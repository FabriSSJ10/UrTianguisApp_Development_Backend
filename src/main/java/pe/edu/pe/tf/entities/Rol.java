package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_rol;
    @Column(name = "Tipo_rol", nullable = false, length = 50)
    private String Tipo_rol;

    public Rol() { }

    public Rol(int id_rol, String tipo_rol) {
        Id_rol = id_rol;
        Tipo_rol = tipo_rol;
    }

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




