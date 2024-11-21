package pe.edu.pe.tf.dtos;

public class Total_pedidos_por_departamentoDTO {
    private String departamento;
    private int cantidad_pedidos;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getCantidad_pedidos() {
        return cantidad_pedidos;
    }

    public void setCantidad_pedidos(int cantidad_pedidos) {
        this.cantidad_pedidos = cantidad_pedidos;
    }
}
