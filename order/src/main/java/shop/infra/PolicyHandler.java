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
    @Autowired OrderRepository orderRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OutOfStockOccurred'")
    public void wheneverOutOfStockOccurred_ApologizeCustomer(@Payload OutOfStockOccurred outOfStockOccurred){

        OutOfStockOccurred event = outOfStockOccurred;
        System.out.println("\n\n##### listener ApologizeCustomer : " + outOfStockOccurred + "\n\n");


        

        // Sample Logic //
        Order.apologizeCustomer(event);
        

        

    }

}


