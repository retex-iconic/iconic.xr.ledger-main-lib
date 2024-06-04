package com.retexspa.xr.ms.ledger.main.core.dto.regRigheChiusureUff;

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
public class RegRigheChiusureUffIndexDTO {
    private String regRigheChiusureUffId;
    private LinkedList<String> regDettChiusureUffIds;
    public RegRigheChiusureUffIndexDTO() {
    }

    public RegRigheChiusureUffIndexDTO(String regRigheChiusureUffId) {
        this.regRigheChiusureUffId = regRigheChiusureUffId;
    }
    public static String getIdFromRegRigheChiusureUff(String regRigheChiusureUffId) {
        return UUID.nameUUIDFromBytes(("/RegRigheChiusureUffIndex/" + regRigheChiusureUffId).getBytes()).toString();
    }
    public static String getDetailNameRegDettChiusureUff() {
        return "regDettChiusureUffIds";
    }
}
