package pe.edu.pe.tf.serviceinterface;
import pe.edu.pe.tf.entities.Tipo_prenda;
import java.util.List;
public interface ITipo_prendaService {
    public List<Tipo_prenda> list();
    public void insert(Tipo_prenda tipo);
    public void update (Tipo_prenda tipo);
    public void delete(int id);
    public Tipo_prenda listId(int id);
}
