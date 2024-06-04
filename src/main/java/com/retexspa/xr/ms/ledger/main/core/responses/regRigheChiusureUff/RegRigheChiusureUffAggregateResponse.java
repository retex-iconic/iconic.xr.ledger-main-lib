package com.retexspa.xr.ms.ledger.main.core.responses.regRigheChiusureUff;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.retexspa.xr.ms.ledger.main.core.dto.regRigheChiusureUff.RegRigheChiusureUffBaseDTO;
import com.retexspa.xr.ms.main.core.responses.BaseAggregateResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class RegRigheChiusureUffAggregateResponse extends BaseAggregateResponse<RegRigheChiusureUffBaseDTO> {
    private Map<String, Object> lastEvent;

    public RegRigheChiusureUffAggregateResponse(
            @JsonProperty("id") String id,
            @JsonProperty("version") Long version,
            @JsonProperty("data") RegRigheChiusureUffBaseDTO data,
            @JsonProperty("lastEvent") Map<String, Object> lastEvent) {
        super(id, version, data);
        this.lastEvent = lastEvent;
    }
}
