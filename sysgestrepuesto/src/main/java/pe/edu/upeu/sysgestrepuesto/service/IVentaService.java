package pe.edu.upeu.sysgestrepuesto.service;

import jakarta.validation.Valid;
import pe.edu.upeu.sysgestrepuesto.dtos.VentaDTO;
import pe.edu.upeu.sysgestrepuesto.dtos.VentaDetalleDTO;
import pe.edu.upeu.sysgestrepuesto.model.Venta;

public interface IVentaService extends ICrudGenericoService<Venta,Long> {
    VentaDTO saveD(VentaDTO.VentaCADTO dto);
}
