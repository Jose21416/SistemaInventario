/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author joset
 */
public class MDIPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MDIPrincipal
     */
    public MDIPrincipal() {
        initComponents();
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
       
        ImageIcon icFacturas = new ImageIcon(getClass().getClassLoader().getResource("Imagenes/Facturas.png"));
        Icon iconoFac = new ImageIcon(icFacturas.getImage().getScaledInstance(65, 65, Image.SCALE_SMOOTH));
        btnFacturas.setIcon(iconoFac);
        
        ImageIcon icRecibos = new ImageIcon(getClass().getClassLoader().getResource("Imagenes/Recibos.png"));
        Icon iconoRec = new ImageIcon(icRecibos.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnRecibos.setIcon(iconoRec);
        
        ImageIcon icAlmacen = new ImageIcon(getClass().getClassLoader().getResource("Imagenes/Almacen.png"));
        Icon iconoAlm = new ImageIcon(icAlmacen.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        btnAlmacen.setIcon(iconoAlm);
        
        ImageIcon mConsultas = new ImageIcon(getClass().getClassLoader().getResource("Imagenes/Busquedas.png"));
        Icon icConsultas = new ImageIcon(mConsultas.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH));
        menuConsultas.setIcon(icConsultas);
        
        ImageIcon imenuDB = new ImageIcon(getClass().getClassLoader().getResource("Imagenes/Almacen.png"));
        Icon icDb = new ImageIcon(imenuDB.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH));
        menuDB.setIcon(icDb);
        
        ImageIcon imHerramientas = new ImageIcon(getClass().getClassLoader().getResource("Imagenes/opciones.png"));
        Icon icHerramientas = new ImageIcon(imHerramientas.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH));
        menuHerramientas.setIcon(icHerramientas);
     
        ImageIcon imItemUs = new ImageIcon(getClass().getClassLoader().getResource("Imagenes/Usuarios.png"));
        Icon icUs = new ImageIcon(imItemUs.getImage().getScaledInstance(26, 26, Image.SCALE_SMOOTH));
        ItemUsuarios.setIcon(icUs);
       
        ImageIcon imInfo = new ImageIcon(getClass().getClassLoader().getResource("Imagenes/info.png"));
        Icon icInfo = new ImageIcon(imInfo.getImage().getScaledInstance(26, 26, Image.SCALE_SMOOTH));
        ItemInfo.setIcon(icInfo);
        
        ImageIcon imLineas = new ImageIcon(getClass().getClassLoader().getResource("Imagenes/iconoLineas.png"));
        Icon icLineas = new ImageIcon(imLineas.getImage().getScaledInstance(26, 26, Image.SCALE_SMOOTH));
        ItemLineas.setIcon(icLineas);
        ItemInfo.setIcon(icInfo);
        
        ImageIcon imProveedores = new ImageIcon(getClass().getClassLoader().getResource("Imagenes/itemProveedores.png"));
        Icon icProveedores = new ImageIcon(imProveedores.getImage().getScaledInstance(26, 26, Image.SCALE_SMOOTH));
        ItemProveedores.setIcon(icProveedores);
        
        ImageIcon imItemDB = new ImageIcon(getClass().getClassLoader().getResource("Imagenes/Restaurar.png"));
        Icon icItemDB = new ImageIcon(imItemDB.getImage().getScaledInstance(26, 26, Image.SCALE_SMOOTH));
        ItemDB.setIcon(icItemDB);
        
        ImageIcon imItemReportes = new ImageIcon(getClass().getClassLoader().getResource("Imagenes/FacturasIcono.png"));
        Icon icReportes = new ImageIcon(imItemReportes.getImage().getScaledInstance(26, 26, Image.SCALE_SMOOTH));
        ItemReportes.setIcon(icReportes);
        
        ImageIcon imDetFac = new ImageIcon(getClass().getClassLoader().getResource("Imagenes/DFacturas.png"));
        Icon icDetFac = new ImageIcon(imDetFac.getImage().getScaledInstance(26, 26, Image.SCALE_SMOOTH));
        ItemDetFact.setIcon(icDetFac);
        
        ImageIcon imDetRec = new ImageIcon(getClass().getClassLoader().getResource("Imagenes/Recibos.png"));
        Icon icDetRec = new ImageIcon(imDetRec.getImage().getScaledInstance(26, 26, Image.SCALE_SMOOTH));
        ItemDRecibos.setIcon(icDetRec);
      
        timer.start();
    }
    
    Timer timer = new Timer(1000, new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        Calendar cal = new GregorianCalendar();
        
        int hh = cal.get(Calendar.HOUR); // Formato de 12 horas
        int mm = cal.get(Calendar.MINUTE);
        int ss = cal.get(Calendar.SECOND);
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        int mes = cal.get(Calendar.MONTH);
        int aa = cal.get(Calendar.YEAR);
        
        // Determinar si es AM o PM
        String ampm = (cal.get(Calendar.AM_PM) == Calendar.AM) ? "AM" : "PM";
        
        // Asegurar que las 12 de medianoche se muestre como "12" en vez de "0"
        if (hh == 0) {
            hh = 12;
        }

        // Actualizar las etiquetas con el formato deseado
        lblHora.setText(hh + ":" + String.format("%02d", mm) + ":" + String.format("%02d", ss) + " " + ampm);
        lblFecha.setText(dia + "/" + (mes + 1) + "/" + aa);
    }
});

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnFacturas = new javax.swing.JButton();
        btnRecibos = new javax.swing.JButton();
        btnAlmacen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        dpnPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuConsultas = new javax.swing.JMenu();
        ItemReportes = new javax.swing.JMenuItem();
        ItemDetFact = new javax.swing.JMenuItem();
        ItemDRecibos = new javax.swing.JMenuItem();
        menuDB = new javax.swing.JMenu();
        ItemDB = new javax.swing.JMenuItem();
        menuHerramientas = new javax.swing.JMenu();
        ItemUsuarios = new javax.swing.JMenuItem();
        ItemInfo = new javax.swing.JMenuItem();
        ItemLineas = new javax.swing.JMenuItem();
        ItemProveedores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        btnFacturas.setText("Facturas");
        btnFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturasActionPerformed(evt);
            }
        });

        btnRecibos.setText("Recibos");
        btnRecibos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecibosActionPerformed(evt);
            }
        });

        btnAlmacen.setText("Almacén");
        btnAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmacenActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario:");

        jLabel2.setText("Hora:");

        jLabel3.setText("Fecha:");

        lblUsuario.setText("jLabel4");

        lblHora.setText("jLabel5");

        lblFecha.setText("jLabel6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlmacen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRecibos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRecibos, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblFecha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dpnPrincipalLayout = new javax.swing.GroupLayout(dpnPrincipal);
        dpnPrincipal.setLayout(dpnPrincipalLayout);
        dpnPrincipalLayout.setHorizontalGroup(
            dpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 777, Short.MAX_VALUE)
        );
        dpnPrincipalLayout.setVerticalGroup(
            dpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        menuConsultas.setText("Consultas");

        ItemReportes.setText("Reportes");
        menuConsultas.add(ItemReportes);

        ItemDetFact.setText("Detalle de facturas");
        ItemDetFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemDetFactActionPerformed(evt);
            }
        });
        menuConsultas.add(ItemDetFact);

        ItemDRecibos.setText("Detalle de recibos");
        menuConsultas.add(ItemDRecibos);

        jMenuBar1.add(menuConsultas);

        menuDB.setText("Base de datos");

        ItemDB.setText("Respaldar / Restaurar");
        menuDB.add(ItemDB);

        jMenuBar1.add(menuDB);

        menuHerramientas.setText("Herramientas");

        ItemUsuarios.setText("Usuarios");
        ItemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemUsuariosActionPerformed(evt);
            }
        });
        menuHerramientas.add(ItemUsuarios);

        ItemInfo.setText("Información");
        menuHerramientas.add(ItemInfo);

        ItemLineas.setText("Líneas");
        ItemLineas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemLineasActionPerformed(evt);
            }
        });
        menuHerramientas.add(ItemLineas);

        ItemProveedores.setText("Proveedores");
        ItemProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemProveedoresActionPerformed(evt);
            }
        });
        menuHerramientas.add(ItemProveedores);

        jMenuBar1.add(menuHerramientas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dpnPrincipal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dpnPrincipal)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenActionPerformed
        // TODO add your handling code here:
        FrmInventario miProducto = new FrmInventario();
        dpnPrincipal.add(miProducto);
        miProducto.show();
    }//GEN-LAST:event_btnAlmacenActionPerformed

    private void btnRecibosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecibosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRecibosActionPerformed

    private void btnFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturasActionPerformed
        FrmFacturas miFactura = new FrmFacturas();
        dpnPrincipal.add(miFactura);
        miFactura.setSize(dpnPrincipal.getSize());
        miFactura.setVisible(true);
    }//GEN-LAST:event_btnFacturasActionPerformed

    private void ItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemUsuariosActionPerformed
        // TODO add your handling code here:
        FrmUsuarios misUsuarios = new FrmUsuarios();
        dpnPrincipal.add(misUsuarios);
        misUsuarios.setSize(dpnPrincipal.getSize());
        misUsuarios.setVisible(true);
    }//GEN-LAST:event_ItemUsuariosActionPerformed

    private void ItemLineasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemLineasActionPerformed
        // Crear instancia de FrmLineas
    FrmLineas misLineas = new FrmLineas();
    dpnPrincipal.add(misLineas); // Agregar al escritorio
    misLineas.setSize(dpnPrincipal.getSize());
    misLineas.setVisible(true);
    try {
        misLineas.setMaximum(true); // Maximizar el JInternalFrame
    } catch (java.beans.PropertyVetoException e) {
        e.printStackTrace();
    }
    
    misLineas.setVisible(true);
    }//GEN-LAST:event_ItemLineasActionPerformed

    private void ItemProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemProveedoresActionPerformed
        // TODO add your handling code here:
        FrmProveedores miProveedor = new FrmProveedores();
        dpnPrincipal.add(miProveedor);
        miProveedor.show();
    }//GEN-LAST:event_ItemProveedoresActionPerformed

    private void ItemDetFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemDetFactActionPerformed
        // TODO add your handling code here:
        FrmDetFacturas miFactura = new FrmDetFacturas();
        dpnPrincipal.add(miFactura);
        miFactura.show();
    }//GEN-LAST:event_ItemDetFactActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDIPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemDB;
    private javax.swing.JMenuItem ItemDRecibos;
    private javax.swing.JMenuItem ItemDetFact;
    private javax.swing.JMenuItem ItemInfo;
    private javax.swing.JMenuItem ItemLineas;
    private javax.swing.JMenuItem ItemProveedores;
    private javax.swing.JMenuItem ItemReportes;
    private javax.swing.JMenuItem ItemUsuarios;
    private javax.swing.JButton btnAlmacen;
    private javax.swing.JButton btnFacturas;
    private javax.swing.JButton btnRecibos;
    private javax.swing.JDesktopPane dpnPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenu menuDB;
    private javax.swing.JMenu menuHerramientas;
    // End of variables declaration//GEN-END:variables
}
