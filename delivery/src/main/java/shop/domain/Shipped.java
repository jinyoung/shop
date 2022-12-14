package shop.domain;

import shop.domain.*;
import shop.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Shipped extends AbstractEvent {

    private Long id;
    private Long orderId;

    public Shipped(Shipping aggregate){
        super(aggregate);
    }
    public Shipped(){
        super();
    }
}
