package com.retexspa.xr.ms.ledger.main.core.responses.regDettChiusureUff;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.retexspa.xr.ms.ledger.main.core.dto.regDettChiusureUff.RegDettChiusureUffBaseDTO;
import com.retexspa.xr.ms.main.core.responses.BaseAggregateResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class RegDettChiusureUffAggregateResponse extends BaseAggregateResponse<RegDettChiusureUffBaseDTO> {
    private Map<String, Object> lastEvent;

    public RegDettChiusureUffAggregateResponse(
            @JsonProperty("id") String id,
            @JsonProperty("version") Long version,
            @JsonProperty("data") RegDettChiusureUffBaseDTO data,
            @JsonProperty("lastEvent") Map<String, Object> lastEvent) {
        super(id, version, data);
        this.lastEvent = lastEvent;
    }
}
