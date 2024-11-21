package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_rol;
    @Column(name = "Tipo_rol", nullable = false, length = 50)
    private String rol;

    @ManyToOne
    @JoinColumn(name = "Id_usuario", referencedColumnName = "id_usuario")
    private Usuario uS;

    public Rol() {
    }

    public Rol(int id_rol, String rol, Usuario uS) {
        this.id_rol = id_rol;
        this.rol = rol;
        this.uS = uS;
    }

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




