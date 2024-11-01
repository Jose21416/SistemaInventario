/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author joset
 */
public class DUsuarios {

    int IdUsuarios;
    String Nombre;
    String Usuario;
    String Clave;
    String perfil;
    
    public DUsuarios() {
    
    
    }
    
    public DUsuarios(int IdUsuarios, String Nombre, String Usuario, String Clave, String perfil) {
        this.IdUsuarios = IdUsuarios;
        this.Nombre = Nombre;
        this.Usuario = Usuario;
        this.Clave = Clave;
        this.perfil = perfil;
    }
    
    public int getIdUsuarios() {
        return IdUsuarios;
    }

    
    public void setIdUsuarios(int IdUsuarios) {
        this.IdUsuarios = IdUsuarios;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    
    
}
