package edu.eci.arsw.app.ucord.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author Ana Gabriela Silva
 * @author Leonardo Galeano
 * @author Iván Camilo Rincón Saavedra
 * @version 9/22/2021
 */
@Entity
@Table(name = "decanaturas")
public class Decanatura {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idDecanatura;

    @Column (name="nombre", nullable = false)
    private String nombre;

    @OneToMany(mappedBy="decanaturaM" ,cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
    private List<Materia> materias;

    public Decanatura(){

    }

    public Decanatura( Integer idDecanatura, String nombre ) {
        this.idDecanatura = idDecanatura;
        this.nombre = nombre;
    }

    @JsonManagedReference
    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public Integer getId() {
        return idDecanatura;
    }

    public void setId(Integer idDecanatura) {
        this.idDecanatura = idDecanatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
