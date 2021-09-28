package edu.eci.arsw.app.ucord.model;

import java.util.List;
import java.util.Map;

public class Estudiante extends Usuario {
    private Integer semestre;
    private List<Materia> cursando;
    private Map<Materia , Integer> aprobadas;

    public Estudiante(){
    }

    public Map<Materia, Integer> getAprobadas() {
        return aprobadas;
    }

    public void setAprobadas(Map<Materia, Integer> aprobadas) {
        this.aprobadas = aprobadas;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public List<Materia> getCursando() {
        return cursando;
    }

    public void setCursando(List<Materia> cursando) {
        this.cursando = cursando;
    }
}
