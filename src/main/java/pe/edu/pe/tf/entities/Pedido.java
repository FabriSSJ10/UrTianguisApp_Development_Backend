package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="Pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_pedido;
    @Column(name = "Estado_pedido",nullable = false, length = 20)
    private String estado_pedido;
    @Column(name = "Fecha_solicitud",nullable = false)
    private LocalDate fecha_solicitud;
    @Column(name = "Fecha_entrega",nullable = false,length = 10)
    private LocalDateTime fecha_entrega;
    @Column(name = "I_fecha_creacion",nullable = false,length = 10)
    private LocalDate i_fecha_creacion;
    @Column(name = "I_creado_por",nullable = false, length = 40)
    private String i_creado_por;
    @OneToOne
    @JoinColumn(name = "Id_pago")
    private Pago pa;
    @ManyToOne
    @JoinColumn(name = "Id_usuario")
    private Usuario us;
    @ManyToOne
    @JoinColumn(name = "Id_notificacion")
    private Notificacion no;

    public Pedido() {

    }

    public Pedido(int id_pedido, String estado_pedido, LocalDate fecha_solicitud, LocalDateTime fecha_entrega, LocalDate i_fecha_creacion, String i_creado_por, Pago pa, Usuario us, Notificacion no) {
        this.id_pedido = id_pedido;
        this.estado_pedido = estado_pedido;
        this.fecha_solicitud = fecha_solicitud;
        this.fecha_entrega = fecha_entrega;
        this.i_fecha_creacion = i_fecha_creacion;
        this.i_creado_por = i_creado_por;
        this.pa = pa;
        this.us = us;
        this.no = no;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getEstado_pedido() {
        return estado_pedido;
    }

    public void setEstado_pedido(String estado_pedido) {
        this.estado_pedido = estado_pedido;
    }

    public LocalDate getFecha_solicitud() {
        return fecha_solicitud;
    }

    public void setFecha_solicitud(LocalDate fecha_solicitud) {
        this.fecha_solicitud = fecha_solicitud;
    }

    public LocalDateTime getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(LocalDateTime fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public LocalDate getI_fecha_creacion() {
        return i_fecha_creacion;
    }

    public void setI_fecha_creacion(LocalDate i_fecha_creacion) {
        this.i_fecha_creacion = i_fecha_creacion;
    }

    public String getI_creado_por() {
        return i_creado_por;
    }

    public void setI_creado_por(String i_creado_por) {
        this.i_creado_por = i_creado_por;
    }

    public Pago getPa() {
        return pa;
    }

    public void setPa(Pago pa) {
        this.pa = pa;
    }

    public Usuario getUs() {
        return us;
    }

    public void setUs(Usuario us) {
        this.us = us;
    }

    public Notificacion getNo() {
        return no;
    }

    public void setNo(Notificacion no) {
        this.no = no;
    }
}
