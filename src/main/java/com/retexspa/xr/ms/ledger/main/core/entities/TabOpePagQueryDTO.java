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
public class TabOpePagQueryDTO {
    private String id;
    private String idFormePagamento;
    private String idTipiOpe;
    private String desOpepagB;
    private String desOpepagL;
    private String flgDettDistFin;
    private Integer numRappFin;
    private String flgMovChiusura;
    private String flgMovUfficio;
    private String flgRetChiusura;
    private String flgRetFpag;
    private String flgTnvMovRfsComm;
    private String flgTnvMovIva;
    private String flgDettDistFinMod;
    private String flgMovInserimento;
    private String flgCertifIncassi;
    private String flgCancellato;
    private LocalDateTime dataCancellazione;
    private Long version;
}
