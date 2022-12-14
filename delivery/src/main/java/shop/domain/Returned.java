package shop.domain;

import shop.domain.*;
import shop.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Returned extends AbstractEvent {

    private Long id;
    private Long orderId;

    public Returned(Shipping aggregate){
        super(aggregate);
    }
    public Returned(){
        super();
    }
}
