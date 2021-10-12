package edu.eci.arsw.app.ucord.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import javax.persistence.*;

/**
 * @author Ana Gabriela Silva
 * @author Leonardo Galeano
 * @author Iván Camilo Rincón Saavedra
 * @version 9/22/2021
 */

@Entity     //Etiqueta necesaria para indentificar que pertenece a una tabla dentro de postgresql
@Table(name = "usuarios")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {

    @Id     //Etiqueta necesaria para identificar la llave primaria de la tabla
    @Column (name="idUsuario", nullable = true)
    private Integer idUsuario;

    @Column (name="correo", nullable = false)
    private String correo;

    @Column (name="nombreCompleto", nullable = false)
    private String nombreCompleto;

    @Column (name="password", nullable = false)
    private String contraseña;

    @Column (name="url")
    private String url;

    @ManyToOne
    @JoinColumn(name = "idDecanatura", nullable = false)
    private Decanatura programa;

    public Usuario(){
    }

    public Usuario(Integer idUsuario, String correo, String nombreCompleto, String contraseña, String url){
        this.idUsuario =  idUsuario;
        this.correo = correo;
        this.nombreCompleto = nombreCompleto;
        this.contraseña = contraseña;
        this.url = url;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
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

    public Decanatura getPrograma() {
        return programa;
    }

    public void setPrograma(Decanatura programa) {
        this.programa = programa;
    }

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombreCompleto + ", contraseña=" + contraseña + ", correo=" + correo + ", idUsuario="
                + idUsuario + "decanatura="+ programa.getNombre() + "]";
    }
}

