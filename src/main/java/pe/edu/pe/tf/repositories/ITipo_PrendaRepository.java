package pe.edu.pe.tf.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.pe.tf.entities.Tipo_Prenda;
@Repository

public interface ITipo_PrendaRepository extends JpaRepository<Tipo_Prenda, Integer>{

}
