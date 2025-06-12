package pe.edu.upeu.sysgestrepuesto.service;


import pe.edu.upeu.sysgestrepuesto.model.UsuarioRol;

import java.util.List;


public interface IUsuarioRolService extends ICrudGenericoService<UsuarioRol,Long> {
    List<UsuarioRol> findOneByUsuarioUser(String user);
    UsuarioRol save(UsuarioRol ur);

}
