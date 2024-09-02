package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="det_pedido")
public class Det_Pedido
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_Det_Pedido;
    @Column(name = "Cantidad",nullable = false)
    private int Cantidad;
    @Column(name = "Precio_total",nullable = false,length = 10)
    private Float Precio_total;
    @Column(name = "Sub_total",nullable = false,length = 10)
    private Float Sub_total;
    @ManyToOne
    @JoinColumn(name = "Id_prenda")
    private Prenda Pr;
    @ManyToOne
    @JoinColumn(name = "Id_pedido")
    private Pedido Pe;
    public Det_Pedido() {

    }

    public Det_Pedido(int id_Det_Pedido, int cantidad, Float precio_total, Float sub_total, Prenda pr, Pedido pe) {
        Id_Det_Pedido = id_Det_Pedido;
        Cantidad = cantidad;
        Precio_total = precio_total;
        Sub_total = sub_total;
        Pr = pr;
        Pe = pe;
    }

    public int getId_Det_Pedido() {
        return Id_Det_Pedido;
    }

    public void setId_Det_Pedido(int id_Det_Pedido) {
        Id_Det_Pedido = id_Det_Pedido;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public Float getPrecio_total() {
        return Precio_total;
    }

    public void setPrecio_total(Float precio_total) {
        Precio_total = precio_total;
    }

    public Float getSub_total() {
        return Sub_total;
    }

    public void setSub_total(Float sub_total) {
        Sub_total = sub_total;
    }

    public Prenda getPr() {
        return Pr;
    }

    public void setPr(Prenda pr) {
        Pr = pr;
    }

    public Pedido getPe() {
        return Pe;
    }

    public void setPe(Pedido pe) {
        Pe = pe;
    }
}
