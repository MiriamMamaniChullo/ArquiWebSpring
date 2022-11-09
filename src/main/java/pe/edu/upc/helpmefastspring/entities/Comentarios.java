package pe.edu.upc.helpmefastspring.entities;

import javax.persistence.*;

@Entity
@Table(name = "Comentarios")
public class Comentarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComentarios;

    @Column(name = "Opinion", length = 40, nullable = false)
    private String Opinion;

    @Column(name = "Calificacion", length = 40, nullable = false)
    private String Calificacion;

    @ManyToOne
    @JoinColumn(name = "idServicios", nullable = false)
    private Servicios servicios;


    public Comentarios(){}

    public Comentarios(int idComentarios, String opinion, String calificacion, Servicios servicios) {
        this.idComentarios = idComentarios;
        Opinion = opinion;
        Calificacion = calificacion;
        this.servicios = servicios;
    }

    public int getIdComentarios() {
        return idComentarios;
    }

    public void setIdComentarios(int idComentarios) {
        this.idComentarios = idComentarios;
    }

    public String getOpinion() {
        return Opinion;
    }

    public void setOpinion(String opinion) {
        Opinion = opinion;
    }

    public String getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(String calificacion) {
        Calificacion = calificacion;
    }

    public Servicios getServicios() {
        return servicios;
    }

    public void setServicios(Servicios servicios) {
        this.servicios = servicios;
    }
}