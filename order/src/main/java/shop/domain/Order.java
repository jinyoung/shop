package shop.domain;

import shop.domain.OrderPlaced;
import shop.domain.OrderCancelled;
import shop.OrderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Order_table")
@Data

public class Order  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String productId;
    
    
    
    
    
    private Integer qty;
    
    
    
    
    
    private String customerId;
    
    
    
    @OneToMany
    
    private OrderDetail orderDetail;
    
    
    
    @Embedded
    
    private Payment payment;
    
    
    
    @Embedded
    
    private Money price;

    @PostPersist
    public void onPostPersist(){


        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();

    }
    @PostRemove
    public void onPostRemove(){


        OrderCancelled orderCancelled = new OrderCancelled(this);
        orderCancelled.publishAfterCommit();

    }
    @PrePersist
    public void onPrePersist(){
        // Get request from Shipping
        //shop.external.Shipping shipping =
        //    Application.applicationContext.getBean(shop.external.ShippingService.class)
        //    .getShipping(/** mapping value needed */);

    }
    @PreRemove
    public void onPreRemove(){
    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = OrderApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }




    public static void apologizeCustomer(OutOfStockOccurred outOfStockOccurred){

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(outOfStockOccurred.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

        
    }


}
