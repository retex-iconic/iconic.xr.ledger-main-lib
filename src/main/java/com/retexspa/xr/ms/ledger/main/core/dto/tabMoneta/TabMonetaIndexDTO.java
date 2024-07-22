package com.retexspa.xr.ms.ledger.main.core.dto.tabMoneta;

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
public class TabMonetaIndexDTO {
    private String tabMonetaId;

    public TabMonetaIndexDTO() {
    }

    public TabMonetaIndexDTO(String tabMonetaId) {
        this.tabMonetaId = tabMonetaId;
    }
    public static String getIdFromTabMoneta(String tabMonetaId) {
        return UUID.nameUUIDFromBytes(("/TabMonetaIndex/" + tabMonetaId).getBytes()).toString();
    }
}
