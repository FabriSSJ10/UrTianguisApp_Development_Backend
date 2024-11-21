package pe.edu.pe.tf.serviceinterface;

import pe.edu.pe.tf.entities.Comentario_outfit;

import java.util.List;

public interface IComentario_outfitService {
    public List<Comentario_outfit>list();
    public void insert(Comentario_outfit com);
    public void delete(int idComentario);
    public void update(Comentario_outfit com);
    public Comentario_outfit listId(int id);
}
