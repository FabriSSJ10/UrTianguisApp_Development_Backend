package pe.edu.pe.tf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.pe.tf.entities.Prenda;

import java.util.List;

@Repository
public interface IPrendaRepository extends JpaRepository<Prenda, Integer> {
    //Cantidad de prendas vendidas por tienda
    @Query(value= "SELECT t.Nombre AS Nombre_tienda, COUNT(*) AS Cantidad_Prendas \n" +
            " FROM TIENDA t JOIN PRENDA p  \n" +
            " ON t.Id_tienda = p.Id_tienda \n" +
            " GROUP BY t.Nombre \n",nativeQuery = true)
    public List<String[]> cantprendasxtienda();
}
