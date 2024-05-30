package com.retexspa.xr.ms.ledger.main.core.queries.tabFormePagamento;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TabFormePagamentoAggregateGetEventsByIdQuery {

    private String tabFormePagamentoId;

    public TabFormePagamentoAggregateGetEventsByIdQuery(@JsonProperty("tabFormePagamentoId") String tabFormePagamentoId) {
        this.tabFormePagamentoId = tabFormePagamentoId;
    }
}
