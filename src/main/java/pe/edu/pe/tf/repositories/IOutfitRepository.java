package pe.edu.pe.tf.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.pe.tf.entities.Outfit;

import java.util.List;

@Repository
public interface IOutfitRepository extends JpaRepository<Outfit, Integer> {
    @Query(value=" SELECT \n" +
            "    prenda.nombre AS Nombre_prenda, \n" +
            "    COUNT(outfit.id_outfit) AS Cantidad_Outfits \n" +
            " FROM \n" +
            "    prenda \n" +
            " JOIN \n" +
            "    outfit ON outfit.id_prenda = prenda.id_prenda \n" +
            " GROUP BY \n" +
            "    prenda.nombre ", nativeQuery=true)
    public List<String []> Cantidad_outfits_por_prenda();
}
