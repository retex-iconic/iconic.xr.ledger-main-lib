package com.retexspa.xr.ms.ledger.main.query.repositories;

import com.retexspa.xr.ms.ledger.main.query.entities.TabFormePagamentoAttributoQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface TabFormePagamentoAttributoRepository extends JpaRepository<TabFormePagamentoAttributoQueryEntity, String>,
        JpaSpecificationExecutor<TabFormePagamentoAttributoQueryEntity> {

    List<TabFormePagamentoAttributoQueryEntity> findByTabFormePagamentoId(String tabFormePagamentoId);

    void deleteByTabFormePagamentoId(String tabFormePagamentoId);

    List<TabFormePagamentoAttributoQueryEntity> findByTabFormePagamentoIdAndAttributoId(
            String id, String attributoId);

    void deleteByTabFormePagamentoIdAndAttributoId(String id, String attributoId);

}
