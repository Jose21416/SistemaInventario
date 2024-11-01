/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Datos.DUsuarios;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joset
 */
public class LUsuarios {
    
    Connection cn = LConexion.getConnection();
    
    public DefaultTableModel mostrarUsuarios(DUsuarios misUsuarios) {
    
        DefaultTableModel miModelo = null;
        
        try{
            String titulos [] = {"Id", "Nombre", "Usuario","Clave", "Perfil"};
            String dts [] = new String [5];
            miModelo = new DefaultTableModel(null, titulos);
            
            CallableStatement cst = cn.prepareCall("{ call sp_mostrarbuscar_usuarios(?)}");
            cst.setString(1, misUsuarios.getUsuario());
            ResultSet rs = cst.executeQuery();
            while (rs.next()) {
            
                dts [0] = rs.getString("IdUsuarios");
                dts [1] = rs.getString("Nombre");
                dts [2] = rs.getString("Usuario");
                dts [3] = rs.getString("Clave");
                dts [4] = rs.getString("Perfil");
                
                miModelo.addRow(dts);
                
            }
            
        }catch(Exception ex){
        
            ex.printStackTrace();
            
        }
        
        
        return miModelo;
        
    }
    
    public String insertarUsuarios (DUsuarios misUsuarios){
        
        String msg = null;
        
        try {
            
            CallableStatement cst = cn.prepareCall("{ call sp_insertar_usuarios(?,?,?,?)}");
            cst.setString(1, misUsuarios.getNombre());
            cst.setString(2, misUsuarios.getUsuario());
            cst.setString(3, misUsuarios.getClave());
            cst.setString(4, misUsuarios.getPerfil());
            
            cst.executeUpdate();
            
            msg = "Si";
        }catch(Exception ex){
            
            ex.printStackTrace();
            msg = "no"; 
            
        }
        
        return msg;
        
    }
    
    
    public String editarUsuarios (DUsuarios misUsuarios){
        
        String msg = null;
        
        try {
            
            CallableStatement cst = cn.prepareCall("{ call sp_editar_usuarios(?,?,?,?,?)}");
            cst.setInt(1, misUsuarios.getIdUsuarios());
            cst.setString(2, misUsuarios.getNombre());
            cst.setString(3, misUsuarios.getUsuario());
            cst.setString(4, misUsuarios.getClave());
            cst.setString(5, misUsuarios.getPerfil());
            
            cst.executeUpdate();
            
            msg = "Si";
        }catch(Exception ex){
            
            ex.printStackTrace();
            msg = "no"; 
            
        }
        
        return msg;
        
    }
    
    
    public String eliminarUsuarios (DUsuarios misUsuarios){
        
        String msg = null;
        
        try {
            
            CallableStatement cst = cn.prepareCall("{ call sp_eliminar_usuarios(?)}");
            cst.setInt(1, misUsuarios.getIdUsuarios());
            cst.executeUpdate();
            msg = "Si";
        }catch(Exception ex){
            
            ex.printStackTrace();
            msg = "no"; 
            
        }
        
        return msg;
        
    }
}
