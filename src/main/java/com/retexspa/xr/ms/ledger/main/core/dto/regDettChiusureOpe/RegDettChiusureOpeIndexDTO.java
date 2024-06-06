package com.retexspa.xr.ms.ledger.main.core.dto.regDettChiusureOpe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class RegDettChiusureOpeIndexDTO {
    private String regDettChiusureOpeId;

    public RegDettChiusureOpeIndexDTO() {
    }

    public RegDettChiusureOpeIndexDTO(String regDettChiusureOpeId) {
        this.regDettChiusureOpeId = regDettChiusureOpeId;
    }

    public static String getIdFromRegDettChiusureOpe(String regDettChiusureOpeId) {
        return UUID.nameUUIDFromBytes(("/RegDettChiusureOpeIndex/" + regDettChiusureOpeId).getBytes()).toString();
    }
}
