package com.retexspa.xr.ms.ledger.main.core.queries.tabCircuitiCarte;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TabCircuitiCarteAggregateGetByIdQuery {
    private String tabCircuitiCarteId;

    public TabCircuitiCarteAggregateGetByIdQuery(@JsonProperty("tabCircuitiCarteId") String tabCircuitiCarteId) {
        this.tabCircuitiCarteId = tabCircuitiCarteId;
    }
}
