package com.retexspa.xr.ms.ledger.main.query.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.retexspa.xr.ms.main.query.entities.AttributoQueryEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(
        name = "tab_forme_pagamento_attributi",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "tab_forme_pagamento_attributi_uk",
                        columnNames = {"tab_forme_pagamento_id", "attributo_id"})
        })
@Getter
@Setter
public class TabFormePagamentoAttributoQueryEntity {


    @Id
    @NonNull
    private String id;

    @ManyToOne(
            fetch = FetchType.LAZY,
            targetEntity = TabFormePagamentoQueryEntity.class,
            cascade = {CascadeType.PERSIST})
    @JsonIgnore
    private TabFormePagamentoQueryEntity tabFormePagamento;

    @ManyToOne(fetch = FetchType.LAZY)
    private AttributoQueryEntity attributo;

    @Column(name = "valore")
    private String valore;

    public TabFormePagamentoAttributoQueryEntity() {}

    public TabFormePagamentoAttributoQueryEntity(
            @NotNull String id,
            TabFormePagamentoQueryEntity tabFormePagamento,
            AttributoQueryEntity attributo,
            String valore) {
        this.id = id;
        this.tabFormePagamento = tabFormePagamento;
        this.attributo = attributo;
        this.valore = valore;
    }

    @NonNull
    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
        this.id = id;
    }

    public TabFormePagamentoQueryEntity getTabFormePagamento() {
        return tabFormePagamento;
    }

    public void setTabFormePagamento(TabFormePagamentoQueryEntity tabFormePagamento) {
        this.tabFormePagamento = tabFormePagamento;
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
