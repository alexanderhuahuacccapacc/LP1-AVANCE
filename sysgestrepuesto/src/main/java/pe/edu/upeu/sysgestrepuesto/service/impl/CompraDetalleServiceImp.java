package pe.edu.upeu.sysgestrepuesto.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.sysgestrepuesto.model.CompraDetalle;
import pe.edu.upeu.sysgestrepuesto.repository.ICompraDetalleRepository;
import pe.edu.upeu.sysgestrepuesto.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysgestrepuesto.service.IConpraDetalleService;

@Transactional
@Service
@RequiredArgsConstructor

public class CompraDetalleServiceImp extends CrudGenericoServiceImp<CompraDetalle, Long> implements IConpraDetalleService {

    private final ICompraDetalleRepository compraDetalleRepository;

    @Override
    protected ICrudGenericoRepository<CompraDetalle, Long> getRepo() {
        return compraDetalleRepository;
    }
}
