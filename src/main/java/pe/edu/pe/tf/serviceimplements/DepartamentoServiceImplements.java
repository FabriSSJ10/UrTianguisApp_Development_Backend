package pe.edu.pe.tf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.tf.entities.Departamento;
import pe.edu.pe.tf.repositories.IDepartamentoRepository;
import pe.edu.pe.tf.serviceinterface.IDepartamentoService;

import java.util.List;

@Service
public class DepartamentoServiceImplements implements IDepartamentoService {

    @Autowired
    private IDepartamentoRepository dR;

    @Override
    public void insert(Departamento d) {dR.save(d);}


    @Override
    public List<Departamento> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int idPais) {
        dR.deleteById(idPais);
    }

    @Override
    public Departamento listId(int idPais) {
        return dR.findById(idPais).orElse(new Departamento());
    }

    @Override
    public void update(Departamento d) {
        dR.save(d);
    }
}
