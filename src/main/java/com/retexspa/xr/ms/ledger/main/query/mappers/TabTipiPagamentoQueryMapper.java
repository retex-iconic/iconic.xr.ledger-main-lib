package com.retexspa.xr.ms.ledger.main.query.mappers;

import com.retexspa.xr.ms.ledger.main.core.entities.TabTipiPagamentoQueryDTO;
import com.retexspa.xr.ms.ledger.main.query.entities.TabTipiPagamentoQueryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface TabTipiPagamentoQueryMapper {
    TabTipiPagamentoQueryMapper INSTANCE = Mappers.getMapper(TabTipiPagamentoQueryMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "codTipoPag", source = "codTipoPag")
    @Mapping(target = "desTipoPagb", source = "desTipoPagb")
    @Mapping(target = "desTipoPagl", source = "desTipoPagl")
    @Mapping(target = "flgContante", source = "flgContante")
    @Mapping(target = "flgAssegno", source = "flgAssegno")
    @Mapping(target = "flgPos", source = "flgPos")
    @Mapping(target = "flgNonRiscosso", source = "flgNonRiscosso")
    @Mapping(target = "flgSostDenaro", source = "flgSostDenaro")
    @Mapping(target = "flgBuoniEnti", source = "flgBuoniEnti")
    @Mapping(target = "flgBuoniDay", source = "flgBuoniDay")
    @Mapping(target = "flgFatturaPagata", source = "flgFatturaPagata")
    @Mapping(target = "flgBuoniCeliaci", source = "flgBuoniCeliaci")
    @Mapping(target = "version", source = "version")
    @Mapping(target = "dataCancellazione", source = "dataCancellazione")
    @Mapping(target = "flgCancellato", source = "flgCancellato")
    TabTipiPagamentoQueryDTO toDTO(TabTipiPagamentoQueryEntity tabTipiPagamentoQueryEntity);

}
