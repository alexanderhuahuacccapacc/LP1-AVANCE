package pe.edu.upeu.sysgestrepuesto.mappers;

import org.mapstruct.Mapper;
import pe.edu.upeu.sysgestrepuesto.dtos.UnidadMedidaDTO;
import pe.edu.upeu.sysgestrepuesto.model.UnidadMedida;

@Mapper(componentModel = "spring")
public interface UnidadMedidaMapper extends GenericMapper<UnidadMedidaDTO, UnidadMedida> {
}
