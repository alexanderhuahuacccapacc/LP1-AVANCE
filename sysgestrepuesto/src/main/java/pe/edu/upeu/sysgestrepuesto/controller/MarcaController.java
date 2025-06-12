package pe.edu.upeu.sysgestrepuesto.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.sysgestrepuesto.dtos.MarcaDTO;
import pe.edu.upeu.sysgestrepuesto.exception.CustomResponse;
import pe.edu.upeu.sysgestrepuesto.mappers.MarcaMapper;
import pe.edu.upeu.sysgestrepuesto.model.MarcaRepuesto;
import pe.edu.upeu.sysgestrepuesto.service.IMarcaService;


import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/marcas")
@CrossOrigin("*")
public class MarcaController {

    @Qualifier("marcaServiceA")

    private final IMarcaService marcaService;

    private final MarcaMapper marcaMapper;


    @GetMapping
    public ResponseEntity<List<MarcaDTO>> findAll() {
        List<MarcaDTO> list = marcaMapper.toDTOs(marcaService.findAll());
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MarcaDTO> findById(@PathVariable("id") Long id) {
        MarcaRepuesto obj = marcaService.findById(id);
        return ResponseEntity.ok(marcaMapper.toDTO(obj));
    }
    /*
     * Otra forma de llamar return ResponseEntity.created(location).build();
     * */
    @PostMapping
    public ResponseEntity<CustomResponse> save(@Valid @RequestBody MarcaDTO dto) {
        MarcaRepuesto obj = marcaService.save(marcaMapper.toEntity(dto));
        //URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdMarca()).toUri();
        return ResponseEntity.ok(new CustomResponse(200, LocalDateTime.now(), (obj!=null?"true":"false"), String.valueOf(obj.getIdMarca())));
    }

    @PutMapping("/{id}")
    public ResponseEntity<MarcaDTO> update(@Valid @PathVariable("id") Long id, @RequestBody MarcaDTO dto) {
        dto.setIdMarca(id);
        MarcaRepuesto obj = marcaService.update(id, marcaMapper.toEntity(dto));
        return ResponseEntity.ok(marcaMapper.toDTO(obj));
    }
    /*
     * Otra forma de retornar - return ResponseEntity.noContent().build();
     * */
    @DeleteMapping("/{id}")
    public ResponseEntity<CustomResponse> delete(@PathVariable("id") Long id) {
        CustomResponse operacion= marcaService.delete(id);
        return ResponseEntity.ok(operacion);
    }

    @GetMapping("/buscarmaxid")
    public ResponseEntity<Long> getMarcaMaxId() {
        Long idMax = marcaService.maxID();
        return ResponseEntity.ok(idMax);
    }

    /*@GetMapping("/hateoas/{id}")
    public EntityModel<MarcaDTO> findByIdHateoas(@PathVariable("id") Long id) {
        EntityModel<MarcaDTO> resource = EntityModel.of(mapperUtil.map(service.findById(id), PatientDTO.class));

        //generar link informativo
        WebMvcLinkBuilder link1 = linkTo(methodOn(this.getClass()).findById(id));
        WebMvcLinkBuilder link2 = linkTo(methodOn(MedicController.class).findAll());

        resource.add(link1.withRel("patient-self-info"));
        resource.add(link2.withRel("all-medic-info"));

        return resource;
    }*/
}
