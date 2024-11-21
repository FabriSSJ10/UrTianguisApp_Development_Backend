package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

@Entity
@Table(name= "Tipo_prenda")
public class Tipo_prenda {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id_tipo_prenda;
    @Column(name="Tipo_Prenda",nullable=false,length=100)
    private String tipo_prenda;
    public Tipo_prenda()
    {

    }

    public Tipo_prenda(int id_tipo_prenda, String tipo_prenda) {
        this.id_tipo_prenda = id_tipo_prenda;
        this.tipo_prenda = tipo_prenda;
    }

    public int getId_tipo_prenda() {
        return id_tipo_prenda;
    }

    public void setId_tipo_prenda(int id_tipo_prenda) {
        this.id_tipo_prenda = id_tipo_prenda;
    }

    public String getTipo_prenda() {
        return tipo_prenda;
    }

    public void setTipo_prenda(String tipo_prenda) {
        this.tipo_prenda = tipo_prenda;
    }
}

