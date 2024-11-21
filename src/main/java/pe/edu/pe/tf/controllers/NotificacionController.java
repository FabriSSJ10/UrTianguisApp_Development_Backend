package pe.edu.pe.tf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.tf.dtos.NotificacionDTO;
import pe.edu.pe.tf.entities.Notificacion;
import pe.edu.pe.tf.serviceinterface.INotificacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/notificaciones")
public class NotificacionController {
    @Autowired
    private INotificacionService nR;
    @GetMapping()
    public List<NotificacionDTO>listar(){
        return nR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, NotificacionDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping()
    public void insertar(@RequestBody NotificacionDTO dto){
        ModelMapper m=new ModelMapper();
        Notificacion us=m.map(dto, Notificacion.class);
        nR.insert(us);
    }

    @GetMapping("/{id}")
    public NotificacionDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        NotificacionDTO dto=m.map(nR.listId(id), NotificacionDTO.class);
        return dto;
    }

    @PutMapping()
    public void modificar(@RequestBody NotificacionDTO dto){
        ModelMapper m=new ModelMapper();
        Notificacion us=m.map(dto, Notificacion.class);
        nR.update(us);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){nR.delete(id);}

}