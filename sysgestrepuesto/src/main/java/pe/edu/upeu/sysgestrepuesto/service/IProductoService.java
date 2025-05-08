package pe.edu.upeu.sysgestrepuesto.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pe.edu.upeu.sysgestrepuesto.dtos.ProductoDTO;
import pe.edu.upeu.sysgestrepuesto.model.Producto;

import java.io.IOException;
import java.sql.SQLException;

public interface IProductoService extends ICrudGenericoService<Producto,Long> {
    ProductoDTO saveD(ProductoDTO.ProductoCADto dto);
    ProductoDTO updateD(ProductoDTO.ProductoCADto dto, Long id);
    //Page<Producto> listaPage(Pageable pageable);
}
