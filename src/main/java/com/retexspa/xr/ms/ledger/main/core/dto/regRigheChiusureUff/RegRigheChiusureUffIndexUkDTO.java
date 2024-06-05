package com.retexspa.xr.ms.ledger.main.core.dto.regRigheChiusureUff;

import com.retexspa.xr.ms.main.core.dto.AggregateIndexUkBaseDTO;

public class RegRigheChiusureUffIndexUkDTO extends AggregateIndexUkBaseDTO {

    public RegRigheChiusureUffIndexUkDTO() {
    }
    public static Integer getUk(Integer codRiga) {
        Integer uk =  codRiga;
        return uk;
    }

    public static String getIndexName() {
        return "RegRigheChiusureUffIndexUk";
    }

    public static String getIndexAggregateName() {
        return "RegRigheChiusureUffIndexUkAggregate";
    }

}
