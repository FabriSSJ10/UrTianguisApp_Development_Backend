package pe.edu.pe.tf.dtos;

public class Monto_total_pagos_por_departamentoDTO {
    private String departmento;
    private double monto_total;

    public String getDepartmento() {
        return departmento;
    }

    public void setDepartmento(String departmento) {
        this.departmento = departmento;
    }

    public double getMonto_total() {
        return monto_total;
    }

    public void setMonto_total(double monto_total) {
        this.monto_total = monto_total;
    }
}
