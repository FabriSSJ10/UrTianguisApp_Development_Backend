package pe.edu.pe.tf.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.tf.dtos.Tipo_ocasionDTO;
import pe.edu.pe.tf.entities.Tipo_ocasion;
import pe.edu.pe.tf.serviceinterface.ITipo_ocasionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipos_ocasion")
public class Tipo_OcasionController {
    @Autowired
    private ITipo_ocasionService toS;
    @PostMapping()
    public void insertar(@RequestBody Tipo_ocasionDTO dto){
        ModelMapper m=new ModelMapper();
        Tipo_ocasion ve=m.map(dto, Tipo_ocasion.class);
        toS.insert(ve);
    }

    @GetMapping()
    public List<Tipo_ocasionDTO> listar(){
        return toS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, Tipo_ocasionDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){ toS.delete(id); }

    @GetMapping("/{id}")
    public Tipo_ocasionDTO listarID(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        Tipo_ocasionDTO dto = m.map(toS.listId(id), Tipo_ocasionDTO.class);
        return dto;
    }

    @PutMapping()
    public  void modificar(@RequestBody Tipo_ocasionDTO dto){
        ModelMapper m=new ModelMapper();
        Tipo_ocasion d = m.map(dto, Tipo_ocasion.class);
        toS.update(d);
    }
}
