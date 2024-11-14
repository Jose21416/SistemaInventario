/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Datos.DAlmacen;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joset
 */
public class LAlmacen {
 
    Connection cn = LConexion.getConnection();
    
    public DefaultTableModel mostrarInventario(DAlmacen miProducto) {
    
        DefaultTableModel miModelo = null;
        
        try{
            String titulos [] = {"CÓDIGO", "DESCRIPCIÓN","STOCK","U/MEDIDA","P/UNITARIO","TOTAL","LÍNEA"};
            String dts [] = new String [7];
            miModelo = new DefaultTableModel(null, titulos);
            
            CallableStatement cst = cn.prepareCall("{ call sp_mostrar_inventario(?)}");
            cst.setString(1, miProducto.getIdAlmacen());
            ResultSet rs = cst.executeQuery();
            while (rs.next()) {
            
                dts [0] = rs.getString("a.IdAlmacen");
                dts [1] = rs.getString("a.Descripcion");
                dts [2] = rs.getString("a.Stock");
                dts [3] = rs.getString("a.UMedida");
                dts [4] = rs.getString("a.PUnitario");
                dts [5] = rs.getString("Total");
                dts [6] = rs.getString("l.Nombre");
    
                miModelo.addRow(dts);
                
            }
            
        }catch(Exception ex){
        
            ex.printStackTrace();
            
        }
        
        
        return miModelo;
        
    }
    
    public String[] mostrarbuscarProductos (DAlmacen misproductos){
        
        String dts [] = null;
        
        try {
            
            dts = new String [6];
            CallableStatement cst = cn.prepareCall("{ call sp_mostrarbuscar_Productos(?)}");
            cst.setString(1, misproductos.getIdAlmacen());
            
            ResultSet rs = cst.executeQuery();
            while (rs.next()) {
            
                dts [0] = rs.getString("IdAlmacen");
                dts [1] = rs.getString("Descripcion");
                dts [2] = "1";
                dts [3] = rs.getString("UMedida");
                dts [4] = rs.getString("PUnitario");
                dts [5] = rs.getString("PUnitario");
    
            }
        }catch(Exception ex){
            
            ex.printStackTrace();
            
        }
        
        return dts;
        
    }
    
}
