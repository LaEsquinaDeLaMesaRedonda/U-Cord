package edu.eci.arsw.app.ucord.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Table (name = "Estudiantes")
@Entity
public class Estudiante extends Usuario {

    @Column(name = "semestre")
    private Integer semestre;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "cursandoMaterias",
            joinColumns = {
                    @JoinColumn(name = "idEstudiante", referencedColumnName = "id", nullable = false, updatable = false)
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "siglaMateria", referencedColumnName = "sigla", nullable = false, updatable = false)
            })
    private Set<Materia> cursando = new HashSet<>();


    //private Map<Materia , Integer> aprobadas;

    public Estudiante(){
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

}
