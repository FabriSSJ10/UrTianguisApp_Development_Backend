package pe.edu.pe.tf.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.pe.tf.entities.Tipo_pago;

@Repository
public interface ITipo_pagoRepository extends JpaRepository<Tipo_pago, Integer> {
}
