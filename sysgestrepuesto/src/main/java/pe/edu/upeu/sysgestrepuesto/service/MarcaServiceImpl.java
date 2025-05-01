package pe.edu.upeu.sysgestrepuesto.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysgestrepuesto.exception.ModelNotFoundException;
import pe.edu.upeu.sysgestrepuesto.model.MarcaRepuesto;
import pe.edu.upeu.sysgestrepuesto.repository.IMarcaRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MarcaServiceImpl implements IMarcaService {
    private final IMarcaRepository repository;
    @Override
    public MarcaRepuesto save(MarcaRepuesto t) {
        return repository.save(t);
    }
    @Override
    public MarcaRepuesto update(Long id, MarcaRepuesto t) {
        repository.findById(id).orElseThrow(() -> new
                ModelNotFoundException("ID NOT FOUND: " + id));
        return repository.save(t);
    }
    @Override
    public List<MarcaRepuesto> findAll() {
        return repository.findAll();
    }
    @Override
    public MarcaRepuesto findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new
                ModelNotFoundException("ID NOT FOUND: " + id));
    }
    @Override
    public void delete(Long id) {
        repository.findById(id).orElseThrow(() -> new
                ModelNotFoundException("ID NOT FOUND: " + id));
        repository.deleteById(id);
    }
}
