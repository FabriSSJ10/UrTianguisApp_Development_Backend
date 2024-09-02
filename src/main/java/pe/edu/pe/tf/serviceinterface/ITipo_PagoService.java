package pe.edu.pe.tf.serviceinterface;
import pe.edu.pe.tf.entities.Tienda;
import pe.edu.pe.tf.entities.Tipo_Pago;

import java.util.List;


public interface ITipo_PagoService {
    public List<Tipo_Pago> list();
    public Tipo_Pago listId(int id);
    void insert(Tipo_Pago tp);
    void update(Tipo_Pago tp);
    void delete(int id);
}
