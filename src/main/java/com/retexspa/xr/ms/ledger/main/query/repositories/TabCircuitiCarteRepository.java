package com.retexspa.xr.ms.ledger.main.query.repositories;

import com.retexspa.xr.ms.ledger.main.query.entities.TabCircuitiCarteQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TabCircuitiCarteRepository extends JpaRepository<TabCircuitiCarteQueryEntity, String>, JpaSpecificationExecutor<TabCircuitiCarteQueryEntity> {
}
