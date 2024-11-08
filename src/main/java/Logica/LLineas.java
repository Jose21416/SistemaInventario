/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Datos.DLineas;
import Datos.DUsuarios;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joset
 */
public class LLineas {
    
    Connection cn = LConexion.getConnection();
 
    public DefaultTableModel mostrarLineas(DLineas misLineas) {
    
        DefaultTableModel miModelo = null;
        
        try{
            String titulos [] = {"Id", "Linea"};
            String dts [] = new String [5];
            miModelo = new DefaultTableModel(null, titulos);
            
            CallableStatement cst = cn.prepareCall("{ call sp_mostrarbuscar_lineas(?)}");
            cst.setString(1, misLineas.getLinea());
            ResultSet rs = cst.executeQuery();
            while (rs.next()) {
            
                dts [0] = rs.getString("IdLineas");
                dts [1] = rs.getString("Nombre");
    
                miModelo.addRow(dts);
                
            }
            
        }catch(Exception ex){
        
            ex.printStackTrace();
            
        }
        
        
        return miModelo;
        
    }
    
    public String insertarLineas (DLineas misLineas){
        
        String msg = null;
        
        try {
            
            CallableStatement cst = cn.prepareCall("{ call sp_insertar_lineas(?)}");
            cst.setString(1, misLineas.getLinea());
            
            cst.executeUpdate();
            
            msg = "Si";
        }catch(Exception ex){
            
            ex.printStackTrace();
            msg = "no"; 
            
        }
        
        return msg;
        
    }
    
    
    public String editarLineas (DLineas misLineas){
        
        String msg = null;
        
        try {
            
            CallableStatement cst = cn.prepareCall("{ call sp_editar_lineas(?)}");
            cst.setInt(1, misLineas.getId());
            cst.setString(2, misLineas.getLinea());
            
            cst.executeUpdate();
            
            msg = "Si";
        }catch(Exception ex){
            
            ex.printStackTrace();
            msg = "no"; 
            
        }
        
        return msg;
        
    }
    
    
    public String eliminarLineas (DLineas misLineas){
        
        String msg = null;
        
        try {
            
            CallableStatement cst = cn.prepareCall("{ call sp_eliminar_lineas(?)}");
            cst.setInt(1, misLineas.getId());
            cst.executeUpdate();
            msg = "Si";
        }catch(Exception ex){
            
            ex.printStackTrace();
            msg = "no"; 
            
        }
        
        return msg;
        
    }
    
}
