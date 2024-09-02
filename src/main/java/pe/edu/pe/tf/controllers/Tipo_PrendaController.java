package pe.edu.pe.tf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.tf.dtos.Tipo_PrendaDTO;
import pe.edu.pe.tf.entities.Tipo_Prenda;
import pe.edu.pe.tf.serviceinterface.ITipo_PrendaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping ("/tipo prenda")
public class Tipo_PrendaController {
    @Autowired
    private ITipo_PrendaService rS;

    @GetMapping
    public List<Tipo_PrendaDTO> listar(){
        return rS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, Tipo_PrendaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody Tipo_PrendaDTO dto)
    {
        ModelMapper m=new ModelMapper();
        Tipo_Prenda ve=m.map(dto,Tipo_Prenda.class);
        rS.insert(ve);
    }

    @GetMapping("/{id}")
    public Tipo_PrendaDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        Tipo_PrendaDTO dto=m.map(rS.listId(id),Tipo_PrendaDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody Tipo_PrendaDTO dto)
    {
        ModelMapper m=new ModelMapper();
        Tipo_Prenda ve=m.map(dto, Tipo_Prenda.class);
        rS.update(ve);
    }
    @DeleteMapping("/{id}")
    public void eliminar (@PathVariable ("id") Integer id)
    {
        rS.delete(id);
    }
}
