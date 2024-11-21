package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Comentario_outfit")
public class Comentario_outfit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_comentario_outfit;
    @Column(name = "Calificacion",nullable = false)
    private float calificacion;
    @Column(name = "Comentario",nullable = false,length = 500)
    private String comentario;
    @ManyToOne
    @JoinColumn(name = "USUARIO_Id_usuario")
    private Usuario us;
    @ManyToOne
    @JoinColumn(name = "OUTFIT_Id_outfit")
    private Outfit ou;

    public Comentario_outfit() {
    }

    public Comentario_outfit(int id_comentario_outfit, float calificacion, String comentario, Usuario us, Outfit ou) {
        this.id_comentario_outfit = id_comentario_outfit;
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.us = us;
        this.ou = ou;
    }

    public int getId_comentario_outfit() {
        return id_comentario_outfit;
    }

    public void setId_comentario_outfit(int id_comentario_outfit) {
        this.id_comentario_outfit = id_comentario_outfit;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Usuario getUs() {
        return us;
    }

    public void setUs(Usuario us) {
        this.us = us;
    }

    public Outfit getOu() {
        return ou;
    }

    public void setOu(Outfit ou) {
        this.ou = ou;
    }
}
