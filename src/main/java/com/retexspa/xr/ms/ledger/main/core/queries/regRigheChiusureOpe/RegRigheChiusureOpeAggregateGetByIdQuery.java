package com.retexspa.xr.ms.ledger.main.core.queries.regRigheChiusureOpe;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegRigheChiusureOpeAggregateGetByIdQuery {
    private String regRigheChiusureOpeId;

    public RegRigheChiusureOpeAggregateGetByIdQuery(@JsonProperty("regRigheChiusureOpeId") String regRigheChiusureOpeId) {
        this.regRigheChiusureOpeId = regRigheChiusureOpeId;
    }
}

