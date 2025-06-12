package pe.edu.upeu.sysgestrepuesto.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.sysgestrepuesto.model.MarcaRepuesto;
import pe.edu.upeu.sysgestrepuesto.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysgestrepuesto.repository.IMarcaRepository;
import pe.edu.upeu.sysgestrepuesto.service.IMarcaService;



@Primary
@Service("marcaServiceA")
@Transactional
@RequiredArgsConstructor
public class MarcaServiceImp extends CrudGenericoServiceImp<MarcaRepuesto, Long> implements IMarcaService {
    private final IMarcaRepository repo;

    @Override
    protected ICrudGenericoRepository<MarcaRepuesto, Long> getRepo(){

        return repo;
    }

    @Override
    public Long maxID() {
        return repo.maxID().get();
    }
}
