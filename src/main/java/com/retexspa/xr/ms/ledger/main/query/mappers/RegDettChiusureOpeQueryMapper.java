package com.retexspa.xr.ms.ledger.main.query.mappers;

import com.retexspa.xr.ms.ledger.main.core.entities.RegDettChiusureOpeQueryDTO;
import com.retexspa.xr.ms.ledger.main.query.entities.RegDettChiusureOpeQueryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface RegDettChiusureOpeQueryMapper {
    RegDettChiusureOpeQueryMapper INSTANCE = Mappers.getMapper(RegDettChiusureOpeQueryMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "idRigaChiOpe", source = "rigaChiOpe.id")
    @Mapping(target = "idOpePagC01", source = "opePagC01.id")
    @Mapping(target = "segnoC01", source = "segnoC01")
    @Mapping(target = "idOpePagC02", source = "opePagC02.id")
    @Mapping(target = "segnoC02", source = "segnoC02")
    @Mapping(target = "idOpePagC03", source = "opePagC03.id")
    @Mapping(target = "segnoC03", source = "segnoC03")
    @Mapping(target = "idOpePagC04", source = "opePagC04.id")
    @Mapping(target = "segnoC04", source = "segnoC04")
    @Mapping(target = "flgCancellato", source = "flgCancellato")
    @Mapping(target = "dataCancellazione", source = "dataCancellazione")
    @Mapping(target = "version", source = "version")
    RegDettChiusureOpeQueryDTO toDTO(RegDettChiusureOpeQueryEntity regDettChiusureOpeQueryEntity);
}