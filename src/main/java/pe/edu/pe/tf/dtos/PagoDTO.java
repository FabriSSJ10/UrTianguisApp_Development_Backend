package pe.edu.pe.tf.dtos;
import pe.edu.pe.tf.entities.Tipo_pago;

import java.time.LocalDate;

public class PagoDTO {
    private int id_pago;
    private float monto;
    private LocalDate fecha_pago;
    private LocalDate fecha_vencimiento;
    private String cod_validacion;
    private String num_tarjeta_cliente;
    private String telefono_cliente;
    private Tipo_pago tp;

    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public LocalDate getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(LocalDate fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public LocalDate getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(LocalDate fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getCod_validacion() {
        return cod_validacion;
    }

    public void setCod_validacion(String cod_validacion) {
        this.cod_validacion = cod_validacion;
    }

    public String getNum_tarjeta_cliente() {
        return num_tarjeta_cliente;
    }

    public void setNum_tarjeta_cliente(String num_tarjeta_cliente) {
        this.num_tarjeta_cliente = num_tarjeta_cliente;
    }

    public String getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(String telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public Tipo_pago getTp() {
        return tp;
    }

    public void setTp(Tipo_pago tp) {
        this.tp = tp;
    }
}
