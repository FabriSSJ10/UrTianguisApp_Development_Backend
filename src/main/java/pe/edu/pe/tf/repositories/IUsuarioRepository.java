package pe.edu.pe.tf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.pe.tf.entities.Usuario;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Integer> {
    public Usuario findOneByUsername(String username);

    @Query(" SELECT TO_CHAR(us.i_fecha_creacion, 'YYYY-MM') AS mes, COUNT(us) AS totalUsuarios " +
            " FROM Usuario us " +
            " GROUP BY TO_CHAR(us.i_fecha_creacion, 'YYYY-MM') " +
            " ORDER BY totalUsuarios ASC ")
    List<Object[]> Mes_menos_usuarios();

    //BUSCAR POR NOMBRE
    @Query("select count(u.username) from Usuario u where u.username =:username")
    public int buscarUsername(@Param("username") String nombre);


    //INSERTAR ROLES
    @Transactional
    @Modifying
    @Query(value = "insert into Rol (rol, id_usuario) VALUES (:rol, :id_usuario)", nativeQuery = true)
    public void insRol(@Param("rol") String authority, @Param("id_usuario") int id_usuario);
}
