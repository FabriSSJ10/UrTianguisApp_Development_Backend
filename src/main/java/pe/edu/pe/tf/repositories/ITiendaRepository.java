package pe.edu.pe.tf.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.pe.tf.entities.Tienda;

@Repository
public interface ITiendaRepository extends JpaRepository<Tienda, Integer> {
}

