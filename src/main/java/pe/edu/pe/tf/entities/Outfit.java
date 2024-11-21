package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Outfit")
public class Outfit{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_outfit;
    @Column(name = "Nombre",nullable = false,length = 50)
    private String nombre;
    @Column(name = "Descripcion",nullable = false,length = 500)
    private String descripcion;
    @Column(name = "Imagen",nullable = false,length = 300)
    private String imagen;
    @Column(name = "I_fecha_creacion",nullable = false)
    private LocalDate i_fecha_creacion;
    @Column(name = "I_fecha_modificacion",nullable = false)
    private LocalDate i_fecha_modificacion;
    @Column(name = "I_creado_por",nullable = false,length = 40)
    private String i_creador_por;
    @Column(name = "I_modificado_por",nullable = false,length = 40)
    private String i_modificado_por;
    @ManyToOne
    @JoinColumn(name = "Id_usuario")
    private Usuario us;
    @ManyToOne
    @JoinColumn(name = "Id_prenda")
    private Prenda pr;
    @ManyToOne
    @JoinColumn(name = "Id_tipo_ocasion")
    private Tipo_ocasion to;

    public Outfit(){

    }

    public Outfit(int id_outfit, String nombre, String descripcion, String imagen, LocalDate i_fecha_creacion, LocalDate i_fecha_modificacion, String i_creador_por, String i_modificado_por, Usuario us, Prenda pr, Tipo_ocasion to) {
        this.id_outfit = id_outfit;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.i_fecha_creacion = i_fecha_creacion;
        this.i_fecha_modificacion = i_fecha_modificacion;
        this.i_creador_por = i_creador_por;
        this.i_modificado_por = i_modificado_por;
        this.us = us;
        this.pr = pr;
        this.to = to;
    }

    public int getId_outfit() {
        return id_outfit;
    }

    public void setId_outfit(int id_outfit) {
        this.id_outfit = id_outfit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
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

    public String getI_creador_por() {
        return i_creador_por;
    }

    public void setI_creador_por(String i_creador_por) {
        this.i_creador_por = i_creador_por;
    }

    public String getI_modificado_por() {
        return i_modificado_por;
    }

    public void setI_modificado_por(String i_modificado_por) {
        this.i_modificado_por = i_modificado_por;
    }

    public Usuario getUs() {
        return us;
    }

    public void setUs(Usuario us) {
        this.us = us;
    }

    public Prenda getPr() {
        return pr;
    }

    public void setPr(Prenda pr) {
        this.pr = pr;
    }

    public Tipo_ocasion getTo() {
        return to;
    }

    public void setTo(Tipo_ocasion to) {
        this.to = to;
    }
}


