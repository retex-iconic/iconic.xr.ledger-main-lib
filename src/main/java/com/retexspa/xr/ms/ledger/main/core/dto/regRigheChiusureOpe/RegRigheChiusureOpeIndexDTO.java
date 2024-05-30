package com.retexspa.xr.ms.ledger.main.core.dto.regRigheChiusureOpe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.UUID;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class RegRigheChiusureOpeIndexDTO {
    private String regRigheChiusureOpeId;
    private LinkedList<String> regDettChiusureOpeIds;

    public RegRigheChiusureOpeIndexDTO() {
    }

    public RegRigheChiusureOpeIndexDTO(String regRigheChiusureOpeId) {
        this.regRigheChiusureOpeId = regRigheChiusureOpeId;
    }

    public static String getIdFromRegRigheChiusureOpe(String regRigheChiusureOpeId) {
        return UUID.nameUUIDFromBytes(("/RegRigheChiusureOpeIndex/" + regRigheChiusureOpeId).getBytes()).toString();
    }

    public static String getDetailNameRegDettChiusureOpe() {
        return "regDettChiusureOpeIds";
    }
}
