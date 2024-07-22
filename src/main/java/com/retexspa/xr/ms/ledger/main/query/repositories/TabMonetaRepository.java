package com.retexspa.xr.ms.ledger.main.query.repositories;

import com.retexspa.xr.ms.ledger.main.query.entities.TabMonetaQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TabMonetaRepository  extends JpaRepository<TabMonetaQueryEntity, String>, JpaSpecificationExecutor<TabMonetaQueryEntity> {
}
