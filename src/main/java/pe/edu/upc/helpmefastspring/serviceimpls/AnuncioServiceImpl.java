package pe.edu.upc.helpmefastspring.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpmefastspring.entities.Anuncio;
import pe.edu.upc.helpmefastspring.repositories.IAnuncioDAO;
import pe.edu.upc.helpmefastspring.serviceinterfaces.IAnuncioService;

import java.util.List;
import java.util.Optional;

@Service
public class AnuncioServiceImpl implements IAnuncioService {

    @Autowired
    private IAnuncioDAO aR;

    @Override
    public void insert(Anuncio anuncio) {
        aR.save(anuncio);
    }

    @Override
    public List<Anuncio> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int idAnuncio) {
        aR.deleteById(idAnuncio);
    }

    @Override
    public Optional<Anuncio> listarId(int idAnuncio) {
        return Optional.empty();
    }

    @Override
    public List<Anuncio> search(String descServicios) {
        return aR.buscarServicio(descServicios);
    }
}
