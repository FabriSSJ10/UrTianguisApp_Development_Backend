package pe.edu.pe.tf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.tf.entities.Tipo_ocasion;
import pe.edu.pe.tf.repositories.ITipo_ocasionRepository;
import pe.edu.pe.tf.serviceinterface.ITipo_ocasionService;

import java.util.List;

@Service
public class Tipo_ocasionServiceImplement implements ITipo_ocasionService {
    @Autowired
    private ITipo_ocasionRepository toR;

    public void insert (Tipo_ocasion to) {toR.save(to);}

    @Override
    public List<Tipo_ocasion> list() {
        return toR.findAll();
    }

    @Override
    public void delete(int idTipo_Ocasion) {
        toR.deleteById(idTipo_Ocasion);
    }

    @Override
    public Tipo_ocasion listId(int idTipo_Ocasion) {
        return toR.findById(idTipo_Ocasion).orElse(new Tipo_ocasion());
    }

    @Override
    public void update(Tipo_ocasion to) {
        toR.save(to);
    }
}
