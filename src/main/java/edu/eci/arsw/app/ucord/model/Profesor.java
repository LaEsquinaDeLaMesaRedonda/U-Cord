package edu.eci.arsw.app.ucord.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Ana Gabriela Silva
 * @author Leonardo Galeano
 * @author Iván Camilo Rincón Saavedra
 * @version 9/22/2021
 */

@Entity
@Table(name = "profesores")
@PrimaryKeyJoinColumn( referencedColumnName = "idUsuario")
public class Profesor extends Usuario{
    @OneToOne
    @JoinColumn(name = "idDecanatura", updatable = false, nullable = false)
    private Decanatura decanatura;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "profesorMateria",
    joinColumns = {
            @JoinColumn(name = "idProfesor", referencedColumnName = "idUsuario", nullable = false, updatable = false)
    },
    inverseJoinColumns = {
            @JoinColumn(name = "siglaMateria", referencedColumnName = "sigla", nullable = false, updatable = false)
    })
    private Set<Materia> materias = new HashSet<>();

    public Profesor(Integer idPersona, String correo, String nombreCompleto, String contraseña, String url, int idDecanatura) {
        super(idPersona, correo, nombreCompleto, contraseña, url);
    }

    public Profesor(){}

    public Set<Materia> getMaterias() {return materias;}

    public void setMaterias(Set<Materia> materias) {this.materias = materias;}

}
