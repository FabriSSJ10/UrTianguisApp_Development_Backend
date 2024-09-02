package pe.edu.pe.tf.serviceinterface;

import pe.edu.pe.tf.entities.Pedido;
import pe.edu.pe.tf.entities.Prenda;

import java.util.List;

public interface IPedidoService {
    public List<Pedido> list();
    public void insert(Pedido p);
    public Pedido listId(int id);
    public void update(Pedido p);
    public void delete(int id);
}
