package pe.edu.pe.tf.serviceinterface;
import pe.edu.pe.tf.entities.Tipo_pago;

import java.util.List;


public interface ITipo_pagoService {
    public List<Tipo_pago> list();
    public Tipo_pago listId(int id);
    void insert(Tipo_pago tp);
    void update(Tipo_pago tp);
    void delete(int id);
}
