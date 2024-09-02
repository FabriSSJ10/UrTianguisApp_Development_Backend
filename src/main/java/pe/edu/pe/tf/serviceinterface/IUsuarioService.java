package pe.edu.pe.tf.serviceinterface;
import pe.edu.pe.tf.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public List<Usuario> list();
    public void insert(Usuario u);
    public void update(Usuario u);
    public void delete(int id);
    public Usuario listId(int id);
    public String mesMenosUsuarios();
}
