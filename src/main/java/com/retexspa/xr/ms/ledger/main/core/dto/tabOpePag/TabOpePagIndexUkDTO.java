package com.retexspa.xr.ms.ledger.main.core.dto.tabOpePag;

import com.retexspa.xr.ms.main.core.dto.AggregateIndexUkBaseDTO;

public class TabOpePagIndexUkDTO  extends AggregateIndexUkBaseDTO {

    public TabOpePagIndexUkDTO() {
    }
    public static String getUk(TabOpePagBaseDTO tabOpePagBaseDTO) {
        String uk =  tabOpePagBaseDTO.getIdTipiOpe() + TabOpePagIndexUkDTO.getUkSeparator() + tabOpePagBaseDTO.getIdFormePagamento();
        return uk;
    }

    public static String getIndexName() {
        return "TabOpePagIndexUk";
    }

    public static String getIndexAggregateName() {
        return "TabOpePagIndexUkAggregate";
    }

}
