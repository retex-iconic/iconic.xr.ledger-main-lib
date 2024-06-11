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
        name = "reg_test_distinta_fin_attributi",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "reg_test_distinta_fin_attributi_uk",
                        columnNames = {"reg_test_distinta_fin_id", "attributo_id"})
        })
@Getter
@Setter
public class RegTestDistintaFinAttributoQueryEntity {
    @Id
    @NonNull
    private String id;

    @ManyToOne(
            fetch = FetchType.LAZY,
            targetEntity = RegTestDistintaFinQueryEntity.class,
            cascade = {CascadeType.PERSIST})
    @JsonIgnore
    private RegTestDistintaFinQueryEntity regTestDistintaFin;

    @ManyToOne(fetch = FetchType.LAZY)
    private AttributoQueryEntity attributo;

    @Column(name = "valore")
    private String valore;

    public RegTestDistintaFinAttributoQueryEntity() {}

    public RegTestDistintaFinAttributoQueryEntity(
            @NotNull String id,
            RegTestDistintaFinQueryEntity regTestDistintaFin,
            AttributoQueryEntity attributo,
            String valore) {
        this.id = id;
        this.regTestDistintaFin = regTestDistintaFin;
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

    public RegTestDistintaFinQueryEntity getRegTestDistintaFin() {
        return regTestDistintaFin;
    }

    public void setRegTestDistintaFin(RegTestDistintaFinQueryEntity regTestDistintaFin) {
        this.regTestDistintaFin = regTestDistintaFin;
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
