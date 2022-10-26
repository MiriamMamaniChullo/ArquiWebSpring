package pe.edu.upc.helpmefastspring.serviceinterfaces;

import pe.edu.upc.helpmefastspring.entities.Interes;

import java.util.List;

public interface IInteresService {
    public void insert(Interes interes);
    List<Interes> list();
    public void delete(int idInteres);
    List<Interes> search(String levelInteres);
}
