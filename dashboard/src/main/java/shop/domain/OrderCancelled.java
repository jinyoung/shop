package shop.domain;

import shop.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String customerId;
}
