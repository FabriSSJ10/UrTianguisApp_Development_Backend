package pe.edu.pe.tf.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.pe.tf.entities.Tipo_Pago;

@Repository
public interface ITipo_PagoRepository extends JpaRepository<Tipo_Pago, Integer> {
}
