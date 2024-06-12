package com.retexspa.xr.ms.ledger.main.core.dto.regDettChiusureUff;

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
public class RegDettChiusureUffIndexDTO {
    private String regDettChiusureUffId;
    /*private LinkedList<String> .....;*/
    public RegDettChiusureUffIndexDTO() {
    }

    public RegDettChiusureUffIndexDTO(String regDettChiusureUffId) {
        this.regDettChiusureUffId = regDettChiusureUffId;
    }
    public static String getIdFromRegDettChiusureUff(String regDettChiusureUffId) {
        return UUID.nameUUIDFromBytes(("/RegDettChiusureUffIndex/" + regDettChiusureUffId).getBytes()).toString();
    }
  /*  public static String getDetailName...() {
        return "......Ids";
    }*/
}
