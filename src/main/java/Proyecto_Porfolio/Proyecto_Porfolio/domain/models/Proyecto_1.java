package Proyecto_Porfolio.Proyecto_Porfolio.domain.models;


import jakarta.persistence.*;


@Entity
@Table
public class Proyecto_1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String descripcion;
    private String img;
    private String repositorio;

    private String tecnologias;

    public Proyecto_1() {
    }

    public Proyecto_1(Integer id, String nombre, String descripcion, String img, String repositorio, String colaboradores, String tecnologias) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.img = img;
        this.repositorio = repositorio;

        this.tecnologias = tecnologias;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(String repositorio) {
        this.repositorio = repositorio;
    }



    public String getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(String tecnologias) {
        this.tecnologias = tecnologias;
    }
}