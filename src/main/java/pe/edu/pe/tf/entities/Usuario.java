package pe.edu.pe.tf.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="usuario")
public class Usuario {
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
    @Column(name = "Contrasena",nullable = false,length = 30)
    private String Contrasena;
    @Column(name = "Fecha_nacimiento",nullable = false)
    private LocalDate Fecha_Nacimiento;
    @Column(name = "Telefono",nullable = false,length = 13)
    private String Telefono;
    @Column(name = "Username",nullable = false,length = 30)
    private String Username;
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
    @ManyToOne
    @JoinColumn(name = "Id_rol")
    private Rol Ro;

    public Usuario() {

    }

    public Usuario(int id_usuario, String nombre, String apellido, String correo, String sexo, String dni, String contrasena, LocalDate fecha_Nacimiento, String telefono, String username, LocalDate i_fecha_creacion, LocalDate i_fecha_modificacion, String i_creado_por, String i_modificado_por, Departamento dp, Rol ro) {
        Id_usuario = id_usuario;
        Nombre = nombre;
        Apellido = apellido;
        Correo = correo;
        Sexo = sexo;
        Dni = dni;
        Contrasena = contrasena;
        Fecha_Nacimiento = fecha_Nacimiento;
        Telefono = telefono;
        Username = username;
        I_fecha_creacion = i_fecha_creacion;
        I_fecha_modificacion = i_fecha_modificacion;
        I_creado_por = i_creado_por;
        I_modificado_por = i_modificado_por;
        Dp = dp;
        Ro = ro;
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

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
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
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
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

    public Rol getRo() {
        return Ro;
    }

    public void setRo(Rol ro) {
        Ro = ro;
    }
}
