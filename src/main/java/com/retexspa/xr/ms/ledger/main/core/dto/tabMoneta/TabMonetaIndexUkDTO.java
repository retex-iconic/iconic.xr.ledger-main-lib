package com.retexspa.xr.ms.ledger.main.core.dto.tabMoneta;

import com.retexspa.xr.ms.ledger.main.core.dto.tabOpePag.TabOpePagBaseDTO;
import com.retexspa.xr.ms.main.core.dto.AggregateIndexUkBaseDTO;

public class TabMonetaIndexUkDTO extends AggregateIndexUkBaseDTO {

    public TabMonetaIndexUkDTO() {
    }
    public static String getUk(TabMonetaBaseDTO tabMonetaBaseDTO) {
        String uk =  tabMonetaBaseDTO.getIdValuta()
                + TabMonetaIndexUkDTO.getUkSeparator()
                + tabMonetaBaseDTO.getTipoMoneta()
                + TabMonetaIndexUkDTO.getUkSeparator()
                + tabMonetaBaseDTO.getTaglioCassetto();
        return uk;
    }

    public static String getIndexName() {
        return "TabMonetaIndexUk";
    }

    public static String getIndexAggregateName() {
        return "TabMonetaIndexUkAggregate";
    }

}
