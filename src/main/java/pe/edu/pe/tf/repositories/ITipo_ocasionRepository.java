package pe.edu.pe.tf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.pe.tf.entities.Tipo_ocasion;

@Repository
public interface ITipo_ocasionRepository extends JpaRepository<Tipo_ocasion, Integer> {
}
