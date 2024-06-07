package com.retexspa.xr.ms.ledger.main.core.responses.regRigaDistintaFin;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.retexspa.xr.ms.ledger.main.core.dto.regRigaDistintaFin.RegRigaDistintaFinBaseDTO;
import com.retexspa.xr.ms.main.core.responses.BaseAggregateResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class RegRigaDistintaFinAggregateResponse extends BaseAggregateResponse<RegRigaDistintaFinBaseDTO> {
    private Map<String, Object> lastEvent;

    public RegRigaDistintaFinAggregateResponse(
            @JsonProperty("id") String id,
            @JsonProperty("version") Long version,
            @JsonProperty("data") RegRigaDistintaFinBaseDTO data,
            @JsonProperty("lastEvent") Map<String, Object> lastEvent) {
        super(id, version, data);
        this.lastEvent = lastEvent;
    }
}
