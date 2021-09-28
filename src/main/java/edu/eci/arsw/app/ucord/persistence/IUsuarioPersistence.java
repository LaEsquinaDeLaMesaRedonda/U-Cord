package edu.eci.arsw.app.ucord.persistence;

import edu.eci.arsw.app.ucord.model.Usuario;
import edu.eci.arsw.app.ucord.service.UCordServicesException;

/**
 * @author Ana Gabriela Silva
 * @author Leonardo Galeano
 * @author Iván Camilo Rincón Saavedra
 * @version 9/28/2021
 */
public interface IUsuarioPersistence {
    void guardarUsuario(Usuario usuario) throws UcordPersistenceException;

    Usuario getUsuarioPorCorreo( String correo ) throws UCordServicesException;

    Usuario getUsuarioPorId( Integer id ) throws UCordServicesException;

    void actualizarFotoDeUsuario( String correo, String url);

    void actualizarContraseñaDeUsuario( String correo, String contraseña );
}
