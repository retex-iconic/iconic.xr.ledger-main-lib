package com.retexspa.xr.ms.ledger.main.query.repositories;

import com.retexspa.xr.ms.ledger.main.query.entities.TabCircuitiCarteQueryEntity;
import com.retexspa.xr.ms.ledger.main.query.entities.TabFormePagamentoQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface TabCircuitiCarteRepository extends JpaRepository<TabCircuitiCarteQueryEntity, String>, JpaSpecificationExecutor<TabCircuitiCarteQueryEntity> {
    List<TabCircuitiCarteQueryEntity> findAllByTabFormePagamentoId(String id);
}
