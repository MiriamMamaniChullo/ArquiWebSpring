package pe.edu.upc.helpmefastspring.serviceinterfaces;

import pe.edu.upc.helpmefastspring.entities.Comentarios;

import java.util.List;
import java.util.Optional;

public interface IComentariosService {

    public void insert(Comentarios comentarios);

    List<Comentarios> list();

    void delete(int idComentarios);

    Optional<Comentarios> listarId(int idComentarios);

    List<Comentarios> search(String Calificacion);
}

