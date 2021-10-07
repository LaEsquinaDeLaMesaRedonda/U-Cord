package edu.eci.arsw.app.ucord.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.arsw.app.ucord.service.IDecanaturaService;

/**
 * @author Ana Gabriela Silva
 * @author Leonardo Galeano
 * @author Iván Camilo Rincón Saavedra
 * @version 9/28/2021
 */

@RestController
@RequestMapping(value = "/U-cord")
public class DecanaturaAPIController {
    @Autowired
    IDecanaturaService decanaturaService;

    @RequestMapping(value, method = RequestMethod.POST)
    
    


    
}
