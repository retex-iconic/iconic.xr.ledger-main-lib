package com.retexspa.xr.ms.ledger.main.query.repositories;

import com.retexspa.xr.ms.ledger.main.query.entities.TabValutaQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TabValutaRepository extends JpaRepository<TabValutaQueryEntity, String>, JpaSpecificationExecutor<TabValutaQueryEntity> {
}
