package com.retexspa.xr.ms.ledger.main.query.repositories;

import com.retexspa.xr.ms.ledger.main.query.entities.TabTipiPagamentoQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface TabTipiPagamentoRepository extends JpaRepository<TabTipiPagamentoQueryEntity, String>,
        JpaSpecificationExecutor<TabTipiPagamentoQueryEntity> {

    List<TabTipiPagamentoQueryEntity> findAllByCodTipoPag(String codTipoPag);
}
