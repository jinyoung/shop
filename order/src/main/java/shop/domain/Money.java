package shop.domain;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Embeddable
@Data
//TODO:
//@AllArgsConstructor
//@NoArgsConstructor
public class Money {

    private Double amount;
  //TODO:  
//    @OneToOne
    private Enum currency;

}

