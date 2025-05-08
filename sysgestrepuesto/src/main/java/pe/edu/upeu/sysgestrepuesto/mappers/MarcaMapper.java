package pe.edu.upeu.sysgestrepuesto.mappers;

import org.mapstruct.Mapper;

import pe.edu.upeu.sysgestrepuesto.dtos.MarcaDTO;
import pe.edu.upeu.sysgestrepuesto.model.MarcaRepuesto;

@Mapper(componentModel = "spring")
public interface MarcaMapper extends GenericMapper<MarcaDTO, MarcaRepuesto> {
}
