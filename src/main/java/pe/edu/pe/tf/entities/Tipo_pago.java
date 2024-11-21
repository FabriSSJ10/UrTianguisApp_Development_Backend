package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Tipo_pago")
public class Tipo_pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tipopago;
    @Column(name = "tipo_pago", nullable = false, length = 20)
    private String tipo_pago;

    public Tipo_pago() {

    }

    public Tipo_pago(int id_tipopago, String tipo_pago) {
        this.id_tipopago = id_tipopago;
        this.tipo_pago = tipo_pago;
    }

    public int getId_tipopago() {
        return id_tipopago;
    }

    public void setId_tipopago(int id_tipopago) {
        this.id_tipopago = id_tipopago;
    }

    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }
}
