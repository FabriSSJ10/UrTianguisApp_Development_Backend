package pe.edu.pe.tf.dtos;

public class Cantidad_prendas_por_tiendaDTO {
    private String tienda;
    private double cantidad_prendas;

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

    public double getCantidad_prendas() {
        return cantidad_prendas;
    }

    public void setCantidad_prendas(double cantidad_prendas) {
        this.cantidad_prendas = cantidad_prendas;
    }
}
