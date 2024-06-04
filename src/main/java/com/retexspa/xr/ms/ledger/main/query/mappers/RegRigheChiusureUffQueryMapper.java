package com.retexspa.xr.ms.ledger.main.query.mappers;

import com.retexspa.xr.ms.ledger.main.core.entities.RegRigheChiusureUffQueryDTO;
import com.retexspa.xr.ms.ledger.main.query.entities.RegRigheChiusureUffQueryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface RegRigheChiusureUffQueryMapper {
    RegRigheChiusureUffQueryMapper INSTANCE = Mappers.getMapper(RegRigheChiusureUffQueryMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "codRiga", source = "codRiga")
    @Mapping(target = "desRigaB", source = "desRigaB")
    @Mapping(target = "desRigaL", source = "desRigaL")
    @Mapping(target = "flgCancellato", source = "flgCancellato")
    @Mapping(target = "dataCancellazione", source = "dataCancellazione")
    @Mapping(target = "version", source = "version")
    RegRigheChiusureUffQueryDTO toDTO(RegRigheChiusureUffQueryEntity regRigheChiusureUffQueryEntity);
}

