package pe.edu.pe.tf.dtos;

public class Cantidad_usuarios_por_departamentoDTO {
    public String departamento;
    public int cantidad_usuarios;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getCantidad_usuarios() {
        return cantidad_usuarios;
    }

    public void setCantidad_usuarios(int cantidad_usuarios) {
        this.cantidad_usuarios = cantidad_usuarios;
    }
}
