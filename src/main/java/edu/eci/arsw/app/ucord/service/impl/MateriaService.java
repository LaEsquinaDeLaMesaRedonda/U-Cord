package edu.eci.arsw.app.ucord.service.impl;

import edu.eci.arsw.app.ucord.model.Decanatura;
import edu.eci.arsw.app.ucord.model.Materia;
import edu.eci.arsw.app.ucord.persistence.UcordPersistenceException;
import edu.eci.arsw.app.ucord.service.IMateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaService implements IMateriaService {

    @Override
    public void agregarMateria(String sigla, String nombre, Integer creditos, Decanatura decanatura) throws UcordPersistenceException {
        try{

        }catch(Exception e){
            System.out.println("La materia no ha podido ser agregada.");
        }
    }

    @Override
    public List<Materia> getMaterias() throws UcordPersistenceException {
        return null;
    }

    @Override
    public void agregarPrerequisito(Materia materia, List<Materia> requisitos) throws UcordPersistenceException {
        try{

        }catch(Exception e){
            System.out.println("El prerequisito no ha podido ser agregado.");
        }
    }

    @Override
    public List<Materia> getPrerequisitos(Materia materia) throws UcordPersistenceException {
        return null;
    }

    @Override
    public List<Materia> getMateriasPorDecanatura(Decanatura decanatura) throws UcordPersistenceException {
        return null;
    }
}
