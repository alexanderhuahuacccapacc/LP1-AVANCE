package pe.edu.upeu.sysgestrepuesto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upeu.sysgestrepuesto.model.MarcaRepuesto;

public interface IMarcaRepository extends JpaRepository<MarcaRepuesto, Long> {
}