package pe.edu.pe.tf.dtos;

import jakarta.persistence.Column;

public class RolDTO {
    private int Id_rol;
    private String Tipo_rol;
    public int getId_rol() {
        return Id_rol;
    }
    public void setId_rol(int id_rol) {
        Id_rol = id_rol;
    }
    public String getTipo_rol() {
        return Tipo_rol;
    }
    public void setTipo_rol(String tipo_rol) {
        Tipo_rol = tipo_rol;
    }
}
