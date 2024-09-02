package pe.edu.pe.tf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.tf.entities.Tipo_Ocasion;
import pe.edu.pe.tf.repositories.ITipo_OcasionRepository;
import pe.edu.pe.tf.serviceinterface.ITipo_OcasionService;

import java.util.List;

@Service
public class Tipo_OcasionServiceImplement implements ITipo_OcasionService {
    @Autowired
    private ITipo_OcasionRepository toR;

    public void insert (Tipo_Ocasion to) {toR.save(to);}

    @Override
    public List<Tipo_Ocasion> list() {
        return toR.findAll();
    }

    @Override
    public void delete(int idTipo_Ocasion) {
        toR.deleteById(idTipo_Ocasion);
    }

    @Override
    public Tipo_Ocasion listId(int idTipo_Ocasion) {
        return toR.findById(idTipo_Ocasion).orElse(new Tipo_Ocasion());
    }

    @Override
    public void update(Tipo_Ocasion to) {
        toR.save(to);
    }
}
