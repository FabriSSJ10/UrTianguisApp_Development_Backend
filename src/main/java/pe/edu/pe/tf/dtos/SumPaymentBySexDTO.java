package pe.edu.pe.tf.dtos;

public class SumPaymentBySexDTO {
    private String Sexo;
    private double MontoTotal;

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public double getMontoTotal() {
        return MontoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        MontoTotal = montoTotal;
    }
}
