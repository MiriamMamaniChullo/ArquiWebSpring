package pe.edu.upc.helpmefastspring.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpmefastspring.entities.Comentarios;
import pe.edu.upc.helpmefastspring.repositories.IComentariosDAO;
import pe.edu.upc.helpmefastspring.serviceinterfaces.IComentariosService;


import java.util.List;
import java.util.Optional;

@Service
public class ComentariosServiceImpl implements IComentariosService {
    @Autowired
    private IComentariosDAO cD;

    @Override
    public void insert(Comentarios comentarios) {cD.save(comentarios);
    }

    @Override
    public List<Comentarios> list() {
        return cD.findAll();
    }

    @Override
    public void delete(int idDistrito) {
        cD.deleteById(idDistrito);}

    @Override
    public Optional<Comentarios> listarId(int Calificacion) {
        return Optional.empty();
    }

    @Override
    public List<Comentarios> search(String Calificacion) {
        return cD.buscarComentarios(Calificacion);
    }
}
