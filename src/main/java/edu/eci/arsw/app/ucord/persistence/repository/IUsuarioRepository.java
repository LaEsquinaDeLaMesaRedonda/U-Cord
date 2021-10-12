package edu.eci.arsw.app.ucord.persistence.repository;

import edu.eci.arsw.app.ucord.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Ana Gabriela Silva
 * @author Leonardo Galeano
 * @author Iván Camilo Rincón Saavedra
 * @version 10/3/2021
 */
@Repository //Springboot necesita saber que esto es un repositorio
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {

}
