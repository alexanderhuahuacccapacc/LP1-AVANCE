package pe.edu.upeu.sysgestrepuesto.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.sysgestrepuesto.model.Proveedor;
import pe.edu.upeu.sysgestrepuesto.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysgestrepuesto.repository.IProveedorRepository;
import pe.edu.upeu.sysgestrepuesto.service.IProveedorService;

@Transactional
@Service
@RequiredArgsConstructor

public class ProveedorServiceImp extends CrudGenericoServiceImp<Proveedor, Long> implements IProveedorService {

    private final IProveedorRepository proveedorRepository;

    @Override
    protected ICrudGenericoRepository<Proveedor, Long> getRepo() {
        return proveedorRepository;
    }
}
