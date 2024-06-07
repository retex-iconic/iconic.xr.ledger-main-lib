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
public class RegTestDistintaFinQueryDTO {
    private String id;
    private Integer codRiga;
    private String desRigaB;
    private String desRigaL;
    private String flgVisSoloMov;
    private String flgQuadraturaCommerciale;
    private String flgQuadraturaVersato;
    private String flgQuadraturaServizi;
    private String flgImpFatturato;
    private String flgImpNonFatturato;
    private String flgImpRimborsiFsIva;
    private String flgFondoCassa;
    private String flgFondiCassetti;
    private String flgFondiCassieri;
    private String flgCancellato;
    private LocalDateTime dataCancellazione;
    private Long version;
}
