package pe.edu.pe.tf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.tf.entities.Catalogo;
import pe.edu.pe.tf.entities.Det_Pedido;
import pe.edu.pe.tf.entities.Outfit;
import pe.edu.pe.tf.repositories.ICatalogoRepository;
import pe.edu.pe.tf.repositories.IDet_PedidoRepository;
import pe.edu.pe.tf.serviceinterface.ICatalogoService;

import java.util.List;

@Service
public class CatalogoServiceImplements implements ICatalogoService {
    @Autowired
    private ICatalogoRepository cP;
    @Override
    public List<Catalogo> list() {
        return cP.findAll();
    }
    @Override
    public void insert(Catalogo p) {
        cP.save(p);
    }
    @Override
    public Catalogo listId(int id) {
        return cP.findById(id).orElse(new Catalogo());
    }
    @Override
    public void update(Catalogo p) {
        cP.save(p);
    }
    @Override
    public void delete(int id) {
        cP.deleteById(id);
    }
}
