package pe.edu.pe.tf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.tf.entities.Pedido;
import pe.edu.pe.tf.entities.Prenda;
import pe.edu.pe.tf.repositories.IPedidoRepository;
import pe.edu.pe.tf.serviceinterface.IPedidoService;

import java.util.List;

@Service
public class PedidoServiceImplements implements IPedidoService {
    @Autowired
    private IPedidoRepository pR;
    @Override
    public List<Pedido> list() {
        return pR.findAll();
    }
    @Override
    public void insert(Pedido p) {
        pR.save(p);
    }
    @Override
    public Pedido listId(int id) {
        return pR.findById(id).orElse(new Pedido());
    }
    @Override
    public void update(Pedido p) {
        pR.save(p);
    }
    @Override
    public void delete(int id) {
        pR.deleteById(id);
    }

}
