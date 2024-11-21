package pe.edu.pe.tf.serviceinterface;

import pe.edu.pe.tf.entities.Notificacion;

import java.util.List;

public interface INotificacionService {
    public List<Notificacion> list();
    public Notificacion listId(int id);
    void insert(Notificacion n);
    void update(Notificacion n);
    void delete(int id);
}
