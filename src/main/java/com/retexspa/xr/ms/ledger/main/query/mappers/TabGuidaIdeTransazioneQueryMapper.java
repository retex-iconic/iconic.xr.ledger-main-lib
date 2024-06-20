package com.retexspa.xr.ms.ledger.main.query.mappers;

import com.retexspa.xr.ms.ledger.main.core.entities.TabGuidaIdeTransazioneQueryDTO;
import com.retexspa.xr.ms.ledger.main.query.entities.TabGuidaIdeTransazioneQueryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface TabGuidaIdeTransazioneQueryMapper {
    TabGuidaIdeTransazioneQueryMapper INSTANCE = Mappers.getMapper(TabGuidaIdeTransazioneQueryMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "idFormePagamento", source = "formePagamento.id")
    @Mapping(target = "lista_01", source = "lista01")
    @Mapping(target = "padDir_01", source = "padDir01")
    @Mapping(target = "padChr_01", source = "padChr01")
    @Mapping(target = "posField_01", source = "posField01")
    @Mapping(target = "lenField_01", source = "lenField01")
    @Mapping(target = "flgEan_01", source = "flgEan01")
    @Mapping(target = "tipoField_01", source = "tipoField01")
    @Mapping(target = "ctrlField_01", source = "ctrlField01")
    @Mapping(target = "suggField_01", source = "suggField01")
    @Mapping(target = "lista_02", source = "lista02")
    @Mapping(target = "padDir_02", source = "padDir02")
    @Mapping(target = "padChr_02", source = "padChr02")
    @Mapping(target = "posField_02", source = "posField02")
    @Mapping(target = "lenField_02", source = "lenField02")
    @Mapping(target = "flgEan_02", source = "flgEan02")
    @Mapping(target = "tipoField_02", source = "tipoField02")
    @Mapping(target = "ctrlField_02", source = "ctrlField02")
    @Mapping(target = "suggField_02", source = "suggField02")
    @Mapping(target = "lista_03", source = "lista03")
    @Mapping(target = "padDir_03", source = "padDir03")
    @Mapping(target = "padChr_03", source = "padChr03")
    @Mapping(target = "posField_03", source = "posField03")
    @Mapping(target = "lenField_03", source = "lenField03")
    @Mapping(target = "flgEan_03", source = "flgEan03")
    @Mapping(target = "tipoField_03", source = "tipoField03")
    @Mapping(target = "ctrlField_03", source = "ctrlField03")
    @Mapping(target = "suggField_03", source = "suggField03")
    @Mapping(target = "lista_04", source = "lista04")
    @Mapping(target = "padDir_04", source = "padDir04")
    @Mapping(target = "padChr_04", source = "padChr04")
    @Mapping(target = "posField_04", source = "posField04")
    @Mapping(target = "lenField_04", source = "lenField04")
    @Mapping(target = "flgEan_04", source = "flgEan04")
    @Mapping(target = "tipoField_04", source = "tipoField04")
    @Mapping(target = "ctrlField_04", source = "ctrlField04")
    @Mapping(target = "suggField_04", source = "suggField04")
    @Mapping(target = "flgEanAltro", source = "flgEanAltro")
    @Mapping(target = "descAltro", source = "descAltro")
    @Mapping(target = "lenEan", source = "lenEan")
    @Mapping(target = "flgCancellato", source = "flgCancellato")
    @Mapping(target = "dataCancellazione", source = "dataCancellazione")
    @Mapping(target = "version", source = "version")
    TabGuidaIdeTransazioneQueryDTO toDTO(TabGuidaIdeTransazioneQueryEntity tabGuidaIdeTransazioneQueryEntity);
}
