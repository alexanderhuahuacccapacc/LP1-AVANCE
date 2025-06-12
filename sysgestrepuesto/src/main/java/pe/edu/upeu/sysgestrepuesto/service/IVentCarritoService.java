package pe.edu.upeu.sysgestrepuesto.service;

import pe.edu.upeu.sysgestrepuesto.dtos.VentCarritoDTO;
import pe.edu.upeu.sysgestrepuesto.model.VentCarrito;

import java.util.List;


public interface IVentCarritoService extends ICrudGenericoService<VentCarrito,Long> {
    VentCarritoDTO saveD(VentCarritoDTO.VentCarritoCADTO dto);
    VentCarritoDTO updateD(VentCarritoDTO.VentCarritoCADTO dto, Long id);
    List<VentCarrito> listaCarritoCliente(String dniruc);

    void deleteCarAll(String dniruc);
}
