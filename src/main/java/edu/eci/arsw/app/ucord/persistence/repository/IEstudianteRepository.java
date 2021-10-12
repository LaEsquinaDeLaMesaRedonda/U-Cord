package edu.eci.arsw.app.ucord.persistence.repository;

import edu.eci.arsw.app.ucord.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ana Gabriela Silva
 * @author Leonardo Galeano
 * @author Iván Camilo Rincón Saavedra
 * @version 10/11/2021
 */

public interface IEstudianteRepository extends JpaRepository<Estudiante, Integer> {
}
