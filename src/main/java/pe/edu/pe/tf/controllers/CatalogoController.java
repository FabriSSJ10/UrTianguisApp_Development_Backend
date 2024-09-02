package pe.edu.pe.tf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.tf.dtos.CatalogoDTO;
import pe.edu.pe.tf.dtos.Det_PedidoDTO;
import pe.edu.pe.tf.entities.Catalogo;
import pe.edu.pe.tf.entities.Det_Pedido;
import pe.edu.pe.tf.serviceinterface.ICatalogoService;
import pe.edu.pe.tf.serviceinterface.IDet_PedidoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalogo")
public class CatalogoController {
    @Autowired
    private ICatalogoService cP;
    @GetMapping
    public List<CatalogoDTO> listar(){
        return cP.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,CatalogoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody CatalogoDTO dto){
        ModelMapper m=new ModelMapper();
        Catalogo ve=m.map(dto, Catalogo.class);
        cP.insert(ve);
    }
    @GetMapping("/{id}")
    public CatalogoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        CatalogoDTO dto=m.map(cP.listId(id),CatalogoDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody CatalogoDTO dto){
        ModelMapper m=new ModelMapper();
        Catalogo ve=m.map(dto,Catalogo.class);
        cP.update(ve);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cP.delete(id);
    }
}
