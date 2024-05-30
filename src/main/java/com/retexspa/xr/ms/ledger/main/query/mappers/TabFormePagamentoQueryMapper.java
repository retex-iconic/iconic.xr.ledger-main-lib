package com.retexspa.xr.ms.ledger.main.query.mappers;

import com.retexspa.xr.ms.ledger.main.core.entites.TabFormePagamentoQueryDTO;
import com.retexspa.xr.ms.ledger.main.core.entites.TabTipiOpeQueryDTO;
import com.retexspa.xr.ms.ledger.main.query.entities.TabFormePagamentoQueryEntity;
import com.retexspa.xr.ms.ledger.main.query.entities.TabTipiOpeQueryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.factory.Mappers;

import java.time.LocalDateTime;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface TabFormePagamentoQueryMapper {
    TabFormePagamentoQueryMapper INSTANCE = Mappers.getMapper(TabFormePagamentoQueryMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "codForPag", source = "codForPag")
    @Mapping(target = "desForpagb", source = "desForpagb")
    @Mapping(target = "desForpagl", source = "desForpagl")
    @Mapping(target = "flgAttivo", source = "flgAttivo")
    @Mapping(target = "flgCassaforte", source = "flgCassaforte")
    @Mapping(target = "agg01Pos", source = "agg01Pos")
    @Mapping(target = "agg01Lun", source = "agg01Lun")
    @Mapping(target = "agg01Des", source = "agg01Des")
    @Mapping(target = "agg02Pos", source = "agg02Pos")
    @Mapping(target = "agg02Lun", source = "agg02Lun")
    @Mapping(target = "agg02Des", source = "agg02Des")
    @Mapping(target = "agg03Pos", source = "agg03Pos")
    @Mapping(target = "agg03Lun", source = "agg03Lun")
    @Mapping(target = "agg03Des", source = "agg03Des")
    @Mapping(target = "agg04Pos", source = "agg04Pos")
    @Mapping(target = "agg04Lun", source = "agg04Lun")
    @Mapping(target = "agg04Des", source = "agg04Des")
    @Mapping(target = "livMinTot", source = "livMinTot")
    @Mapping(target = "idTipoPagamento", source = "tipoPagamento.id")
    @Mapping(target = "version", source = "version")
    @Mapping(target = "dataCancellazione", source = "dataCancellazione")
    @Mapping(target = "flgCancellato", source = "flgCancellato")
    TabFormePagamentoQueryDTO toDTO(TabFormePagamentoQueryEntity tabFormePagaamentoQueryEntity);
}
