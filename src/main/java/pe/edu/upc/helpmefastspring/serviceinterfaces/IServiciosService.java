package pe.edu.upc.helpmefastspring.serviceinterfaces;

import pe.edu.upc.helpmefastspring.entities.Interes;
import pe.edu.upc.helpmefastspring.entities.Servicios;

import java.util.List;
import java.util.Optional;

public interface IServiciosService {
    public void insert(Servicios servicios);
    List<Servicios> list();
    public void delete(int idServicios);
    public Optional<Servicios> listarId(int idServicios);
    List<Servicios> search(String descServicios);
}