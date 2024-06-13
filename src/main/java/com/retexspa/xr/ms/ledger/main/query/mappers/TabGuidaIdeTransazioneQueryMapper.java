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
    @Mapping(target = "lista_01", source = "lista_01")
    @Mapping(target = "padDir_01", source = "padDir_01")
    @Mapping(target = "padChr_01", source = "padChr_01")
    @Mapping(target = "posField_01", source = "posField_01")
    @Mapping(target = "lenField_01", source = "lenField_01")
    @Mapping(target = "flgEan_01", source = "flgEan_01")
    @Mapping(target = "tipoField_01", source = "tipoField_01")
    @Mapping(target = "ctrlField_01", source = "ctrlField_01")
    @Mapping(target = "suggField_01", source = "suggField_01")
    @Mapping(target = "lista_02", source = "lista_02")
    @Mapping(target = "padDir_02", source = "padDir_02")
    @Mapping(target = "padChr_02", source = "padChr_02")
    @Mapping(target = "posField_02", source = "posField_02")
    @Mapping(target = "lenField_02", source = "lenField_02")
    @Mapping(target = "flgEan_02", source = "flgEan_02")
    @Mapping(target = "tipoField_02", source = "tipoField_02")
    @Mapping(target = "ctrlField_02", source = "ctrlField_02")
    @Mapping(target = "suggField_02", source = "suggField_02")
    @Mapping(target = "lista_03", source = "lista_03")
    @Mapping(target = "padDir_03", source = "padDir_03")
    @Mapping(target = "padChr_03", source = "padChr_03")
    @Mapping(target = "posField_03", source = "posField_03")
    @Mapping(target = "lenField_03", source = "lenField_03")
    @Mapping(target = "flgEan_03", source = "flgEan_03")
    @Mapping(target = "tipoField_03", source = "tipoField_03")
    @Mapping(target = "ctrlField_03", source = "ctrlField_03")
    @Mapping(target = "suggField_03", source = "suggField_03")
    @Mapping(target = "lista_04", source = "lista_04")
    @Mapping(target = "padDir_04", source = "padDir_04")
    @Mapping(target = "padChr_04", source = "padChr_04")
    @Mapping(target = "posField_04", source = "posField_04")
    @Mapping(target = "lenField_04", source = "lenField_04")
    @Mapping(target = "flgEan_04", source = "flgEan_04")
    @Mapping(target = "tipoField_04", source = "tipoField_04")
    @Mapping(target = "ctrlField_04", source = "ctrlField_04")
    @Mapping(target = "suggField_04", source = "suggField_04")
    @Mapping(target = "flgEanAltro", source = "flgEanAltro")
    @Mapping(target = "descAltro", source = "descAltro")
    @Mapping(target = "lenEan", source = "lenEan")
    @Mapping(target = "flgCancellato", source = "flgCancellato")
    @Mapping(target = "dataCancellazione", source = "dataCancellazione")
    @Mapping(target = "version", source = "version")
    TabGuidaIdeTransazioneQueryDTO toDTO(TabGuidaIdeTransazioneQueryEntity tabGuidaIdeTransazioneQueryEntity);
}
