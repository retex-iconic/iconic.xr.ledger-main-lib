package com.retexspa.xr.ms.ledger.main.core.dto.attributo;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.LinkedList;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttributoIndexDTO extends com.retexspa.xr.ms.main.core.dto.attributo.AttributoIndexDTO {

    // DONE IN INDEXAGGREGATE AND EVENTHANDLER
    private LinkedList<String> tabTipiOpeIds;
    private LinkedList<String> tabTipiPagamentoIds;
    private LinkedList<String> tabFormePagamentoIds;

    public AttributoIndexDTO() {
    }

    public AttributoIndexDTO(String attributoId) {
        super(attributoId);
    }

    public LinkedList<String> getTabTipiOpeIds() {
        return tabTipiOpeIds;
    }

    public void setTabTipiOpeIds(LinkedList<String> tabTipiOpeIds) {
        this.tabTipiOpeIds = tabTipiOpeIds;
    }

    public LinkedList<String> getTabTipiPagamentoIds() {
        return tabTipiPagamentoIds;
    }

    public void setTabTipiPagamentoIds(LinkedList<String> tabTipiPagamentoIds) {
        this.tabTipiPagamentoIds = tabTipiPagamentoIds;
    }

    public LinkedList<String> getTabFormePagamentoIds() {
        return tabFormePagamentoIds;
    }

    public void setTabFormePagamentoIds(LinkedList<String> tabFormePagamentoIds) {
        this.tabFormePagamentoIds = tabFormePagamentoIds;
    }

    public static String getDetailNameTabTipiOpe() {
        return "TabTipiOpe";
    }

    public static String getDetailNameTabTipiPagamento() {
        return "TabTipiPagamento";
    }

    public static String getDetailNameTabFormePagamento() { return "TabFormePagamento"; }


}
