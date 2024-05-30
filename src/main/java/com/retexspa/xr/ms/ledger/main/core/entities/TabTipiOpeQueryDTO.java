package com.retexspa.xr.ms.ledger.main.core.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.time.LocalDateTime;


@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
@Getter
@Setter
public class TabTipiOpeQueryDTO {
    private String id;
    private Integer codTipope;
    private String desTipopeB;
    private String desTipopeL;
    private String flgCassaForte;
    private String flgBarriera;
    private String flgRichiestaUg;
    private String flgRichiestaCassiere;
    private String variazioneFondoCassa;
    private String segnoModificaVenduto;
    private String flgVersamento;
    private String flgServizio;
    private String flgUfficio;
    private String flgCancellato;
    private LocalDateTime dataCancellazione;
    private Long version;
}
