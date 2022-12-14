package pe.edu.upc.helpmefastspring.serviceinterfaces;

import pe.edu.upc.helpmefastspring.entities.Anuncio;
import pe.edu.upc.helpmefastspring.entities.Enfermero;

import java.util.List;
import java.util.Optional;

public interface IEnfermeroService {
    void insert(Enfermero enfermero);

    List<Enfermero> list();

    void delete(int idEnfermero);
    public Optional<Enfermero> listarId(int idEnfermero);
    List<Enfermero> search(String nameEnfermero);
}
