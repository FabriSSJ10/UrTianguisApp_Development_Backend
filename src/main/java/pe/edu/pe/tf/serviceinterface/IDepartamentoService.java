package pe.edu.pe.tf.serviceinterface;

import pe.edu.pe.tf.entities.Departamento;

import java.util.List;


public interface IDepartamentoService {
    public List<Departamento> list();
    public void insert (Departamento d);
    public void update (Departamento d);
    public void delete (int id);
    public Departamento listId(int id);
    public List<String[]> Cantidad_usuarios_por_departamento();
}
