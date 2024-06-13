package com.retexspa.xr.ms.ledger.main.query.repositories;

import com.retexspa.xr.ms.ledger.main.query.entities.TabGuidaIdeTransazioneQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TabGuidaIdeTransazioneRepository  extends JpaRepository<TabGuidaIdeTransazioneQueryEntity, String>, JpaSpecificationExecutor<TabGuidaIdeTransazioneQueryEntity> {
}
