/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author joset
 */
public class DDetalleRecibos {
    
    int IdDetalleRecib;
    int RecibosId;
    String ProductosId;
    int LineasId;
    int Cantidad;
    double Total;

    public DDetalleRecibos() {
        
    }
    
    public DDetalleRecibos(int IdDetalleRecib, int RecibosId, String ProductosId, int LineasId, int Cantidad, double Total) {
        this.IdDetalleRecib = IdDetalleRecib;
        this.RecibosId = RecibosId;
        this.ProductosId = ProductosId;
        this.LineasId = LineasId;
        this.Cantidad = Cantidad;
        this.Total = Total;
    }

    public int getIdDetalleRecib() {
        return IdDetalleRecib;
    }

    public void setIdDetalleRecib(int IdDetalleRecib) {
        this.IdDetalleRecib = IdDetalleRecib;
    }

    public int getRecibosId() {
        return RecibosId;
    }

    public void setRecibosId(int RecibosId) {
        this.RecibosId = RecibosId;
    }

    public String getProductosId() {
        return ProductosId;
    }

    public void setProductosId(String ProductosId) {
        this.ProductosId = ProductosId;
    }

    public int getLineasId() {
        return LineasId;
    }

    public void setLineasId(int LineasId) {
        this.LineasId = LineasId;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }
    
}
