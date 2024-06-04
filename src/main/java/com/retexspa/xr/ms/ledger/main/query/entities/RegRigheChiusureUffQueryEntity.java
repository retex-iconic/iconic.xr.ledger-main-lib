package com.retexspa.xr.ms.ledger.main.query.entities;

import com.retexspa.xr.ms.ledger.main.core.dto.regRigheChiusureUff.RegRigheChiusureUffBaseDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "regRigheChiusureUff")
@Getter
@Setter
public class RegRigheChiusureUffQueryEntity {
    @Id
    @NonNull
    private String id;
    @Column(name = "codRiga")
    private Integer codRiga;
    @Column(name = "desRiga_b")
    private String desRigaB;
    @Column(name = "desRiga_l")
    private String desRigaL;
    @Column(name = "flgCancellato")
    private String flgCancellato;
    @Column(name = "data_cancellazione")
    private LocalDateTime dataCancellazione;
    @Column(name = "version")
    private Long version;
    public RegRigheChiusureUffQueryEntity() {
    }

    public RegRigheChiusureUffQueryEntity(
            @NonNull String id,
            RegRigheChiusureUffBaseDTO data,
            Long version)  {
        this.id = id;
        this.codRiga = data.getCodRiga();
        this.desRigaB = data.getDesRigaB();
        this.desRigaL = data.getDesRigaL();
        this.flgCancellato = data.getFlgCancellato();
        this.version =version;
    }
}
