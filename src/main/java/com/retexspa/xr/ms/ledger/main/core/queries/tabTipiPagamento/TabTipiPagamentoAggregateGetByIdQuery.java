package com.retexspa.xr.ms.ledger.main.core.queries.tabTipiPagamento;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TabTipiPagamentoAggregateGetByIdQuery {

    private String tabTipiPagamentoId;

    public TabTipiPagamentoAggregateGetByIdQuery(@JsonProperty("tabTipiPagamentoId") String tabTipiPagamentoId) {
        this.tabTipiPagamentoId = tabTipiPagamentoId;
    }

    public String getTabTipiPagamentoId() {
        return tabTipiPagamentoId;
    }

    public void setTabTipiPagamentoId(String tabTipiPagamentoId) {
        this.tabTipiPagamentoId = tabTipiPagamentoId;
    }
}
