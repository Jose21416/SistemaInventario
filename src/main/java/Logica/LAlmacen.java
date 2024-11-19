/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Datos.DAlmacen;
import Datos.DLineas;
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
    
    public String[] mostrarbuscarProductosRec (DAlmacen misproductos){
        
        String dts [] = null;
        
        try {
            
            dts = new String [8];
            CallableStatement cst = cn.prepareCall("{ call sp_mostrar_productosrecibos(?)}");
            cst.setString(1, misproductos.getIdAlmacen());
            
            ResultSet rs = cst.executeQuery();
            while (rs.next()) {
            
                dts [0] = rs.getString("a.IdAlmacen");
                dts [1] = rs.getString("a.Descripcion");
                dts [2] = "1";
                dts [3] = rs.getString("a.PUnitario");
                dts [4] = rs.getString("a.UMedida");
                dts [5] = rs.getString("l.Nombre");
                dts [6] = rs.getString("a.PUnitario");
                dts [7] = rs.getString("l.IdLineas");
    
            }
        }catch(Exception ex){
            
            ex.printStackTrace();
            
        }
        
        return dts;
        
    }
    
    public String insertarProductos (DAlmacen misProductos){
        
        String msg = null;
        
        try {
            
            CallableStatement cst = cn.prepareCall("{ call sp_insertar_productos(?,?,?,?,?,?)}");
            
            cst.setString(1, misProductos.getIdAlmacen());
            cst.setInt(2, misProductos.getLineasId());
            cst.setString(3, misProductos.getDescripcion());
            cst.setInt(4, misProductos.getStock());
            cst.setDouble(5, misProductos.getPUnitario());
            cst.setString(6, misProductos.getUMedida());
            
            cst.executeUpdate();
            
            msg = "Se registró de forma correcta";
        }catch(Exception ex){
            
            ex.printStackTrace();
            
        }
        
        return msg;
        
    }
    
    public String disminuirStock (DAlmacen misProductos){
        
        String msg = null;
        
        try {
            
            CallableStatement cst = cn.prepareCall("{ call sp_disminuir_stock(?,?)}");
            
            cst.setString(1, misProductos.getIdAlmacen());
            cst.setInt(2, misProductos.getStock());
            
            cst.executeUpdate();
            
            msg = "Se registró de forma correcta";
        }catch(Exception ex){
            
            ex.printStackTrace();
            msg = "Ocurrió un problema";
            
        }
        
        return msg;
        
    }
    
}
