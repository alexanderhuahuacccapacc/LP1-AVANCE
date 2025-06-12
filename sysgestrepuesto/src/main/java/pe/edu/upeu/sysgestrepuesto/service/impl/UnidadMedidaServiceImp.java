package pe.edu.upeu.sysgestrepuesto.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.sysgestrepuesto.model.UnidadMedida;
import pe.edu.upeu.sysgestrepuesto.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysgestrepuesto.repository.IUnidadMediaRepository;
import pe.edu.upeu.sysgestrepuesto.service.IUnidadMedidaService;


@Service
@Transactional
@RequiredArgsConstructor
public class UnidadMedidaServiceImp extends CrudGenericoServiceImp<UnidadMedida, Long> implements IUnidadMedidaService {

    private final IUnidadMediaRepository repo;
    @Override
    protected ICrudGenericoRepository<UnidadMedida, Long> getRepo() {
        return repo;
    }
}
