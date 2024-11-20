/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.sql.Date;

/**
 *
 * @author joset
 */
public class DRecibos {
    
    int IdRecibos;
    Date FechaRecibo;
    String PersonaEntrega;
    String PersonaRecibe;
    
    public DRecibos() {
        
    }


    public DRecibos(int IDRecibos, Date FechaRecibo, String PersonaEntrega, String PersonaRecibe) {
        
        this.IdRecibos = IdRecibos;
        this.FechaRecibo = FechaRecibo;
        this.PersonaEntrega = PersonaEntrega;
        this.PersonaRecibe = PersonaRecibe;
    }

    public int getIdRecibos() {
        return IdRecibos;
    }

    public void setIdRecibos(int IdRecibos) {
        this.IdRecibos = IdRecibos;
    }
    
    public Date getFechaRecibo() {
        return FechaRecibo;
    }

    public void setFechaRecibo(Date FechaRecibo) {
        this.FechaRecibo = FechaRecibo;
    }

    public String getPersonaEntrega() {
        return PersonaEntrega;
    }

    public void setPersonaEntrega(String PersonaEntrega) {
        this.PersonaEntrega = PersonaEntrega;
    }

    public String getPersonaRecibe() {
        return PersonaRecibe;
    }

    public void setPersonaRecibe(String PersonaRecibe) {
        this.PersonaRecibe = PersonaRecibe;
    }
    
    
    
}
