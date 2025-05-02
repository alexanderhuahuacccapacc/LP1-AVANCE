package pe.edu.upeu.sysgestrepuesto.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.sysgestrepuesto.model.Emisor;
import pe.edu.upeu.sysgestrepuesto.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysgestrepuesto.repository.IEmisorRepository;
import pe.edu.upeu.sysgestrepuesto.service.IEmisorService;

@Transactional
@Service
@RequiredArgsConstructor

public class EmisorServiceImp extends CrudGenericoServiceImp<Emisor, Long> implements IEmisorService {

    private final IEmisorRepository emisorRepository;

    @Override
    protected ICrudGenericoRepository<Emisor, Long> getRepo() {
        return emisorRepository;
    }
}
