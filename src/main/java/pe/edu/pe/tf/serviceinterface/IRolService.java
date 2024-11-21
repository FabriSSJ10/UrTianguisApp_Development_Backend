package pe.edu.pe.tf.serviceinterface;

import pe.edu.pe.tf.entities.Rol;

import java.util.List;

public interface IRolService {
    public void insert(Rol r);
    public List<Rol> list();
    public void delete(int id);
    public Rol listId(int id);
    public void update(Rol r);
}
