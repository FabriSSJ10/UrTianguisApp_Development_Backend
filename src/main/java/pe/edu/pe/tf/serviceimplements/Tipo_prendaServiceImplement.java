package pe.edu.pe.tf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.tf.entities.Tipo_prenda;
import pe.edu.pe.tf.serviceinterface.ITipo_prendaService;
import pe.edu.pe.tf.repositories.ITipo_prendaRepository;

import java.util.List;

@Service
public class Tipo_prendaServiceImplement implements ITipo_prendaService {
    @Autowired
    private ITipo_prendaRepository rR;

    @Override
    public List<Tipo_prenda> list() {
        return rR.findAll();
    }

    @Override
    public void insert(Tipo_prenda tipo) {
        rR.save(tipo);
    }
    @Override
    public void update(Tipo_prenda tipo) {
        rR.save(tipo);
    }

    @Override
    public Tipo_prenda listId(int id) {
        return rR.findById(id).orElse(new Tipo_prenda());
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }
}
