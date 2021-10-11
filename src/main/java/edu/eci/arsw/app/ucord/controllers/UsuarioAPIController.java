package edu.eci.arsw.app.ucord.controllers;

import edu.eci.arsw.app.ucord.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ana Gabriela Silva
 * @author Leonardo Galeano
 * @author Iván Camilo Rincón Saavedra
 * @version 9/28/2021
 */
@RestController
@RequestMapping(value = "/U-cord")
public class UsuarioAPIController {

  @Autowired
  private IUsuarioService service;

  public UsuarioAPIController() {}
}
