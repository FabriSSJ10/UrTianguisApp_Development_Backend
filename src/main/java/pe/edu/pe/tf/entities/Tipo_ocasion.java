package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Tipo_ocasion")
public class Tipo_ocasion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tipo_ocasion;
    @Column(name = "Tipo_de_ocasion",nullable = false,length = 100)
    private String tipo_ocasion;

    public Tipo_ocasion(){

    }

    public Tipo_ocasion(int id_tipo_ocasion, String tipo_ocasion) {
        this.id_tipo_ocasion = id_tipo_ocasion;
        this.tipo_ocasion = tipo_ocasion;
    }

    public int getId_tipo_ocasion() {
        return id_tipo_ocasion;
    }

    public void setId_tipo_ocasion(int id_tipo_ocasion) {
        this.id_tipo_ocasion = id_tipo_ocasion;
    }

    public String getTipo_ocasion() {
        return tipo_ocasion;
    }

    public void setTipo_ocasion(String tipo_ocasion) {
        this.tipo_ocasion = tipo_ocasion;
    }
}
