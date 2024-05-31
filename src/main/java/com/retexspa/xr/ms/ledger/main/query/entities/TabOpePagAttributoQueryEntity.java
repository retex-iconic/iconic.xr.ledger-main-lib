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
        name = "tab_ope_pag_attributi",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "tab_ope_pag_attributi_uk",
                        columnNames = {"tab_ope_pag_id", "attributo_id"})
        })
@Getter
@Setter
public class TabOpePagAttributoQueryEntity {
    @Id
    @NonNull
    private String id;

    @ManyToOne(
            fetch = FetchType.LAZY,
            targetEntity = TabOpePagQueryEntity.class,
            cascade = {CascadeType.PERSIST})
    @JsonIgnore
    private TabOpePagQueryEntity tabOpePag;

    @ManyToOne(fetch = FetchType.LAZY)
    private AttributoQueryEntity attributo;

    @Column(name = "valore")
    private String valore;

    public TabOpePagAttributoQueryEntity() {}

    public TabOpePagAttributoQueryEntity(
            @NotNull String id,
            TabOpePagQueryEntity tabOpePag,
            AttributoQueryEntity attributo,
            String valore) {
        this.id = id;
        this.tabOpePag = tabOpePag;
        this.attributo = attributo;
        this.valore = valore;
    }

}
