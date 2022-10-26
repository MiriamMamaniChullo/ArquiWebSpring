package pe.edu.upc.helpmefastspring.entities;

import javax.persistence.*;

@Entity
@Table(name = "AdultoJoven")
public class AdultoJoven {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre", length = 20, nullable = false)
    private String nombre;
    @Column(name = "apellido", length = 20, nullable = false)
    private String apellido;
    private int edad;
    private int DNI;
    private int celular;
    @Column(name = "Email", length = 40, nullable = false)
    private String Email;
    @Column(name = "direccion", length = 50, nullable = false)
    private String direccion;
    @Column(name = "username", length = 20, nullable = false)
    private String username;
    @Column(name = "password", length = 20, nullable = false)
    private String password;

    public AdultoJoven() {
    }

    public AdultoJoven(int id, String nombre, String apellido, int edad, int DNI, int celular, String email, String direccion, String username, String password) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.celular = celular;
        Email = email;
        this.direccion = direccion;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
