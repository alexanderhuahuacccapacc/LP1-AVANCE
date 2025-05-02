package pe.edu.upeu.sysgestrepuesto.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.sysgestrepuesto.model.Rol;
import pe.edu.upeu.sysgestrepuesto.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysgestrepuesto.repository.IRolRepository;
import pe.edu.upeu.sysgestrepuesto.service.IRolService;

@Transactional
@Service
@RequiredArgsConstructor

public class RolServiceImp extends CrudGenericoServiceImp<Rol, Long> implements IRolService {

    private final IRolRepository rolRepository;

    @Override
    protected ICrudGenericoRepository<Rol, Long> getRepo() {
        return rolRepository;
    }
}
