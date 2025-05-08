package pe.edu.upeu.sysgestrepuesto.mappers;

import org.mapstruct.Mapper;
import pe.edu.upeu.sysgestrepuesto.dtos.CategoriaDTO;
import pe.edu.upeu.sysgestrepuesto.model.Categoria;

@Mapper(componentModel = "spring")
public interface CategoriaMapper extends GenericMapper<CategoriaDTO, Categoria> {
}