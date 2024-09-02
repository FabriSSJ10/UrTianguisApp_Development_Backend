package pe.edu.pe.tf.dtos;

import pe.edu.pe.tf.entities.Notificaciones;
import pe.edu.pe.tf.entities.Pago;
import pe.edu.pe.tf.entities.Usuario;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PedidoDTO {
    private int Id_pedido;
    private String Estado_pedido;
    private LocalDate Fecha_solicitud;
    private LocalDateTime Fecha_entrega;
    private LocalDate I_fecha_creacion;
    private String I_creado_por;
    private Pago Pa;
    private Usuario Us;
    private Notificaciones No;

    public int getId_pedido() {
        return Id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        Id_pedido = id_pedido;
    }

    public String getEstado_pedido() {
        return Estado_pedido;
    }

    public void setEstado_pedido(String estado_pedido) {
        Estado_pedido = estado_pedido;
    }

    public LocalDate getFecha_solicitud() {
        return Fecha_solicitud;
    }

    public void setFecha_solicitud(LocalDate fecha_solicitud) {
        Fecha_solicitud = fecha_solicitud;
    }

    public LocalDateTime getFecha_entrega() {
        return Fecha_entrega;
    }

    public void setFecha_entrega(LocalDateTime fecha_entrega) {
        Fecha_entrega = fecha_entrega;
    }

    public LocalDate getI_fecha_creacion() {
        return I_fecha_creacion;
    }

    public void setI_fecha_creacion(LocalDate i_fecha_creacion) {
        I_fecha_creacion = i_fecha_creacion;
    }

    public String getI_creado_por() {
        return I_creado_por;
    }

    public void setI_creado_por(String i_creado_por) {
        I_creado_por = i_creado_por;
    }

    public Pago getPa() {
        return Pa;
    }

    public void setPa(Pago pa) {
        Pa = pa;
    }

    public Usuario getUs() {
        return Us;
    }

    public void setUs(Usuario us) {
        Us = us;
    }

    public Notificaciones getNo() {
        return No;
    }

    public void setNo(Notificaciones no) {
        No = no;
    }
}
