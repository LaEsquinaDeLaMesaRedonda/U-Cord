package edu.eci.arsw.app.ucord.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ana Gabriela Silva
 * @author Leonardo Galeano
 * @author Iván Camilo Rincón Saavedra
 * @version 9/22/2021
 */
@Table(name = "usuarios")
@Entity //Etiqueta necesaria para indentificar que pertenece a una tabla dentro de postgresql
public class Usuario {
    @Id //Etiqueta necesaria para identificar la llave primaria de la tabla
    private Integer idPersona;
    private String correo;
    private String nombre;
    private String apellido;
    private String contraseña;
    private String url;

    //private List<Decanatura> programa; // => Si hay un campo aqui que no exista en la base de datos, va tirar error

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

    // public List<Decanatura> getPrograma() {
    //     return programa;
    // }

    // public void setPrograma(List<Decanatura> programa) {
    //     this.programa = programa;
    // }

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

    @Override
    public String toString() {
        return "Usuario [apellido=" + apellido + ", contraseña=" + contraseña + ", correo=" + correo + ", idPersona="
                + idPersona + ", nombre=" + nombre + "]";//, programa=" + programa + ", url=" + url + "]";
    }
    
}

