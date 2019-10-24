/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Image;
import java.io.File;
import javafx.scene.paint.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import rocola.Datos;

/**
 *
 * @author Dani
 */
public class Perfil extends javax.swing.JFrame {

    /**
     * Creates new form Perfil
     */
    public Perfil() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jlFoto = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlCorreo = new javax.swing.JLabel();
        jlTelefono = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Perfil");
        setBackground(new java.awt.Color(255, 255, 255));

        jlFoto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuarios.png"))); // NOI18N
        jlFoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jlFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlFotoMouseClicked(evt);
            }
        });

        jlNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlNombreMouseClicked(evt);
            }
        });

        jlCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCorreo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlTelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlTelefonoMouseClicked(evt);
            }
        });

        jLabel1.setText("Correo Electronico");

        jLabel3.setText("Telefono");

        btnCerrarSesion.setBackground(new java.awt.Color(204, 204, 204));
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jlFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(jlNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnCerrarSesion)
                .addGap(33, 33, 33))
        );

        jlNombre.getAccessibleContext().setAccessibleName("jlNombre");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlFotoMouseClicked
        // TODO add your handling code here:
        //Datos datos = new Datos("","","","","","",0);
        //datos.seleccionarFoto(); 
     
        int resultado;
        File fichero;
        Carga ven = new Carga();
        Perfil per = new Perfil();
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNGP","jpg","png");
        ven.jfcCarga.setFileFilter(filtro);
        resultado = ven.jfcCarga.showOpenDialog(null);
        if(JFileChooser.APPROVE_OPTION == resultado){
            fichero = ven.jfcCarga.getSelectedFile();
            try{
                 ImageIcon imagen = new ImageIcon(fichero.toString());
                 Icon icono = new ImageIcon (imagen.getImage().getScaledInstance(jlFoto.getWidth(),jlFoto.getHeight(), Image.SCALE_DEFAULT));
                 jlFoto.setText(null);
                 jlFoto.setIcon(icono);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "error al cargar la imagen" + e);
            }
        }
        
        
        
    }//GEN-LAST:event_jlFotoMouseClicked

    private void jlNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlNombreMouseClicked
        // TODO add your handling code here:
        Editar_Nombre nombreEditar = new Editar_Nombre();
        nombreEditar.setVisible(true);
    }//GEN-LAST:event_jlNombreMouseClicked

    private void jlTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlTelefonoMouseClicked
        // TODO add your handling code here:
        Editar_Telefono ediTel = new Editar_Telefono();
        ediTel.setVisible(true);
    }//GEN-LAST:event_jlTelefonoMouseClicked

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
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlCorreo;
    public javax.swing.JLabel jlFoto;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlTelefono;
    // End of variables declaration//GEN-END:variables
}
