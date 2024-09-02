package pe.edu.pe.tf.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.tf.dtos.Tipo_OcasionDTO;
import pe.edu.pe.tf.dtos.Tipo_PagoDTO;
import pe.edu.pe.tf.entities.Tipo_Ocasion;
import pe.edu.pe.tf.entities.Tipo_Pago;
import pe.edu.pe.tf.serviceinterface.ITipo_OcasionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipo_Ocasion")
public class Tipo_OcasionController {
    @Autowired
    private ITipo_OcasionService toS;
    @PostMapping
    public void insertar(@RequestBody Tipo_OcasionDTO dto){
        ModelMapper m=new ModelMapper();
        Tipo_Ocasion ve=m.map(dto,Tipo_Ocasion.class);
        toS.insert(ve);
    }

    @GetMapping
    public List<Tipo_OcasionDTO> listar(){
        return toS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,Tipo_OcasionDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){ toS.delete(id); }

    @GetMapping("/{id}")
    public  Tipo_OcasionDTO listarID(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        Tipo_OcasionDTO dto = m.map(toS.listId(id), Tipo_OcasionDTO.class);
        return dto;
    }

    @PutMapping
    public  void modificar(@RequestBody Tipo_OcasionDTO dto){
        ModelMapper m=new ModelMapper();
        Tipo_Ocasion d = m.map(dto, Tipo_Ocasion.class);
        toS.update(d);
    }
}
