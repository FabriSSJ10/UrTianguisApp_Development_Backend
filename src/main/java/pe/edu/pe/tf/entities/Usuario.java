package pe.edu.pe.tf.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usuario;
    @Column(name = "Nombre", nullable = false, length = 30)
    private String nombre;
    @Column(name = "Apellido", nullable = false, length = 30)
    private String apellido;
    @Column(name = "Correo", nullable = false, length = 320)
    private String correo;
    @Column(name = "Sexo", nullable = false, length = 20)
    private String sexo;
    @Column(name = "Dni", nullable = false, length = 8)
    private String dni;
    @Column(name = "Password", nullable = false, length = 500)
    private String password;
    @Column(name = "Fecha_nacimiento", nullable = false)
    private LocalDate fecha_Nacimiento;
    @Column(name = "Telefono", nullable = false, length = 13)
    private String telefono;
    @Column(name = "Username", nullable = false, length = 30)
    private String username;
    @Column(name = "Enabled", nullable = false)
    private boolean enabled;
    @Column(name = "I_fecha_creacion", nullable = false)
    private LocalDate i_fecha_creacion;
    @Column(name = "I_fecha_modificacion", nullable = false)
    private LocalDate i_fecha_modificacion;
    @Column(name = "I_creado_por", nullable = false, length = 40)
    private String i_creado_por;
    @Column(name = "I_modificado_por", nullable = false, length = 40)
    private String i_modificado_por;
    @ManyToOne
    @JoinColumn(name = "Id_departamento")
    private Departamento dp;

    @OneToMany(mappedBy = "uS", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Rol> roles;

    public Usuario() {

    }

    public Usuario(int id_usuario, String nombre, String apellido, String correo, String sexo, String dni, String password, LocalDate fecha_Nacimiento, String telefono, String username, boolean enabled, LocalDate i_fecha_creacion, LocalDate i_fecha_modificacion, String i_creado_por, String i_modificado_por, Departamento dp, List<Rol> roles) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.sexo = sexo;
        this.dni = dni;
        this.password = password;
        this.fecha_Nacimiento = fecha_Nacimiento;
        this.telefono = telefono;
        this.username = username;
        this.enabled = enabled;
        this.i_fecha_creacion = i_fecha_creacion;
        this.i_fecha_modificacion = i_fecha_modificacion;
        this.i_creado_por = i_creado_por;
        this.i_modificado_por = i_modificado_por;
        this.dp = dp;
        this.roles = roles;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getFecha_Nacimiento() {
        return fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(LocalDate fecha_Nacimiento) {
        this.fecha_Nacimiento = fecha_Nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public LocalDate getI_fecha_creacion() {
        return i_fecha_creacion;
    }

    public void setI_fecha_creacion(LocalDate i_fecha_creacion) {
        this.i_fecha_creacion = i_fecha_creacion;
    }

    public LocalDate getI_fecha_modificacion() {
        return i_fecha_modificacion;
    }

    public void setI_fecha_modificacion(LocalDate i_fecha_modificacion) {
        this.i_fecha_modificacion = i_fecha_modificacion;
    }

    public String getI_creado_por() {
        return i_creado_por;
    }

    public void setI_creado_por(String i_creado_por) {
        this.i_creado_por = i_creado_por;
    }

    public String getI_modificado_por() {
        return i_modificado_por;
    }

    public void setI_modificado_por(String i_modificado_por) {
        this.i_modificado_por = i_modificado_por;
    }

    public Departamento getDp() {
        return dp;
    }

    public void setDp(Departamento dp) {
        this.dp = dp;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }
}
