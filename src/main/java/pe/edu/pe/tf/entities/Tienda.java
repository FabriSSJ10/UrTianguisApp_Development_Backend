package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tienda")
public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_tienda;
    @Column(name = "Nombre", nullable = false, length = 50)
    private String Nombre;
    @Column(name = "Ubicacion", nullable = false, length = 100)
    private String Ubicacion;
    @Column(name = "Logo", nullable = false, length = 300)
    private String Logo;
    @ManyToOne
    @JoinColumn(name = "Id_usuario")
    private Usuario Us;

    public Tienda() {

    }

    public Tienda(int id_tienda, String nombre, String ubicacion, String logo, Usuario us) {
        Id_tienda = id_tienda;
        Nombre = nombre;
        Ubicacion = ubicacion;
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

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
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