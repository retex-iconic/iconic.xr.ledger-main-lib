package com.retexspa.xr.ms.ledger.main.core.queries.tabGuidaIdeTransazione;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TabGuidaIdeTransazioneAggregateGetEventsByIdQuery {
    private String tabGuidaIdeTransazioneId;

    public TabGuidaIdeTransazioneAggregateGetEventsByIdQuery(@JsonProperty("tabGuidaIdeTransazioneId") String tabGuidaIdeTransazioneId) {
        this.tabGuidaIdeTransazioneId = tabGuidaIdeTransazioneId;
    }
}
