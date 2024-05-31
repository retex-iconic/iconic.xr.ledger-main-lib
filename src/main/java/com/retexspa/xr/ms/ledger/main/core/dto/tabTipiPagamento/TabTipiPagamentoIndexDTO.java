package com.retexspa.xr.ms.ledger.main.core.dto.tabTipiPagamento;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.LinkedList;
import java.util.UUID;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TabTipiPagamentoIndexDTO {

    private String tabTipiPagamentoId;
    private LinkedList<String> tabFormePagamentoIds;

    public TabTipiPagamentoIndexDTO() {
    }

    public TabTipiPagamentoIndexDTO(String tabTipiPagamentoId) {
        this.tabTipiPagamentoId = tabTipiPagamentoId;
    }

    public static String getIdFromTabTipiPagamento(String tabTipiPagamentoId) {
        return UUID.nameUUIDFromBytes(("/TabTipiPagamentoIndex/" + tabTipiPagamentoId).getBytes()).toString();
    }

    public static String getDetailNameTabFormePagamento() {
        return "tabFormePagamentoIds";
    }

    public String getTabTipiPagamentoId() {
        return tabTipiPagamentoId;
    }

    public void setTabTipiPagamentoId(String tabTipiPagamentoId) {
        this.tabTipiPagamentoId = tabTipiPagamentoId;
    }




    public LinkedList<String> getTabFormePagamentoIds() {
        return tabFormePagamentoIds;
    }

    public void setTabFormePagamentoIds(LinkedList<String> tabFormePagamentoIds) {
        this.tabFormePagamentoIds = tabFormePagamentoIds;
    }
}
