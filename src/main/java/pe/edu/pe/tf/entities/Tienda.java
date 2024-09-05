package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tienda")
public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_tienda;
    @Column(name = "Nombre", nullable = false, length = 50)
    private String Nombre;
    @Column(name = "Altitud", nullable = false, precision = 9, scale = 6)
    private BigDecimal altitud;
    @Column(name = "Latitud", nullable = false, precision = 9, scale = 6)
    private BigDecimal Latitud;
    @Column(name = "Logo", nullable = false, length = 300)
    private String Logo;
    @ManyToOne
    @JoinColumn(name = "Id_usuario")
    private Usuario Us;

    public Tienda() {

    }

    public Tienda(int id_tienda, String nombre, BigDecimal altitud, BigDecimal latitud, String logo, Usuario us) {
        Id_tienda = id_tienda;
        Nombre = nombre;
        this.altitud = altitud;
        Latitud = latitud;
        Logo = logo;
        Us = us;
    }

    public int getId_tienda() {
        return Id_tienda;
    }

    public void setId_tienda(int id_tienda) {
        Id_tienda = id_tienda;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public BigDecimal getAltitud() {
        return altitud;
    }

    public void setAltitud(BigDecimal altitud) {
        this.altitud = altitud;
    }

    public BigDecimal getLatitud() {
        return Latitud;
    }

    public void setLatitud(BigDecimal latitud) {
        Latitud = latitud;
    }

    public String getLogo() {
        return Logo;
    }

    public void setLogo(String logo) {
        Logo = logo;
    }

    public Usuario getUs() {
        return Us;
    }

    public void setUs(Usuario us) {
        Us = us;
    }
}