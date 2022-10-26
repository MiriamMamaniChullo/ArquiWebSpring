package pe.edu.upc.helpmefastspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpmefastspring.entities.AdultoJoven;
import pe.edu.upc.helpmefastspring.serviceinterfaces.IAdultoJovenService;

import java.util.List;

@RestController
@RequestMapping("/adultoJoven")
public class AdultoJovenController {
    @Autowired
    private IAdultoJovenService ajService;

    @PostMapping
    public void registrar(@RequestBody AdultoJoven aj) {ajService.insert(aj);}

    @GetMapping
    public List<AdultoJoven> listar() {
        return ajService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){ajService.delete(id);}

    @PutMapping
    public void actualizar(@RequestBody AdultoJoven i) {ajService.insert(i);}

    @PostMapping("/buscar")
    public List<AdultoJoven> buscar(@RequestBody AdultoJoven aj){
        return ajService.search(aj.getNombre());
    }
}