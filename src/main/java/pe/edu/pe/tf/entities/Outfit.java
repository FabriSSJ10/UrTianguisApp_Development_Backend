package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="outfit")
public class Outfit{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_outfit;
    @Column(name = "Nombre",nullable = false,length = 50)
    private String Nombre;
    @Column(name = "Descripcion",nullable = false,length = 500)
    private String Descripcion;
    @Column(name = "Calificacion",nullable = false)
    private int Calificacion;
    @Column(name = "Imagen",nullable = false,length = 300)
    private String Imagen;
    @Column(name = "I_fecha_creacion",nullable = false)
    private LocalDate I_fecha_creacion;
    @Column(name = "I_fecha_modificacion",nullable = false)
    private LocalDate I_fecha_modificacion;
    @Column(name = "I_creado_por",nullable = false,length = 40)
    private String I_creador_por;
    @Column(name = "I_modificado_por",nullable = false,length = 40)
    private String I_modificado_por;
    @ManyToOne
    @JoinColumn(name = "Id_usuario")
    private Usuario Us;
    @ManyToOne
    @JoinColumn(name = "Id_prenda")
    private Prenda Pr;
    @ManyToOne
    @JoinColumn(name = "Id_tipo_ocasion")
    private Tipo_Ocasion To;

    public Outfit(){

    }

    public Outfit(int id_outfit, String nombre, String descripcion, int calificacion, String imagen, LocalDate i_fecha_creacion, LocalDate i_fecha_modificacion, String i_creador_por, String i_modificado_por, Usuario us, Prenda pr, Tipo_Ocasion to) {
        Id_outfit = id_outfit;
        Nombre = nombre;
        Descripcion = descripcion;
        Calificacion = calificacion;
        Imagen = imagen;
        I_fecha_creacion = i_fecha_creacion;
        I_fecha_modificacion = i_fecha_modificacion;
        I_creador_por = i_creador_por;
        I_modificado_por = i_modificado_por;
        Us = us;
        Pr = pr;
        To = to;
    }

    public int getId_outfit() {
        return Id_outfit;
    }

    public void setId_outfit(int id_outfit) {
        Id_outfit = id_outfit;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(int calificacion) {
        Calificacion = calificacion;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
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

    public String getI_creador_por() {
        return I_creador_por;
    }

    public void setI_creador_por(String i_creador_por) {
        I_creador_por = i_creador_por;
    }

    public String getI_modificado_por() {
        return I_modificado_por;
    }

    public void setI_modificado_por(String i_modificado_por) {
        I_modificado_por = i_modificado_por;
    }

    public Usuario getUs() {
        return Us;
    }

    public void setUs(Usuario us) {
        Us = us;
    }

    public Prenda getPr() {
        return Pr;
    }

    public void setPr(Prenda pr) {
        Pr = pr;
    }

    public Tipo_Ocasion getTo() {
        return To;
    }

    public void setTo(Tipo_Ocasion to) {
        To = to;
    }
}


