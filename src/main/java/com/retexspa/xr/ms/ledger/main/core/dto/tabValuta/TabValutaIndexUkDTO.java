package com.retexspa.xr.ms.ledger.main.core.dto.tabValuta;

import com.retexspa.xr.ms.main.core.dto.AggregateIndexUkBaseDTO;

public class TabValutaIndexUkDTO extends AggregateIndexUkBaseDTO {
    public TabValutaIndexUkDTO() {
    }
    public static String getUk(TabValutaBaseDTO dto) {
        return dto.getCodValuta();
    }

    public static String getIndexName() {
        return "TabValutaIndexUk";
    }

    public static String getIndexAggregateName() {
        return "TabValutaIndexUkAggregate";
    }
}
