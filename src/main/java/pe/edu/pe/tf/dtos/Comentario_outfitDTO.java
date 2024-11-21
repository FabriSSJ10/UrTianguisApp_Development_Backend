package pe.edu.pe.tf.dtos;

import pe.edu.pe.tf.entities.Outfit;
import pe.edu.pe.tf.entities.Usuario;

public class Comentario_outfitDTO {
    private int id_comentario;
    private float calificacion;
    private String comentario;
    private Usuario us;
    private Outfit ou;

    public int getId_comentario() {
        return id_comentario;
    }

    public void setId_comentario(int id_comentario) {
        this.id_comentario = id_comentario;
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
