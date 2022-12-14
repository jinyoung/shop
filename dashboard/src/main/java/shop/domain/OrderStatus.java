package shop.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="OrderStatus_table")
@Data
public class OrderStatus {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String orderStatus;
        private String deliveryStatus;
        private String productId;


}
