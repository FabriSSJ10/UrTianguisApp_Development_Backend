package pe.edu.pe.tf.dtos;

public class CantPrendaxTiendaDTO {
    private String tienda;
    private double cantidad_de_prendas;

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

    public double getCantidad_de_prendas() {
        return cantidad_de_prendas;
    }

    public void setCantidad_de_prendas(double cantidad_de_prendas) {
        this.cantidad_de_prendas = cantidad_de_prendas;
    }
}
