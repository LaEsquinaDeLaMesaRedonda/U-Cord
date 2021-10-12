package edu.eci.arsw.app.ucord.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
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

    @ManyToOne
    @JoinColumn(name = "idDecanatura", nullable = false)
    private Decanatura decanaturaM;

    @ManyToMany(mappedBy = "materias", fetch = FetchType.LAZY)
    private Set<Profesor> profesores = new HashSet<>();

    @ManyToMany(mappedBy = "cursando", fetch = FetchType.LAZY)
    private Set<Estudiante> estudiantes = new HashSet<>();

    @ManyToMany(mappedBy = "aprobadas", fetch = FetchType.LAZY)
    private Set<Estudiante> estudiantesAprobados = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "requisitosMaterias",
    joinColumns = @JoinColumn(name = "siglaMateria", referencedColumnName = "sigla"),
    inverseJoinColumns = @JoinColumn(name = "siglaRequisito", referencedColumnName = "sigla"))
    private Set<Materia> requisitos;

    @ManyToMany
    @JoinTable(name = "requisitosMaterias",
    joinColumns = @JoinColumn(name = "siglaRequisito"),
    inverseJoinColumns = @JoinColumn(name = "siglaMateria"))
    private Set<Materia> requisitode;

    public Materia(){}

    public Materia(String sigla, String nombre, Integer creditos) {
        this.sigla = sigla;
        this.nombre = nombre;
        this.creditos = creditos;
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

    @JsonBackReference
    public Decanatura getDecanaturaM() {
        return decanaturaM;
    }

    public void setDecanaturaM(Decanatura decanaturaM) {
        this.decanaturaM = decanaturaM;
    }

    public Set<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(Set<Profesor> profesores) {
        this.profesores = profesores;
    }

    public Set<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Set<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Set<Estudiante> getEstudiantesAprobados() {
        return estudiantesAprobados;
    }

    public void setEstudiantesAprobados(Set<Estudiante> estudiantesAprobados) {
        this.estudiantesAprobados = estudiantesAprobados;
    }

    public Set<Materia> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(Set<Materia> requisitos) {
        this.requisitos = requisitos;
    }

    public Set<Materia> getRequisitode() {
        return requisitode;
    }

    public void setRequisitode(Set<Materia> requisitode) {
        this.requisitode = requisitode;
    }
}
