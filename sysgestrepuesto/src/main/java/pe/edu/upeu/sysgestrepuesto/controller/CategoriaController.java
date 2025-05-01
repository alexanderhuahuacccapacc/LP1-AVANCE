package pe.edu.upeu.sysgestrepuesto.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import pe.edu.upeu.sysgestrepuesto.model.Categoria;
import pe.edu.upeu.sysgestrepuesto.service.ICategoriaService;

import java.net.URI;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    private final ICategoriaService categoriaService;
    @GetMapping
    public ResponseEntity<List<Categoria>> findAll() {
        List<Categoria> list = categoriaService.findAll();
        return ResponseEntity.ok(list);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Categoria> findById(@PathVariable("id") Long
                                                      id) {
        Categoria obj = categoriaService.findById(id);
        return ResponseEntity.ok(obj);
    }
    @PostMapping
    public ResponseEntity<Void> save(@Valid @RequestBody Categoria dto) {
        Categoria obj = categoriaService.save(dto);
        URI location =

                ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(
                obj.getIdCategoria()).toUri();
        return ResponseEntity.created(location).build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<Categoria> update(@PathVariable("id") Long
                                                    id, @RequestBody
                                            Categoria dto) {
        dto.setIdCategoria(id);
        Categoria obj = categoriaService.update(id, dto);
        return ResponseEntity.ok(obj);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        categoriaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

