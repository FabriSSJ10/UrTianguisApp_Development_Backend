package pe.edu.pe.tf.dtos;

public class Cantidad_pagos_por_tipo_pagoDTO {
    private String tipo_pago;
    private double cantidad_pagos;

    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public double getCantidad_pagos() {
        return cantidad_pagos;
    }

    public void setCantidad_pagos(double cantidad_pagos) {
        this.cantidad_pagos = cantidad_pagos;
    }
}
