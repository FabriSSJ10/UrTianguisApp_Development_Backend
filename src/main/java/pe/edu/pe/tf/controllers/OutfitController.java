package pe.edu.pe.tf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.tf.dtos.OutfitDTO;
import pe.edu.pe.tf.dtos.PagoDTO;
import pe.edu.pe.tf.entities.Outfit;
import pe.edu.pe.tf.serviceinterface.IOutfitService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/outfit")
public class OutfitController {
    @Autowired
    private IOutfitService oS;
    @GetMapping
    public List<OutfitDTO> listar(){
        return oS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,OutfitDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody OutfitDTO dto){
        ModelMapper m=new ModelMapper();
        Outfit ou=m.map(dto,Outfit.class);
        oS.insert(ou);
    }
    @GetMapping("/{id}")
    public OutfitDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        OutfitDTO dto=m.map(oS.listId(id),OutfitDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody OutfitDTO dto){
        ModelMapper m=new ModelMapper();
        Outfit ou=m.map(dto,Outfit.class);
        oS.update(ou);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        oS.delete(id);
    }
}
