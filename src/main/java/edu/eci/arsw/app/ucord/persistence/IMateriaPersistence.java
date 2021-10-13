package edu.eci.arsw.app.ucord.persistence;

import edu.eci.arsw.app.ucord.model.Decanatura;
import edu.eci.arsw.app.ucord.model.Materia;

import java.util.List;

/**
 * @author Ana Gabriela Silva
 * @author Leonardo Galeano
 * @author Iván Camilo Rincón Saavedra
 * @version 10/12/2021
 */

public interface IMateriaPersistence {

    void agregarMateria(Materia materia) throws UcordPersistenceException;

    void agregarPreRequisito (Materia requisito, Integer idMateria) throws UcordPersistenceException;

    List<Materia> getMaterias () throws UcordPersistenceException;

    List<Materia> getMateriaPorCreditos (Integer creditos) throws UcordPersistenceException;

    List<Materia> getMateriaPorDecanatura (Integer idDecanatura) throws UcordPersistenceException;

    List<Materia> getMateriaPorSiglas (String siglas) throws UcordPersistenceException;

    List<Materia> getPreRequisitos (String siglas) throws UcordPersistenceException;


}
