package pe.edu.pe.tf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.tf.dtos.*;
import pe.edu.pe.tf.dtos.CantPedidosPorMesDTO;
import pe.edu.pe.tf.entities.Pedido;
import pe.edu.pe.tf.entities.Prenda;
import pe.edu.pe.tf.serviceinterface.IPedidoService;
import pe.edu.pe.tf.serviceinterface.IPrendaService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
    @Autowired
    private IPedidoService pR;
    @GetMapping
    public List<PedidoDTO> listar(){
        return pR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, PedidoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
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
    @PutMapping
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
    public List<CantPedidosPorMesDTO> pedidopormes() {
        List<String[]> lista = this.pR.totalpedidopormes();
        List<CantPedidosPorMesDTO> listaDTO = new ArrayList();
        for (String[] x : lista) {
            CantPedidosPorMesDTO dto = new CantPedidosPorMesDTO();
            dto.setAno(x[0]);
            dto.setMes(x[1]);
            dto.setCant(Integer.parseInt(x[2]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
    @GetMapping({"/TotalPedidoPorDepartment"})
    public List<CantPedidoPorDepartmentDTO> pedidopordepartment() {
        List<String[]> lista = this.pR.totalpedidopordepartamento();
        List<CantPedidoPorDepartmentDTO> listaDTO = new ArrayList();
        for (String[] x : lista) {
            CantPedidoPorDepartmentDTO dto = new CantPedidoPorDepartmentDTO();
            dto.setDepartament(x[0]);
            dto.setTotal(Integer.parseInt(x[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}