package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Departamento")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_departamento;
    @Column(name = "Departamento",nullable = false,length = 80)
    private String Departamento;

    public Departamento()
    {
    }

    public Departamento(String departamento, int id_departamento) {
        Departamento = departamento;
        Id_departamento = id_departamento;
    }

    public int getId_pais() {
        return Id_departamento;
    }

    public void setId_departamento(int id_departamento) {
        Id_departamento = id_departamento;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }
}
