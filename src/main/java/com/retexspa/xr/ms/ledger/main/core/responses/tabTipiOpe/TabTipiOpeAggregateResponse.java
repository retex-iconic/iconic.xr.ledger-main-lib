package com.retexspa.xr.ms.ledger.main.core.responses.tabTipiOpe;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.retexspa.xr.ms.ledger.main.core.dto.tabTipiOpe.TabTipiOpeBaseDTO;
import com.retexspa.xr.ms.main.core.responses.BaseAggregateResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;
@Getter
@Setter
public class TabTipiOpeAggregateResponse extends BaseAggregateResponse<TabTipiOpeBaseDTO> {
    private Map<String, Object> lastEvent;

    public TabTipiOpeAggregateResponse(
            @JsonProperty("id") String id,
            @JsonProperty("version") Long version,
            @JsonProperty("data") TabTipiOpeBaseDTO data,
            @JsonProperty("lastEvent") Map<String, Object> lastEvent) {
        super(id, version, data);
        this.lastEvent = lastEvent;
    }
}
