package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class InStock extends AbstractEvent {

    private Long id;

    public InStock() {
        super();
    }
}
//>>> DDD / Domain Event
