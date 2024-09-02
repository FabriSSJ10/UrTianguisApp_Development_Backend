package pe.edu.pe.tf.serviceinterface;

import pe.edu.pe.tf.entities.Outfit;
import pe.edu.pe.tf.entities.Pago;

import java.util.List;

public interface IOutfitService {
    public List<Outfit> list();
    public void insert (Outfit o);
    public Outfit listId(int id);
    public void update (Outfit o);
    public void delete (int o);
}
