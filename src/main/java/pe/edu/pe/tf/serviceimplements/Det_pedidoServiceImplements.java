package pe.edu.pe.tf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.tf.entities.Det_pedido;
import pe.edu.pe.tf.repositories.IDet_pedidoRepository;
import pe.edu.pe.tf.serviceinterface.IDet_pedidoService;

import java.util.List;

@Service
public class Det_pedidoServiceImplements implements IDet_pedidoService {
    @Autowired
    private IDet_pedidoRepository dP;
    @Override
    public List<Det_pedido> list() {
        return dP.findAll();
    }
    @Override
    public void insert(Det_pedido p) {
        dP.save(p);
    }
    @Override
    public Det_pedido listId(int id) {
        return dP.findById(id).orElse(new Det_pedido());
    }
    @Override
    public void update(Det_pedido p) {
        dP.save(p);
    }
    @Override
    public void delete(int id) {
        dP.deleteById(id);
    }
    public List<String[]> Monto_total_recaudado_por_tipo_prenda() {
        return this.dP.Monto_total_recaudado_por_tipo_prenda();
    }
}
