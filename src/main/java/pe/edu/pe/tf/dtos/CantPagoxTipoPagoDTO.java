package pe.edu.pe.tf.dtos;

public class CantPagoxTipoPagoDTO {
    private String tipo_de_pago;
    private double cant_pagos;


    public String getTipo_de_pago() {
        return tipo_de_pago;
    }

    public void setTipo_de_pago(String tipo_de_pago) {
        this.tipo_de_pago = tipo_de_pago;
    }

    public double getCant_pagos() {
        return cant_pagos;
    }

    public void setCant_pagos(double cant_pagos) {
        this.cant_pagos = cant_pagos;
    }
}
