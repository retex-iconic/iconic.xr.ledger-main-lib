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
public class RegDettChiusureOpeQueryDTO {
    private String id;
    private String idRigaChiOpe;
    private String idOpePagC01;
    private String segnoC01;
    private String idOpePagC02;
    private String segnoC02;
    private String idOpePagC03;
    private String segnoC03;
    private String idOpePagC04;
    private String segnoC04;
    private String flgCancellato;
    private LocalDateTime dataCancellazione;
    private Long version;
}
