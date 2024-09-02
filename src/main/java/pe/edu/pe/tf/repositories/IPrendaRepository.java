package pe.edu.pe.tf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.pe.tf.entities.Prenda;

@Repository
public interface IPrendaRepository extends JpaRepository<Prenda, Integer> {
}
