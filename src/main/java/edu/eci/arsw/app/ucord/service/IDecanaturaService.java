package edu.eci.arsw.app.ucord.service;

import java.util.List;

import edu.eci.arsw.app.ucord.model.Decanatura;
import edu.eci.arsw.app.ucord.model.Materia;
import edu.eci.arsw.app.ucord.model.Profesor;
import edu.eci.arsw.app.ucord.persistence.UcordPersistenceException;

public interface IDecanaturaService {
    
    List<Decanatura> getDecanaturas() throws UcordPersistenceException;
    void agregarDecanatura (Integer id, String nombre, Profesor decano) throws UcordPersistenceException;
    Decanatura getDecaturaPorNombre (String nombre) throws UcordPersistenceException;
    void agregarDecano (Profesor decano) throws UcordPersistenceException;
    List<Materia> getMateriasPorDecanatura (Decanatura decanatura)throws UcordPersistenceException;


}
