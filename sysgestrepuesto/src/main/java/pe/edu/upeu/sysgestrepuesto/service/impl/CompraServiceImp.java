package pe.edu.upeu.sysgestrepuesto.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.sysgestrepuesto.model.Compra;
import pe.edu.upeu.sysgestrepuesto.repository.ICompraRepository;
import pe.edu.upeu.sysgestrepuesto.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysgestrepuesto.service.ICompraService;

@Transactional
@Service
@RequiredArgsConstructor

public class CompraServiceImp extends CrudGenericoServiceImp<Compra, Long> implements ICompraService{

    private final ICompraRepository compraRepository;

    @Override
    protected ICrudGenericoRepository<Compra, Long> getRepo() {
        return compraRepository;
    }
}
