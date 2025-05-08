package pe.edu.upeu.sysgestrepuesto.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import pe.edu.upeu.sysgestrepuesto.dtos.MarcaDTO;
import pe.edu.upeu.sysgestrepuesto.mappers.MarcaMapper;
import pe.edu.upeu.sysgestrepuesto.model.MarcaRepuesto;
import pe.edu.upeu.sysgestrepuesto.service.IMarcaService;

import java.net.URI;
import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/marcas")
public class MarcaController {
    private Logger logger = LogManager.getLogger(MarcaController.class);
    private final IMarcaService service;
    private final MarcaMapper marcaMapper;

    @GetMapping
    public ResponseEntity<List<MarcaRepuesto>> findAll() {
        List<MarcaRepuesto> list = service.findAll();
        return ResponseEntity.ok(list);
    }
    @GetMapping("/{id}")
    public ResponseEntity<MarcaRepuesto> findById(@PathVariable("id") Long id) {
        MarcaRepuesto obj = service.findById(id);
        return ResponseEntity.ok(obj);
    }
    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Valid MarcaDTO dto) {
        MarcaRepuesto obj = service.save(marcaMapper.toEntity(dto));
        logger.info("creandoo nueva marca");
        URI location =
                ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdMarca()).toUri();
        return ResponseEntity.created(location).build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<MarcaRepuesto> update( @PathVariable("id") Long id,
                                         @RequestBody MarcaRepuesto dto) {
        dto.setIdMarca(id);
        MarcaRepuesto obj = service.update(id, dto);
        return ResponseEntity.ok(obj);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
