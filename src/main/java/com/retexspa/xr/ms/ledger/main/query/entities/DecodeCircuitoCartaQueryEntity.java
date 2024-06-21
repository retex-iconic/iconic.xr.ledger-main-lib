package com.retexspa.xr.ms.ledger.main.query.entities;

import com.retexspa.xr.ms.ledger.main.core.dto.decodeCircuitoCarta.DecodeCircuitoCartaBaseDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "DecodeCircuitoCarta")
@Getter
@Setter
public class DecodeCircuitoCartaQueryEntity {
    @Id
    @NonNull
    private String id;

    @Column(name = "prefisso")
    private String prefisso;

    @ManyToOne(fetch = FetchType.LAZY)
    private TabCircuitiCarteQueryEntity tipoCarta;

    @Column(name = "version")
    private Long version;

    @Column(name = "dataCancellazione")
    private LocalDateTime dataCancellazione;

    @Column(name = "flgCancellato")
    private String flgCancellato;

    public DecodeCircuitoCartaQueryEntity() {
    }

    public DecodeCircuitoCartaQueryEntity(@NonNull String id,
                                          DecodeCircuitoCartaBaseDTO data,
                                       Long version) {
        this.id = id;
        this.prefisso = data.getPrefisso();
        this.flgCancellato =data.getFlgCancellato();
        this.version = version;
    }

}
