package shop.domain;

import shop.domain.Shipped;
import shop.domain.Returned;
import shop.DeliveryApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Shipping_table")
@Data

public class Shipping  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Long orderId;
    
    
    
    
    
    private String productId;

    @PostPersist
    public void onPostPersist(){


        Shipped shipped = new Shipped(this);
        shipped.publishAfterCommit();

    }
    @PostRemove
    public void onPostRemove(){


        Returned returned = new Returned(this);
        returned.publishAfterCommit();

    }

    public static ShippingRepository repository(){
        ShippingRepository shippingRepository = DeliveryApplication.applicationContext.getBean(ShippingRepository.class);
        return shippingRepository;
    }




    public static void startDelivery(OrderPlaced orderPlaced){

        /** Example 1:  new item 
        Shipping shipping = new Shipping();
        repository().save(shipping);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(shipping->{
            
            shipping // do something
            repository().save(shipping);


         });
        */

        
    }
    public static void cancelDelivery(OrderCancelled orderCancelled){

        /** Example 1:  new item 
        Shipping shipping = new Shipping();
        repository().save(shipping);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCancelled.get???()).ifPresent(shipping->{
            
            shipping // do something
            repository().save(shipping);


         });
        */

        
    }


}
