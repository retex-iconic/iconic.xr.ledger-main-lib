package com.retexspa.xr.ms.ledger.main.query.mappers;

import com.retexspa.xr.ms.ledger.main.core.entities.TabCircuitiCarteQueryDTO;
import com.retexspa.xr.ms.ledger.main.query.entities.TabCircuitiCarteQueryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface TabCircuitiCarteQueryMapper {
    TabCircuitiCarteQueryMapper INSTANCE = Mappers.getMapper(TabCircuitiCarteQueryMapper.class);
    @Mapping(target = "id", source = "id")
    @Mapping(target = "tipoCarta", source = "tipoCarta")
    @Mapping(target = "ordineStampa", source = "ordineStampa")
    @Mapping(target = "idFormePagamento", source = "tabFormePagamentoQueryEntity.id")
    @Mapping(target = "version", source = "version")
    TabCircuitiCarteQueryDTO toDTO(TabCircuitiCarteQueryEntity tabCircuitiCarteQueryEntity);
}
