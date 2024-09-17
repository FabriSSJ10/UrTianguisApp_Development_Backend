package pe.edu.pe.tf.dtos;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class Tipo_PagoDTO {
    private int Id_tipo_pago;
    private String Tipo;

    public int getId_tipo_pago() {
        return Id_tipo_pago;
    }

    public void setId_tipo_pago(int id_tipo_pago) {
        Id_tipo_pago = id_tipo_pago;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }
}
