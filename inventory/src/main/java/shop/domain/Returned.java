package shop.domain;

import shop.domain.*;
import shop.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Returned extends AbstractEvent {

    private Long id;
    private Long orderId;
}


