package com.retexspa.xr.ms.ledger.main.core.dto.regTestDistintaFin;

import com.retexspa.xr.ms.main.core.dto.AggregateIndexUkBaseDTO;

public class RegTestDistintaFinIndexUkDTO extends AggregateIndexUkBaseDTO {
    public RegTestDistintaFinIndexUkDTO() {
    }
    public static Integer getUk(Integer codRiga) {
        Integer uk =  codRiga;
        return uk;
    }
    public static String getIndexName() {
        return "RegTestDistintaFinIndexUk";
    }

    public static String getIndexAggregateName() {
        return "RegTestDistintaFinIndexUkAggregate";
    }
}
