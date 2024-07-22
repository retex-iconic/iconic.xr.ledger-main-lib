package com.retexspa.xr.ms.ledger.main.core.dto.tabGuidaIdeTransazione;

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
public class TabGuidaIdeTransazioneIndexDTO {
    private String tabGuidaIdeTransazioneId;
  /*  private LinkedList<String> ....Ids;*/

    public TabGuidaIdeTransazioneIndexDTO() {
    }

    public TabGuidaIdeTransazioneIndexDTO(String tabGuidaIdeTransazioneId) {
      this.tabGuidaIdeTransazioneId = tabGuidaIdeTransazioneId;
  }
    public static String getIdFromTabGuidaIdeTransazione(String tabGuidaIdeTransazioneId) {
        return UUID.nameUUIDFromBytes(("/TabGuidaIdeTransazioneIndex/" + tabGuidaIdeTransazioneId).getBytes()).toString();
    }
/*    public static String getDetailName...() {return "......Ids";}*/
}
