package pe.edu.pe.tf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.tf.dtos.Tipo_PrendaDTO;
import pe.edu.pe.tf.entities.Prenda;
import pe.edu.pe.tf.entities.Tipo_Pago;
import pe.edu.pe.tf.entities.Tipo_Prenda;
import pe.edu.pe.tf.serviceinterface.ITipo_PrendaService;
import pe.edu.pe.tf.repositories.ITipo_PrendaRepository;

import java.util.List;

@Service
public class Tipo_PrendaServiceImplement implements ITipo_PrendaService {
    @Autowired
    private ITipo_PrendaRepository rR;

    @Override
    public List<Tipo_Prenda> list() {
        return rR.findAll();
    }

    @Override
    public void insert(Tipo_Prenda tipo) {
        rR.save(tipo);
    }
    @Override
    public void update(Tipo_Prenda tipo) {
        rR.save(tipo);
    }

    @Override
    public Tipo_Prenda listId(int id) {
        return rR.findById(id).orElse(new Tipo_Prenda());
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);

    }

}
