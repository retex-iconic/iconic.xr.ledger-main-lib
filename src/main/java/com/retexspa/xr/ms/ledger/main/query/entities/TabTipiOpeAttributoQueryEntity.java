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
        name = "tab_tipi_ope_attributi",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "tab_tipi_ope_attributi_uk",
                        columnNames = {"tab_tipi_ope_id", "attributo_id"})
        })
@Getter
@Setter
public class TabTipiOpeAttributoQueryEntity {
    @Id @NonNull private String id;

    @ManyToOne(
            fetch = FetchType.LAZY,
            targetEntity = TabTipiOpeQueryEntity.class,
            cascade = {CascadeType.PERSIST})
    @JsonIgnore
    private TabTipiOpeQueryEntity tabTipiOpe;

    @ManyToOne(fetch = FetchType.LAZY)
    private AttributoQueryEntity attributo;

    @Column(name = "valore")
    private String valore;

    public TabTipiOpeAttributoQueryEntity() {}

    public TabTipiOpeAttributoQueryEntity(
            @NotNull String id,
            TabTipiOpeQueryEntity tabTipiOpe,
            AttributoQueryEntity attributo,
            String valore) {
        this.id = id;
        this.tabTipiOpe = tabTipiOpe;
        this.attributo = attributo;
        this.valore = valore;
    }

}

