package pe.edu.pe.tf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.tf.dtos.RolDTO;
import pe.edu.pe.tf.entities.Rol;
import pe.edu.pe.tf.serviceinterface.IRolService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rol")
public class RolController {
    @Autowired
    private IRolService rS;
    @PostMapping
    public  void registrar(@RequestBody RolDTO dto){
        ModelMapper m=new ModelMapper();
        Rol r = m.map(dto, Rol.class);
        rS.insert(r);
    }
    @GetMapping
    public List<RolDTO> listar(){
        return rS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,RolDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){ rS.delete(id); }

    @GetMapping("/{id}")
    public  RolDTO listarID(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        RolDTO dto = m.map(rS.listId(id), RolDTO.class);
        return dto;
    }
    @PutMapping
    public  void modificar(@RequestBody RolDTO dto){
        ModelMapper m=new ModelMapper();
        Rol r = m.map(dto, Rol.class);
        rS.update(r);
    }
}
