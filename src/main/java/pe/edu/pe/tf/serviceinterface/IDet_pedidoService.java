package pe.edu.pe.tf.serviceinterface;

import pe.edu.pe.tf.entities.Det_pedido;

import java.util.List;

public interface IDet_pedidoService {
    public List<Det_pedido> list();
    public void insert(Det_pedido p);
    public Det_pedido listId(int id);
    public void update(Det_pedido p);
    public void delete(int id);
    List<String[]> Monto_total_recaudado_por_tipo_prenda();
}
