package shop.external;

import lombok.Data;
import java.util.Date;
@Data
public class Shipping {

    private Long id;
    private Long orderId;
    private String productId;
}


