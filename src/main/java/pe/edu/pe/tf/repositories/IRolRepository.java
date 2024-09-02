package pe.edu.pe.tf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.pe.tf.entities.Rol;

public interface IRolRepository extends JpaRepository<Rol, Integer> {
}
