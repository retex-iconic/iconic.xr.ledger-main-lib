package com.retexspa.xr.ms.ledger.main.core.queries.tabFormePagamento;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TabFormePagamentoAggregateGetByIdQuery {


    private String tabFormePagamentoId;

    public TabFormePagamentoAggregateGetByIdQuery(@JsonProperty("tabFormePagamentoId") String tabFormePagamentoId) {
        this.tabFormePagamentoId = tabFormePagamentoId;
    }
}
