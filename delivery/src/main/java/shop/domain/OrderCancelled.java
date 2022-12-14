package shop.domain;

import shop.domain.*;
import shop.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String customerId;
}


