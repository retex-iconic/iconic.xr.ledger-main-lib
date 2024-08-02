package com.retexspa.xr.ms.ledger.main.query.repositories;

import com.retexspa.xr.ms.ledger.main.query.entities.TabOpePagQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface TabOpePagRepository  extends JpaRepository<TabOpePagQueryEntity, String>, JpaSpecificationExecutor<TabOpePagQueryEntity> {
   List<TabOpePagQueryEntity> findAllByTipiOpeId(String tipiOpe);
}
