package pe.edu.upeu.sysgestrepuesto.service;

import pe.edu.upeu.sysgestrepuesto.exception.CustomResponse;
import pe.edu.upeu.sysgestrepuesto.model.MarcaRepuesto;

import java.util.List;

public interface IMarcaService extends ICrudGenericoService <MarcaRepuesto, Long> {
    MarcaRepuesto save(MarcaRepuesto t);
    MarcaRepuesto update(Long id, MarcaRepuesto t);
    List<MarcaRepuesto> findAll();
    MarcaRepuesto findById(Long id);
    CustomResponse delete(Long id);

    Long maxID();
}
