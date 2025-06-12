package pe.edu.upeu.sysgestrepuesto.service;

import pe.edu.upeu.sysgestrepuesto.model.Rol;
import pe.edu.upeu.sysgestrepuesto.model.Usuario;

import java.util.Optional;

public interface IRolService extends ICrudGenericoService<Rol,Long> {
    Optional<Usuario> findOneByUser(String user);

    public Optional<Rol> getByNombre(Rol.RolNombre rolNombre);
}
