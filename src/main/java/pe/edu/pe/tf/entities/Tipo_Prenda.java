package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

@Entity
@Table(name= "Tipo_Prenda")
public class Tipo_Prenda {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int Id_tipo_prenda;
    @Column(name="Tipo_Prenda",nullable=false,length=100)
    private String Tipo_prenda;
    public Tipo_Prenda ()
    {

    }

    public Tipo_Prenda(int id_tipo_prenda, String tipo_prenda) {
        Id_tipo_prenda = id_tipo_prenda;
        Tipo_prenda = tipo_prenda;
    }

    public int getId_tipo_prenda() {
        return Id_tipo_prenda;
    }

    public void setId_tipo_prenda(int id_tipo_prenda) {
        Id_tipo_prenda = id_tipo_prenda;
    }

    public String getTipo_prenda() {
        return Tipo_prenda;
    }

    public void setTipo_prenda(String tipo_prenda) {
        Tipo_prenda = tipo_prenda;
    }
}

