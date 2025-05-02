package pe.edu.upeu.sysgestrepuesto.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.sysgestrepuesto.model.Venta;
import pe.edu.upeu.sysgestrepuesto.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysgestrepuesto.repository.IVentaRepository;
import pe.edu.upeu.sysgestrepuesto.service.IVentaService;

@Transactional
@Service
@RequiredArgsConstructor

public class VentaServiceImp extends CrudGenericoServiceImp<Venta, Long> implements IVentaService {

    private final IVentaRepository ventaRepository;

    @Override
    protected ICrudGenericoRepository<Venta, Long> getRepo() {
        return ventaRepository;
    }
}
