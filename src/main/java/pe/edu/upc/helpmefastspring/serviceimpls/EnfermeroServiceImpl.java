package pe.edu.upc.helpmefastspring.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpmefastspring.entities.Enfermero;
import pe.edu.upc.helpmefastspring.repositories.IEnfermeroDAO;
import pe.edu.upc.helpmefastspring.serviceinterfaces.IEnfermeroService;

import java.util.List;
import java.util.Optional;

@Service
public class EnfermeroServiceImpl implements IEnfermeroService {

    @Autowired
    private IEnfermeroDAO eR;

    @Override
    public void insert(Enfermero enfermero) {
        eR.save(enfermero);
    }

    @Override
    public List<Enfermero> list() { return eR.findAll(); }

    @Override
    public void delete(int idEnfermero) { eR.deleteById(idEnfermero); }

    @Override
    public Optional<Enfermero> listarId(int idEnfermero) {
        return Optional.empty();
    }

    @Override
    public List<Enfermero> search(String nameEnfermero) {
        return eR.buscarNombre(nameEnfermero); }
}
