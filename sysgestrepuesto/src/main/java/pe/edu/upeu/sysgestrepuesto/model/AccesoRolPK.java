package pe.edu.upeu.sysgestrepuesto.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode

public class AccesoRolPK {
    @ManyToOne
    @JoinColumn(name = "acceso_id")
    private Acceso acceso;
    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Rol rol;
}