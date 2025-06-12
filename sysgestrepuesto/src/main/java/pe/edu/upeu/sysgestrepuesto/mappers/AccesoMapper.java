package pe.edu.upeu.sysgestrepuesto.mappers;

import org.mapstruct.Mapper;
import pe.edu.upeu.sysgestrepuesto.dtos.AccesoDTO;
import pe.edu.upeu.sysgestrepuesto.model.Acceso;

@Mapper(componentModel = "spring")
public interface AccesoMapper extends GenericMapper <AccesoDTO, Acceso> {
}
