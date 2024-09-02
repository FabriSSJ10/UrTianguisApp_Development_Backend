package pe.edu.pe.tf.dtos;

import pe.edu.pe.tf.entities.Pedido;
import pe.edu.pe.tf.entities.Prenda;

public class Det_PedidoDTO {
    private int id_Det_Pedido;
    private int Cantidad;
    private float Precio_total;
    private float Sub_total;
    private Prenda Pr;
    private Pedido Pe;

    public int getId_Det_Pedido() {
        return id_Det_Pedido;
    }

    public void setId_Det_Pedido(int id_Det_Pedido) {
        this.id_Det_Pedido = id_Det_Pedido;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public float getPrecio_total() {
        return Precio_total;
    }

    public void setPrecio_total(float precio_total) {
        Precio_total = precio_total;
    }

    public float getSub_total() {
        return Sub_total;
    }

    public void setSub_total(float sub_total) {
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
