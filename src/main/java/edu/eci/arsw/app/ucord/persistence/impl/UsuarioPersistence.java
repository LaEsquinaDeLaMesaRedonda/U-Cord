package edu.eci.arsw.app.ucord.persistence.impl;

import edu.eci.arsw.app.ucord.model.Usuario;
import edu.eci.arsw.app.ucord.persistence.IUsuarioPersistence;
import edu.eci.arsw.app.ucord.persistence.UcordPersistenceException;
import edu.eci.arsw.app.ucord.service.UCordServicesException;
import org.springframework.stereotype.Service;

/**
 * @author Ana Gabriela Silva
 * @author Leonardo Galeano
 * @author Iván Camilo Rincón Saavedra
 * @version 9/28/2021
 */

@Service
public class UsuarioPersistence implements IUsuarioPersistence {
    @Override
    public void guardarUsuario(Usuario usuario) throws UcordPersistenceException {


    }

    @Override
    public Usuario getUsuarioPorCorreo(String correo) throws UCordServicesException {
        return null;
    }

    @Override
    public Usuario getUsuarioPorId(Integer id) throws UCordServicesException {
        return null;
    }

    @Override
    public void actualizarFotoDeUsuario(String correo, String url) {

    }

    @Override
    public void actualizarContraseñaDeUsuario(String correo, String contraseña) {

    }
}
