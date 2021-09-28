package edu.eci.arsw.app.ucord.model;

import java.util.List;

/**
 * @author Ana Gabriela Silva
 * @author Leonardo Galeano
 * @author Iván Camilo Rincón Saavedra
 * @version 9/22/2021
 */
public class Usuario {
    private Integer idPersona;
    private String correo;
    private String nombre;
    private String apellido;
    private String contraseña;
    private String url;

    private List<Decanatura> programa;

    public Usuario(){
    }

    public Usuario(Integer idPersona, String correo, String nombre, String apellido, String contraseña, String url){
        this.idPersona =  idPersona;
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.url = url;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

