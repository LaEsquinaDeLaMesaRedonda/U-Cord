package edu.eci.arsw.app.ucord.service;

import edu.eci.arsw.app.ucord.model.Decanatura;
import edu.eci.arsw.app.ucord.model.Materia;
import edu.eci.arsw.app.ucord.persistence.UcordPersistenceException;

import java.util.List;

public interface IMateriaService{

    void agregarMateria(String sigla, String nombre, Integer creditos, Decanatura decanatura ) throws UcordPersistenceException;

    List<Materia> getMaterias() throws UcordPersistenceException;

    void agregarPrerequisito(Materia materia, List<Materia> requisitos) throws UcordPersistenceException;

    List<Materia> getPrerequisitos(Materia materia) throws UcordPersistenceException;

    List<Materia> getMateriasPorDecanatura(Decanatura decanatura) throws UcordPersistenceException;

}