package pe.edu.pe.tf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.tf.dtos.Tipo_pagoDTO;
import pe.edu.pe.tf.entities.Tipo_pago;
import pe.edu.pe.tf.serviceinterface.ITipo_pagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipopagos")

public class Tipo_PagoController {
    @Autowired
    private ITipo_pagoService tpR;
    @GetMapping()
    public List<Tipo_pagoDTO>listar(){
        return tpR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, Tipo_pagoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping()
    public void insertar(@RequestBody Tipo_pagoDTO dto){
        ModelMapper m=new ModelMapper();
        Tipo_pago ve=m.map(dto, Tipo_pago.class);
        tpR.insert(ve);
    }

    @GetMapping("/{id}")
    public Tipo_pagoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        Tipo_pagoDTO dto=m.map(tpR.listId(id), Tipo_pagoDTO.class);
        return dto;
    }
    @PutMapping()
    public void modificar(@RequestBody Tipo_pagoDTO dto){
        ModelMapper m=new ModelMapper();
        Tipo_pago ve=m.map(dto, Tipo_pago.class);
        tpR.update(ve);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        tpR.delete(id);
    }
}
