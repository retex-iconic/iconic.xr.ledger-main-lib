package com.retexspa.xr.ms.ledger.main.core.dto.regTestDistintaFin;

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
public class RegTestDistintaFinIndexDTO {
    private String regTestDistintaFinId;
    private LinkedList<String> regRigaDistintaFinIds;

    public RegTestDistintaFinIndexDTO() {
    }

    public RegTestDistintaFinIndexDTO(String regTestDistintaFinId) {
        this.regTestDistintaFinId = regTestDistintaFinId;
    }
    public static String getIdFromRegTestDistintaFin(String regTestDistintaFinId) {
        return UUID.nameUUIDFromBytes(("/RegTestDistintaFinIndex/" + regTestDistintaFinId).getBytes()).toString();
    }
    public static String getDetailNameRegRigaDistintaFin() {
        return "regRigaDistintaFinIds";
    }
}
