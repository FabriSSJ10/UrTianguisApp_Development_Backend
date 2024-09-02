package pe.edu.pe.tf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.tf.dtos.NotificacionesDTO;
import pe.edu.pe.tf.entities.Notificaciones;
import pe.edu.pe.tf.serviceinterface.INotificacionesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/notificaciones")
public class NotificacionesController {
    @Autowired
    private INotificacionesService nR;
    @GetMapping
    public List<NotificacionesDTO>listar(){
        return nR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,NotificacionesDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody NotificacionesDTO dto){
        ModelMapper m=new ModelMapper();
        Notificaciones us=m.map(dto,Notificaciones.class);
        nR.insert(us);
    }

    @GetMapping("/{id}")
    public NotificacionesDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        NotificacionesDTO dto=m.map(nR.listId(id),NotificacionesDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody NotificacionesDTO dto){
        ModelMapper m=new ModelMapper();
        Notificaciones us=m.map(dto,Notificaciones.class);
        nR.update(us);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){nR.delete(id);}

}