package pe.edu.pe.tf.dtos;

import jakarta.persistence.Column;

public class DepartamentoDTO {


    private int Id_pais;
    private String Departamento;

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
