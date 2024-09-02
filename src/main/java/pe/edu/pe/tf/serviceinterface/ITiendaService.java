package pe.edu.pe.tf.serviceinterface;
import pe.edu.pe.tf.entities.Tienda;
import pe.edu.pe.tf.entities.Usuario;

import java.util.List;

public interface ITiendaService {
    public List<Tienda> list();
    void insert(Tienda t);
    public Tienda listId(int id);
    void update(Tienda t);
    void delete(int id);
}
