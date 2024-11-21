package pe.edu.pe.tf.dtos;

public class Monto_total_pagos_por_sexoDTO {
    private String sexo;
    private double monto_total;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getMonto_total() {
        return monto_total;
    }

    public void setMonto_total(double monto_total) {
        this.monto_total = monto_total;
    }
}
