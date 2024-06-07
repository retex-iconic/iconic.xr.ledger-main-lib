package com.retexspa.xr.ms.ledger.main.core.dto.regRigaDistintaFin;

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
public class RegRigaDistintaFinIndexDTO {
    private String regRigaDistintaFinId;
    /*private LinkedList<String> ...*/

    public RegRigaDistintaFinIndexDTO() {
    }

    public RegRigaDistintaFinIndexDTO(String regRigaDistintaFinId) {
        this.regRigaDistintaFinId = regRigaDistintaFinId;
    }
    public static String getIdFromRegRigaDistintaFin(String  regRigaDistintaFinId) {
        return UUID.nameUUIDFromBytes(("/RegRigaDistintaFinIndex/" + regRigaDistintaFinId).getBytes()).toString();
    }
/*    public static String getDetailName...() {
        return "....Ids";
    }*/
}
