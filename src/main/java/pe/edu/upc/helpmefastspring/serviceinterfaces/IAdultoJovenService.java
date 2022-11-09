package pe.edu.upc.helpmefastspring.serviceinterfaces;

import pe.edu.upc.helpmefastspring.entities.AdultoJoven;

import java.util.List;
import java.util.Optional;

public interface IAdultoJovenService {
    public void insert(AdultoJoven adultoJoven);
    List<AdultoJoven> list();
    public void delete(int id);
    public Optional<AdultoJoven> listarId(int idAdultoJoven);
    List<AdultoJoven> search(String nombre);
}
