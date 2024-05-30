package com.retexspa.xr.ms.ledger.main.core.dto.tabTipiOpe;

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
public class   TabTipiOpeIndexDTO {

    private String tabTipiOpeId;
    private LinkedList<String> tabOpePagIds;
    public TabTipiOpeIndexDTO() {
    }

    public TabTipiOpeIndexDTO(String tabTipiOpeId) {
        this.tabTipiOpeId = tabTipiOpeId;
    }
    public static String getIdFromTabTipiOpe(String tabTipiOpeId) {
        return UUID.nameUUIDFromBytes(("/TabTipiOpeIndex/" + tabTipiOpeId).getBytes()).toString();
    }
    public static String getDetailNameTabOpePag() {
        return "tabOpePagIds";
    }
}
