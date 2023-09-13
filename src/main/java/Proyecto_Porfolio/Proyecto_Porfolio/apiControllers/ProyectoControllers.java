package Proyecto_Porfolio.Proyecto_Porfolio.apiControllers;

import Proyecto_Porfolio.Proyecto_Porfolio.domain.models.Proyecto_1;
import Proyecto_Porfolio.Proyecto_Porfolio.domain.services.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5174")
@RestController
@RequestMapping(path = "api/v1/portafolio")

public class ProyectoControllers {
    private final ProyectoService proyectoService;

    @Autowired

    public ProyectoControllers(ProyectoService proyectoService) {

        this.proyectoService = proyectoService;
    }

    @GetMapping
    public List<Proyecto_1> getProyectoController(){
        return proyectoService.getProyecto_1();
    }

    @PostMapping
    public void createProyecto(@RequestBody Proyecto_1 proyecto_1){
        proyectoService.newProyecto_1(proyecto_1);
    }

    @PutMapping("/{id}")
    public void updateProyecto_1(@PathVariable Integer id, @RequestBody Proyecto_1 proyecto_1 ){
        proyectoService.update(id, proyecto_1);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id, Proyecto_1 proyecto_1){
        proyectoService.deleteProyecto_1(id, proyecto_1);
    }
}