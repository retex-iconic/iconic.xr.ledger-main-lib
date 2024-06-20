package com.retexspa.xr.ms.ledger.main.core.dto.tabFormePagamento;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.LinkedList;
import java.util.UUID;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TabFormePagamentoIndexDTO {

    private String tabFormePagamentoId;

    private LinkedList<String> tabOpePagIds;
    private LinkedList<String> tabCircuitiCarteIds;
    private LinkedList<String> tabGuidaIdeTransazioneIds;
    public TabFormePagamentoIndexDTO() {
    }

    public TabFormePagamentoIndexDTO(String tabFormePagamentoId) {
        this.tabFormePagamentoId = tabFormePagamentoId;
    }

    public static String getIdFromTabFormePagamento(String tabFormePagamentoId) {
        return UUID.nameUUIDFromBytes(("/TabFormePagamentoIndex/" + tabFormePagamentoId).getBytes()).toString();
    }


    public String getTabFormePagamentoId() {
        return tabFormePagamentoId;
    }

    public void setTabFormePagamentoId(String tabFormePagamentoId) {
        this.tabFormePagamentoId = tabFormePagamentoId;
    }

    public LinkedList<String> getTabOpePagIds() {
        return tabOpePagIds;
    }

    public void setTabOpePagIds(LinkedList<String> tabOpePagIds) {
        this.tabOpePagIds = tabOpePagIds;
    }

    public LinkedList<String> getTabGuidaIdeTransazioneIds() {
        return tabGuidaIdeTransazioneIds;
    }

    public void setTabGuidaIdeTransazioneIds(LinkedList<String> tabGuidaIdeTransazioneIds) {
        this.tabGuidaIdeTransazioneIds = tabGuidaIdeTransazioneIds;
    }

    public static String getDetailNameTabOpePag() {
        return "tabOpePagIds";
    }

    public static String getDetailNameTabCircuitiCarte() {
        return "tabCircuitiCarteIds";
    }

    public LinkedList<String> getTabCircuitiCarteIds() {
        return tabCircuitiCarteIds;
    }

    public void setTabCircuitiCarteIds(LinkedList<String> tabCircuitiCarteIds) {
        this.tabCircuitiCarteIds = tabCircuitiCarteIds;
    }
    public static String getDetailNameTabGuidaIdeTransazione() {
        return "tabGuidaIdeTransazioneIds";
    }
}
