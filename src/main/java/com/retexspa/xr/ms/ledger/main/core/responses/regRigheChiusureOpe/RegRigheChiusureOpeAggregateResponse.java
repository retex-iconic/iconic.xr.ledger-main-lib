package com.retexspa.xr.ms.ledger.main.core.responses.regRigheChiusureOpe;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.retexspa.xr.ms.ledger.main.core.dto.regRigheChiusureOpe.RegRigheChiusureOpeBaseDTO;
import com.retexspa.xr.ms.main.core.responses.BaseAggregateResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class RegRigheChiusureOpeAggregateResponse extends BaseAggregateResponse<RegRigheChiusureOpeBaseDTO> {
    private Map<String, Object> lastEvent;

    public RegRigheChiusureOpeAggregateResponse(
            @JsonProperty("id") String id,
            @JsonProperty("version") Long version,
            @JsonProperty("data") RegRigheChiusureOpeBaseDTO data,
            @JsonProperty("lastEvent") Map<String, Object> lastEvent) {
        super(id, version, data);
        this.lastEvent = lastEvent;
    }
}
