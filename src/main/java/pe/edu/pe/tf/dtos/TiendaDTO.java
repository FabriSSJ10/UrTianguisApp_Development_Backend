package pe.edu.pe.tf.dtos;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import pe.edu.pe.tf.entities.Usuario;

import java.math.BigDecimal;

public class TiendaDTO {
    private int Id_tienda;
    private String Nombre;
    private BigDecimal Altitud;
    private BigDecimal Latitud;
    private String Logo;
    private Usuario Us;

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
        return Altitud;
    }

    public void setAltitud(BigDecimal altitud) {
        Altitud = altitud;
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
