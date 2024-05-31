package com.retexspa.xr.ms.ledger.main.core.queries.tabOpePag;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TabOpePagAggregateGetByIdQuery {
    private String tabOpePagId;

    public TabOpePagAggregateGetByIdQuery(@JsonProperty("tabOpePagId") String tabOpePagId) {
        this.tabOpePagId = tabOpePagId;
    }
}
