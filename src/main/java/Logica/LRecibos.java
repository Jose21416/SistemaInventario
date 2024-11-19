/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Datos.DFactura;
import Datos.DRecibos;
import Presentacion.FrmFacturas;
import Presentacion.FrmRecibos;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

/**
 *
 * @author joset
 */
public class LRecibos {
    
    Connection cn = LConexion.getConnection();
    
    public int insertarRecibos(DRecibos misRecibos) {

        int idres = 0;
        FrmRecibos miFrmRecibo = new FrmRecibos();

        try {

            CallableStatement cst = cn.prepareCall("{ call sp_insertar_recibos(?,?,?,?)}");
            cst.setDate(1, misRecibos.getFechaRecibo());
            cst.setString(2, misRecibos.getPersonaEntrega());
            cst.setString(3, misRecibos.getPersonaRecibe());
            cst.registerOutParameter(4, Types.INTEGER);

            cst.executeUpdate();
            idres = cst.getInt(4);
       
        } catch (Exception ex) {

            ex.printStackTrace();
            idres = 0;

        }

        return idres;

    }
    
}
