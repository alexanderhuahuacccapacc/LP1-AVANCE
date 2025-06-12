package pe.edu.upeu.sysgestrepuesto.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import pe.edu.upeu.sysgestrepuesto.dtos.VentaDetalleDTO;
import pe.edu.upeu.sysgestrepuesto.model.VentaDetalle;

@Mapper(componentModel = "spring")
public interface VentaDetalleMapper extends GenericMapper<VentaDetalleDTO, VentaDetalle> {
    @Mapping(target = "venta", ignore = true)  // Ignoramos aquí porque asignamos
    @Mapping(target = "producto", ignore = true)

    VentaDetalle toEntityFromCADTO(VentaDetalleDTO.VentaDetalleCADTO ventaDetalleCADTO);
}
