package pe.edu.pe.tf.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "tipo_pago")
public class Tipo_Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_tipo_pago;
    @Column(name = "Tipo", nullable = false, length = 20)
    private String Tipo;

    public Tipo_Pago() {

    }

    public Tipo_Pago(int id_tipo_pago, String tipo) {
        Id_tipo_pago = id_tipo_pago;
        Tipo = tipo;
    }

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
