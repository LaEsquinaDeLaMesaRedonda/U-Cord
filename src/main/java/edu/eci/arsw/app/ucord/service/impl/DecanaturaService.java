package edu.eci.arsw.app.ucord.service.impl;

import java.util.List;

import edu.eci.arsw.app.ucord.model.Decanatura;
import edu.eci.arsw.app.ucord.model.Materia;
import edu.eci.arsw.app.ucord.model.Profesor;
import edu.eci.arsw.app.ucord.persistence.UcordPersistenceException;
import edu.eci.arsw.app.ucord.service.IDecanaturaService;

public class DecanaturaService implements IDecanaturaService {
   
    @Override
    public List<Decanatura> getDecanaturas() {
        return null;
    }

    @Override
    public void agregarDecanatura(Integer id, String nombre, Profesor decano) {
        try{

        }catch(Exception e){
            System.out.println("La decanatura no ha podido ser agregada.");
        }
        
    }

    @Override
    public Decanatura getDecaturaPorNombre(String nombre) {
        return null;
        
    }

    @Override
    public void agregarDecano(Profesor decano) throws UcordPersistenceException {
        try{

        }catch(Exception e){
            System.out.println("El dedcano no ha podido ser agregado.");
        }
        
    }

    @Override
    public List<Materia> getMateriasPorDecanatura(Decanatura decanatura) {
        return null;
        
    }
















    
}
