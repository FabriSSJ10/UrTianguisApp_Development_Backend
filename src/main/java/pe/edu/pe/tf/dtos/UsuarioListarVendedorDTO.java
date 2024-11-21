package pe.edu.pe.tf.dtos;

import pe.edu.pe.tf.entities.Departamento;

import java.time.LocalDate;

public class UsuarioListarVendedorDTO {
    private int Id_Usuario;
    private String Nombre;
    private String Apellido;
    private String Correo;
    private String Sexo;
    private String Dni;
    private LocalDate Fecha_Nacimiento;
    private String Telefono;
    private String Username;
    private Departamento Dp;

    public int getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        Id_Usuario = id_Usuario;
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

    public Departamento getDp() {
        return Dp;
    }

    public void setDp(Departamento dp) {
        Dp = dp;
    }
}
