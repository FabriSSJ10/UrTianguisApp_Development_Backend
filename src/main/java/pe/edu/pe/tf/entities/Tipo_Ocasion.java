package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Tipo_Ocasion")
public class Tipo_Ocasion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tipo_ocasion;
    @Column(name = "Tipo_ocasion",nullable = false,length = 100)
    private String Tipo_ocasion;

    public Tipo_Ocasion(){

    }

    public Tipo_Ocasion(int id_tipo_ocasion, String tipo_ocasion) {
        this.id_tipo_ocasion = id_tipo_ocasion;
        Tipo_ocasion = tipo_ocasion;
    }

    public int getId_tipo_ocasion() {
        return id_tipo_ocasion;
    }

    public void setId_tipo_ocasion(int id_tipo_ocasion) {
        this.id_tipo_ocasion = id_tipo_ocasion;
    }

    public String getTipo_ocasion() {
        return Tipo_ocasion;
    }

    public void setTipo_ocasion(String tipo_ocasion) {
        Tipo_ocasion = tipo_ocasion;
    }
}
