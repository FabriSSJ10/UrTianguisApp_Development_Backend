package pe.edu.pe.tf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.pe.tf.entities.Tipo_Ocasion;

@Repository
public interface ITipo_OcasionRepository extends JpaRepository<Tipo_Ocasion, Integer> {
}
