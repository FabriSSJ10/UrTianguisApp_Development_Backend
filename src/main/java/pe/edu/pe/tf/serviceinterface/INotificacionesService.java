package pe.edu.pe.tf.serviceinterface;

import pe.edu.pe.tf.entities.Notificaciones;

import java.util.List;

public interface INotificacionesService {
    public List<Notificaciones> list();
    public Notificaciones listId(int id);
    void insert(Notificaciones n);
    void update(Notificaciones n);
    void delete(int id);
}
