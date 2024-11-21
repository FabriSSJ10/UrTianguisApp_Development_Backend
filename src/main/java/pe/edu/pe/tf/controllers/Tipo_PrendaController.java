package pe.edu.pe.tf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.tf.dtos.Tipo_prendaDTO;
import pe.edu.pe.tf.entities.Tipo_prenda;
import pe.edu.pe.tf.serviceinterface.ITipo_prendaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping ("/tipos_prenda")
public class Tipo_PrendaController {
    @Autowired
    private ITipo_prendaService rS;

    @GetMapping()
    public List<Tipo_prendaDTO> listar(){
        return rS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, Tipo_prendaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping()
    public void registrar(@RequestBody Tipo_prendaDTO dto)
    {
        ModelMapper m=new ModelMapper();
        Tipo_prenda ve=m.map(dto, Tipo_prenda.class);
        rS.insert(ve);
    }

    @GetMapping("/{id}")
    public Tipo_prendaDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        Tipo_prendaDTO dto=m.map(rS.listId(id), Tipo_prendaDTO.class);
        return dto;
    }
    @PutMapping()
    public void modificar(@RequestBody Tipo_prendaDTO dto)
    {
        ModelMapper m=new ModelMapper();
        Tipo_prenda ve=m.map(dto, Tipo_prenda.class);
        rS.update(ve);
    }
    @DeleteMapping("/{id}")
    public void eliminar (@PathVariable ("id") Integer id)
    {
        rS.delete(id);
    }
}
