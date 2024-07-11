package com.retexspa.xr.ms.ledger.main.core.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.math.BigDecimal;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
@Getter
@Setter
public class TabValutaQueryDTO {

    private String id;

    private String codValuta;

    private String nome;

    private String descrizione;

    private String flgValutaPrevalente;

    private String flgCambioFisso;

    private String flgAbilitazioneOrdini;

    private BigDecimal importoCambioValPrev;

    private Integer numeroDecimali;

    private String formato;

    private Long version;
}
