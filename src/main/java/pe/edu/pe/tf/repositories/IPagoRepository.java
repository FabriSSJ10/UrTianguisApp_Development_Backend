package pe.edu.pe.tf.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.pe.tf.entities.Pago;

import java.util.List;

@Repository
public interface IPagoRepository extends JpaRepository<Pago, Integer> {
    @Query(value = " SELECT u.sexo, SUM(p.monto) AS monto_total_pago \n" +
            " FROM usuario u \n" +
            " JOIN pedido pe ON u.id_usuario = pe.id_usuario \n" +
            " JOIN pago p ON pe.id_pago = p.id_pago \n" +
            " GROUP BY u.sexo \n" +
            " ORDER BY monto_total_pago DESC \n", nativeQuery = true)
    public List<String[]> sumBySex();

    @Query(value = " SELECT d.departamento, SUM(p.monto) AS monto_total_pago \n" +
            " FROM usuario u \n" +
            " JOIN pedido pe ON u.id_usuario = pe.id_usuario \n" +
            " JOIN pago p ON pe.id_pago = p.id_pago \n" +
            " JOIN departamento d ON u.id_departamento = d.id_departamento \n" +
            " GROUP BY d.departamento \n" +
            " ORDER BY monto_total_pago DESC \n", nativeQuery = true)
    public List<String[]> sumByDepartment();

    //CANTIDAD DE PAGOS REALIZADOS X TIPO DE PAGO
    @Query(value=" SELECT tipo_pago.tipo, COUNT(*) AS Cantidad_Pagos \n" +
            " FROM pago \n" +
            " JOIN tipo_pago  ON tipo_pago.id_tipo_pago = pago.id_tipo_pago \n" +
            " GROUP BY tipo_pago.tipo ", nativeQuery = true)
    public List<String[]> cantpagosxtipodepago();

    //Cantidad de pagos realizados según metodo de pago agrupados por mes de mayor a menor
    @Query(value=" SELECT TP.Tipo AS Tipo_de_pago_realizado, \n" +
            " EXTRACT(MONTH FROM P.Fecha_pago) AS Mes, \n" +
            " COUNT(*) AS Cantidad_Pagos \n" +
            " FROM PAGO P\n" +
            " JOIN TIPO_PAGO TP ON TP.Id_tipo_pago = P.Id_tipo_pago\n" +
            " GROUP BY TP.Tipo, EXTRACT(MONTH FROM P.Fecha_pago)\n" +
            " ORDER BY Mes, Cantidad_Pagos DESC \n",nativeQuery = true)
    public List<String[]>pagos_agrupadosxmesxmetodo();

}
