package pe.edu.upc.helpmefastspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpmefastspring.entities.Enfermero;
import pe.edu.upc.helpmefastspring.entities.Interes;
import pe.edu.upc.helpmefastspring.serviceinterfaces.IInteresService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/interes")
public class InteresController {

    @Autowired
    private IInteresService iService;

    @PostMapping
    public void registrar(@RequestBody Interes i) {iService.insert(i);}
    @GetMapping
    public List<Interes> listar() {
        return iService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){iService.delete(id);}
    @PutMapping
    public void actualizar(@RequestBody Interes i) {iService.insert(i);}
    @PostMapping("/buscar")
    public List<Interes> buscar(@RequestBody Interes i){
        return iService.search(i.getLevelInteres());
    }
    @GetMapping("/{id}")
    public Optional<Interes> listarId(@PathVariable("id") Integer id) {
        return iService.listarId(id);
    }
}