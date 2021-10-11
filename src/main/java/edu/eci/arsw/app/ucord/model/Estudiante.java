package edu.eci.arsw.app.ucord.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "estudiantes")
@PrimaryKeyJoinColumn( referencedColumnName = "idUsuario")
public class Estudiante extends Usuario {

    @Column(name = "semestre")
    private Integer semestre;


    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "cursando",
            joinColumns = {
                    @JoinColumn(name = "idEstudiante", referencedColumnName = "idUsuario", nullable = false, updatable = false)
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "siglaMateria", referencedColumnName = "sigla", nullable = false, updatable = false)
            })
    private Set<Materia> cursando = new HashSet<>();


    public Estudiante(){
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public Set<Materia> getCursando() {
        return cursando;
    }

    public void setCursando(Set<Materia> cursando) {
        this.cursando = cursando;
    }
}
