package pe.edu.upeu.sysgestrepuesto.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.sysgestrepuesto.model.Acceso;
import pe.edu.upeu.sysgestrepuesto.repository.IAccesoRepository;
import pe.edu.upeu.sysgestrepuesto.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysgestrepuesto.service.IAccesoService;

@Transactional
@Service
@RequiredArgsConstructor

public class AccesoServiceImp extends CrudGenericoServiceImp<Acceso,Long> implements IAccesoService {

    private final IAccesoRepository accesoRepository;

    @Override
    protected ICrudGenericoRepository<Acceso, Long> getRepo() {
        return accesoRepository;
    }
}
