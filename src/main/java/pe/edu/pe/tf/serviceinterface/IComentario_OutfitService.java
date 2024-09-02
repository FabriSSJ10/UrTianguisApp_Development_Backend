package pe.edu.pe.tf.serviceinterface;

import pe.edu.pe.tf.entities.Catalogo;
import pe.edu.pe.tf.entities.Comentario_Outfit;
import pe.edu.pe.tf.entities.Comentario_Outfit;

import java.util.List;

public interface IComentario_OutfitService {
    public List<Comentario_Outfit>list();
    public void insert(Comentario_Outfit com);
    public void delete(int idComentario);
    public void update(Comentario_Outfit com);
    public Comentario_Outfit listId(int id);
}
