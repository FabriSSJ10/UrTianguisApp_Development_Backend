package pe.edu.pe.tf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.pe.tf.entities.Usuario;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Integer> {
    public Usuario findOneByUsername (String username);

    @Query(" SELECT \n" +
            "    TO_CHAR(us.I_fecha_creacion, 'MM') AS mes, \n" +
            "    COUNT(us) AS total_Usuarios \n" +
            " FROM \n" +
            "    Usuario us \n" +
            " GROUP BY \n" +
            "    TO_CHAR(us.I_fecha_creacion, 'MM') \n" +
            " ORDER BY \n" +
            "    total_Usuarios ASC \n ")
    List<Object[]> mesMenosUsuarios();
}
