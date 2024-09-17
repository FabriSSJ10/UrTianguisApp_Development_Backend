package pe.edu.pe.tf.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_usuario;
    @Column(name = "Nombre",nullable = false,length = 30)
    private String Nombre;
    @Column(name = "Apellido",nullable = false,length = 30)
    private String Apellido;
    @Column(name = "Correo",nullable = false,length = 320)
    private String Correo;
    @Column(name = "Sexo",nullable = false,length = 20)
    private String Sexo;
    @Column(name = "Dni",nullable = false,length = 8)
    private String Dni;
    @Column(name = "Password",nullable = false,length = 500)
    private String password;
    @Column(name = "Fecha_nacimiento",nullable = false)
    private LocalDate Fecha_Nacimiento;
    @Column(name = "Telefono",nullable = false,length = 13)
    private String Telefono;
    @Column(name = "Username",nullable = false,length = 30)
    private String username;
    @Column(name = "Enabled",nullable = false)
    private boolean Enabled;

    @Column(name = "I_fecha_creacion",nullable = false)
    private LocalDate I_fecha_creacion;
    @Column(name = "I_fecha_modificacion",nullable = false)
    private LocalDate I_fecha_modificacion;
    @Column(name = "I_creado_por",nullable = false,length = 40)
    private String I_creado_por;
    @Column(name = "I_modificado_por",nullable = false,length = 40)
    private String I_modificado_por;
    @ManyToOne
    @JoinColumn(name = "Id_departamento")
    private Departamento Dp;

    @JsonIgnore
    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="user_id")
    private List<Rol> roles;


    public Usuario() {

    }

    public Usuario(int id_usuario, String nombre, String apellido, String correo, String sexo, String dni, String password, LocalDate fecha_Nacimiento, String telefono, String username, boolean enabled, LocalDate i_fecha_creacion, LocalDate i_fecha_modificacion, String i_creado_por, String i_modificado_por, Departamento dp, List<Rol> roles) {
        Id_usuario = id_usuario;
        Nombre = nombre;
        Apellido = apellido;
        Correo = correo;
        Sexo = sexo;
        Dni = dni;
        this.password = password;
        Fecha_Nacimiento = fecha_Nacimiento;
        Telefono = telefono;
        this.username = username;
        Enabled = enabled;
        I_fecha_creacion = i_fecha_creacion;
        I_fecha_modificacion = i_fecha_modificacion;
        I_creado_por = i_creado_por;
        I_modificado_por = i_modificado_por;
        Dp = dp;
        this.roles = roles;
    }

    public int getId_usuario() {
        return Id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        Id_usuario = id_usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public LocalDate getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(LocalDate fecha_Nacimiento) {
        Fecha_Nacimiento = fecha_Nacimiento;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean getEnabled() {
        return Enabled;
    }

    public void setEnabled(boolean enabled) {
        Enabled = enabled;
    }

    public LocalDate getI_fecha_creacion() {
        return I_fecha_creacion;
    }

    public void setI_fecha_creacion(LocalDate i_fecha_creacion) {
        I_fecha_creacion = i_fecha_creacion;
    }

    public LocalDate getI_fecha_modificacion() {
        return I_fecha_modificacion;
    }

    public void setI_fecha_modificacion(LocalDate i_fecha_modificacion) {
        I_fecha_modificacion = i_fecha_modificacion;
    }

    public String getI_creado_por() {
        return I_creado_por;
    }

    public void setI_creado_por(String i_creado_por) {
        I_creado_por = i_creado_por;
    }

    public String getI_modificado_por() {
        return I_modificado_por;
    }

    public void setI_modificado_por(String i_modificado_por) {
        I_modificado_por = i_modificado_por;
    }

    public Departamento getDp() {
        return Dp;
    }

    public void setDp(Departamento dp) {
        Dp = dp;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }
}
