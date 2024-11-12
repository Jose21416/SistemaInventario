/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Datos.DProveedores;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joset
 */
public class LProveedores {
    
    Connection cn = LConexion.getConnection();
    
    public DefaultTableModel mostrarProveedores(DProveedores misProveedores) {
    
        DefaultTableModel miModelo = null;
        
        try{
            String titulos [] = {"Id", "Nombre", "Telefono","Domicilio"};
            String dts [] = new String [4];
            miModelo = new DefaultTableModel(null, titulos);
            
            CallableStatement cst = cn.prepareCall("{ call sp_mostrarbuscar_proveedores(?)}");
            cst.setString(1, misProveedores.getNombre());
            ResultSet rs = cst.executeQuery();
            while (rs.next()) {
            
                dts [0] = rs.getString(1);
                dts [1] = rs.getString(2);
                dts [2] = rs.getString(3);
                dts [3] = rs.getString(4);
                
                miModelo.addRow(dts);
                
            }
            
        }catch(Exception ex){
        
            ex.printStackTrace();
            
        }
        
        
        return miModelo;
        
    }
    
    public String insertarProveedores (DProveedores misProveedores){
        
        String msg = null;
        
        try {
            
            CallableStatement cst = cn.prepareCall("{ call sp_insertar_proveedores(?,?,?)}");
            cst.setString(1, misProveedores.getNombre());
            cst.setString(2, misProveedores.getTelefono());
            cst.setString(3, misProveedores.getDomicilio());
            
            cst.executeUpdate();
            
            msg = "Si";
        }catch(Exception ex){
            
            ex.printStackTrace();
            msg = "no"; 
            
        }
        
        return msg;
        
    }
    
    
    public String editarProveedores (DProveedores misProveedores){
        
        String msg = null;
        
        try {
            
            CallableStatement cst = cn.prepareCall("{ call sp_editar_proveedores(?,?,?,?)}");
            cst.setInt(1, misProveedores.getId());
            cst.setString(2, misProveedores.getNombre());
            cst.setString(3, misProveedores.getTelefono());
            cst.setString(4, misProveedores.getDomicilio());
            
            cst.executeUpdate();
            
            msg = "Si";
        }catch(Exception ex){
            
            ex.printStackTrace();
            msg = "no"; 
            
        }
        
        return msg;
        
    }
    
    
    public String eliminarProveedores (DProveedores misProveedores){
        
        String msg = null;
        
        try {
            
            CallableStatement cst = cn.prepareCall("{ call sp_eliminar_proveedores(?)}");
            cst.setInt(1, misProveedores.getId());
            cst.executeUpdate();
            msg = "Si";
        }catch(Exception ex){
            
            ex.printStackTrace();
            msg = "no"; 
            
        }
        
        return msg;
        
    }
    
}
