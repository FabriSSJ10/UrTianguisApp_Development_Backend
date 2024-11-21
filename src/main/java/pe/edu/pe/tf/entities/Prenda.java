package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Prenda")
public class Prenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_prenda;
    @Column(name = "Nombre",nullable = false,length = 50)
    private String nombre;
    @Column(name = "Descripcion",nullable = false,length = 300)
    private String descripcion;
    @Column(name = "Precio",nullable = false,length = 10)
    private float precio;
    @Column(name = "Talla",nullable = false,length = 10)
    private String talla;
    @Column(name = "Stock",nullable = false)
    private int stock;
    @Column(name = "Veces_usada",nullable = false)
    private int veces_usada;
    @Column(name = "Imagen",nullable = false)
    private String imagen;
    @Column(name = "I_fecha_creacion",nullable = false)
    private LocalDate i_fecha_creacion;
    @Column(name = "I_fecha_modificacion",nullable = false)
    private LocalDate i_fecha_modificacion;
    @Column(name = "I_creado_por",nullable = false,length = 40)
    private String i_creado_por;
    @Column(name = "I_modificado_por",nullable = false,length = 40)
    private String i_modificado_por;
    @ManyToOne
    @JoinColumn(name = "Id_tipo_prenda")
    private Tipo_prenda tp;
    @ManyToOne
    @JoinColumn(name = "Id_tienda")
    private Tienda ti;

    public Prenda() {
    }

    public Prenda(int id_prenda, String nombre, String descripcion, float precio, String talla, int stock, int veces_usada, String imagen, LocalDate i_fecha_creacion, LocalDate i_fecha_modificacion, String i_creado_por, String i_modificado_por, Tipo_prenda tp, Tienda ti) {
        this.id_prenda = id_prenda;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.talla = talla;
        this.stock = stock;
        this.veces_usada = veces_usada;
        this.imagen = imagen;
        this.i_fecha_creacion = i_fecha_creacion;
        this.i_fecha_modificacion = i_fecha_modificacion;
        this.i_creado_por = i_creado_por;
        this.i_modificado_por = i_modificado_por;
        this.tp = tp;
        this.ti = ti;
    }

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
