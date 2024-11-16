/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Datos.DDetalleFacturas;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joset
 */
public class LDetalleFacturas {
    
    Connection cn = LConexion.getConnection();

    
    public String registrarDetalleFactura(DDetalleFacturas miDetalle){
        String msg = null;
        try{
            CallableStatement cst = cn.prepareCall("{call sp_insertar_detallefacturas(?,?,?,?)}");
            cst.setInt(1, miDetalle.getFacturasId());
            cst.setString(2, miDetalle.getProductosId());
            cst.setInt(3, miDetalle.getCantidad());
            cst.setDouble(4, miDetalle.getTotal());
            cst.executeUpdate();
            msg = "si";
        }catch(Exception ex){
        ex.printStackTrace();
        msg = "no";
    }
    return msg;
}

    public DefaultTableModel mostrarDetalleFacturas(DDetalleFacturas miDetalle) {
      
        DefaultTableModel miModelo = null;
        try{
            
            String titulos [] = {"CÓDIGO","DESCRIPCIÓN","STOCK","UMEDIDA","PUNITARIO","TOTAL"};
            String dts [] = new String [6];
            miModelo = new DefaultTableModel(null, titulos);
            CallableStatement cst = cn.prepareCall("{call sp_mostrardetalleFacturas(?)}");
            cst.setInt(1, miDetalle.getFacturasId());
            
            ResultSet rs = cst.executeQuery();
            while (rs.next()){
                
                dts[0] = rs.getString("d.ProductosId");
                dts[1] = rs.getString("p.Descripcion");
                dts[2] = rs.getString("d.Cantidad");
                dts[3] = rs.getString("p.UMedida");
                dts[4] = rs.getString("p.PUnitario");
                dts[5] = rs.getString("d.Total");
                miModelo.addRow(dts);
                
            }
            
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return miModelo;
    }
    
}
