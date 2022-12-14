package shop.domain;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Data

public class OrderDetail  {

    
    
    
    private Long orderItemId;
    
    
    
    private Long productId;
    
    
    
    private Long qty;

}
