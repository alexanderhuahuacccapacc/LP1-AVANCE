package pe.edu.upeu.sysgestrepuesto.mappers;

import org.mapstruct.Mapper;
import pe.edu.upeu.sysgestrepuesto.dtos.ClienteDTO;
import pe.edu.upeu.sysgestrepuesto.model.Cliente;

@Mapper(componentModel = "spring")
public interface ClienteMapper extends GenericMapper<ClienteDTO, Cliente> {
}
