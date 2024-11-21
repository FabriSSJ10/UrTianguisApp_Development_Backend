package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="catalogo")
public class Catalogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_catalogo;
    @Column(name = "I_fecha_creacion",nullable = false)
    private LocalDate i_fecha_creacion;
    @Column(name = "I_fecha_modificacion",nullable = false)
    private LocalDate i_fecha_modificacion;
    @ManyToOne
    @JoinColumn(name = "Id_outfit")
    private Outfit ou;

    public Catalogo(){

    }

    public Catalogo(int id_catalogo, LocalDate i_fecha_creacion, LocalDate i_fecha_modificacion, Outfit ou) {
        this.id_catalogo = id_catalogo;
        this.i_fecha_creacion = i_fecha_creacion;
        this.i_fecha_modificacion = i_fecha_modificacion;
        this.ou = ou;
    }

    public int getId_catalogo() {
        return id_catalogo;
    }

    public void setId_catalogo(int id_catalogo) {
        this.id_catalogo = id_catalogo;
    }

    public LocalDate getI_fecha_creacion() {
        return i_fecha_creacion;
    }

    public void setI_fecha_creacion(LocalDate i_fecha_creacion) {
        this.i_fecha_creacion = i_fecha_creacion;
    }

    public LocalDate getI_fecha_modificacion() {
        return i_fecha_modificacion;
    }

    public void setI_fecha_modificacion(LocalDate i_fecha_modificacion) {
        this.i_fecha_modificacion = i_fecha_modificacion;
    }

    public Outfit getOu() {
        return ou;
    }

    public void setOu(Outfit ou) {
        this.ou = ou;
    }
}
