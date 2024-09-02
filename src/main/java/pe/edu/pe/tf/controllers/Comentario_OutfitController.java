package pe.edu.pe.tf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.tf.dtos.Comentario_OutfitDTO;
import pe.edu.pe.tf.entities.Comentario_Outfit;
import pe.edu.pe.tf.serviceinterface.IComentario_OutfitService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Comentario_outfit")
public class Comentario_OutfitController {
    @Autowired
    private IComentario_OutfitService cS;
    @GetMapping("/listarprobandoruta")
    public List<Comentario_OutfitDTO>listar(){
        return cS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x,Comentario_OutfitDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody Comentario_OutfitDTO dto){
        ModelMapper m= new ModelMapper();
        Comentario_Outfit com=m.map(dto,Comentario_Outfit.class);
        cS.insert(com);
    }

    @GetMapping("/{id}")
    public Comentario_OutfitDTO listarID(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        Comentario_OutfitDTO dto = m.map(cS.listId(id), Comentario_OutfitDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody Comentario_OutfitDTO dto){
        ModelMapper m= new ModelMapper();
        Comentario_Outfit com = m.map(dto,Comentario_Outfit.class);
        cS.update(com);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable ("Id") Integer id){
        cS.delete(id);
    }
}
