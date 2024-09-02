package pe.edu.pe.tf.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "tipo_pago")
public class Tipo_Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Tipo_Pago;
    @Column(name = "Tipo", nullable = false, length = 20)
    private String Tipo;

    public Tipo_Pago() {

    }

    public Tipo_Pago(int tipo_Pago, String tipo) {
        Tipo_Pago = tipo_Pago;
        Tipo = tipo;
    }

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
