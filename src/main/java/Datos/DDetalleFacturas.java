/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author joset
 */
public class DDetalleFacturas {
    
    int IdDetalleFacturas;
    int FacturasId;
    String ProductosId;
    int Cantidad;
    double Total;
    
    public DDetalleFacturas(){
        
    }

    public DDetalleFacturas(int IdDetalleFacturas, int FacturasId, String ProductosId, int Cantidad, double Total) {
        this.IdDetalleFacturas = IdDetalleFacturas;
        this.FacturasId = FacturasId;
        this.ProductosId = ProductosId;
        this.Cantidad = Cantidad;
        this.Total = Total;
    }

    
    
    public int getIdDetalleFacturas() {
        return IdDetalleFacturas;
    }

    public void setIdDetalleFacturas(int IdDetalleFacturas) {
        this.IdDetalleFacturas = IdDetalleFacturas;
    }

    public int getFacturasId() {
        return FacturasId;
    }

    public void setFacturasId(int FacturasId) {
        this.FacturasId = FacturasId;
    }

    public String getProductosId() {
        return ProductosId;
    }

    public void setProductosId(String ProductosId) {
        this.ProductosId = ProductosId;
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
