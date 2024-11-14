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
public class DFactura {
    
    int LineasId;
    int ProveedoresId;
    Date FechaEntrada;
    
    public DFactura () {
        
        
        
    }

    public DFactura(int LineasId, int ProveedoresId, Date FechaEntrada) {
        this.LineasId = LineasId;
        this.ProveedoresId = ProveedoresId;
        this.FechaEntrada = FechaEntrada;
    }

    public int getLineasId() {
        return LineasId;
    }

    public void setLineasId(int LineasId) {
        this.LineasId = LineasId;
    }

    public int getProveedoresId() {
        return ProveedoresId;
    }

    public void setProveedoresId(int ProveedoresId) {
        this.ProveedoresId = ProveedoresId;
    }

    public Date getFechaEntrada() {
        return FechaEntrada;
    }

    public void setFechaEntrada(Date FechaEntrada) {
        this.FechaEntrada = FechaEntrada;
    }
    
    
    
}
