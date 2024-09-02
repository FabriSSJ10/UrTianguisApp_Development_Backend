package pe.edu.pe.tf.dtos;

import pe.edu.pe.tf.entities.Outfit;
import pe.edu.pe.tf.entities.Usuario;

public class Comentario_OutfitDTO {
    private int Id_comentario;
    private String Comentario;
    private Usuario us;
    private Outfit ou;

    public int getId_comentario() {
        return Id_comentario;
    }

    public void setId_comentario(int id_comentario) {
        Id_comentario = id_comentario;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String comentario) {
        Comentario = comentario;
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
