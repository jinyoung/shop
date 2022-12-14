package shop.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import shop.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import shop.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired InventoryRepository inventoryRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Shipped'")
    public void wheneverShipped_DecreaseStock(@Payload Shipped shipped){

        Shipped event = shipped;
        System.out.println("\n\n##### listener DecreaseStock : " + shipped + "\n\n");


        

        // Sample Logic //
        Inventory.decreaseStock(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderPlaced'")
    public void wheneverOrderPlaced_CheckInventory(@Payload OrderPlaced orderPlaced){

        OrderPlaced event = orderPlaced;
        System.out.println("\n\n##### listener CheckInventory : " + orderPlaced + "\n\n");


        

        // Sample Logic //
        Inventory.checkInventory(event);
        

        

    }

    @Autowired
    shop.external.OrderService orderService;

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Returned'")
    public void wheneverReturned_UpdateStock(@Payload Returned returned){

        Returned event = returned;
        System.out.println("\n\n##### listener UpdateStock : " + returned + "\n\n");

        // REST Request Sample
        
        // orderService.getOrder(/** mapping value needed */);


        

        // Sample Logic //
        Inventory.updateStock(event);
        

        

    }

}


