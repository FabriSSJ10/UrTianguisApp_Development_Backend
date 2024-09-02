package pe.edu.pe.tf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.pe.tf.entities.Comentario_Outfit;

@Repository
public interface IComentario_OutfitRepository extends JpaRepository<Comentario_Outfit, Integer> {
}
