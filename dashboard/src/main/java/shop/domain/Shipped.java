package shop.domain;

import shop.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class Shipped extends AbstractEvent {

    private Long id;
    private Long orderId;
}
