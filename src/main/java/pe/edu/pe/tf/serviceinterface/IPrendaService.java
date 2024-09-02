package pe.edu.pe.tf.serviceinterface;

import pe.edu.pe.tf.entities.Prenda;
import pe.edu.pe.tf.entities.Tienda;

import java.util.List;

public interface IPrendaService {
    public List<Prenda> list();
    public void insert(Prenda p);
    public Prenda listId(int id);
    public void update(Prenda p);
    public void delete(int id);
}
