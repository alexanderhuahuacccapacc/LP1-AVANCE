package pe.edu.upeu.sysgestrepuesto.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.sysgestrepuesto.model.Rol;
import pe.edu.upeu.sysgestrepuesto.model.Usuario;
import pe.edu.upeu.sysgestrepuesto.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysgestrepuesto.repository.IRolRepository;
import pe.edu.upeu.sysgestrepuesto.service.IRolService;


import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class RolServiceImp extends CrudGenericoServiceImp<Rol, Long> implements IRolService {
    private final IRolRepository repo;
    @Override
    protected ICrudGenericoRepository<Rol, Long> getRepo() {
        return repo;
    }

    @Override
    public Optional<Usuario> findOneByUser(String user) {
        return Optional.empty();
    }

    @Override
    public Optional<Rol> getByNombre(Rol.RolNombre rolNombre) {
        return repo.findByNombre(rolNombre);
    }

}
