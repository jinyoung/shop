package shop.domain;

import shop.CustomerApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Customer_table")
@Data

public class Customer  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String name;
    
    
    
    
    
    private String address;


    public static CustomerRepository repository(){
        CustomerRepository customerRepository = CustomerApplication.applicationContext.getBean(CustomerRepository.class);
        return customerRepository;
    }




    public static void thankToCustomer(OrderPlaced orderPlaced){

        /** Example 1:  new item 
        Customer customer = new Customer();
        repository().save(customer);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(customer->{
            
            customer // do something
            repository().save(customer);


         });
        */

        
    }


}
