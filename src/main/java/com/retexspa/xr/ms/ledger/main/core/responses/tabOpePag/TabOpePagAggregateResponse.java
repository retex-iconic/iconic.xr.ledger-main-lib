package com.retexspa.xr.ms.ledger.main.core.responses.tabOpePag;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.retexspa.xr.ms.ledger.main.core.dto.tabOpePag.TabOpePagBaseDTO;
import com.retexspa.xr.ms.main.core.responses.BaseAggregateResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;
@Getter
@Setter
public class TabOpePagAggregateResponse extends BaseAggregateResponse<TabOpePagBaseDTO>{
    private Map<String, Object> lastEvent;
    public TabOpePagAggregateResponse(
            @JsonProperty("id") String id,
            @JsonProperty("version") Long version,
            @JsonProperty("data") TabOpePagBaseDTO data,
            @JsonProperty("lastEvent") Map<String, Object> lastEvent) {
        super(id, version, data);
        this.lastEvent = lastEvent;
    }
}
