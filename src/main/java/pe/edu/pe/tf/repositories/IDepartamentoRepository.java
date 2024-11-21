package pe.edu.pe.tf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.pe.tf.entities.Departamento;

import java.util.List;

@Repository
public interface IDepartamentoRepository extends JpaRepository<Departamento, Integer> {
    @Query(value = " SELECT d.departamento,COUNT(u.id_usuario) AS Cantidad_Usuarios \n" +
            " FROM usuario as u JOIN departamento as d ON u.id_departamento = d.id_departamento \n" +
            " GROUP BY departamento ",nativeQuery = true)
    public List<String[]> Cantidad_usuarios_por_departamento();
}
