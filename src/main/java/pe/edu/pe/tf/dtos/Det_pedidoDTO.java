package pe.edu.pe.tf.dtos;

import pe.edu.pe.tf.entities.Pedido;
import pe.edu.pe.tf.entities.Prenda;

public class Det_pedidoDTO {
    private int id_det_pedido;
    private int cantidad;
    private float precio_total;
    private float sub_total;
    private Prenda pr;
    private Pedido pe;

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

    public float getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(float precio_total) {
        this.precio_total = precio_total;
    }

    public float getSub_total() {
        return sub_total;
    }

    public void setSub_total(float sub_total) {
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
