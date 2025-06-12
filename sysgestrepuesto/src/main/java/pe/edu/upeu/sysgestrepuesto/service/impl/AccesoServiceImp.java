package pe.edu.upeu.sysgestrepuesto.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysgestrepuesto.exception.CustomResponse;
import pe.edu.upeu.sysgestrepuesto.model.Acceso;
import pe.edu.upeu.sysgestrepuesto.repository.IAccesoRepository;
import pe.edu.upeu.sysgestrepuesto.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysgestrepuesto.service.IAccesoService;


import java.util.List;

@Service
@RequiredArgsConstructor
public class AccesoServiceImp extends pe.edu.upeu.sysgestrepuesto.service.impl.CrudGenericoServiceImp<Acceso, Long> implements IAccesoService {
    private final IAccesoRepository repo;
    @Override
    protected ICrudGenericoRepository<Acceso, Long> getRepo() {
        return repo;
    }
    @Override
    public List<Acceso> getAccesoByUser(String username) {
        return repo.getAccesoByUser(username);
    }

    @Override
    public Acceso save(Acceso acceso) {
        return null;
    }

    @Override
    public Acceso update(Long aLong, Acceso acceso) {
        return null;
    }

    @Override
    public List<Acceso> findAll() {
        return List.of();
    }

    @Override
    public Acceso findById(Long aLong) {
        return null;
    }

    @Override
    public CustomResponse delete(Long aLong) {
        return null;
    }
}
