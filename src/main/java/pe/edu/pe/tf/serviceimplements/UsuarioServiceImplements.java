package pe.edu.pe.tf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.tf.entities.Usuario;
import pe.edu.pe.tf.repositories.IUsuarioRepository;
import pe.edu.pe.tf.serviceinterface.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplements implements IUsuarioService {
    @Autowired
    private IUsuarioRepository uR;

    @Override
    public List<Usuario> list() {return uR.findAll();}

    @Override
    public void insert(Usuario u) {
        uR.save(u);
    }

    @Override
    public void update(Usuario u) {
        uR.save(u);
    }

    @Override
    public void delete(int id) {
        uR.deleteById(id);
    }

    @Override
    public Usuario listId(int id) {
        return uR.findById(id).orElse(new Usuario());
    }

    @Override
    public String mesMenosUsuarios() {
        List<Object[]> mesMenor = uR.mesMenosUsuarios();
        if (!mesMenor.isEmpty()) {
            Object[] UsuarioxMes = mesMenor.get(0);
            String mes = (String) UsuarioxMes[0];
            long totalUsuarios= (long) UsuarioxMes[1];
            return ("Mes con menos usuarios: "+mes+" con "+ totalUsuarios+" usuarios");
        } else{
            return ("no hay datos");
        }
    }
}
