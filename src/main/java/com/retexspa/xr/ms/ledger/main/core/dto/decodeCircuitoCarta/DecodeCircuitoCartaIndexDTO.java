package com.retexspa.xr.ms.ledger.main.core.dto.decodeCircuitoCarta;

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
public class DecodeCircuitoCartaIndexDTO {
    private String decodeCircuitoCartaId;

    public DecodeCircuitoCartaIndexDTO() {
    }

    public DecodeCircuitoCartaIndexDTO(String decodeCircuitoCartaId) {
        this.decodeCircuitoCartaId = decodeCircuitoCartaId;
    }
    public static String getIdFromDecodeCircuitoCarta(String id) {
        return UUID.nameUUIDFromBytes(("/DecodeCircuitoCartaIndex/" + id).getBytes()).toString();
    }

}
