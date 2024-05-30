package com.retexspa.xr.ms.ledger.main.core.queries.regRigheChiusureOpe;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegRigheChiusureOpeAggregateGetEventsByIdQuery {
    private String regRigheChiusureOpeId;

    public RegRigheChiusureOpeAggregateGetEventsByIdQuery(@JsonProperty("regRigheChiusureOpeId") String regRigheChiusureOpeId) {
        this.regRigheChiusureOpeId = regRigheChiusureOpeId;
    }
}
