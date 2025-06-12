package pe.edu.upeu.sysgestrepuesto.repository;


import org.springframework.data.jpa.repository.Query;
import pe.edu.upeu.sysgestrepuesto.model.MarcaRepuesto;

import java.util.Optional;

public interface IMarcaRepository extends ICrudGenericoRepository<MarcaRepuesto, Long> {
    @Query(nativeQuery = true, value = "SELECT MAX(id_marca) AS id FROM upeu_marca")
    Optional<Long> maxID();
}