package pe.edu.upeu.sysgestrepuesto.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.sysgestrepuesto.model.UsuarioRol;
import pe.edu.upeu.sysgestrepuesto.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysgestrepuesto.repository.IUsuarioRolRepository;
import pe.edu.upeu.sysgestrepuesto.service.IUsuarioRolService;

@Transactional
@Service
@RequiredArgsConstructor

public class UsuarioRolServiceImp extends CrudGenericoServiceImp<UsuarioRol, Long>  implements IUsuarioRolService {

    private final IUsuarioRolRepository usuarioRolRepository;


    @Override
    protected ICrudGenericoRepository<UsuarioRol, Long> getRepo() {
        return usuarioRolRepository;
    }
}

