package pe.edu.pe.tf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.tf.entities.Comentario_Outfit;
import pe.edu.pe.tf.entities.Prenda;
import pe.edu.pe.tf.repositories.IComentario_OutfitRepository;
import pe.edu.pe.tf.serviceinterface.IComentario_OutfitService;

import java.util.List;

@Service
public class Comentario_OutfitServiceImplements implements IComentario_OutfitService {
    @Autowired
    private IComentario_OutfitRepository comR;
    @Override
    public List<Comentario_Outfit> list() {
        return comR.findAll();
    }

    @Override
    public Comentario_Outfit listId(int id) {
        return comR.findById(id).orElse(new Comentario_Outfit());
    }

    @Override
    public void insert(Comentario_Outfit com) {
        comR.save(com);
    }

    @Override
    public void delete(int idComentario) {
        comR.deleteById(idComentario);
    }

    @Override
    public void update(Comentario_Outfit com) {
        comR.save(com);
    }
}
