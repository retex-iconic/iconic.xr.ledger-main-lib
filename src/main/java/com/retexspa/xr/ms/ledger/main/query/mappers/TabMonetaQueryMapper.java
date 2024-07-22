package com.retexspa.xr.ms.ledger.main.query.mappers;

import com.retexspa.xr.ms.ledger.main.core.entities.TabMonetaQueryDTO;
import com.retexspa.xr.ms.ledger.main.query.entities.TabMonetaQueryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface TabMonetaQueryMapper {
    TabOpePagQueryMapper INSTANCE = Mappers.getMapper(TabOpePagQueryMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "idValuta", source = "tabValuta.id")
    @Mapping(target = "tipoMoneta", source = "tipoMoneta")
    @Mapping(target = "taglioCassetto", source = "taglioCassetto")
    @Mapping(target = "descrizioneTaglio", source = "descrizioneTaglio")
    @Mapping(target = "valoreUnitario", source = "valoreUnitario")
    @Mapping(target = "valoreTubetto", source = "valoreTubetto")
    @Mapping(target = "flgOrdini", source = "flgOrdini")
    @Mapping(target = "flgCassaforte", source = "flgCassaforte")
    @Mapping(target = "flgContasoldiCm", source = "flgContasoldiCm")
    @Mapping(target = "flgContasoldiHm", source = "flgContasoldiHm")
    @Mapping(target = "flgContasoldiVb", source = "flgContasoldiVb")
    @Mapping(target = "flgContasoldiCb", source = "flgContasoldiCb")
    @Mapping(target = "flgInvioBanca", source = "flgInvioBanca")
    @Mapping(target = "flgCancellato", source = "flgCancellato")
    @Mapping(target = "dataCancellazione", source = "dataCancellazione")
    @Mapping(target = "version", source = "version")
    TabMonetaQueryDTO toDTO(TabMonetaQueryEntity tabMonetaQueryEntity);
}
