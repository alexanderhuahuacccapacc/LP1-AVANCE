package pe.edu.upeu.sysgestrepuesto.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.sysgestrepuesto.model.VentCarrito;
import pe.edu.upeu.sysgestrepuesto.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysgestrepuesto.repository.IVentCarritoRepository;
import pe.edu.upeu.sysgestrepuesto.service.IVentCarritoService;

@Transactional
@Service
@RequiredArgsConstructor

public class VentCarritoServiceImp extends CrudGenericoServiceImp<VentCarrito, Long> implements IVentCarritoService {

    private final IVentCarritoRepository ventCarritoRepository;


    @Override
    protected ICrudGenericoRepository<VentCarrito, Long> getRepo() {
        return ventCarritoRepository;
    }
}
