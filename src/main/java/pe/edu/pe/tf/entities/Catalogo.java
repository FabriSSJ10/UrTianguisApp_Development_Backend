package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="catalogo")
public class Catalogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_catalogo;
    @Column(name = "I_fecha_creacion",nullable = false)
    private LocalDate I_fecha_creacion;
    @Column(name = "I_fecha_modificacion",nullable = false)
    private LocalDate I_fecha_modificacion;
    @ManyToOne
    @JoinColumn(name = "Id_outfit")
    private Outfit Ou;

    public Catalogo(){

    }

    public Catalogo(int Id_catalogo, Outfit ou, LocalDate i_fecha_modificacion, LocalDate i_fecha_creacion) {
        this.Id_catalogo = Id_catalogo;
        Ou = ou;
        I_fecha_modificacion = i_fecha_modificacion;
        I_fecha_creacion = i_fecha_creacion;
    }

    public int getId_catalogo() {
        return Id_catalogo;
    }

    public void setId_catalogo(int catalogo) {
        this.Id_catalogo = catalogo;
    }

    public Outfit getOu() {
        return Ou;
    }

    public void setOu(Outfit ou) {
        Ou = ou;
    }

    public LocalDate getI_fecha_creacion() {
        return I_fecha_creacion;
    }

    public void setI_fecha_creacion(LocalDate i_fecha_creacion) {
        I_fecha_creacion = i_fecha_creacion;
    }

    public LocalDate getI_fecha_modificacion() {
        return I_fecha_modificacion;
    }

    public void setI_fecha_modificacion(LocalDate i_fecha_modificacion) {
        I_fecha_modificacion = i_fecha_modificacion;
    }
}
