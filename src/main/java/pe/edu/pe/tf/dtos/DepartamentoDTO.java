package pe.edu.pe.tf.dtos;

import jakarta.persistence.Column;

public class DepartamentoDTO {
    private int Id_departamento;
    private String Departamento;

    public int getId_departamento() {
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
