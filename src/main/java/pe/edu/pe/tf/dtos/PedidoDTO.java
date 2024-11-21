package pe.edu.pe.tf.dtos;

import pe.edu.pe.tf.entities.Notificacion;
import pe.edu.pe.tf.entities.Pago;
import pe.edu.pe.tf.entities.Usuario;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PedidoDTO {
    private int id_pedido;
    private String estado_pedido;
    private LocalDate fecha_solicitud;
    private LocalDateTime fecha_entrega;
    private LocalDate i_fecha_creacion;
    private String i_creado_por;
    private Pago pa;
    private Usuario us;
    private Notificacion no;

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
