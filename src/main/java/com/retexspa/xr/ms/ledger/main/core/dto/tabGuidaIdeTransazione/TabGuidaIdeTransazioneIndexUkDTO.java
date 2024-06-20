package com.retexspa.xr.ms.ledger.main.core.dto.tabGuidaIdeTransazione;

import com.retexspa.xr.ms.main.core.dto.AggregateIndexUkBaseDTO;

public class TabGuidaIdeTransazioneIndexUkDTO  extends AggregateIndexUkBaseDTO {

    public TabGuidaIdeTransazioneIndexUkDTO() {
    }

    public static String getUk(TabGuidaIdeTransazioneBaseDTO tabGuidaIdeTransazioneBaseDTO) {
        String uk = tabGuidaIdeTransazioneBaseDTO.getIdFormePagamento();
        return uk;
    }

    public static String getIndexName() {
        return "TabGuidaIdeTransazioneIndexUk";
    }

    public static String getIndexAggregateName() {
        return "TabGuidaIdeTransazioneIndexUkAggregate";
    }
}
