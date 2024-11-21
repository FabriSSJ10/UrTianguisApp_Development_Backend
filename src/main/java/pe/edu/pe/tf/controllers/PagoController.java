package pe.edu.pe.tf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.tf.dtos.*;
import pe.edu.pe.tf.entities.Pago;
import pe.edu.pe.tf.serviceinterface.IPagoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pagos")
public class PagoController {
    @Autowired
    private IPagoService pS;
    @GetMapping()
    public List<PagoDTO> listar(){
        return pS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PagoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping()
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
    @PutMapping()
    public void modificar(@RequestBody PagoDTO dto){
        ModelMapper m=new ModelMapper();
        Pago pa=m.map(dto,Pago.class);
        pS.update(pa);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        pS.delete(id);
    }

    @GetMapping("/sumBySex")
    public List<Monto_total_pagos_por_sexoDTO> Monto_total_pagos_por_sexo() {
        List<String[]> lista = pS.Monto_total_pagos_por_sexo();
        List<Monto_total_pagos_por_sexoDTO> listaDTO = new ArrayList<>();
        for (String[] columna : lista) {
            Monto_total_pagos_por_sexoDTO dto = new Monto_total_pagos_por_sexoDTO();
            dto.setSexo(columna[0]);
            dto.setMonto_total(Double.parseDouble(columna[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }

    @GetMapping("/sumByDepartment")
    public List<Monto_total_pagos_por_departamentoDTO> Monto_total_pagos_por_departamento() {
        List<String[]> lista = pS.Monto_total_pagos_por_departamento();
        List<Monto_total_pagos_por_departamentoDTO> listaDTO = new ArrayList<>();
        for (String[] columna : lista) {
            Monto_total_pagos_por_departamentoDTO dto = new Monto_total_pagos_por_departamentoDTO();
            dto.setDepartmento(columna[0]);
            dto.setMonto_total(Double.parseDouble(columna[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }

    @GetMapping("/cantidad_pagoxtipo_pago")
    public List<Cantidad_pagos_por_tipo_pagoDTO> Cantidad_pagos_por_tipo_pago(){
        List<String[]> lista=pS.Cantidad_pagos_por_tipo_pago();
        List<Cantidad_pagos_por_tipo_pagoDTO>listaDTO=new ArrayList<>();
        for(String[] columna:lista){
            Cantidad_pagos_por_tipo_pagoDTO dto=new Cantidad_pagos_por_tipo_pagoDTO();
            dto.setTipo_pago(columna[0]);
            dto.setCantidad_pagos(Integer.parseInt(columna[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }

    @GetMapping("/Pagos_Agrupadosxmesxmetodo")
    public List<Cantidad_pagos_por_tipo_pago_y_mesDTO> Cantidad_pagos_por_tipo_pago_y_mes(){
        List<String[]> lista=pS.Cantidad_pagos_por_tipo_pago_y_mes();
        List<Cantidad_pagos_por_tipo_pago_y_mesDTO>listaDTO=new ArrayList<>();
        for(String[] columna:lista){
            Cantidad_pagos_por_tipo_pago_y_mesDTO dto=new Cantidad_pagos_por_tipo_pago_y_mesDTO();
            dto.setMetodo_pago(columna[0]);
            dto.setCantidad_de_pagos(Integer.parseInt(columna[2]));
            dto.setMes_cancelado(columna[1]);
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
