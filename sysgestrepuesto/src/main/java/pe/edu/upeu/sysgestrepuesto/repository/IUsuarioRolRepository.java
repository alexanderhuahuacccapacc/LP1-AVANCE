package pe.edu.upeu.sysgestrepuesto.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upeu.sysgestrepuesto.model.UsuarioRol;
import pe.edu.upeu.sysgestrepuesto.model.UsuarioRolPK;

import java.util.List;


public interface IUsuarioRolRepository extends ICrudGenericoRepository<UsuarioRol, UsuarioRolPK> {
    @Query("SELECT ur FROM UsuarioRol ur WHERE ur.usuario.user = :user")//Consulta JPQL
    List<UsuarioRol> findOneByUsuarioUser(@Param("user") String user);

}
