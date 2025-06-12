package pe.edu.upeu.sysgestrepuesto.repository;

import pe.edu.upeu.sysgestrepuesto.model.Usuario;

import java.util.Optional;

public interface IUsuarioRepository extends ICrudGenericoRepository<Usuario,Long>{
    Optional<Usuario> findOneByUser(String user);

}
