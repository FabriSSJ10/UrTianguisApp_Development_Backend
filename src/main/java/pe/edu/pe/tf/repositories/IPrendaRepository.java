package pe.edu.pe.tf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.pe.tf.entities.Prenda;

import java.util.List;

@Repository
public interface IPrendaRepository extends JpaRepository<Prenda, Integer> {
    @Query(value= "SELECT t.nombre, COUNT(*) AS Cantidad_Prendas_Vendidas \n" +
            " FROM TIENDA t JOIN PRENDA p  \n" +
            " ON t.id_tienda = p.id_tienda \n" +
            " GROUP BY t.nombre \n",nativeQuery = true)
    public List<String[]> Cantidad_prendas_por_tienda();
}
