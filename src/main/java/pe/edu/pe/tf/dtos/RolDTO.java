package pe.edu.pe.tf.dtos;

import jakarta.persistence.Column;
import pe.edu.pe.tf.entities.Usuario;

public class RolDTO {
    private int id_rol;
    private String rol;
    private Usuario uS;

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Usuario getuS() {
        return uS;
    }

    public void setuS(Usuario uS) {
        this.uS = uS;
    }
}
