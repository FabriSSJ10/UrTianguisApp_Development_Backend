package pe.edu.pe.tf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.tf.entities.Prenda;
import pe.edu.pe.tf.entities.Tienda;
import pe.edu.pe.tf.repositories.IPrendaRepository;
import pe.edu.pe.tf.serviceinterface.IPrendaService;

import java.util.List;

@Service
public class PrendaServiceImplements implements IPrendaService {
    @Autowired
    private IPrendaRepository pR;
    @Override
    public List<Prenda> list() {
        return pR.findAll();
    }
    @Override
    public void insert(Prenda p) {
        pR.save(p);
    }
    @Override
    public Prenda listId(int id) {
        return pR.findById(id).orElse(new Prenda());
    }
    @Override
    public void update(Prenda p) {
        pR.save(p);
    }
    @Override
    public void delete(int id) {
        pR.deleteById(id);
    }
    @Override
    public List<String[]> prendasxtienda(){return pR.cantprendasxtienda();};
}
