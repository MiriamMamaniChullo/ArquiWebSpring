package pe.edu.upc.helpmefastspring.serviceinterfaces;

import pe.edu.upc.helpmefastspring.entities.AdultoJoven;

import java.util.List;

public interface IAdultoJovenService {
    public void insert(AdultoJoven adultoJoven);
    List<AdultoJoven> list();
    public void delete(int id);
    List<AdultoJoven> search(String nombre);
}
