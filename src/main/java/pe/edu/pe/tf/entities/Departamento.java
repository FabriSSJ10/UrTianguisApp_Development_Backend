package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Departamento")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_departamento;
    @Column(name = "Departamento",nullable = false,length = 80)
    private String departamento;

    public Departamento()
    {
    }

    public Departamento(int id_departamento, String departamento) {
        this.id_departamento = id_departamento;
        this.departamento = departamento;
    }

    public int getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
