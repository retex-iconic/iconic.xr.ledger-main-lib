package com.retexspa.xr.ms.ledger.main.query.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.retexspa.xr.ms.ledger.main.core.dto.tabFormePagamento.TabFormePagamentoBaseDTO;
import com.retexspa.xr.ms.ledger.main.core.dto.tabTipiPagamento.TabTipiPagamentoBaseDTO;
import com.retexspa.xr.ms.main.core.dto.Enums;
import com.retexspa.xr.ms.main.core.helpers.EnumValidator;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "tabFormePagamento")
public class TabFormePagamentoQueryEntity {
    @Id
    @NonNull
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    private TabTipiPagamentoQueryEntity tipoPagamento;

    @Column(name = "codForPag")
    private Integer codForPag;

    @Column(name = "desForpagb")
    private String desForpagb;
    @Column(name = "desForpagl")
    private String desForpagl;
    @Column(name = "flgAttivo")
    @EnumValidator(enumClazz = Enums.CheckSN.class)
    private String flgAttivo;
    @Column(name = "flgCassaforte")
    @EnumValidator(enumClazz = Enums.CheckSN.class)
    private String flgCassaforte;
    @Column(name = "agg01Pos")
    private Integer agg01Pos;
    @Column(name = "agg01Lun")
    private Integer agg01Lun;
    @Column(name = "agg01Des")
    private String agg01Des;
    @Column(name = "agg02Pos")
    private Integer agg02Pos;
    @Column(name = "agg02Lun")
    private Integer agg02Lun;
    @Column(name = "agg02Des")
    private String agg02Des;
    @Column(name = "agg03Pos")
    private Integer agg03Pos;
    @Column(name = "agg03Lun")
    private Integer agg03Lun;
    @Column(name = "agg03Des")
    private String agg03Des;
    @Column(name = "agg04Pos")
    private Integer agg04Pos;
    @Column(name = "agg04Lun")
    private Integer agg04Lun;
    @Column(name = "agg04Des")
    private String agg04Des;
    @Column(name = "livMinTot")
    private String livMinTot;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tabFormePagamento")
    @JsonIgnore
    private Set<TabFormePagamentoAttributoQueryEntity> tabFormePagamentoAttributi;

    @Column(name = "version")
    private Long version;


    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "FlgCancellato not valid")
    private String flgCancellato;

    private LocalDateTime dataCancellazione;
    public TabFormePagamentoQueryEntity() {
    }

    public TabFormePagamentoQueryEntity(@NonNull String id, TabFormePagamentoBaseDTO tabFormePagamentoBaseDTO,
                                        Long version) {
        this.id = id;
        this.codForPag = tabFormePagamentoBaseDTO.getCodForPag();
        this.desForpagb = tabFormePagamentoBaseDTO.getDesForpagb();
        this.desForpagl = tabFormePagamentoBaseDTO.getDesForpagl();
        this.flgAttivo = tabFormePagamentoBaseDTO.getFlgAttivo();
        this.flgCassaforte = tabFormePagamentoBaseDTO.getFlgCassaforte();
        this.agg01Pos = tabFormePagamentoBaseDTO.getAgg01Pos();
        this.agg01Lun = tabFormePagamentoBaseDTO.getAgg01Lun();
        this.agg01Des = tabFormePagamentoBaseDTO.getAgg01Des();
        this.agg02Pos = tabFormePagamentoBaseDTO.getAgg02Pos();
        this.agg02Lun = tabFormePagamentoBaseDTO.getAgg02Lun();
        this.agg02Des = tabFormePagamentoBaseDTO.getAgg02Des();
        this.agg03Pos = tabFormePagamentoBaseDTO.getAgg03Pos();
        this.agg03Lun = tabFormePagamentoBaseDTO.getAgg03Lun();
        this.agg03Des = tabFormePagamentoBaseDTO.getAgg03Des();
        this.agg04Pos = tabFormePagamentoBaseDTO.getAgg04Pos();
        this.agg04Lun = tabFormePagamentoBaseDTO.getAgg04Lun();
        this.agg04Des = tabFormePagamentoBaseDTO.getAgg04Des();
        this.livMinTot = tabFormePagamentoBaseDTO.getLivMinTot();
        this.version = version;
        this.setFlgCancellato(tabFormePagamentoBaseDTO.getFlgCancellato());
    }
}
