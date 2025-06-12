package pe.edu.upeu.sysgestrepuesto.repository;

import pe.edu.upeu.sysgestrepuesto.model.Rol;

import java.util.Optional;

public interface IRolRepository extends ICrudGenericoRepository<Rol,Long>{
    Optional<Rol> findByNombre(Rol.RolNombre rolNombre);

    Optional<Rol> findByDescripcion(String nombre);
}
