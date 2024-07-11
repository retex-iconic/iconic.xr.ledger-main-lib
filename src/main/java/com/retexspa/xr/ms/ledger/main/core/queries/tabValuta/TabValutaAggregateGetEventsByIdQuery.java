package com.retexspa.xr.ms.ledger.main.core.queries.tabValuta;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TabValutaAggregateGetEventsByIdQuery {
    private String tabValutaId;

    public TabValutaAggregateGetEventsByIdQuery(@JsonProperty("tabValutaId") String tabValutaId) {
        this.tabValutaId = tabValutaId;
    }
}
