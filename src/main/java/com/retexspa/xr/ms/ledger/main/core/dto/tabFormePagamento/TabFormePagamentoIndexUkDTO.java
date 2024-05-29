package com.retexspa.xr.ms.ledger.main.core.dto.tabFormePagamento;

import com.retexspa.xr.ms.main.core.dto.AggregateIndexUkBaseDTO;

public class TabFormePagamentoIndexUkDTO extends AggregateIndexUkBaseDTO {

    public TabFormePagamentoIndexUkDTO() {
    }
    public static Integer getUk(TabFormePagamentoBaseDTO baseDTO) {
        Integer uk = baseDTO.getCodForPag();
        return uk;
    }

    public static String getIndexName() {
        return "TabFormePagamentoIndexUk";
    }

    public static String getIndexAggregateName() {
        return "TabFormePagamentoIndexUkAggregate";
    }
}
