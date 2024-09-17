package pe.edu.pe.tf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.tf.dtos.TiendaDTO;
import pe.edu.pe.tf.entities.Tienda;
import pe.edu.pe.tf.serviceinterface.ITiendaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tienda")
public class TiendaController {
    @Autowired
    private ITiendaService tR;
    @GetMapping("/listarTiendas")
    public List<TiendaDTO>listar(){
        return tR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TiendaDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/registrarTiendas")
    @PreAuthorize("hasAuthority('VENDEDOR')")
    public void insertar(@RequestBody TiendaDTO dto){
        ModelMapper m=new ModelMapper();
        Tienda ve=m.map(dto,Tienda.class);
        tR.insert(ve);
    }

    @GetMapping("/{id}")
    public TiendaDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        TiendaDTO dto=m.map(tR.listId(id),TiendaDTO.class);
        return dto;
    }

    @PutMapping("/modificarTiendas")
    @PreAuthorize("hasAuthority('VENDEDOR')")
    public void modificar(@RequestBody TiendaDTO dto){
        ModelMapper m=new ModelMapper();
        Tienda ve=m.map(dto,Tienda.class);
        tR.update(ve);
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR','VENDEDOR')")
    public void eliminar(@PathVariable("id") Integer id){
        tR.delete(id);
    }

}
