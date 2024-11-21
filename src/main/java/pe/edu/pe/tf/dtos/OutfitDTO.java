package pe.edu.pe.tf.dtos;
import pe.edu.pe.tf.entities.Prenda;
import pe.edu.pe.tf.entities.Tipo_ocasion;
import pe.edu.pe.tf.entities.Usuario;

import java.time.LocalDate;

public class OutfitDTO {
    private int id_outfit;
    private String nombre;
    private String descripcion;
    private String imagen;
    private LocalDate i_fecha_creacion;
    private LocalDate i_fecha_modificacion;
    private String i_creador_por;
    private String i_modificado_por;
    private Usuario us;
    private Prenda pr;
    private Tipo_ocasion to;

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
