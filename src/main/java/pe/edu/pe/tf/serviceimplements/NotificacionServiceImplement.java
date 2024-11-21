package pe.edu.pe.tf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.tf.entities.Notificacion;
import pe.edu.pe.tf.repositories.INotificacionRepository;
import pe.edu.pe.tf.serviceinterface.INotificacionService;

import java.util.List;

@Service
public class NotificacionServiceImplement implements INotificacionService {
    @Autowired
    private INotificacionRepository nR;
    @Override
    public List<Notificacion> list() {
        return nR.findAll();
    }
    @Override
    public Notificacion listId(int id) {
        return nR.findById(id).orElse(new Notificacion());
    }

    @Override
    public void insert(Notificacion n) {
        nR.save(n);
    }

    @Override
    public void update(Notificacion n) {
        nR.save(n);
    }

    @Override
    public void delete(int id) {
        nR.deleteById(id);
    }
}
