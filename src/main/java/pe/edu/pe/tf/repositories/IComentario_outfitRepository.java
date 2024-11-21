package pe.edu.pe.tf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.pe.tf.entities.Comentario_outfit;

@Repository
public interface IComentario_outfitRepository extends JpaRepository<Comentario_outfit, Integer> {
}
