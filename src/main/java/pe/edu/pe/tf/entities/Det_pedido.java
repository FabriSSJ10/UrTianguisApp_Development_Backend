package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Det_pedido")
public class Det_pedido
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_det_pedido;
    @Column(name = "Cantidad",nullable = false)
    private int cantidad;
    @Column(name = "Precio_total",nullable = false,length = 10)
    private Float precio_total;
    @Column(name = "Sub_total",nullable = false,length = 10)
    private Float sub_total;
    @ManyToOne
    @JoinColumn(name = "Id_prenda")
    private Prenda pr;
    @ManyToOne
    @JoinColumn(name = "Id_pedido")
    private Pedido pe;

    public Det_pedido() {
    }

    public Det_pedido(int id_det_pedido, int cantidad, Float precio_total, Float sub_total, Prenda pr, Pedido pe) {
        this.id_det_pedido = id_det_pedido;
        this.cantidad = cantidad;
        this.precio_total = precio_total;
        this.sub_total = sub_total;
        this.pr = pr;
        this.pe = pe;
    }

    public int getId_det_pedido() {
        return id_det_pedido;
    }

    public void setId_det_pedido(int id_det_pedido) {
        this.id_det_pedido = id_det_pedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Float getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(Float precio_total) {
        this.precio_total = precio_total;
    }

    public Float getSub_total() {
        return sub_total;
    }

    public void setSub_total(Float sub_total) {
        this.sub_total = sub_total;
    }

    public Prenda getPr() {
        return pr;
    }

    public void setPr(Prenda pr) {
        this.pr = pr;
    }

    public Pedido getPe() {
        return pe;
    }

    public void setPe(Pedido pe) {
        this.pe = pe;
    }
}
