/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Datos.DDetalleRecibos;
import java.sql.CallableStatement;
import java.sql.Connection;

/**
 *
 * @author joset
 */
public class LDetalleRecibos {
    
    Connection cn = LConexion.getConnection();

    
    public String registrarDetalleRecibos(DDetalleRecibos miDetalle){
        String msg = null;
        try{
            CallableStatement cst = cn.prepareCall("{call sp_insertar_datellerecib(?,?,?,?,?)}");
            cst.setInt(1, miDetalle.getRecibosId());
            cst.setString(2, miDetalle.getProductosId());
            cst.setInt(3, miDetalle.getLineasId());
            cst.setInt(4, miDetalle.getCantidad());
            cst.setDouble(5, miDetalle.getTotal());
            cst.executeUpdate();
            msg = "si";
        }catch(Exception ex){
        ex.printStackTrace();
        msg = "no";
    }
    return msg;
}
    
}
