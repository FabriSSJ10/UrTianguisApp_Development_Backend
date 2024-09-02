package pe.edu.pe.tf.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.pe.tf.entities.Outfit;

@Repository
public interface IOutfitRepository extends JpaRepository<Outfit, Integer> {
}
