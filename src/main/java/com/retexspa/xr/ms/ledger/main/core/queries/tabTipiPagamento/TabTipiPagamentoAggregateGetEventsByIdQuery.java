package com.retexspa.xr.ms.ledger.main.core.queries.tabTipiPagamento;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TabTipiPagamentoAggregateGetEventsByIdQuery {
    private String tabTipiPagamentoId;

    public TabTipiPagamentoAggregateGetEventsByIdQuery(@JsonProperty("tabTipiPagamentoId") String tabTipiPagamentoId) {
        this.tabTipiPagamentoId = tabTipiPagamentoId;
    }

    public String getTabTipiPagamentoId() {
        return tabTipiPagamentoId;
    }

    public void setTabTipiPagamentoId(String societaId) {
        this.tabTipiPagamentoId = tabTipiPagamentoId;
    }
}
