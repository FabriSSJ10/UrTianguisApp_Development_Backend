package pe.edu.pe.tf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.tf.entities.Comentario_outfit;
import pe.edu.pe.tf.repositories.IComentario_outfitRepository;
import pe.edu.pe.tf.serviceinterface.IComentario_outfitService;

import java.util.List;

@Service
public class Comentario_outfitServiceImplements implements IComentario_outfitService {
    @Autowired
    private IComentario_outfitRepository comR;
    @Override
    public List<Comentario_outfit> list() {
        return comR.findAll();
    }

    @Override
    public Comentario_outfit listId(int id) {
        return comR.findById(id).orElse(new Comentario_outfit());
    }

    @Override
    public void insert(Comentario_outfit com) {
        comR.save(com);
    }

    @Override
    public void delete(int idComentario) {
        comR.deleteById(idComentario);
    }

    @Override
    public void update(Comentario_outfit com) {
        comR.save(com);
    }
}
