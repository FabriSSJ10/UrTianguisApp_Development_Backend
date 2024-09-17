package pe.edu.pe.tf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.pe.tf.entities.Departamento;

import java.util.List;

@Repository
public interface IDepartamentoRepository extends JpaRepository<Departamento, Integer> {
    @Query(value = " SELECT \n" +
            "    departamento AS Departamento, \n" +
            "    COUNT(usuario.id_usuario) AS Cantidad_Usuarios \n" +
            " FROM \n" +
            "    usuario \n" +
            " OIN \n" +
            "    departamento ON usuario.id_departamento = departamento.id_departamento \n" +
            " GROUP BY \n" +
            "    departamento ",nativeQuery = true)
    public List<String[]> cantidad();
}
