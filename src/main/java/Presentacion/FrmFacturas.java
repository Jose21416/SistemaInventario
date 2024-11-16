/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Presentacion;

import Datos.DAlmacen;
import Datos.DDetalleFacturas;
import Datos.DFactura;
import Logica.LAlmacen;
import Logica.LDetalleFacturas;
import Logica.LFactura;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.DecimalFormat;
import java.util.Calendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joset
 */
public class FrmFacturas extends javax.swing.JInternalFrame {

    DefaultTableModel miModelo;
    static int idlineas = 0;

    public static void setProveedores(String id, String proveedor) {

        txtIdProveedores.setText(id);
        txtProveedor.setText(proveedor);

    }
    
    public static void setLinea(String id, String linea) {

        idlineas = Integer.parseInt(id);
        txtIdLineas.setText(id);
        txtLinea.setText(linea);

    }

    /**
     * Creates new form FrmFacturas
     */
    public FrmFacturas() {
        initComponents();
        habilitar(true);

        ImageIcon imNuevo = new ImageIcon(getClass().getClassLoader().getResource("Imagenes/iconSuma.png"));
        Icon icNuevo = new ImageIcon(imNuevo.getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH));
        btnNuevo.setIcon(icNuevo);

        ImageIcon imGuardar = new ImageIcon(getClass().getClassLoader().getResource("Imagenes/iconGuardar.png"));
        Icon icGuardar = new ImageIcon(imGuardar.getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH));
        btnGuardar.setIcon(icGuardar);

        ImageIcon imCancelar = new ImageIcon(getClass().getClassLoader().getResource("Imagenes/iconCancelar.png"));
        Icon icCancelar = new ImageIcon(imCancelar.getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH));
        btnCancelar.setIcon(icCancelar);

        jLabel1.setVisible(false);
        txtIdFacturas.setVisible(false);
        txtIdLineas.setVisible(false);
        txtIdProveedores.setVisible(false);
        txtTotal.setEditable(false);
        miModelo = (DefaultTableModel) tblFacturas.getModel();

        tblFacturas.getColumn("CÓDIGO").setWidth(15);
        tblFacturas.getColumn("CÓDIGO").setPreferredWidth(15);

        tblFacturas.getColumn("DESCRIPCIÓN").setWidth(220);
        tblFacturas.getColumn("DESCRIPCIÓN").setPreferredWidth(220);

        tblFacturas.getColumn("CANTIDAD").setWidth(20);
        tblFacturas.getColumn("CANTIDAD").setPreferredWidth(20);

        tblFacturas.getColumn("U/MEDIDA").setWidth(20);
        tblFacturas.getColumn("U/MEDIDA").setPreferredWidth(20);

        tblFacturas.getColumn("P/UNITARIO").setWidth(20);
        tblFacturas.getColumn("P/UNITARIO").setPreferredWidth(20);

        tblFacturas.getColumn("TOTAL").setWidth(20);
        tblFacturas.getColumn("TOTAL").setPreferredWidth(20);

        txtIdLineas.setEnabled(false);
        txtIdProveedores.setEnabled(false);
        
    }

    public void habilitar(boolean b) {

        txtEnter.setEnabled(!b);
        txtFecha.setEnabled(!b);
        txtLinea.setEnabled(!b);
        txtProveedor.setEnabled(!b);
        btnCancelar.setEnabled(!b);
        btnGuardar.setEnabled(!b);
        btnBuscarLinea.setEnabled(!b);
        btnBuscarProveedor.setEnabled(!b);
        btnNuevo.setEnabled(b);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdFacturas = new javax.swing.JTextField();
        txtLinea = new javax.swing.JTextField();
        txtProveedor = new javax.swing.JTextField();
        txtFecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFacturas = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnBuscarLinea = new javax.swing.JButton();
        btnBuscarProveedor = new javax.swing.JButton();
        txtIdLineas = new javax.swing.JTextField();
        txtIdProveedores = new javax.swing.JTextField();
        txtEnter = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Facturas"));
        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jLabel1.setText("Id:");

        jLabel2.setText("Línea:");

        jLabel3.setText("Proveedor:");

        jLabel4.setText("Fecha:");

        tblFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "DESCRIPCIÓN", "CANTIDAD", "U/MEDIDA", "P/UNITARIO", "TOTAL"
            }
        ));
        tblFacturas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblFacturasKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblFacturas);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnBuscarLinea.setText("...");
        btnBuscarLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLineaActionPerformed(evt);
            }
        });

        btnBuscarProveedor.setText("...");
        btnBuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProveedorActionPerformed(evt);
            }
        });

        txtEnter.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnterActionPerformed(evt);
            }
        });
        txtEnter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEnterKeyPressed(evt);
            }
        });

        txtTotal.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel5.setText("TOTAL:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIdFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtProveedor)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(txtLinea))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnBuscarProveedor)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtIdProveedores))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnBuscarLinea)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtIdLineas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(txtIdFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(txtLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarLinea)
                    .addComponent(txtIdLineas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProveedor)
                    .addComponent(txtIdProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(txtEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:

        String msg = "", msgfinal = "";

        if (txtLinea.getText().equals("")) {

            JOptionPane.showMessageDialog(rootPane, "Campo linea obligatorio", "Validación", JOptionPane.WARNING_MESSAGE);
            txtLinea.requestFocusInWindow();
            return;
        }

        if (txtProveedor.getText().equals("")) {

            JOptionPane.showMessageDialog(rootPane, "Campo proveedor obligatorio", "Validación", JOptionPane.WARNING_MESSAGE);
            txtProveedor.requestFocusInWindow();
            return;
        }

        if (txtFecha.getDate() == null) {

            JOptionPane.showMessageDialog(rootPane, "Campo fecha obligatorio", "Validación", JOptionPane.WARNING_MESSAGE);
            txtFecha.requestFocusInWindow();
            return;
        }

        LFactura fn = new LFactura();
        DFactura dts = new DFactura();

        dts.setLineasId(Integer.parseInt(txtIdLineas.getText()));
        dts.setProveedoresId(Integer.parseInt(txtIdProveedores.getText()));

        Calendar cal;

        cal = txtFecha.getCalendar();

        int aa, mm, dd;

        aa = cal.get(Calendar.YEAR) - 1900;
        mm = cal.get(Calendar.MONTH);
        dd = cal.get(Calendar.DAY_OF_MONTH);

        dts.setFechaEntrada(new Date(aa, mm, dd));
        txtProveedor.setText("");
        txtLinea.setText("");
        txtLinea.setEnabled(false);
        txtProveedor.setEnabled(false);

        int idfact = fn.insertarFacturas(dts);
        if (idfact>0) {
            
            int filas = tblFacturas.getRowCount();
            for(int i = 0; i < filas; i++){
                    
                String idprod = tblFacturas.getValueAt(i,0).toString();
                String descrip = tblFacturas.getValueAt(i,1).toString();
                int cantidad = Integer.parseInt(tblFacturas.getValueAt(i,2).toString());
                String umedida = tblFacturas.getValueAt(i,3).toString();
                double punitario = Double.parseDouble(tblFacturas.getValueAt(i,4).toString());
                double total = Double.parseDouble(tblFacturas.getValueAt(i,5).toString());
                
                LDetalleFacturas fundf = new LDetalleFacturas();
                DDetalleFacturas dtsf = new DDetalleFacturas();
                dtsf.setFacturasId(idfact);
                dtsf.setProductosId(idprod);
                dtsf.setCantidad(cantidad);
                dtsf.setTotal(total);
                
                String mensaje = fundf.registrarDetalleFactura(dtsf);
                
                if(mensaje.equals("si")){
                    LAlmacen funAl = new LAlmacen();
                    DAlmacen dtsp = new DAlmacen ();
                    
                    dtsp.setIdAlmacen(idprod);
                    dtsp.setDescripcion(descrip);
                    dtsp.setStock(cantidad);
                    dtsp.setUMedida(umedida);
                    dtsp.setPUnitario(punitario);
                    dtsp.setLineasId(idlineas);
                    
                    msgfinal = funAl.insertarProductos(dtsp);
                }
                
            }
        JOptionPane.showMessageDialog(rootPane, msgfinal , "Información", JOptionPane.INFORMATION_MESSAGE);
        txtLinea.setText("");
        idlineas = 0;

        } else {

            JOptionPane.showMessageDialog(rootPane, "Ocurrió un problema al registrar", "Información", JOptionPane.ERROR_MESSAGE);

        }
        habilitar(true);
        limpiar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    public void limpiar(){
        
        txtEnter.setText("");
        txtFecha.setDate(null);
        txtLinea.setText("m");
        txtProveedor.setText("m");
        txtIdFacturas.setText("");
        txtIdLineas.setText("");
        txtIdProveedores.setText("");
        txtTotal.setText("");
        
        try{
            DefaultTableModel modelo = (DefaultTableModel) tblFacturas.getModel();
            int filas = tblFacturas.getRowCount();
            for(int i = 0; filas > i; i++){
                
                modelo.removeRow(0);
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
        
    }
    
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        habilitar(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBuscarLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLineaActionPerformed
        // TODO add your handling code here:
        FrmBuscarLineas mi = new FrmBuscarLineas(new JFrame(), true);
        mi.setLocationRelativeTo(null);
        mi.setVisible(true);
    }//GEN-LAST:event_btnBuscarLineaActionPerformed

    private void btnBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProveedorActionPerformed
        // TODO add your handling code here:
        FrmBuscarProveedores mi = new FrmBuscarProveedores(new JFrame(), true);
        mi.setLocationRelativeTo(null);
        mi.setVisible(true);
    }//GEN-LAST:event_btnBuscarProveedorActionPerformed

    public boolean estaenTabla(String texto) {

        boolean res = false;
        DecimalFormat ft = new DecimalFormat("####.00");
        for (int i = 0; i < tblFacturas.getRowCount(); i++) {

            String codigo = tblFacturas.getValueAt(i, 0).toString();
            if (codigo.equals(texto)) {
                int cantidad = Integer.parseInt(tblFacturas.getValueAt(i, 2).toString());
                double preciounitario = Double.parseDouble(tblFacturas.getValueAt(i, 4).toString());
                int totalcantidad = cantidad + 1;
                tblFacturas.setValueAt(totalcantidad, i, 2);

                double totalparcial = totalcantidad * preciounitario;
                tblFacturas.setValueAt(ft.format(totalparcial), i, 5);
                res = true;
            }

        }
        sumarTotal();
        return res;
    }

    public void sumarTotal() {

        DecimalFormat ft = new DecimalFormat("####.00");
        double totalparcial = 0, totalfinal = 0;
        for (int i = 0; i < tblFacturas.getRowCount(); i++) {

            totalparcial = Double.parseDouble(tblFacturas.getValueAt(i, 5).toString());
            totalfinal += totalparcial;
            txtTotal.setText(ft.format(totalfinal));
        }

    }

    private void txtEnterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnterKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            boolean b = estaenTabla(txtEnter.getText());
            if (b == false) {
                mostrarProductos(txtEnter.getText());
            }
            sumarTotal();
            txtEnter.setText("");
        }
    }//GEN-LAST:event_txtEnterKeyPressed

    private void txtEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnterActionPerformed
/*
    public void limpiarFrmFactura() {
        
        int filas = tblFacturas.getRowCount();
        miModelo = (DefaultTableModel) tblFacturas.getModel();
        
        for (int i = 0; i < filas; i++){
            
            miModelo.removeRow(i);
            
        }
        
        txtIdLineas.setText("");
        txtIdProveedores.setText("");
        txtEnter.setText("");
        txtFecha.setDate(null);
        txtLinea.setText("");
        txtProveedor.setText("");
        txtTotal.setText("");
        idlinea = 0;
        txtIdFacturas.setText("");
        txtLinea.setText("");
        txtProveedor.setText("");
        
    }
*/   
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        habilitar(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tblFacturasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblFacturasKeyPressed
        // TODO add your handling code here:
        DecimalFormat ft = new DecimalFormat("####.00");

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            for (int i = 0; i < tblFacturas.getRowCount(); i++) {
                int cantidad = Integer.parseInt(tblFacturas.getValueAt(i, 2).toString());
                double preciounitario = Double.parseDouble(tblFacturas.getValueAt(i, 4).toString());

                double totalparcial = cantidad * preciounitario;
                tblFacturas.setValueAt(ft.format(totalparcial), i, 5);
            }
            sumarTotal();
        }
    }//GEN-LAST:event_tblFacturasKeyPressed

    public void mostrarProductos(String  producto) {

        LAlmacen fn = new LAlmacen();
        DAlmacen dts = new DAlmacen();
        DefaultTableModel tblDatos = (DefaultTableModel) tblFacturas.getModel();
        dts.setIdAlmacen(producto);
        String registros[] = fn.mostrarbuscarProductos(dts);
        if (registros[0] != null) {

            tblDatos.insertRow(0, registros);
            tblFacturas.setModel(tblDatos);

        } else {

            registros[0] = txtEnter.getText();
            registros[1] = "";
            registros[2] = "1";
            registros[3] = "";
            registros[4] = "0.00";
            registros[5] = "0.00";
            tblDatos.insertRow(0, registros);
            tblFacturas.setModel(tblDatos);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarLinea;
    private javax.swing.JButton btnBuscarProveedor;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFacturas;
    private javax.swing.JTextField txtEnter;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtIdFacturas;
    private static javax.swing.JTextField txtIdLineas;
    private static javax.swing.JTextField txtIdProveedores;
    private static javax.swing.JTextField txtLinea;
    private static javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

}
