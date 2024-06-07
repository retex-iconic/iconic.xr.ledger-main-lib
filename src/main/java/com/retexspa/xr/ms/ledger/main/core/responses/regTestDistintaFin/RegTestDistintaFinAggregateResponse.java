package com.retexspa.xr.ms.ledger.main.core.responses.regTestDistintaFin;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.retexspa.xr.ms.ledger.main.core.dto.regTestDistintaFin.RegTestDistintaFinBaseDTO;
import com.retexspa.xr.ms.main.core.responses.BaseAggregateResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class RegTestDistintaFinAggregateResponse extends BaseAggregateResponse<RegTestDistintaFinBaseDTO> {
    private Map<String, Object> lastEvent;

    public RegTestDistintaFinAggregateResponse(
            @JsonProperty("id") String id,
            @JsonProperty("version") Long version,
            @JsonProperty("data") RegTestDistintaFinBaseDTO data,
            @JsonProperty("lastEvent") Map<String, Object> lastEvent) {
        super(id, version, data);
        this.lastEvent = lastEvent;
    }
}
