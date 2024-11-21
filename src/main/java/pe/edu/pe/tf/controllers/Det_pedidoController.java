package pe.edu.pe.tf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.tf.dtos.*;
import pe.edu.pe.tf.entities.Det_pedido;
import pe.edu.pe.tf.serviceinterface.IDet_pedidoService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/det_pedido")
public class Det_pedidoController {
    @Autowired
    private IDet_pedidoService dP;
    @GetMapping()
    public List<Det_pedidoDTO> listar(){
        return dP.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, Det_pedidoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping()
    public void insertar(@RequestBody Det_pedidoDTO dto){
        ModelMapper m=new ModelMapper();
        Det_pedido ve=m.map(dto, Det_pedido.class);
        dP.insert(ve);
    }
    @GetMapping("/{id}")
    public Det_pedidoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        Det_pedidoDTO dto=m.map(dP.listId(id), Det_pedidoDTO.class);
        return dto;
    }
    @PutMapping()
    public void modificar(@RequestBody Det_pedidoDTO dto){
        ModelMapper m=new ModelMapper();
        Det_pedido ve=m.map(dto, Det_pedido.class);
        dP.update(ve);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        dP.delete(id);
    }

    @GetMapping({"/TotalRecaudadoxPrenda"})
    public List<Monto_total_recaudado_por_tipo_prendaDTO> Monto_total_recaudado_por_tipo_prenda() {
        List<String[]> lista = this.dP.Monto_total_recaudado_por_tipo_prenda();
        List<Monto_total_recaudado_por_tipo_prendaDTO> listaDTO = new ArrayList();
        Iterator var3 = lista.iterator();

        while(var3.hasNext()) {
            String[] columna = (String[])var3.next();
            Monto_total_recaudado_por_tipo_prendaDTO dto = new Monto_total_recaudado_por_tipo_prendaDTO();
            dto.setTipo_prenda(columna[0]);
            dto.setTotal_recaudado(Double.parseDouble(columna[1]));
            listaDTO.add(dto);
        }

        return listaDTO;
    }
}
