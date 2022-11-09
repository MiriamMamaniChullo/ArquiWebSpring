package pe.edu.upc.helpmefastspring.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.helpmefastspring.entities.Interes;
import pe.edu.upc.helpmefastspring.entities.Servicios;
import pe.edu.upc.helpmefastspring.repositories.IServiceDAO;
import pe.edu.upc.helpmefastspring.serviceinterfaces.IServiciosService;

import java.util.List;
import java.util.Optional;

@Service
public class ServiciosServiceImpl implements IServiciosService {

    @Autowired
    private IServiceDAO sS;

    @Override
    public void insert(Servicios servicios) {sS.save(servicios);
    }

    @Override
    public List<Servicios> list() {
        return sS.findAll();
    }

    @Override
    public void delete(int idServicios) {
        sS.deleteById(idServicios);}

    @Override
    public Optional<Servicios> listarId(int idServicios) {
        return Optional.empty();
    }

    @Override
    public List<Servicios> search(String descServicios) {
        return sS.buscarDescServicios(descServicios);
    }
}
