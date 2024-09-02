package pe.edu.pe.tf.dtos;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


public class NotificacionesDTO {
    private int Id_Notificaciones;
    private boolean Confirmacion_Pedido;
    private boolean Confirmacion_Entrega;

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
