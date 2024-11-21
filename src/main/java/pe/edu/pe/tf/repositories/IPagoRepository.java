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
            " ORDER BY monto_total_pago DESC;", nativeQuery = true)
    public List<String[]> Monto_total_pagos_por_sexo();

    @Query(value = " SELECT d.departamento, SUM(p.monto) AS monto_total_pago \n" +
            " FROM usuario u \n" +
            " JOIN pedido pe ON u.id_usuario = pe.id_usuario \n" +
            " JOIN pago p ON pe.id_pago = p.id_pago \n" +
            " JOIN departamento d ON u.id_departamento = d.id_departamento \n" +
            " GROUP BY d.departamento \n" +
            " ORDER BY monto_total_pago DESC;", nativeQuery = true)
    public List<String[]> Monto_total_pagos_por_departamento();

    //CANTIDAD DE PAGOS REALIZADOS X TIPO DE PAGO
    @Query(value = " SELECT tp.tipo_pago, COUNT(*) AS Cantidad_Pagos \n" +
            " FROM pago pa \n" +
            " JOIN tipo_pago tp ON tp.id_tipopago = pa.id_tipopago \n" +
            " GROUP BY tp.tipo_pago;",
            nativeQuery = true)
    public List<String[]> Cantidad_pagos_por_tipo_pago();

    //Cantidad de pagos realizados según metodo de pago agrupados por mes de mayor a menor
    @Query(value=" SELECT TP.tipo_pago AS Tipo_de_pago_realizado, \n" +
            " EXTRACT(MONTH FROM P.fecha_pago) AS Mes, \n" +
            " COUNT(*) AS Cantidad_Pagos \n" +
            " FROM Pago P \n" +
            " JOIN Tipo_pago TP ON TP.id_tipopago = P.Id_tipopago \n" +
            " GROUP BY TP.tipo_pago, EXTRACT(MONTH FROM P.fecha_pago) \n" +
            " ORDER BY Mes, Cantidad_Pagos DESC ",nativeQuery = true)
    public List<String[]>Cantidad_pagos_por_tipo_pago_y_mes();

}
