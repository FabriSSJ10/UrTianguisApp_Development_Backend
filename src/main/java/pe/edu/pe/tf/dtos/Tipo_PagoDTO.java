package pe.edu.pe.tf.dtos;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class Tipo_PagoDTO {
    private int Tipo_Pago;
    private String Tipo;

    public int getTipo_Pago() {
        return Tipo_Pago;
    }

    public void setTipo_Pago(int tipo_Pago) {
        Tipo_Pago = tipo_Pago;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }
}
