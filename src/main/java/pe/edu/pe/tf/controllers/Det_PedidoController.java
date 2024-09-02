package pe.edu.pe.tf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.tf.dtos.Det_PedidoDTO;
import pe.edu.pe.tf.dtos.OutfitDTO;
import pe.edu.pe.tf.dtos.PedidoDTO;
import pe.edu.pe.tf.dtos.UsuarioDTO;
import pe.edu.pe.tf.entities.Det_Pedido;
import pe.edu.pe.tf.entities.Pedido;
import pe.edu.pe.tf.serviceinterface.IDet_PedidoService;
import pe.edu.pe.tf.serviceinterface.IUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/det_pedido")
public class Det_PedidoController {
    @Autowired
    private IDet_PedidoService dP;
    @GetMapping
    public List<Det_PedidoDTO> listar(){
        return dP.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,Det_PedidoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody Det_PedidoDTO dto){
        ModelMapper m=new ModelMapper();
        Det_Pedido ve=m.map(dto, Det_Pedido.class);
        dP.insert(ve);
    }
    @GetMapping("/{id}")
    public Det_PedidoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        Det_PedidoDTO dto=m.map(dP.listId(id),Det_PedidoDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody Det_PedidoDTO dto){
        ModelMapper m=new ModelMapper();
        Det_Pedido ve=m.map(dto,Det_Pedido.class);
        dP.update(ve);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        dP.delete(id);
    }
}
