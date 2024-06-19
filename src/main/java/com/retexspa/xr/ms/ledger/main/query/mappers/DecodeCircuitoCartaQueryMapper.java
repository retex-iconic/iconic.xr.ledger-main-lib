package com.retexspa.xr.ms.ledger.main.query.mappers;

import com.retexspa.xr.ms.ledger.main.core.entities.DecodeCircuitoCartaQueryDTO;
import com.retexspa.xr.ms.ledger.main.query.entities.DecodeCircuitoCartaQueryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)

public interface DecodeCircuitoCartaQueryMapper {
    DecodeCircuitoCartaQueryMapper INSTANCE = Mappers.getMapper(DecodeCircuitoCartaQueryMapper.class);
    @Mapping(target = "id", source = "id")
    @Mapping(target = "prefisso", source = "prefisso")
    @Mapping(target = "version", source = "version")
    DecodeCircuitoCartaQueryDTO toDTO(DecodeCircuitoCartaQueryEntity decodeCircuitoCartaQueryEntity);
}
