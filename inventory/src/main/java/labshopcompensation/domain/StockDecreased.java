package labshopcompensation.domain;

import java.util.*;
import labshopcompensation.domain.*;
import labshopcompensation.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class StockDecreased extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;

    public StockDecreased(Inventory aggregate) {
        super(aggregate);
    }

    public StockDecreased() {
        super();
    }
}
