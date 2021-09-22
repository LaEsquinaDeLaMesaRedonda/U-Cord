package edu.eci.arsw.app.ucord.model;

import java.util.List;

/**
 * @author Ana Gabriela Silva
 * @author Leonardo Galeano
 * @author Iván Camilo Rincón Saavedra
 * @version 9/22/2021
 */
public class Persona {
    private Integer idPersona;
    private String correo;
    private String nombre;
    private String apellido;
    private String contraseña;

    private List<Decanatura> programa;

    public Persona(){
    }

    public Persona(Integer idPersona, String correo, String nombre, String apellido, String contraseña){
        this.idPersona =  idPersona;
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
    }

    public List<Decanatura> getPrograma() {
        return programa;
    }

    public void setPrograma(List<Decanatura> programa) {
        this.programa = programa;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}

