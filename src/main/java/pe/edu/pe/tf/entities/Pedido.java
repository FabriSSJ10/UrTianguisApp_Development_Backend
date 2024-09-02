package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_pedido;
    @Column(name = "Estado_pedido",nullable = false, length = 20)
    private String Estado_pedido;
    @Column(name = "Fecha_solicitud",nullable = false)
    private LocalDate Fecha_solicitud;
    @Column(name = "Fecha_entrega",nullable = false,length = 10)
    private LocalDateTime Fecha_entrega;
    @Column(name = "I_fecha_creacion\n",nullable = false,length = 10)
    private LocalDate I_fecha_creacion;
    @Column(name = "I_creado_por",nullable = false, length = 40)
    private String I_creado_por;
    @OneToOne
    @JoinColumn(name = "Id_pago")
    private Pago Pa;
    @ManyToOne
    @JoinColumn(name = "Id_usuario")
    private Usuario Us;
    @ManyToOne
    @JoinColumn(name = "Id_notificacion")
    private Notificaciones Nt;

    public Pedido() {

    }

    public Pedido(int id_pedido, String estado_pedido, LocalDate fecha_solicitud, LocalDateTime fecha_entrega, LocalDate i_fecha_creacion, String i_creado_por, Pago pa, Usuario us, Notificaciones nt) {
        Id_pedido = id_pedido;
        Estado_pedido = estado_pedido;
        Fecha_solicitud = fecha_solicitud;
        Fecha_entrega = fecha_entrega;
        I_fecha_creacion = i_fecha_creacion;
        I_creado_por = i_creado_por;
        Pa = pa;
        Us = us;
        Nt = nt;
    }

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

    public Notificaciones getNt() {
        return Nt;
    }

    public void setNt(Notificaciones nt) {
        Nt = nt;
    }
}
