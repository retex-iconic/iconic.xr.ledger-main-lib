package com.retexspa.xr.ms.ledger.main.query.entities;

import com.retexspa.xr.ms.ledger.main.core.dto.tabCircuitiCarte.TabCircuitiCarteBaseDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "TabCircuitiCarte")
@Getter
@Setter
public class TabCircuitiCarteQueryEntity {
    @Id
    @NonNull
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    private TabFormePagamentoQueryEntity tabFormePagamento;

    @Column(name = "tipoCarta")
    private String tipoCarta;

    @Column(name = "ordineStampa")
    private Integer ordineStampa;

    @Column(name = "version")
    private Long version;

    @Column(name = "dataCancellazione")
    private LocalDateTime dataCancellazione;

    @Column(name = "flgCancellato")
    private String flgCancellato;

    public TabCircuitiCarteQueryEntity() {
    }

    public TabCircuitiCarteQueryEntity(@NonNull String id,
                                       TabCircuitiCarteBaseDTO data,
                                       Long version) {
        this.id = id;
        this.tipoCarta = data.getTipoCarta();
        this.ordineStampa = data.getOrdineStampa();
        this.flgCancellato =data.getFlgCancellato();
        this.version = version;
    }


}
