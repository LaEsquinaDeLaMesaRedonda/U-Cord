package edu.eci.arsw.app.ucord.model;

import java.util.List;

/**
 * @author Ana Gabriela Silva
 * @author Leonardo Galeano
 * @author Iván Camilo Rincón Saavedra
 * @version 9/22/2021
 */
public class Materia {

    private String sigla;
    private String nombre;
    private Integer creditos;
    private List<Materia> prerequisitos;
    private Decanatura decanatura;

    public Materia() {
    }
    public Materia(String sigla, String nombre, Integer creditos, Decanatura decanatura) {
        this.sigla = sigla;
        this.nombre = nombre;
        this.creditos = creditos;
        this.decanatura = decanatura;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public List<Materia> getPrerequisitos() {
        return prerequisitos;
    }

    public void setPrerequisitos(List<Materia> prerequisitos) {
        this.prerequisitos = prerequisitos;
    }
}
