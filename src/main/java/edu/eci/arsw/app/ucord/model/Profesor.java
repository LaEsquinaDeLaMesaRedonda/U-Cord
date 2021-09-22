package edu.eci.arsw.app.ucord.model;

import java.util.List;

/**
 * @author Ana Gabriela Silva
 * @author Leonardo Galeano
 * @author Iván Camilo Rincón Saavedra
 * @version 9/22/2021
 */
public class Profesor {
    private List<Materia> materiasAdictar;
    public Profesor() {
    }

    public List<Materia> getMateriasAdictar() {
        return materiasAdictar;
    }

    public void setMateriasAdictar(List<Materia> materiasAdictar) {
        this.materiasAdictar = materiasAdictar;
    }
}
