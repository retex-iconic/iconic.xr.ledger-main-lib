package com.retexspa.xr.ms.ledger.main.query.repositories;

import com.retexspa.xr.ms.ledger.main.query.entities.TabTipiPagamentoAttributoQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;

public interface TabTipiPagamentoAttributoRepository  extends JpaRepository<TabTipiPagamentoAttributoQueryEntity, String>,
        JpaSpecificationExecutor<TabTipiPagamentoAttributoQueryEntity> {

    List<TabTipiPagamentoAttributoQueryEntity> findByTabTipiPagamentoId(String tabTipiPagamentoId);

    void deleteByTabTipiPagamentoId(String tabTipiPagamentoId);

    Optional<TabTipiPagamentoAttributoQueryEntity> findByTabTipiPagamentoIdAndAttributoId(
            String id, String attributoId);

    void deleteByTabTipiPagamentoIdAndAttributoId(String id, String attributoId);

}
