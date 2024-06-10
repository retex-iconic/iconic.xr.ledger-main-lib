package com.retexspa.xr.ms.ledger.main.core.responses.regDettChiusureOpe;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.retexspa.xr.ms.ledger.main.core.dto.regDettChiusureOpe.RegDettChiusureOpeBaseDTO;
import com.retexspa.xr.ms.main.core.responses.BaseAggregateResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class RegDettChiusureOpeAggregateResponse extends BaseAggregateResponse<RegDettChiusureOpeBaseDTO> {
    private Map<String, Object> lastEvent;

    public RegDettChiusureOpeAggregateResponse(
            @JsonProperty("id") String id,
            @JsonProperty("version") Long version,
            @JsonProperty("data") RegDettChiusureOpeBaseDTO data,
            @JsonProperty("lastEvent") Map<String, Object> lastEvent) {
        super(id, version, data);
        this.lastEvent = lastEvent;
    }
}