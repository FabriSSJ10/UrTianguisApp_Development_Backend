package pe.edu.pe.tf.dtos;

import pe.edu.pe.tf.entities.Tienda;
import pe.edu.pe.tf.entities.Tipo_Prenda;

import java.time.LocalDate;

public class PrendaDTO {
    private int Id_prenda;
    private String Nombre;
    private String Descripcion;
    private float Precio;
    private String Talla;
    private int Stock;
    private int Veces_usada;
    private LocalDate I_fecha_creacion;
    private LocalDate I_fecha_modificacion;
    private String I_creado_por;
    private String I_modificado_por;
    private Tipo_Prenda Tp;
    private Tienda Ti;

    public int getId_prenda() {
        return Id_prenda;
    }

    public void setId_prenda(int id_prenda) {
        Id_prenda = id_prenda;
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

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float precio) {
        Precio = precio;
    }

    public String getTalla() {
        return Talla;
    }

    public void setTalla(String talla) {
        Talla = talla;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    public int getVeces_usada() {
        return Veces_usada;
    }

    public void setVeces_usada(int veces_usada) {
        Veces_usada = veces_usada;
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

    public String getI_creado_por() {
        return I_creado_por;
    }

    public void setI_creado_por(String i_creado_por) {
        I_creado_por = i_creado_por;
    }

    public String getI_modificado_por() {
        return I_modificado_por;
    }

    public void setI_modificado_por(String i_modificado_por) {
        I_modificado_por = i_modificado_por;
    }

    public Tipo_Prenda getTp() {
        return Tp;
    }

    public void setTp(Tipo_Prenda tp) {
        Tp = tp;
    }

    public Tienda getTii() {
        return Ti;
    }

    public void setTi(Tienda ti) {
        Ti = ti;
    }
}
