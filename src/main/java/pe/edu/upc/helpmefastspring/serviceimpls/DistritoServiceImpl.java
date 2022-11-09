package pe.edu.upc.helpmefastspring.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpmefastspring.entities.Distrito;
import pe.edu.upc.helpmefastspring.repositories.IDistritoDAO;
import pe.edu.upc.helpmefastspring.serviceinterfaces.IDistritoService;

import java.util.List;
import java.util.Optional;

@Service
public class DistritoServiceImpl implements IDistritoService {

    @Autowired
    private IDistritoDAO sD;

    @Override
    public void insert(Distrito distrito) {sD.save(distrito);
    }

    @Override
    public List<Distrito> list() {
        return sD.findAll();
    }

    @Override
    public void delete(int idDistrito) {
        sD.deleteById(idDistrito);}

    @Override
    public Optional<Distrito> listarId(int idDistrito) {
        return Optional.empty();
    }

    @Override
    public List<Distrito> search(String nameDistrito) {
        return sD.buscarDistrito(nameDistrito);
    }
}
