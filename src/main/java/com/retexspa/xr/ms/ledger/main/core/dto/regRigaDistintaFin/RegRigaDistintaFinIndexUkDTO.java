package com.retexspa.xr.ms.ledger.main.core.dto.regRigaDistintaFin;


import com.retexspa.xr.ms.main.core.dto.AggregateIndexUkBaseDTO;

public class RegRigaDistintaFinIndexUkDTO extends AggregateIndexUkBaseDTO {
    public RegRigaDistintaFinIndexUkDTO() {
    }

    public static String getUk(RegRigaDistintaFinBaseDTO regRigaDistintaFinBaseDTO) {
        String uk =  regRigaDistintaFinBaseDTO.getIdRigaDistFin() + RegRigaDistintaFinIndexUkDTO.getUkSeparator() + regRigaDistintaFinBaseDTO.getIdOpePag();
        return uk;
    }
    public static String getIndexName() {
        return "RegRigaDistintaFinIndexUk";
    }

    public static String getIndexAggregateName() {
        return "RegRigaDistintaFinIndexUkAggregate";
    }
}
