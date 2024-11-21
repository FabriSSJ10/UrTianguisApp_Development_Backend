package pe.edu.pe.tf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.tf.dtos.*;
import pe.edu.pe.tf.dtos.Total_pedidos_por_mesDTO;
import pe.edu.pe.tf.entities.Pedido;
import pe.edu.pe.tf.serviceinterface.IPedidoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    @Autowired
    private IPedidoService pR;
    @GetMapping("")
    public List<PedidoDTO> listar(){
        return pR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, PedidoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping()
    public void insertar(@RequestBody PedidoDTO dto){
        ModelMapper m=new ModelMapper();
        Pedido ve=m.map(dto,Pedido.class);
        pR.insert(ve);
    }
    @GetMapping("/{id}")
    public PedidoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        PedidoDTO dto=m.map(pR.listId(id),PedidoDTO.class);
        return dto;
    }
    @PutMapping()
    public void modificar(@RequestBody PedidoDTO dto){
        ModelMapper m=new ModelMapper();
        Pedido ve=m.map(dto,Pedido.class);
        pR.update(ve);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        pR.delete(id);
    }
    @GetMapping({"/TotalPedidoPorMes"})
    public List<Total_pedidos_por_mesDTO> Total_pedidos_por_mes() {
        List<String[]> lista = this.pR.Total_pedidos_por_mes();
        List<Total_pedidos_por_mesDTO> listaDTO = new ArrayList();
        for (String[] x : lista) {
            Total_pedidos_por_mesDTO dto = new Total_pedidos_por_mesDTO();
            dto.setAnio(x[0]);
            dto.setMes(x[1]);
            dto.setCantidad_pedidos(Integer.parseInt(x[2]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
    @GetMapping({"/TotalPedidoPorDepartment"})
    public List<Total_pedidos_por_departamentoDTO> Total_pedidos_por_departamento() {
        List<String[]> lista = this.pR.Total_pedidos_por_departamento();
        List<Total_pedidos_por_departamentoDTO> listaDTO = new ArrayList();
        for (String[] x : lista) {
            Total_pedidos_por_departamentoDTO dto = new Total_pedidos_por_departamentoDTO();
            dto.setDepartamento(x[0]);
            dto.setCantidad_pedidos(Integer.parseInt(x[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
