package com.retexspa.xr.ms.ledger.main.query.repositories;

import com.retexspa.xr.ms.ledger.main.query.entities.TabFormePagamentoQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface TabFormePagamentoRepository extends JpaRepository<TabFormePagamentoQueryEntity, String>,
        JpaSpecificationExecutor<TabFormePagamentoQueryEntity> {

    List<TabFormePagamentoQueryEntity> findAllByCodForPag(String codForPag);

    List<TabFormePagamentoQueryEntity> findAllByTipoPagamentoId(String id);
}
