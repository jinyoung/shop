package shop.domain;

import shop.domain.*;
import shop.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OutOfStockOccurred extends AbstractEvent {

    private Long id;
}


