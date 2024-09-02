package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Departamento")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_pais;
    @Column(name = "Departamento",nullable = false,length = 80)
    private String Departamento;

    public Departamento()
    {
    }

    public Departamento(String departamento, int id_pais) {
        Departamento = departamento;
        Id_pais = id_pais;
    }

    public int getId_pais() {
        return Id_pais;
    }

    public void setId_pais(int id_pais) {
        Id_pais = id_pais;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }
}
