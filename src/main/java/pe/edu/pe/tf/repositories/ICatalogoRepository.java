package pe.edu.pe.tf.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.pe.tf.entities.Catalogo;

@Repository
public interface ICatalogoRepository extends JpaRepository<Catalogo, Integer> {
}
