package pe.edu.upeu.sysgestrepuesto.service;

import pe.edu.upeu.sysgestrepuesto.model.Acceso;

import java.util.List;


public interface IAccesoService extends ICrudGenericoService <Acceso,Long> {

    List<Acceso> getAccesoByUser(String username);
}
