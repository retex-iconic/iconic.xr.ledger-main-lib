package com.retexspa.xr.ms.ledger.main.query.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.retexspa.xr.ms.ledger.main.core.dto.tabGuidaIdeTransazione.TabGuidaIdeTransazioneBaseDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tabGuidaIdeTransazione")
@Getter
@Setter
public class TabGuidaIdeTransazioneQueryEntity {
    @Id @NonNull private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_forme_pagamento", referencedColumnName = "id")
    private TabFormePagamentoQueryEntity formePagamento;
    @Column(name = "lista_01")
    private String lista01;
    @Column(name = "padDir_01")
    private String padDir01;
    @Column(name = "padChr_01")
    private String padChr01;
    @Column(name = "posField_01")
    private Integer posField01;
    @Column(name = "lenField_01")
    private Integer lenField01;
    @Column(name = "flgEan_01")
    private String flgEan01;
    @Column(name = "tipoField_01")
    private String tipoField01;
    @Column(name = "ctrlField_01")
    private String ctrlField01;
    @Column(name = "suggField_01")
    private String suggField01;
    @Column(name = "lista_02")
    private String lista02;
    @Column(name = "padDir_02")
    private String padDir02;
    @Column(name = "padChr_02")
    private String padChr02;
    @Column(name = "posField_02")
    private Integer posField02;
    @Column(name = "lenField_02")
    private Integer lenField02;
    @Column(name = "flgEan_02")
    private String flgEan02;
    @Column(name = "tipoField_02")
    private String tipoField02;
    @Column(name = "ctrlField_02")
    private String ctrlField02;
    @Column(name = "suggField_02")
    private String suggField02;
    @Column(name = "lista_03")
    private String lista03;
    @Column(name = "padDir_03")
    private String padDir03;
    @Column(name = "padChr_03")
    private String padChr03;
    @Column(name = "posField_03")
    private Integer posField03;
    @Column(name = "lenField_03")
    private Integer lenField03;
    @Column(name = "flgEan_03")
    private String flgEan03;
    @Column(name = "tipoField_03")
    private String tipoField03;
    @Column(name = "ctrlField_03")
    private String ctrlField03;
    @Column(name = "suggField_03")
    private String suggField03;
    @Column(name = "lista_04")
    private String lista04;
    @Column(name = "padDir_04")
    private String padDir04;
    @Column(name = "padChr_04")
    private String padChr04;
    @Column(name = "posField_04")
    private Integer posField04;
    @Column(name = "lenField_04")
    private Integer lenField04;
    @Column(name = "flgEan_04")
    private String flgEan04;
    @Column(name = "tipoField_04")
    private String tipoField04;
    @Column(name = "ctrlField_04")
    private String ctrlField04;
    @Column(name = "suggField_04")
    private String suggField04;
    @Column(name = "flgEanAltro")
    private String flgEanAltro;
    @Column(name = "descAltro")
    private String descAltro;
    @Column(name = "lenEan")
    private String lenEan;
    @Column(name = "flg_cancellato")
    private String flgCancellato;
    @Column(name = "data_cancellazione")
    private LocalDateTime dataCancellazione;
    @Column(name = "version")
    private Long version;

    public TabGuidaIdeTransazioneQueryEntity() {
    }

    public TabGuidaIdeTransazioneQueryEntity(@NonNull String id,
                                             TabGuidaIdeTransazioneBaseDTO data,
                                             Long version) {
        this.id = id;
        this.lista01 = data.getLista_01();
        this.padDir01 = data.getPadDir_01();
        this.padChr01 = data.getPadChr_01();
        this.posField01 = data.getPosField_01();
        this.lenField01 = data.getLenField_01();
        this.flgEan01 = data.getFlgEan_01();
        this.tipoField01 = data.getTipoField_01();
        this.ctrlField01 = data.getCtrlField_01();
        this.suggField01 = data.getSuggField_01();
        this.lista02 = data.getLista_02();
        this.padDir02 = data.getPadDir_02();
        this.padChr02 = data.getPadChr_02();
        this.posField02 = data.getPosField_02();
        this.lenField02 = data.getLenField_02();
        this.flgEan02 = data.getFlgEan_02();
        this.tipoField02 = data.getTipoField_02();
        this.ctrlField02 = data.getCtrlField_02();
        this.suggField02 = data.getSuggField_02();
        this.lista03 = data.getLista_03();
        this.padDir03 = data.getPadDir_03();
        this.padChr03 = data.getPadChr_03();
        this.posField03 = data.getPosField_03();
        this.lenField03 = data.getLenField_03();
        this.flgEan03 = data.getFlgEan_03();
        this.tipoField03 = data.getTipoField_03();
        this.ctrlField03 = data.getCtrlField_03();
        this.suggField03 = data.getSuggField_03();
        this.lista04 = data.getLista_04();
        this.padDir04 = data.getPadDir_04();
        this.padChr04 = data.getPadChr_04();
        this.posField04 = data.getPosField_04();
        this.lenField04 = data.getLenField_04();
        this.flgEan04 = data.getFlgEan_04();
        this.tipoField04 = data.getTipoField_04();
        this.ctrlField04 = data.getCtrlField_04();
        this.suggField04 = data.getSuggField_04();
        this.flgEanAltro = data.getFlgEanAltro();
        this.descAltro = data.getDescAltro();
        this.lenEan = data.getLenEan();
        this.flgCancellato = data.getFlgCancellato();
        this.version = version;
    }
}
