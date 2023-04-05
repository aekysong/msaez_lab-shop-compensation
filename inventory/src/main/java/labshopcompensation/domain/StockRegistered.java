package labshopcompensation.domain;

import java.util.*;
import labshopcompensation.domain.*;
import labshopcompensation.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class StockRegistered extends AbstractEvent {

    private Long id;
    private Long stock;

    public StockRegistered(Inventory aggregate) {
        super(aggregate);
    }

    public StockRegistered() {
        super();
    }
}
