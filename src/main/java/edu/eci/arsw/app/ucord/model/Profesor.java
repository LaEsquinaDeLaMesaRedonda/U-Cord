package edu.eci.arsw.app.ucord.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Ana Gabriela Silva
 * @author Leonardo Galeano
 * @author Iván Camilo Rincón Saavedra
 * @version 9/22/2021
 */

@Table(name = "Profesores")
@Entity
public class Profesor extends Usuario{

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "profesorMateria",
    joinColumns = {
            @JoinColumn(name = "idProfesor", referencedColumnName = "id", nullable = false, updatable = false)
    },
    inverseJoinColumns = {
            @JoinColumn(name = "siglaMateria", referencedColumnName = "sigla", nullable = false, updatable = false)
    })
    private Set<Materia> materias = new HashSet<>();

    public Profesor(Integer idPersona, String correo, String nombreCompleto, String contraseña, String url, int idDecanatura) {
        super(idPersona, correo, nombreCompleto, contraseña, url, idDecanatura);
    }

    public Profesor(){}

    public Set<Materia> getMaterias() {return materias;}

    public void setMaterias(Set<Materia> materias) {this.materias = materias;}

}
