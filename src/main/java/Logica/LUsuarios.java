/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Datos.DUsuarios;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joset
 */
public class LUsuarios {

    Connection cn = LConexion.getConnection();

    public DefaultTableModel mostrarUsuarios(DUsuarios misUsuarios) {

        DefaultTableModel miModelo = null;

        try {
            String titulos[] = {"Id", "Nombre", "Usuario", "Clave", "Perfil"};
            String dts[] = new String[5];
            miModelo = new DefaultTableModel(null, titulos);

            CallableStatement cst = cn.prepareCall("{ call sp_mostrarbuscar_usuarios(?)}");
            cst.setString(1, misUsuarios.getUsuario());
            ResultSet rs = cst.executeQuery();
            while (rs.next()) {

                dts[0] = rs.getString("IdUsuarios");
                dts[1] = rs.getString("Nombre");
                dts[2] = rs.getString("Usuario");
                dts[3] = "*****";
                dts[4] = rs.getString("Perfil");

                miModelo.addRow(dts);

            }

        } catch (Exception ex) {

            ex.printStackTrace();

        }

        return miModelo;

    }

    public String insertarUsuarios(DUsuarios misUsuarios) {

        String msg = null;

        try {

            CallableStatement cst = cn.prepareCall("{ call sp_insertar_usuarios(?,?,?,?)}");
            cst.setString(1, misUsuarios.getNombre());
            cst.setString(2, misUsuarios.getUsuario());
            cst.setString(3, misUsuarios.getClave());
            cst.setString(4, misUsuarios.getPerfil());

            cst.executeUpdate();

            msg = "Se registró de forma correcta";
        } catch (Exception ex) {

            ex.printStackTrace();

        }

        return msg;

    }

    public String editarUsuarios(DUsuarios misUsuarios) {

        String msg = null;

        try {

            CallableStatement cst = cn.prepareCall("{ call sp_editar_usuarios(?,?,?,?,?)}");
            cst.setInt(1, misUsuarios.getIdUsuarios());
            cst.setString(2, misUsuarios.getNombre());
            cst.setString(3, misUsuarios.getUsuario());
            cst.setString(4, misUsuarios.getClave());
            cst.setString(5, misUsuarios.getPerfil());

            cst.executeUpdate();

            msg = "Se actualizó de forma correcta";
        } catch (Exception ex) {

            ex.printStackTrace();

        }

        return msg;

    }

    public String eliminarUsuarios(DUsuarios misUsuarios) {

        String msg = null;

        try {

            CallableStatement cst = cn.prepareCall("{ call sp_eliminar_usuarios(?)}");
            cst.setInt(1, misUsuarios.getIdUsuarios());
            cst.executeUpdate();
            msg = "Se eliminó de forma correcta";
        } catch (Exception ex) {

            ex.printStackTrace();

        }

        return msg;

    }

    public String ValidarLogin(DUsuarios misUsuarios) {
    String perfil = "";

    try {
        // Preparar la llamada al procedimiento almacenado
        CallableStatement cst = cn.prepareCall("{ call sp_validarusuario (?, ?) }");
        cst.setString(1, misUsuarios.getUsuario());
        cst.setString(2, misUsuarios.getClave());
        ResultSet rs = cst.executeQuery();

        // Verificar si hay resultados usando rs.next()
        if (rs.next()) {
            perfil = rs.getString("Perfil");
        }

        // Cerrar ResultSet y CallableStatement
        rs.close();
        cst.close();

    } catch (Exception ex) {
        ex.printStackTrace();
    }

    return perfil;
}
    
    public boolean verificarUsuarioExistente(String usuario) {
    // Lógica para verificar si el usuario ya existe en la base de datos
    String sql = "SELECT COUNT(*) FROM usuarios WHERE usuario = ?";
    try {
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setString(1, usuario); // Establecer el nombre del usuario a buscar
        ResultSet rs = pst.executeQuery();
        if (rs.next() && rs.getInt(1) > 0) {
            // Si el resultado es mayor a 0, el usuario ya existe
            return true;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false; // Si no existe, devolver false
}


}
