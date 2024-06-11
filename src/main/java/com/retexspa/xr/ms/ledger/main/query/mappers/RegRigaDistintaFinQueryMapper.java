package com.retexspa.xr.ms.ledger.main.query.mappers;

import com.retexspa.xr.ms.ledger.main.core.entities.RegRigaDistintaFinQueryDTO;
import com.retexspa.xr.ms.ledger.main.query.entities.RegRigaDistintaFinQueryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface RegRigaDistintaFinQueryMapper {
    RegRigaDistintaFinQueryMapper INSTANCE = Mappers.getMapper(RegRigaDistintaFinQueryMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "idRigaDistFin", source = "rigaDistFin.id")
    @Mapping(target = "idOpePag", source = "opePag.id")
    @Mapping(target = "segno", source = "segno")
    @Mapping(target = "flgCancellato", source = "flgCancellato")
    @Mapping(target = "dataCancellazione", source = "dataCancellazione")
    @Mapping(target = "version", source = "version")
    RegRigaDistintaFinQueryDTO toDTO(RegRigaDistintaFinQueryEntity regRigaDistintaFinQueryEntity);
}
