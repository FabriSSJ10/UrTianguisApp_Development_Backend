package pe.edu.pe.tf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.pe.tf.entities.Det_Pedido;

@Repository
public interface IDet_PedidoRepository extends JpaRepository<Det_Pedido, Integer> {
}
