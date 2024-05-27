package com.retexspa.xr.ms.ledger.main.query.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.retexspa.xr.ms.main.query.entities.AttributoQueryEntity;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(
        name = "tab_tipi_pagamento_attributi",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "tab_tipi_pagamento_attributi_uk",
                        columnNames = {"tab_tipi_pagamento_id", "attributo_id"})
        })
public class TabTipiPagamentoAttributoQueryEntity {


        @Id
        @NonNull
        private String id;

        @ManyToOne(
                fetch = FetchType.LAZY,
                targetEntity = TabTipiPagamentoQueryEntity.class,
                cascade = {CascadeType.PERSIST})
        @JsonIgnore
        private TabTipiPagamentoQueryEntity tabTipiPagamento;

        @ManyToOne(fetch = FetchType.LAZY)
        private AttributoQueryEntity attributo;

        @Column(name = "valore")
        private String valore;

        public TabTipiPagamentoAttributoQueryEntity() {}

        public TabTipiPagamentoAttributoQueryEntity(
                @NotNull String id,
                TabTipiPagamentoQueryEntity tabTipiPagamento,
                AttributoQueryEntity attributo,
                String valore) {
                this.id = id;
                this.tabTipiPagamento = tabTipiPagamento;
                this.attributo = attributo;
                this.valore = valore;
        }

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public TabTipiPagamentoQueryEntity getTabTipiPagamento() {
                return tabTipiPagamento;
        }

        public void setTabTipiPagamento(TabTipiPagamentoQueryEntity tabTipiPagamento) {
                this.tabTipiPagamento = tabTipiPagamento;
        }

        public AttributoQueryEntity getAttributo() {
                return attributo;
        }

        public void setAttributo(AttributoQueryEntity attributo) {
                this.attributo = attributo;
        }

        public String getValore() {
                return valore;
        }

        public void setValore(String valore) {
                this.valore = valore;
        }

}
