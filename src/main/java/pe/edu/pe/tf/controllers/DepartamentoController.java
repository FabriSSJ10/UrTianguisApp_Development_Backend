package pe.edu.pe.tf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.tf.dtos.DepartamentoDTO;
import pe.edu.pe.tf.dtos.QuantityOutfitsbyClothesDTO;
import pe.edu.pe.tf.dtos.QuantityuserbydepartmentDTO;
import pe.edu.pe.tf.entities.Departamento;
import pe.edu.pe.tf.serviceinterface.IDepartamentoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {
    @Autowired
    private IDepartamentoService dS;
    @PostMapping("/registrarDepartamentos")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void registrar (@RequestBody DepartamentoDTO dto){
        ModelMapper m =new ModelMapper();
        Departamento d = m.map(dto, Departamento.class);
        dS.insert(d);
    }

    @GetMapping("listarDepartamentos")
    public List<DepartamentoDTO> listar(){
        return dS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,DepartamentoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void eliminar(@PathVariable("id") Integer id){ dS.delete(id); }

    @GetMapping("/{id}")
    public  DepartamentoDTO listarID(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        DepartamentoDTO dto = m.map(dS.listId(id), DepartamentoDTO.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public  void modificar(@RequestBody DepartamentoDTO dto){
        ModelMapper m=new ModelMapper();
        Departamento d = m.map(dto, Departamento.class);
        dS.update(d);
    }

    @GetMapping("/cantidadesUsuarioXDepartamento")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR','VENDEDOR')")
    public List <QuantityuserbydepartmentDTO>obtener()
    {
        List<String []>lista=dS.obtenercantidad();
        List<QuantityuserbydepartmentDTO>listaDTO=new ArrayList<>();
        for (String []columna:lista)
        {
            QuantityuserbydepartmentDTO dto=new QuantityuserbydepartmentDTO();
            dto.setDepartment(columna[0]);
            dto.setQuantity(Integer.parseInt(columna[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
