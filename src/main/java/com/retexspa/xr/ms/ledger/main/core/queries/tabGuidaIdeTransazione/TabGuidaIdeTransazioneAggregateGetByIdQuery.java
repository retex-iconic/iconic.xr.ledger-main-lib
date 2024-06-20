package com.retexspa.xr.ms.ledger.main.core.queries.tabGuidaIdeTransazione;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TabGuidaIdeTransazioneAggregateGetByIdQuery {
    private String tabGuidaIdeTransazioneId;

    public TabGuidaIdeTransazioneAggregateGetByIdQuery(@JsonProperty("tabGuidaIdeTransazioneId") String tabGuidaIdeTransazioneId) {
        this.tabGuidaIdeTransazioneId = tabGuidaIdeTransazioneId;
    }
}
