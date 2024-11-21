package pe.edu.pe.tf.dtos;

public class Total_pedidos_por_mesDTO {
    private String anio;
    private String mes;
    private int cantidad_pedidos;

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getCantidad_pedidos() {
        return cantidad_pedidos;
    }

    public void setCantidad_pedidos(int cantidad_pedidos) {
        this.cantidad_pedidos = cantidad_pedidos;
    }
}
