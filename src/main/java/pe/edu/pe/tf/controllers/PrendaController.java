package pe.edu.pe.tf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.tf.dtos.Det_PedidoDTO;
import pe.edu.pe.tf.dtos.PrendaDTO;
import pe.edu.pe.tf.dtos.TiendaDTO;
import pe.edu.pe.tf.dtos.UsuarioDTO;
import pe.edu.pe.tf.entities.Prenda;
import pe.edu.pe.tf.repositories.IPrendaRepository;
import pe.edu.pe.tf.serviceinterface.IPrendaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/prenda")
public class PrendaController {
    @Autowired
    private IPrendaService pR;
    @GetMapping
    public List<PrendaDTO> listar(){
        return pR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, PrendaDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody PrendaDTO dto){
        ModelMapper m=new ModelMapper();
        Prenda ve=m.map(dto,Prenda.class);
        pR.insert(ve);
    }

    @GetMapping("/{id}")
    public PrendaDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        PrendaDTO dto=m.map(pR.listId(id),PrendaDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody PrendaDTO dto){
        ModelMapper m=new ModelMapper();
        Prenda ve=m.map(dto,Prenda.class);
        pR.update(ve);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        pR.delete(id);
    }
}
