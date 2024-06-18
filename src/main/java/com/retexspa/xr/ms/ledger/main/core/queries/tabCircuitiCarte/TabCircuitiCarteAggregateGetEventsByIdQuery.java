package com.retexspa.xr.ms.ledger.main.core.queries.tabCircuitiCarte;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TabCircuitiCarteAggregateGetEventsByIdQuery {
    private String tabCircuitiCarteId;

    public TabCircuitiCarteAggregateGetEventsByIdQuery(@JsonProperty("tabCircuitiCarteId") String tabCircuitiCarteId) {
        this.tabCircuitiCarteId = tabCircuitiCarteId;
    }
}
