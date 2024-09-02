package pe.edu.pe.tf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.tf.dtos.PagoDTO;
import pe.edu.pe.tf.dtos.PedidoDTO;
import pe.edu.pe.tf.entities.Pago;
import pe.edu.pe.tf.serviceinterface.IPagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pago")
public class PagoController {
    @Autowired
    private IPagoService pS;
    @GetMapping
    public List<PagoDTO> listar(){
        return pS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PagoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody PagoDTO dto){
        ModelMapper m=new ModelMapper();
        Pago pa=m.map(dto,Pago.class);
        pS.insert(pa);
    }
    @GetMapping("/{id}")
    public PagoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        PagoDTO dto=m.map(pS.listId(id),PagoDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody PagoDTO dto){
        ModelMapper m=new ModelMapper();
        Pago pa=m.map(dto,Pago.class);
        pS.update(pa);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        pS.delete(id);
    }
}
