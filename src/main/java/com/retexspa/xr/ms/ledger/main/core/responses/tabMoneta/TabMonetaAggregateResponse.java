package com.retexspa.xr.ms.ledger.main.core.responses.tabMoneta;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.retexspa.xr.ms.ledger.main.core.dto.tabMoneta.TabMonetaBaseDTO;
import com.retexspa.xr.ms.ledger.main.core.dto.tabOpePag.TabOpePagBaseDTO;
import com.retexspa.xr.ms.main.core.responses.BaseAggregateResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class TabMonetaAggregateResponse  extends BaseAggregateResponse<TabMonetaBaseDTO> {
    private Map<String, Object> lastEvent;
    public TabMonetaAggregateResponse(
            @JsonProperty("id") String id,
            @JsonProperty("version") Long version,
            @JsonProperty("data") TabMonetaBaseDTO data,
            @JsonProperty("lastEvent") Map<String, Object> lastEvent) {
        super(id, version, data);
        this.lastEvent = lastEvent;
    }
}
