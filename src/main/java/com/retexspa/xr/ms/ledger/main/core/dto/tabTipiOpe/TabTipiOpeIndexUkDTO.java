package com.retexspa.xr.ms.ledger.main.core.dto.tabTipiOpe;

import com.retexspa.xr.ms.main.core.dto.AggregateIndexUkBaseDTO;

public class TabTipiOpeIndexUkDTO extends AggregateIndexUkBaseDTO {

    public TabTipiOpeIndexUkDTO() {
    }
    public static Integer getUk(Integer codTipopeId) {
        Integer uk =  codTipopeId;
        return uk;
    }

    public static String getIndexName() {
        return "TabTipiOpeIndexUk";
    }

    public static String getIndexAggregateName() {
        return "TabTipiOpeIndexUkAggregate";
    }

}
