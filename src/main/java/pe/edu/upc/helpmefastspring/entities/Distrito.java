package pe.edu.upc.helpmefastspring.entities;

import javax.persistence.*;

@Entity
@Table(name = "Distrito")
public class Distrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDistrito;

    @Column(name = "nameDistrito", length = 40, nullable = false)
    private String nameDistrito;

    @ManyToOne
    @JoinColumn(name = "idServicio", nullable = false)
    private Servicios servicios;

    public Distrito() {}

    public Distrito(int idDistrito, String nameDistrito, Servicios servicios) {
        this.idDistrito = idDistrito;
        this.nameDistrito = nameDistrito;
        this.servicios = servicios;
    }

    public int getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    public String getNameDistrito() {
        return nameDistrito;
    }

    public void setNameDistrito(String nameDistrito) {
        this.nameDistrito = nameDistrito;
    }

    public Servicios getServicios() {
        return servicios;
    }

    public void setServicios(Servicios servicios) {
        this.servicios = servicios;
    }
}