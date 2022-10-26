package pe.edu.upc.helpmefastspring.serviceinterfaces;

import pe.edu.upc.helpmefastspring.entities.Enfermero;

import java.util.List;

public interface IEnfermeroService {
    void insert(Enfermero enfermero);

    List<Enfermero> list();

    void delete(int idEnfermero);

    List<Enfermero> search(String nameEnfermero);
}
