package pe.edu.upeu.sysgestrepuesto.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.sysgestrepuesto.model.VentaDetalle;
import pe.edu.upeu.sysgestrepuesto.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysgestrepuesto.repository.IVentaDetalleRepository;
import pe.edu.upeu.sysgestrepuesto.service.IVentaDetalleService;

@Transactional
@Service
@RequiredArgsConstructor

public class VentaDetalleServiceImp extends CrudGenericoServiceImp<VentaDetalle, Long> implements IVentaDetalleService {

   private final IVentaDetalleRepository ventaDetalleRepository;

    @Override
    protected ICrudGenericoRepository<VentaDetalle, Long> getRepo() {
        return ventaDetalleRepository;
    }
}
