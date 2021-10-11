package edu.eci.arsw.app.ucord.persistence.impl;

import edu.eci.arsw.app.ucord.model.Usuario;
import edu.eci.arsw.app.ucord.persistence.IUsuarioPersistence;
import edu.eci.arsw.app.ucord.persistence.UcordPersistenceException;
import edu.eci.arsw.app.ucord.persistence.repository.IUsuarioRepository;
import edu.eci.arsw.app.ucord.service.UCordServicesException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Optional;

/**
 * @author Ana Gabriela Silva
 * @author Leonardo Galeano
 * @author Iván Camilo Rincón Saavedra
 * @version 9/28/2021
 */

@Service
public class UsuarioPersistence implements IUsuarioPersistence {
    @Autowired
    private IUsuarioRepository usuarioRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void guardarUsuario(Usuario usuario) throws UcordPersistenceException {
        try {
            usuarioRepository.save(usuario);
        } catch ( Exception exception ){
            throw new UcordPersistenceException(UcordPersistenceException.FAILED_CREATING+" The User");
        }

    }

    @Override
    public Usuario getUsuarioPorCorreo(String correo) throws UcordPersistenceException {
        Query query = entityManager.createNativeQuery("SELECT * FROM Usuarios WHERE correo = ?",Usuario.class);
        query.setParameter(1,correo);
        if ( query.getResultList().size() == 0) throw new UcordPersistenceException("The user with mail "+correo+" was "+UcordPersistenceException.NOT_FOUND);
        return (Usuario) query.getSingleResult();
    }

    @Override
    public Usuario getUsuarioPorId(Integer id) throws UcordPersistenceException {
        Optional<Usuario>  optionalUsuario = usuarioRepository.findById(id);
        optionalUsuario.orElseThrow( ()-> new UcordPersistenceException(UcordPersistenceException.NOT_FOUND));
        return optionalUsuario.get();
    }

    @Override
    public void actualizarFotoDeUsuario(String correo, String url) throws UcordPersistenceException{
        try{
            Query query = entityManager.createNativeQuery("UPDATE Usuarios SET url=? WHERE correo = ?");
            query.setParameter(1, url);
            query.setParameter(2, correo);
            query.executeUpdate();
        } catch ( Exception exception){
            throw new UcordPersistenceException(UcordPersistenceException.FAILED_UPDATING+" User "+correo);
        }
    }

    @Override
    public void actualizarContraseñaDeUsuario(String correo, String contraseña) throws UcordPersistenceException{
        try{
            Query query = entityManager.createNativeQuery("UPDATE Usuarios SET contraseña=? WHERE correo = ?");
            query.setParameter(1, contraseña);
            query.setParameter(2, correo);
            query.executeUpdate();
        } catch ( Exception exception){
            throw new UcordPersistenceException(UcordPersistenceException.FAILED_UPDATING+" User "+correo);
        }
    }
}
