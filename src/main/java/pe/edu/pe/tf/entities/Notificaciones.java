package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "notificacion")
public class Notificaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_Notificaciones;
    @Column(name = "Confirmacion_Pedido", nullable = false)
    private boolean Confirmacion_Pedido;
    @Column(name = "Confirmacion_Entrega", nullable = false)
    private boolean Confirmacion_Entrega;

    public Notificaciones() {

    }

    public Notificaciones(int id_Notificaciones, boolean confirmacion_Pedido, boolean confirmacion_Entrega) {
        Id_Notificaciones = id_Notificaciones;
        Confirmacion_Pedido = confirmacion_Pedido;
        Confirmacion_Entrega = confirmacion_Entrega;
    }

    public int getId_Notificaciones() {
        return Id_Notificaciones;
    }

    public void setId_Notificaciones(int id_Notificaciones) {
        Id_Notificaciones = id_Notificaciones;
    }

    public boolean isConfirmacion_Pedido() {
        return Confirmacion_Pedido;
    }

    public void setConfirmacion_Pedido(boolean confirmacion_Pedido) {
        Confirmacion_Pedido = confirmacion_Pedido;
    }

    public boolean isConfirmacion_Entrega() {
        return Confirmacion_Entrega;
    }

    public void setConfirmacion_Entrega(boolean confirmacion_Entrega) {
        Confirmacion_Entrega = confirmacion_Entrega;
    }
}
