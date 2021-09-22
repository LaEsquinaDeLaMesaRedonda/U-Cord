package edu.eci.arsw.app.ucord.model;

import java.util.List;

/**
 * @author Ana Gabriela Silva
 * @author Leonardo Galeano
 * @author Iván Camilo Rincón Saavedra
 * @version 9/22/2021
 */
public class Decanatura {
    private Integer id;
    private String nombre;
    private Profesor decano;

    private List<Materia> materias;

    public Decanatura(){

    }

    public Decanatura(Integer id, String nombre, Profesor decano) {
        this.id = id;
        this.nombre = nombre;
        this.decano = decano;
    }
    
    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
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

    public Profesor getDecano() {
        return decano;
    }

    public void setDecano(Profesor decano) {
        this.decano = decano;
    }
}
