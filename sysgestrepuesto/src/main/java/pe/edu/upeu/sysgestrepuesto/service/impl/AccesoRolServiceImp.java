package pe.edu.upeu.sysgestrepuesto.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.sysgestrepuesto.model.AccesoRol;
import pe.edu.upeu.sysgestrepuesto.repository.IAccesoRolRepository;
import pe.edu.upeu.sysgestrepuesto.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysgestrepuesto.service.IAccesoRolService;

@Transactional
@Service
@RequiredArgsConstructor

public class AccesoRolServiceImp extends CrudGenericoServiceImp<AccesoRol,Long> implements IAccesoRolService {

    private final IAccesoRolRepository accesoRolRepository;

    @Override
    protected ICrudGenericoRepository<AccesoRol,Long> getRepo(){return accesoRolRepository;}
}
