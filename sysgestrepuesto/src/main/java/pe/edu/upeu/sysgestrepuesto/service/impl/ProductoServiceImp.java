package pe.edu.upeu.sysgestrepuesto.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.sysgestrepuesto.model.Producto;
import pe.edu.upeu.sysgestrepuesto.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysgestrepuesto.repository.IProductoRepository;
import pe.edu.upeu.sysgestrepuesto.service.IProductoService;

@Transactional
@Service
@RequiredArgsConstructor

public class ProductoServiceImp extends CrudGenericoServiceImp<Producto, Long> implements IProductoService {

   private final IProductoRepository productoRepository;

    @Override
    protected ICrudGenericoRepository<Producto, Long> getRepo() {
        return productoRepository;
    }
}
