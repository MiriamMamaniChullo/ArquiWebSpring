package pe.edu.upc.helpmefastspring.serviceinterfaces;

import pe.edu.upc.helpmefastspring.entities.AdultoJoven;
import pe.edu.upc.helpmefastspring.entities.Anuncio;

import java.util.List;
import java.util.Optional;

public interface IAnuncioService {
    public void insert(Anuncio anuncio);
    List<Anuncio> list();
    public void delete(int idAnuncio);
    public Optional<Anuncio>listarId(int idAnuncio);
    List<Anuncio> search(String descServicios);
}
