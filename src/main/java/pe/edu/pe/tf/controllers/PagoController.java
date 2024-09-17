package pe.edu.pe.tf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.tf.dtos.*;
import pe.edu.pe.tf.entities.Pago;
import pe.edu.pe.tf.serviceinterface.IPagoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController

@RequestMapping("/pago")
public class PagoController {
    @Autowired
    private IPagoService pS;
    @GetMapping("/listarPagos")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<PagoDTO> listar(){
        return pS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PagoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/registrarPagos")
    @PreAuthorize("hasAuthority('CLIENTE')")
    public void insertar(@RequestBody PagoDTO dto){
        ModelMapper m=new ModelMapper();
        Pago pa=m.map(dto,Pago.class);
        pS.insert(pa);
    }
    @GetMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'VENDEDOR')")
    public PagoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        PagoDTO dto=m.map(pS.listId(id),PagoDTO.class);
        return dto;
    }
    @PutMapping("/modificarPagos")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void modificar(@RequestBody PagoDTO dto){
        ModelMapper m=new ModelMapper();
        Pago pa=m.map(dto,Pago.class);
        pS.update(pa);
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('CLIENTE')")
    public void eliminar(@PathVariable("id") Integer id){
        pS.delete(id);
    }

    @GetMapping("/montoTotalSegunSexo")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<SumPaymentBySexDTO> sumBySexController() {
        List<String[]> lista = pS.sumBySexService();
        List<SumPaymentBySexDTO> listaDTO = new ArrayList<>();
        for (String[] columna : lista) {
            SumPaymentBySexDTO dto = new SumPaymentBySexDTO();
            dto.setSexo(columna[0]);
            dto.setMontoTotal(Double.parseDouble(columna[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }

    @GetMapping("/montoTotalSegunDepartamento")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<SumPaymentByDepartmentDTO> sumByDepartmentController() {
        List<String[]> lista = pS.sumByDepartmentService();
        List<SumPaymentByDepartmentDTO> listaDTO = new ArrayList<>();
        for (String[] columna : lista) {
            SumPaymentByDepartmentDTO dto = new SumPaymentByDepartmentDTO();
            dto.setDepartmento(columna[0]);
            dto.setMontoTotal(Double.parseDouble(columna[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }

    @GetMapping("/cantidad_pagoxtipo_pago")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<CantPagoxTipoPagoDTO> cantidadController(){
        List<String[]> lista=pS.pagosxtipodepago();
        List<CantPagoxTipoPagoDTO>listaDTO=new ArrayList<>();
        for(String[] columna:lista){
            CantPagoxTipoPagoDTO dto=new CantPagoxTipoPagoDTO();
            dto.setTipo_de_pago(columna[0]);
            dto.setCant_pagos(Integer.parseInt(columna[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }

    @GetMapping("/Pagos_Agrupadosxmesxmetodo")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<Pagos_AgrupxMesxMetodoDTO> cantidadControladora(){
        List<String[]> lista=pS.pgsagrupadosxmesxmetodo();
        List<Pagos_AgrupxMesxMetodoDTO>listaDTO=new ArrayList<>();
        for(String[] columna:lista){
            Pagos_AgrupxMesxMetodoDTO dto=new Pagos_AgrupxMesxMetodoDTO();
            dto.setMetodo_pago(columna[0]);
            dto.setCantidad_de_pagos(Integer.parseInt(columna[1]));
            dto.setMes_cancelado(columna[2]);
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
