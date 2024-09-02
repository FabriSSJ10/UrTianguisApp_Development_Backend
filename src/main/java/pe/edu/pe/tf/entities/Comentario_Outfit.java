package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Comentario_outfit")
public class Comentario_Outfit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_comentario;
    @Column(name = "Comentario",nullable = false,length = 500)
    private String Comentario;
    @ManyToOne
    @JoinColumn(name = "USUARIO_Id_usuario")
    private Usuario us;
    @ManyToOne
    @JoinColumn(name = "OUTFIT_Id_outfit")
    private Outfit ou;

    public Comentario_Outfit() {
    }

    public Comentario_Outfit(int id_comentario, String comentario, Usuario us, Outfit ou) {
        Id_comentario = id_comentario;
        Comentario = comentario;
        this.us = us;
        this.ou = ou;
    }

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
