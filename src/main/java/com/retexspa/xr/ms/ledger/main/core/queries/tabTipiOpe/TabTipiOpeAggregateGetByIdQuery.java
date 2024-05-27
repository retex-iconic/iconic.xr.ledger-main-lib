package com.retexspa.xr.ms.ledger.main.core.queries.tabTipiOpe;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TabTipiOpeAggregateGetByIdQuery {
    private String tabTipiOpeId;

    public TabTipiOpeAggregateGetByIdQuery(@JsonProperty("tabTipiOpeId") String tabTipiOpeId) {
        this.tabTipiOpeId = tabTipiOpeId;
    }
}
