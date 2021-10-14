package edu.eci.arsw.app.ucord.persistence;

import java.util.List;

import edu.eci.arsw.app.ucord.model.Decanatura;

public interface IDecanaturaPersistence {
   
    void agregarDecanatura (Decanatura decanatura) throws UcordPersistenceException;
    List<Decanatura> getDecanaturas() throws UcordPersistenceException;
    List<Decanatura> getDecanaturaPorNombre(String nombreDecanatura) throws UcordPersistenceException;
    List<Decanatura> getDecanaturaPorMateria(String nombreMateria) throws UcordPersistenceException;
    List<Decanatura> getDecanaturaPorUsuario(Integer idUsuario) throws UcordPersistenceException;

    
    



    
}
