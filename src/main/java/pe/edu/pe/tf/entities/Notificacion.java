package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Notificacion")
public class Notificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_notificacion;
    @Column(name = "Descripcion", nullable = false, length = 100)
    private String descripcion;

    public Notificacion() {
    }

    public Notificacion(int id_notificacion, String descripcion) {
        this.id_notificacion = id_notificacion;
        this.descripcion = descripcion;
    }

    public int getId_notificacion() {
        return id_notificacion;
    }

    public void setId_notificacion(int id_notificacion) {
        this.id_notificacion = id_notificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}