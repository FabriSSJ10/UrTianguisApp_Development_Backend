package pe.edu.pe.tf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.tf.entities.Tipo_pago;
import pe.edu.pe.tf.repositories.ITipo_pagoRepository;
import pe.edu.pe.tf.serviceinterface.ITipo_pagoService;

import java.util.List;

@Service
public class Tipo_pagoServiceImplements implements ITipo_pagoService {
    @Autowired
    private ITipo_pagoRepository tpR;
    @Override
    public List<Tipo_pago> list() {
        return tpR.findAll();
    }
    @Override
    public Tipo_pago listId(int id) {
        return tpR.findById(id).orElse(new Tipo_pago());
    }

    @Override
    public void insert(Tipo_pago tp) {
        tpR.save(tp);
    }

    @Override
    public void update(Tipo_pago tp) {
        tpR.save(tp);
    }

    @Override
    public void delete(int id) {
        tpR.deleteById(id);
    }
}
