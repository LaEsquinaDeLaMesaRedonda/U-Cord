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
@Table(name = "materias")
public class Materia {

    @Id
    @Column (name="sigla", nullable = false)
    private String sigla;

    @Column (name="nombre", nullable = false)
    private String nombre;

    @Column (name="creditos", nullable = false)
    private Integer creditos;

    @Column (name = "idDecanatura")
    private Integer idDecanatura;


    @ManyToMany(mappedBy = "materias", fetch = FetchType.LAZY)
    private Set<Profesor> profesores = new HashSet<>();

    @ManyToMany(mappedBy = "cursando", fetch = FetchType.LAZY)
    private Set<Estudiante> estudiantes = new HashSet<>();

    public Materia(){}

    public Materia(String sigla, String nombre, Integer creditos, Integer idDecanatura) {
        this.sigla = sigla;
        this.nombre = nombre;
        this.creditos = creditos;
        this.idDecanatura = idDecanatura;
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

    public Integer getIdDecanatura() {return idDecanatura;}

    public void setIdDecanatura(Integer idDecanatura) {this.idDecanatura = idDecanatura;}
}
