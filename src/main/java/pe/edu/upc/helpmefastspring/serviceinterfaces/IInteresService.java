package pe.edu.upc.helpmefastspring.serviceinterfaces;

import pe.edu.upc.helpmefastspring.entities.Enfermero;
import pe.edu.upc.helpmefastspring.entities.Interes;

import java.util.List;
import java.util.Optional;

public interface IInteresService {
    public void insert(Interes interes);
    List<Interes> list();
    public void delete(int idInteres);
    public Optional<Interes> listarId(int idInteres);
    List<Interes> search(String levelInteres);
}
