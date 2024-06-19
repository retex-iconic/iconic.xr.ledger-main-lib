package com.retexspa.xr.ms.ledger.main.core.dto.tabCircuitiCarte;

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
public class TabCircuitiCarteIndexDTO {

    private String tabCircuitiCarteId;
    private LinkedList<String> decodeCircuitoCartaIds;

    public TabCircuitiCarteIndexDTO() {
    }

    public TabCircuitiCarteIndexDTO(String tabCircuitiCarteId) {
        this.tabCircuitiCarteId = tabCircuitiCarteId;
    }
    public static String getIdFromTabCircuitiCarte(String id) {
        return UUID.nameUUIDFromBytes(("/TabCircuitiCarteIndex/" + id).getBytes()).toString();
    }
    public static String getDetailNameTabCircuitiCarte() {
        return "decodeCircuitoCartaIds";
    }

}
