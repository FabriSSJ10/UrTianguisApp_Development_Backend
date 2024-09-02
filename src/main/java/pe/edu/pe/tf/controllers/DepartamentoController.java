package pe.edu.pe.tf.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.tf.dtos.DepartamentoDTO;
import pe.edu.pe.tf.entities.Departamento;
import pe.edu.pe.tf.serviceinterface.IDepartamentoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {
    @Autowired
    private IDepartamentoService dS;
    @PostMapping
    public void registrar (@RequestBody DepartamentoDTO dto){
        ModelMapper m =new ModelMapper();
        Departamento d = m.map(dto, Departamento.class);
        dS.insert(d);
    }

    @GetMapping
    public List<DepartamentoDTO> listar(){
        return dS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,DepartamentoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){ dS.delete(id); }

    @GetMapping("/{id}")
    public  DepartamentoDTO listarID(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        DepartamentoDTO dto = m.map(dS.listId(id), DepartamentoDTO.class);
        return dto;
    }

    @PutMapping
    public  void modificar(@RequestBody DepartamentoDTO dto){
        ModelMapper m=new ModelMapper();
        Departamento d = m.map(dto, Departamento.class);
        dS.update(d);
    }
}
