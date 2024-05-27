package com.retexspa.xr.ms.ledger.main.core.queries.tabTipiOpe;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TabTipiOpeAggregateGetEventsByIdQuery {
    private String tabTipiOpeId;

    public TabTipiOpeAggregateGetEventsByIdQuery(@JsonProperty("tabTipiOpeId") String tabTipiOpeId) {
        this.tabTipiOpeId = tabTipiOpeId;
    }
}
