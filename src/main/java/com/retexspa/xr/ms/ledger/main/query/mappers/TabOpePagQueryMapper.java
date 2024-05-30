package com.retexspa.xr.ms.ledger.main.query.mappers;

import com.retexspa.xr.ms.ledger.main.core.entities.TabOpePagQueryDTO;
import com.retexspa.xr.ms.ledger.main.query.entities.TabOpePagQueryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface TabOpePagQueryMapper {
    TabOpePagQueryMapper INSTANCE = Mappers.getMapper(TabOpePagQueryMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "idFormePagamento", source = "formePagamento.id")
    @Mapping(target = "idTipiOpe", source = "tipiOpe.id")
    @Mapping(target = "desOpepagB", source = "desOpepagB")
    @Mapping(target = "desOpepagL", source = "desOpepagL")
    @Mapping(target = "flgDettDistFin", source = "flgDettDistFin")
    @Mapping(target = "numRappFin", source = "numRappFin")
    @Mapping(target = "flgMovChiusura", source = "flgMovChiusura")
    @Mapping(target = "flgMovUfficio", source = "flgMovUfficio")
    @Mapping(target = "flgRetChiusura", source = "flgRetChiusura")
    @Mapping(target = "flgRetFpag", source = "flgRetFpag")
    @Mapping(target = "flgTnvMovRfsComm", source = "flgTnvMovRfsComm")
    @Mapping(target = "flgTnvMovIva", source = "flgTnvMovIva")
    @Mapping(target = "flgDettDistFinMod", source = "flgDettDistFinMod")
    @Mapping(target = "flgMovInserimento", source = "flgMovInserimento")
    @Mapping(target = "flgCertifIncassi", source = "flgCertifIncassi")
    @Mapping(target = "flgCancellato", source = "flgCancellato")
    @Mapping(target = "dataCancellazione", source = "dataCancellazione")
    @Mapping(target = "version", source = "version")
    TabOpePagQueryDTO toDTO(TabOpePagQueryEntity tabOpePagQueryEntity);
}
