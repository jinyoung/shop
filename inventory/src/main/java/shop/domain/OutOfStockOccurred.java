package shop.domain;

import shop.domain.*;
import shop.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OutOfStockOccurred extends AbstractEvent {

    private Long id;

    public OutOfStockOccurred(Inventory aggregate){
        super(aggregate);
    }
    public OutOfStockOccurred(){
        super();
    }
}
