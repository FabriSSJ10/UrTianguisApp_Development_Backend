package pe.edu.pe.tf.dtos;

public class Pagos_AgrupxMesxMetodoDTO {
    private String metodo_pago;
    private double cantidad_de_pagos;
    private String mes_cancelado;

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public String getMes_cancelado() {
        return mes_cancelado;
    }

    public void setMes_cancelado(String mes_cancelado) {
        this.mes_cancelado = mes_cancelado;
    }

    public double getCantidad_de_pagos() {
        return cantidad_de_pagos;
    }

    public void setCantidad_de_pagos(double cantidad_de_pagos) {
        this.cantidad_de_pagos = cantidad_de_pagos;
    }
}
