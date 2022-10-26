package pe.edu.upc.helpmefastspring.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpmefastspring.entities.Interes;
import pe.edu.upc.helpmefastspring.repositories.IInteresRepository;
import pe.edu.upc.helpmefastspring.serviceinterfaces.IInteresService;

import java.util.List;

@Service
public class InteresServiceImpl implements IInteresService {
    @Autowired
    private IInteresRepository iR;

    @Override
    public void insert(Interes interes) {
        iR.save(interes);
    }

    @Override
    public List<Interes> list() {
        return iR.findAll();
    }

    @Override
    public void delete(int idInteres) {
        iR.deleteById(idInteres);
    }

    @Override
    public List<Interes> search(String levelInteres) {
        return iR.buscarNivel(levelInteres);
    }
}
