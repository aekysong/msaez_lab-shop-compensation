package labshopcompensation.domain;

import java.util.*;
import labshopcompensation.domain.*;
import labshopcompensation.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;

    public StockIncreased(Inventory aggregate) {
        super(aggregate);
    }

    public StockIncreased() {
        super();
    }
}
