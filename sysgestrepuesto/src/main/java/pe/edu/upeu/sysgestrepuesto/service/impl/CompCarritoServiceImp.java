package pe.edu.upeu.sysgestrepuesto.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.sysgestrepuesto.model.CompCarrito;
import pe.edu.upeu.sysgestrepuesto.repository.ICompCarritoRepository;
import pe.edu.upeu.sysgestrepuesto.repository.ICrudGenericoRepository;

@Transactional
@Service
@RequiredArgsConstructor

public class CompCarritoServiceImp extends CrudGenericoServiceImp<CompCarrito,Long> {

    private final ICompCarritoRepository compCarritoRepository;

    @Override
    protected ICrudGenericoRepository<CompCarrito, Long> getRepo() {
        return compCarritoRepository;
    }
}
