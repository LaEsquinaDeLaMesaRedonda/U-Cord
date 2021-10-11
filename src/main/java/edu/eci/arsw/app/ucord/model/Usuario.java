package edu.eci.arsw.app.ucord.model;

import java.util.List;

import javax.persistence.Column;
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
@Entity     //Etiqueta necesaria para indentificar que pertenece a una tabla dentro de postgresql
public class Usuario {

    @Id     //Etiqueta necesaria para identificar la llave primaria de la tabla
    @Column (name="id", nullable = false)
    private Integer idPersona;

    @Column (name="correo", nullable = false)
    private String correo;

    @Column (name="nombreCompleto", nullable = false)
    private String nombreCompleto;

    @Column (name="password", nullable = false)
    private String contraseña;

    @Column (name="url")
    private String url;

    @Column (name="idDecanatura", nullable = false)
    private int idDecanatura;

    public Usuario(){
    }

    public Usuario(Integer idPersona, String correo, String nombreCompleto, String contraseña, String url, int idDecanatura){
        this.idPersona =  idPersona;
        this.correo = correo;
        this.nombreCompleto = nombreCompleto;
        this.contraseña = contraseña;
        this.url = url;
        this.idDecanatura = idDecanatura;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombreCompleto() {return nombreCompleto;}

    public void setNombreCompleto(String nombreCompleto) {this.nombreCompleto = nombreCompleto;}

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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

    public int getIdDecanatura() {return idDecanatura;}

    public void setIdDecanatura(int idDecanatura) {this.idDecanatura = idDecanatura;}

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombreCompleto + ", contraseña=" + contraseña + ", correo=" + correo + ", idPersona="
                + idPersona + "decanatura="+ idDecanatura + "]";
    }
}

