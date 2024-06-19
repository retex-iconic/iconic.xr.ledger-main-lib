package com.retexspa.xr.ms.ledger.main.core.dto.decodeCircuitoCarta;

import com.retexspa.xr.ms.ledger.main.core.dto.tabCircuitiCarte.TabCircuitiCarteIndexUkDTO;
import com.retexspa.xr.ms.main.core.dto.AggregateIndexUkBaseDTO;

public class DecodeCircuitoCartaIndexUkDTO extends AggregateIndexUkBaseDTO {
    public DecodeCircuitoCartaIndexUkDTO() {
    }
    public static String getUk(DecodeCircuitoCartaBaseDTO dto) {
        return dto.getIdTipoCarta() + DecodeCircuitoCartaIndexUkDTO.getUkSeparator() + dto.getPrefisso();
    }

    public static String getIndexName() {
        return "DecodeCircuitoCartaIndexUK";
    }

    public static String getIndexAggregateName() {
        return "DecodeCircuitoCartaIndexUKAggregate";
    }
}
