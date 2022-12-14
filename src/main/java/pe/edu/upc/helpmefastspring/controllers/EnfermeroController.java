package pe.edu.upc.helpmefastspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpmefastspring.entities.Anuncio;
import pe.edu.upc.helpmefastspring.entities.Enfermero;
import pe.edu.upc.helpmefastspring.serviceimpls.EnfermeroServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/enfermeros")
public class EnfermeroController {

    @Autowired
    private EnfermeroServiceImpl eService;

    @PostMapping
    public void registrar(@RequestBody Enfermero e) { eService.insert(e); }

    @GetMapping
    public List<Enfermero> listar(){
        return eService.list();}

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        eService.delete(id); }

    @PutMapping
    public void actualizar(@RequestBody Enfermero e) { eService.insert(e); }

    @PostMapping("/buscar")
    public List<Enfermero> buscar(@RequestBody Enfermero e) { return eService.search(e.getNameEnfermero());}

    @GetMapping("/{id}")
    public Optional<Enfermero> listarId(@PathVariable("id") Integer id) {
        return eService.listarId(id);
    }
}
