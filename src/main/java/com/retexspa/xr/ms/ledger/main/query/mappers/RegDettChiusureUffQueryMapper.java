package com.retexspa.xr.ms.ledger.main.query.mappers;

import com.retexspa.xr.ms.ledger.main.core.entities.RegDettChiusureUffQueryDTO;
import com.retexspa.xr.ms.ledger.main.query.entities.RegDettChiusureUffQueryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface RegDettChiusureUffQueryMapper {
    RegDettChiusureUffQueryMapper INSTANCE = Mappers.getMapper(RegDettChiusureUffQueryMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "idRigaChiUff", source = "rigaChiUff.id")
    @Mapping(target = "idOpePagC01", source = "opePagC01.id")
    @Mapping(target = "segnoC01", source = "segnoC01")
    @Mapping(target = "idOpePagC02", source = "opePagC02.id")
    @Mapping(target = "segnoC02", source = "segnoC02")
    @Mapping(target = "flgCancellato", source = "flgCancellato")
    @Mapping(target = "dataCancellazione", source = "dataCancellazione")
    @Mapping(target = "version", source = "version")
    RegDettChiusureUffQueryDTO toDTO(RegDettChiusureUffQueryEntity regDettChiusureUffQueryEntity);
}
