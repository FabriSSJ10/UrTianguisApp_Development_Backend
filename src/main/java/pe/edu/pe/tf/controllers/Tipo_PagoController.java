package pe.edu.pe.tf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.tf.dtos.Tipo_PagoDTO;
import pe.edu.pe.tf.entities.Tipo_Pago;
import pe.edu.pe.tf.serviceinterface.ITipo_PagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipo_pago")

public class Tipo_PagoController {
    @Autowired
    private ITipo_PagoService tpR;
    @GetMapping
    public List<Tipo_PagoDTO>listar(){
        return tpR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,Tipo_PagoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody Tipo_PagoDTO dto){
        ModelMapper m=new ModelMapper();
        Tipo_Pago ve=m.map(dto,Tipo_Pago.class);
        tpR.insert(ve);
    }

    @GetMapping("/{id}")
    public Tipo_PagoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        Tipo_PagoDTO dto=m.map(tpR.listId(id),Tipo_PagoDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody Tipo_PagoDTO dto){
        ModelMapper m=new ModelMapper();
        Tipo_Pago ve=m.map(dto,Tipo_Pago.class);
        tpR.update(ve);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        tpR.delete(id);
    }
}
