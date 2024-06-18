package com.retexspa.xr.ms.ledger.main.core.dto.tabCircuitiCarte;

import com.retexspa.xr.ms.ledger.main.core.dto.tabOpePag.TabOpePagBaseDTO;
import com.retexspa.xr.ms.ledger.main.core.dto.tabOpePag.TabOpePagIndexUkDTO;
import com.retexspa.xr.ms.main.core.dto.AggregateIndexUkBaseDTO;

public class TabCircuitiCarteIndexUkDTO  extends AggregateIndexUkBaseDTO {

    public TabCircuitiCarteIndexUkDTO() {
    }
    public static String getUk(TabCircuitiCarteBaseDTO dto) {
        return dto.getIdFormePagamento() + TabCircuitiCarteIndexUkDTO.getUkSeparator() + dto.getTipoCarta();
    }

    public static String getIndexName() {
        return "TabCircuitiCarteIndexUK";
    }

    public static String getIndexAggregateName() {
        return "TabCircuitiCarteIndexUKAggregate";
    }
}
