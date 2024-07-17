package com.retexspa.xr.ms.ledger.main.core.queries.tabMoneta;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TabMonetaAggregateGetByIdQuery {
    private String tabMonetaId;

    public TabMonetaAggregateGetByIdQuery(@JsonProperty("tabMonetaId") String tabMonetaId) {
        this.tabMonetaId = tabMonetaId;
    }
}
