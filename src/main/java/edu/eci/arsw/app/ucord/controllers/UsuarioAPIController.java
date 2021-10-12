package edu.eci.arsw.app.ucord.controllers;

import edu.eci.arsw.app.ucord.model.Usuario;
import edu.eci.arsw.app.ucord.service.IUsuarioService;
import edu.eci.arsw.app.ucord.service.UCordServicesException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Ana Gabriela Silva
 * @author Leonardo Galeano
 * @author Iván Camilo Rincón Saavedra
 * @version 9/28/2021
 */
@RestController
@RequestMapping(value = "/U-cord/users")
@CrossOrigin( origins = "*",  methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.DELETE}) //es un protocolo estándar que define la interacción entre un navegador y un servidor para manejar de forma segura las solicitudes HTTP de origen cruzado.
public class UsuarioAPIController {

  @Autowired
  private IUsuarioService service;

  @RequestMapping(path = "/newUser", method = RequestMethod.POST )
  public ResponseEntity<?> addUsuario(@RequestBody Usuario newUser) {
    try {
      service.agregarUsuario(newUser);
      return new ResponseEntity<>(HttpStatus.CREATED);
    } catch ( UCordServicesException ex ) {
      Logger.getLogger(UsuarioAPIController.class.getName()).log(Level.SEVERE, null, ex);
      return new ResponseEntity<>(ex.getMessage(),HttpStatus.FORBIDDEN);
    }
  }

  @RequestMapping( method = RequestMethod.GET )
  public ResponseEntity<?> getAllUser() {
    try {
      return new ResponseEntity<>(service.getAllUsuarios(),HttpStatus.CREATED);
    } catch ( UCordServicesException ex ) {
      Logger.getLogger(UsuarioAPIController.class.getName()).log(Level.SEVERE, null, ex);
      return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
    }
  }

  @RequestMapping( path = "/{correo}", method = RequestMethod.GET)
  public ResponseEntity<?> getUserByMail(@PathVariable String correo) {
    try {
      return new ResponseEntity<>(service.getUsuarioPorCorreo(correo),HttpStatus.CREATED);
    } catch ( UCordServicesException ex ) {
      Logger.getLogger(UsuarioAPIController.class.getName()).log(Level.SEVERE, null, ex);
      return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
    }
  }
}
