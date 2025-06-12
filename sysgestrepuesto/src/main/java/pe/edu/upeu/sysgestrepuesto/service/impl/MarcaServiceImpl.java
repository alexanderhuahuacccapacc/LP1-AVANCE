package pe.edu.upeu.sysgestrepuesto.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.sysgestrepuesto.exception.ModelNotFoundException;
import pe.edu.upeu.sysgestrepuesto.model.MarcaRepuesto;
import pe.edu.upeu.sysgestrepuesto.repository.IMarcaRepository;
import pe.edu.upeu.sysgestrepuesto.service.IMarcaService;
import pe.edu.upeu.sysgestrepuesto.exception.CustomResponse;


import java.util.List;
import java.time.LocalDateTime;

@Primary
@Transactional
@Service("marcaServiceA")
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
    public CustomResponse delete(Long id) {
        repository.findById(id).orElseThrow(() -> new
                ModelNotFoundException("ID NOT FOUND: " + id));
        repository.deleteById(id);
        CustomResponse cer=new CustomResponse();
        cer.setStatusCode(200);
        cer.setDatetime(LocalDateTime.now());
        cer.setMessage("true");
        cer.setDetails("Todo Ok");
        return cer;
    }

    @Override
    public Long maxID() {
        return repository.maxID().get();
    }
}