package pe.edu.pe.tf.serviceinterface;

import pe.edu.pe.tf.entities.Tipo_ocasion;

import java.util.List;

public interface ITipo_ocasionService {
    public List<Tipo_ocasion> list();
    public void insert (Tipo_ocasion to);
    public void update (Tipo_ocasion to);
    public void delete (int id);
    public Tipo_ocasion listId(int id);
}
