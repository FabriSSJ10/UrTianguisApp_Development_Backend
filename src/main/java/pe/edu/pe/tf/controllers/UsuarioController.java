package pe.edu.pe.tf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.tf.dtos.TiendaDTO;
import pe.edu.pe.tf.dtos.UsuarioDTO;
import pe.edu.pe.tf.entities.Usuario;
import pe.edu.pe.tf.serviceinterface.IUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService uS;
    @GetMapping()
    public List<UsuarioDTO>listar(){
        return uS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UsuarioDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping()
    public void insertar(@RequestBody UsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        Usuario us=m.map(dto,Usuario.class);
        uS.insert(us);
    }

    @GetMapping("/{id}")
    public UsuarioDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        UsuarioDTO dto=m.map(uS.listId(id),UsuarioDTO.class);
        return dto;
    }

    @PutMapping()
    public void modificar(@RequestBody UsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        Usuario us=m.map(dto,Usuario.class);
        uS.update(us);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){uS.delete(id);}

    @GetMapping("/Mes_menos_usuarios")
    public String Mes_menos_usuarios(){
        return uS.Mes_menos_usuarios();
    }
}
