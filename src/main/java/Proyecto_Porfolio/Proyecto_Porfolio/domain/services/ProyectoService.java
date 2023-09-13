package Proyecto_Porfolio.Proyecto_Porfolio.domain.services;

import Proyecto_Porfolio.Proyecto_Porfolio.Infrarepositorie.ProyectoRepository;
import Proyecto_Porfolio.Proyecto_Porfolio.domain.models.Proyecto_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProyectoService {
    private final ProyectoRepository proyectoRepository;

    @Autowired

    public ProyectoService(ProyectoRepository proyectoRepository) {

        this.proyectoRepository = proyectoRepository;
    }

    public List<Proyecto_1> getProyecto_1() {
        return proyectoRepository.findAll();
    }

    public void newProyecto_1(Proyecto_1 proyecto_1) {
        proyectoRepository.save(proyecto_1);
    }

    public void update(Integer id, Proyecto_1 proyecto_1) {

        Optional<Proyecto_1> proyectoByID = (proyectoRepository.findById(id));

        if (proyectoByID.isPresent()) {
            Proyecto_1 proyectoExistente = proyectoByID.get();

            proyectoExistente.setNombre(proyecto_1.getNombre());
            proyectoExistente.setDescripcion(proyecto_1.getDescripcion());
            proyectoExistente.setImg(proyecto_1.getImg());
            proyectoExistente.setRepositorio(proyecto_1.getRepositorio());

            proyectoExistente.setTecnologias(proyecto_1.getTecnologias());

            proyectoRepository.save(proyectoExistente);
        }
    }

    public void deleteProyecto_1(Integer id, Proyecto_1 proyecto) {
        boolean existed;
        existed = proyectoRepository.existsById (id);
        if (existed) { proyectoRepository.delete (proyecto);
        }
    }
}
