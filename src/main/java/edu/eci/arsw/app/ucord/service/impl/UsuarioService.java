package edu.eci.arsw.app.ucord.service.impl;

import edu.eci.arsw.app.ucord.model.Usuario;
import edu.eci.arsw.app.ucord.persistence.IUsuarioPersistence;
import edu.eci.arsw.app.ucord.service.IUsuarioService;
import edu.eci.arsw.app.ucord.service.UCordServicesException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ana Gabriela Silva
 * @author Leonardo Galeano
 * @author Iván Camilo Rincón Saavedra
 * @version 9/28/2021
 */

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private IUsuarioPersistence persistence;

    @Override
    public void agregarUsuario(Usuario usuario) throws UCordServicesException {

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
