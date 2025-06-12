package pe.edu.upeu.sysgestrepuesto.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import pe.edu.upeu.sysgestrepuesto.dtos.VentaDTO;
import pe.edu.upeu.sysgestrepuesto.model.Venta;

@Mapper(componentModel = "spring")
public interface VentaMapper extends GenericMapper<VentaDTO, Venta> {
    @Mapping(target = "cliente", ignore = true)  /* Ignoramos aquí porque asignamos*/
    @Mapping(target = "usuario", ignore = true)
    Venta toEntityFromCADTO(VentaDTO.VentaCADTO ventaCADTO);
}
