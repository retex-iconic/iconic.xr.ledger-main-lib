package com.retexspa.xr.ms.ledger.main.query.mappers;

import com.retexspa.xr.ms.ledger.main.core.entities.TabCircuitiCarteQueryDTO;
import com.retexspa.xr.ms.ledger.main.core.entities.TabValutaQueryDTO;
import com.retexspa.xr.ms.ledger.main.query.entities.TabValutaQueryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface TabValutaQueryMapper {
    TabValutaQueryMapper INSTANCE = Mappers.getMapper(TabValutaQueryMapper.class);
    @Mapping(target = "id", source = "id")
    @Mapping(target = "codValuta", source = "codValuta")
    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "descrizione", source = "descrizione")
    @Mapping(target = "flgValutaPrevalente", source = "flgValutaPrevalente")
    @Mapping(target = "flgCambioFisso", source = "flgCambioFisso")
    @Mapping(target = "flgAbilitazioneOrdini", source = "flgAbilitazioneOrdini")
    @Mapping(target = "importoCambioValPrev", source = "importoCambioValPrev")
    @Mapping(target = "numeroDecimali", source = "numeroDecimali")
    @Mapping(target = "formato", source = "formato")
    @Mapping(target = "version", source = "version")
    TabValutaQueryDTO toDTO(TabValutaQueryEntity tabValutaQueryEntity);
}
