package com.retexspa.xr.ms.ledger.main.core.dto.tabTipiPagamento;

import com.retexspa.xr.ms.ledger.main.core.dto.tabTipiPagamento.TabTipiPagamentoBaseDTO;
import com.retexspa.xr.ms.main.core.dto.AggregateIndexUkBaseDTO;

public class TabTipiPagamentoIndexUkDTO extends AggregateIndexUkBaseDTO {

    public TabTipiPagamentoIndexUkDTO() {
    }

    public static Integer getUk(TabTipiPagamentoBaseDTO tabTipiPagamentoBaseDTO) {
        Integer uk = tabTipiPagamentoBaseDTO.getCodTipoPag();
        return uk;
    }

    public static String getIndexName() {
        return "TabTipiPagamentoIndexUk";
    }

    public static String getIndexAggregateName() {
        return "TabTipiPagamentoIndexUkAggregate";
    }
}


