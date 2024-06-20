package com.retexspa.xr.ms.ledger.main.core.responses.tabGuidaIdeTransazione;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.retexspa.xr.ms.ledger.main.core.dto.tabGuidaIdeTransazione.TabGuidaIdeTransazioneBaseDTO;
import com.retexspa.xr.ms.main.core.responses.BaseAggregateResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class TabGuidaIdeTransazioneAggregateResponse extends BaseAggregateResponse<TabGuidaIdeTransazioneBaseDTO> {
    private Map<String, Object> lastEvent;
    public TabGuidaIdeTransazioneAggregateResponse(
            @JsonProperty("id") String id,
            @JsonProperty("version") Long version,
            @JsonProperty("data") TabGuidaIdeTransazioneBaseDTO data,
            @JsonProperty("lastEvent") Map<String, Object> lastEvent) {
        super(id, version, data);
        this.lastEvent = lastEvent;
    }
}
