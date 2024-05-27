package com.retexspa.xr.ms.ledger.main.query.mappers;

import com.retexspa.xr.ms.ledger.main.core.entities.TabTipiOpeQueryDTO;
import com.retexspa.xr.ms.ledger.main.query.entities.TabTipiOpeQueryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface TabTipiOpeQueryMapper {
    TabTipiOpeQueryMapper INSTANCE = Mappers.getMapper(TabTipiOpeQueryMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "codTipope", source = "codTipope")
    @Mapping(target = "desTipopeB", source = "desTipopeB")
    @Mapping(target = "desTipopeL", source = "desTipopeL")
    @Mapping(target = "flgCassaForte", source = "flgCassaForte")
    @Mapping(target = "flgBarriera", source = "flgBarriera")
    @Mapping(target = "flgRichiestaUg", source = "flgRichiestaUg")
    @Mapping(target = "flgRichiestaCassiere", source = "flgRichiestaCassiere")
    @Mapping(target = "variazioneFondoCassa", source = "variazioneFondoCassa")
    @Mapping(target = "segnoModificaVenduto", source = "segnoModificaVenduto")
    @Mapping(target = "flgVersamento", source = "flgVersamento")
    @Mapping(target = "flgServizio", source = "flgServizio")
    @Mapping(target = "flgUfficio", source = "flgUfficio")
    @Mapping(target = "flgCancellato", source = "flgCancellato")
    @Mapping(target = "version", source = "version")
    TabTipiOpeQueryDTO toDTO(TabTipiOpeQueryEntity tabTipiOpeQueryEntity);
}
