package pe.edu.pe.tf.serviceinterface;

import pe.edu.pe.tf.entities.Det_Pedido;
import pe.edu.pe.tf.entities.Outfit;
import pe.edu.pe.tf.entities.Prenda;

import java.util.List;

public interface IDet_PedidoService {
    public List<Det_Pedido> list();
    public void insert(Det_Pedido p);
    public Det_Pedido listId(int id);
    public void update(Det_Pedido p);
    public void delete(int id);
    List<String[]> TotalxPrenda();
}
