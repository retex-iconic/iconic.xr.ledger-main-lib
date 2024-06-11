package com.retexspa.xr.ms.ledger.main.query.mappers;

import com.retexspa.xr.ms.ledger.main.core.entities.RegTestDistintaFinQueryDTO;
import com.retexspa.xr.ms.ledger.main.query.entities.RegTestDistintaFinQueryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface RegTestDistintaFinQueryMapper {
    RegTestDistintaFinQueryMapper INSTANCE = Mappers.getMapper(RegTestDistintaFinQueryMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "codRiga", source = "codRiga")
    @Mapping(target = "desRigaB", source = "desRigaB")
    @Mapping(target = "desRigaL", source = "desRigaL")
    @Mapping(target = "flgVisSoloMov", source = "flgVisSoloMov")
    @Mapping(target = "flgQuadraturaCommerciale", source = "flgQuadraturaCommerciale")
    @Mapping(target = "flgQuadraturaVersato", source = "flgQuadraturaVersato")
    @Mapping(target = "flgQuadraturaServizi", source = "flgQuadraturaServizi")
    @Mapping(target = "flgImpFatturato", source = "flgImpFatturato")
    @Mapping(target = "flgImpNonFatturato", source = "flgImpNonFatturato")
    @Mapping(target = "flgImpRimborsiFsIva", source = "flgImpRimborsiFsIva")
    @Mapping(target = "flgFondiCassetti", source = "flgFondiCassetti")
    @Mapping(target = "flgFondiCassieri", source = "flgFondiCassieri")
    @Mapping(target = "flgCancellato", source = "flgCancellato")
    @Mapping(target = "dataCancellazione", source = "dataCancellazione")
    @Mapping(target = "version", source = "version")
    RegTestDistintaFinQueryDTO toDTO(RegTestDistintaFinQueryEntity regTestDistintaFinQueryEntity);
}
