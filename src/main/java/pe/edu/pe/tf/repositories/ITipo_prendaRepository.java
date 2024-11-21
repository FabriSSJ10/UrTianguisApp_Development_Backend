package pe.edu.pe.tf.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.pe.tf.entities.Tipo_prenda;
@Repository

public interface ITipo_prendaRepository extends JpaRepository<Tipo_prenda, Integer>{

}
