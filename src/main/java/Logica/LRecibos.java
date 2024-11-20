/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Datos.DRecibos;
import Presentacion.FrmRecibos;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Types;
import javax.swing.table.DefaultTableModel;

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
    
    public DefaultTableModel mostrarRecibos() {

        DefaultTableModel miModelo = null;

        try {
            String titulos[] = {"CÓDIGO", "FECHA", "EMISOR", "RECEPTOR"};
            String dts[] = new String[4];
            miModelo = new DefaultTableModel(null, titulos);

            CallableStatement cst = cn.prepareCall("{ call sp_mostrar_recibos()}");
            ResultSet rs = cst.executeQuery();
            while (rs.next()) {

                dts[0] = rs.getString("IdRecibos");
                dts[1] = rs.getString("FechaS");
                dts[2] = rs.getString("PersonaEntrega");
                dts[3] = rs.getString("PersonaRecibe");

                miModelo.addRow(dts);

            }

        } catch (Exception ex) {

            ex.printStackTrace();

        }

        return miModelo;

    }
    
    public DefaultTableModel buscarRecibos(DRecibos miId) {

        DefaultTableModel miModelo = null;

        try {
            String titulos[] = {"CÓDIGO", "FECHA", "EMISOR", "RECEPTOR"};
            String dts[] = new String[4];
            miModelo = new DefaultTableModel(null, titulos);
            CallableStatement cst = cn.prepareCall("{ call sp_buscar_recibos(?)}");
            cst.setInt(1, miId.getIdRecibos());
            ResultSet rs = cst.executeQuery();
            while (rs.next()) {

                dts[0] = rs.getString("IdRecibos");
                dts[1] = rs.getString("FechaS");
                dts[2] = rs.getString("PersonaEntrega");
                dts[3] = rs.getString("PersonaRecibe");

                miModelo.addRow(dts);

            }

        } catch (Exception ex) {

            ex.printStackTrace();

        }

        return miModelo;

    }
    
}
