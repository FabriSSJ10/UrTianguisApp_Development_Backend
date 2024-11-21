package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Pago")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_pago;
    @Column(name = "Monto",nullable = true)
    private float monto;
    @Column(name = "Fecha_pago",nullable = false)
    private LocalDate fecha_pago;
    @Column(name = "Fecha_vencimiento",nullable = true)
    private LocalDate fecha_vencimiento;
    @Column(name = "Cod_validacion",nullable = true,length = 10)
    private String cod_validacion;
    @Column(name = "Num_tarjeta_cliente",nullable = true,length = 20)
    private String num_tarjeta_cliente;
    @Column(name = "Telefono_cliente",nullable = true,length = 13)
    private String telefono_cliente;
    @ManyToOne
    @JoinColumn(name = "Id_tipopago")
    private Tipo_pago tp;

    public Pago() {
    }

    public Pago(int id_pago, float monto, LocalDate fecha_pago, LocalDate fecha_vencimiento, String cod_validacion, String num_tarjeta_cliente, String telefono_cliente, Tipo_pago tp) {
        this.id_pago = id_pago;
        this.monto = monto;
        this.fecha_pago = fecha_pago;
        this.fecha_vencimiento = fecha_vencimiento;
        this.cod_validacion = cod_validacion;
        this.num_tarjeta_cliente = num_tarjeta_cliente;
        this.telefono_cliente = telefono_cliente;
        this.tp = tp;
    }

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
