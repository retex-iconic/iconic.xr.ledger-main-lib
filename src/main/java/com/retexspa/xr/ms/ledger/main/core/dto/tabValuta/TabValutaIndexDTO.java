package com.retexspa.xr.ms.ledger.main.core.dto.tabValuta;

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
public class TabValutaIndexDTO {

    private String tabValutaId;
    private LinkedList<String> tabMonetaIds;

    public TabValutaIndexDTO() {
    }

    public TabValutaIndexDTO(String tabValutaId) {
        this.tabValutaId = tabValutaId;
    }

    public static String getIdFromTabValuta(String id) {
        return UUID.nameUUIDFromBytes(("/TabValutaIndex/" + id).getBytes()).toString();
    }

    public static String getDetailNameTabMoneta() {
        return "tabMonetaIds";
    }
}
