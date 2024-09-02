package pe.edu.pe.tf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.tf.entities.Pago;
import pe.edu.pe.tf.entities.Pedido;
import pe.edu.pe.tf.repositories.IPagoRepository;
import pe.edu.pe.tf.serviceinterface.IPagoService;

import java.util.List;

@Service
public class PagoServiceImplements implements IPagoService {
    @Autowired
    private IPagoRepository pR;

    @Override
    public List<Pago> list() {
        return pR.findAll();
    }

    @Override
    public void insert(Pago p) {
        pR.save(p);
    }

    @Override
    public Pago listId(int id) {
        return pR.findById(id).orElse(new Pago());
    }

    @Override
    public void update(Pago p) {
        pR.save(p);
    }

    @Override
    public void delete(int id) {
        pR.deleteById(id);
    }
}
