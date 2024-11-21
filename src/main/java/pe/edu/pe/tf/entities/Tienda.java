package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tienda")
public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tienda;
    @Column(name = "Nombre", nullable = false, length = 50)
    private String nombre;
    @Column(name = "Altitud", nullable = false, precision = 9, scale = 6)
    private BigDecimal altitud;
    @Column(name = "Latitud", nullable = false, precision = 9, scale = 6)
    private BigDecimal latitud;
    @Column(name = "Logo", nullable = false, length = 300)
    private String logo;
    @ManyToOne
    @JoinColumn(name = "Id_usuario")
    private Usuario us;

    public Tienda() {

    }

    public Tienda(int id_tienda, String nombre, BigDecimal altitud, BigDecimal latitud, String logo, Usuario us) {
        this.id_tienda = id_tienda;
        this.nombre = nombre;
        this.altitud = altitud;
        this.latitud = latitud;
        this.logo = logo;
        this.us = us;
    }

    public int getId_tienda() {
        return id_tienda;
    }

    public void setId_tienda(int id_tienda) {
        this.id_tienda = id_tienda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getAltitud() {
        return altitud;
    }

    public void setAltitud(BigDecimal altitud) {
        this.altitud = altitud;
    }

    public BigDecimal getLatitud() {
        return latitud;
    }

    public void setLatitud(BigDecimal latitud) {
        this.latitud = latitud;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Usuario getUs() {
        return us;
    }

    public void setUs(Usuario us) {
        this.us = us;
    }
}