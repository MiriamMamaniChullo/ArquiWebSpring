package pe.edu.upc.helpmefastspring.serviceinterfaces;

import pe.edu.upc.helpmefastspring.entities.Servicios;

import java.util.List;

public interface IServiciosService {
    public void insert(Servicios servicios);
    List<Servicios> list();
    public void delete(int idServicios);
    List<Servicios> search(String descServicios);
}