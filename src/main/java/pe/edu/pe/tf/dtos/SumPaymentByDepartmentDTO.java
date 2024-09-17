package pe.edu.pe.tf.dtos;

public class SumPaymentByDepartmentDTO {
    private String Departmento;
    private double MontoTotal;

    public String getDepartmento() {
        return Departmento;
    }

    public void setDepartmento(String departmento) {
        Departmento = departmento;
    }

    public double getMontoTotal() {
        return MontoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        MontoTotal = montoTotal;
    }
}
