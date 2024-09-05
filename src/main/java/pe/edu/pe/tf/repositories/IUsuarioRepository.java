package pe.edu.pe.tf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.pe.tf.entities.Usuario;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Integer> {
    @Query(" SELECT TO_CHAR(us.I_fecha_creacion, 'YYYY-MM') AS mes, COUNT(us) AS totalUsuarios " +
            " FROM Usuario us " +
            " GROUP BY TO_CHAR(us.I_fecha_creacion, 'YYYY-MM') " +
            " ORDER BY totalUsuarios ASC ")
    List<Object[]> mesMenosUsuarios();
}
