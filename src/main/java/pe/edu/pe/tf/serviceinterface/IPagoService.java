package pe.edu.pe.tf.serviceinterface;

import pe.edu.pe.tf.entities.Pago;
import pe.edu.pe.tf.entities.Pedido;

import java.util.List;

public interface IPagoService {
    public List<Pago> list();
    public void insert(Pago p);
    public Pago listId(int id);
    public void update(Pago p);
    public void delete(int id);
    List<String[]> Monto_total_pagos_por_sexo();
    List<String[]> Monto_total_pagos_por_departamento();
    List<String[]> Cantidad_pagos_por_tipo_pago();
    List<String[]> Cantidad_pagos_por_tipo_pago_y_mes();
}

