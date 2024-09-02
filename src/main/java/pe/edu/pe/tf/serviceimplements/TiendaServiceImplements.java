package pe.edu.pe.tf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.tf.entities.Tienda;
import pe.edu.pe.tf.entities.Usuario;
import pe.edu.pe.tf.repositories.ITiendaRepository;
import pe.edu.pe.tf.serviceinterface.ITiendaService;

import java.util.List;

@Service
public class TiendaServiceImplements implements ITiendaService {
    @Autowired
    private ITiendaRepository tR;
    @Override
    public List<Tienda> list() {return tR.findAll();}

    @Override
    public void insert(Tienda t) {
        tR.save(t) ;
    }

    @Override
    public Tienda listId(int id) {
        return tR.findById(id).orElse(new Tienda());
    }

    @Override
    public void update(Tienda t) {
        tR.save(t);
    }

    @Override
    public void delete(int id) {
        tR.deleteById(id);
    }

}
