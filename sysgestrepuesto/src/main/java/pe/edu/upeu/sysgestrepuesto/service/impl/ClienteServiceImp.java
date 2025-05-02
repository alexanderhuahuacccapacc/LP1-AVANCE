package pe.edu.upeu.sysgestrepuesto.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.sysgestrepuesto.model.Cliente;
import pe.edu.upeu.sysgestrepuesto.repository.IClienteRepository;
import pe.edu.upeu.sysgestrepuesto.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysgestrepuesto.service.IClienteService;

@Transactional
@Service
@RequiredArgsConstructor

public class ClienteServiceImp extends CrudGenericoServiceImp<Cliente,Long> implements IClienteService {

    private final IClienteRepository clienteRepository;

    @Override
    protected ICrudGenericoRepository<Cliente, Long> getRepo() {
        return clienteRepository;
    }
}
