package com.retexspa.xr.ms.ledger.main.core.dto.regRigheChiusureOpe;

import com.retexspa.xr.ms.main.core.dto.AggregateIndexUkBaseDTO;

public class RegRigheChiusureOpeIndexUkDTO extends AggregateIndexUkBaseDTO {

    public RegRigheChiusureOpeIndexUkDTO() {
    }

    public static Integer getUk(Integer codRiga) {
        Integer uk = codRiga;
        return uk;
    }

    public static String getIndexName() {
        return "RegRigheChiusureOpeIndexUk";
    }

    public static String getIndexAggregateName() {
        return "RegRigheChiusureOpeIndexUkAggregate";
    }
}
