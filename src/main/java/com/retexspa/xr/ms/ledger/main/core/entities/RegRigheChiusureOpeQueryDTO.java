package com.retexspa.xr.ms.ledger.main.core.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
@Getter
@Setter
public class RegRigheChiusureOpeQueryDTO {
    private String id;
    private Integer codRiga;
    private String desRigaB;
    private String desRigaL;
    private String flgCancellato;
    private Long version;
}
