package pe.edu.pe.tf.dtos;

import pe.edu.pe.tf.entities.Tienda;
import pe.edu.pe.tf.entities.Tipo_prenda;

import java.time.LocalDate;

public class PrendaDTO {
    private int id_prenda;
    private String nombre;
    private String descripcion;
    private float precio;
    private String talla;
    private int stock;
    private int veces_usada;
    private String imagen;
    private LocalDate i_fecha_creacion;
    private LocalDate i_fecha_modificacion;
    private String i_creado_por;
    private String i_modificado_por;
    private Tipo_prenda tp;
    private Tienda ti;

    public int getId_prenda() {
        return id_prenda;
    }

    public void setId_prenda(int id_prenda) {
        this.id_prenda = id_prenda;
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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getVeces_usada() {
        return veces_usada;
    }

    public void setVeces_usada(int veces_usada) {
        this.veces_usada = veces_usada;
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

    public String getI_creado_por() {
        return i_creado_por;
    }

    public void setI_creado_por(String i_creado_por) {
        this.i_creado_por = i_creado_por;
    }

    public String getI_modificado_por() {
        return i_modificado_por;
    }

    public void setI_modificado_por(String i_modificado_por) {
        this.i_modificado_por = i_modificado_por;
    }

    public Tipo_prenda getTp() {
        return tp;
    }

    public void setTp(Tipo_prenda tp) {
        this.tp = tp;
    }

    public Tienda getTi() {
        return ti;
    }

    public void setTi(Tienda ti) {
        this.ti = ti;
    }
}
