package pe.edu.pe.tf.dtos;

import jakarta.persistence.Column;

public class DepartamentoDTO {
    private int id_departamento;
    private String departamento;

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
