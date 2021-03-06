/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import MODELO.CRUD_USUARIO;
import javax.swing.JOptionPane;

/**
 *
 * @author MT JASR
 */
public class REGISTRARSE extends javax.swing.JDialog {

    /**
     * Creates new form REGISTRARSE
     */
    public REGISTRARSE(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        TXT_NOMBRE = new rojerusan.RSMetroTextFullPlaceHolder();
        TXT_CONTRASEÑA = new rojerusan.RSMetroTextPassPlaceHolder();
        BTN_REGISTRAR = new rojeru_san.rsbutton.RSButtonRound();
        TXT_APELLIDO = new rojerusan.RSMetroTextFullPlaceHolder();
        TXT_EMAIL = new rojerusan.RSMetroTextFullPlaceHolder();
        TXT_CON_CONTRASEÑA = new rojerusan.RSMetroTextPassPlaceHolder();
        jLabel2 = new javax.swing.JLabel();
        TXT_USUARIO = new rojerusan.RSMetroTextFullPlaceHolder();
        LBL_LIMPIAR = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        TXT_NOMBRE.setForeground(new java.awt.Color(51, 51, 51));
        TXT_NOMBRE.setBorderColor(new java.awt.Color(204, 204, 204));
        TXT_NOMBRE.setBotonColor(new java.awt.Color(204, 204, 204));
        TXT_NOMBRE.setNextFocusableComponent(TXT_APELLIDO);
        TXT_NOMBRE.setPhColor(new java.awt.Color(102, 102, 102));
        TXT_NOMBRE.setPlaceholder("Nombre");

        TXT_CONTRASEÑA.setForeground(new java.awt.Color(51, 51, 51));
        TXT_CONTRASEÑA.setBorderColor(new java.awt.Color(204, 204, 204));
        TXT_CONTRASEÑA.setBotonColor(new java.awt.Color(204, 204, 204));
        TXT_CONTRASEÑA.setNextFocusableComponent(TXT_CON_CONTRASEÑA);
        TXT_CONTRASEÑA.setPhColor(new java.awt.Color(102, 102, 102));
        TXT_CONTRASEÑA.setPlaceholder("Contraseña");

        BTN_REGISTRAR.setText("Registrate");
        BTN_REGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_REGISTRARActionPerformed(evt);
            }
        });

        TXT_APELLIDO.setForeground(new java.awt.Color(51, 51, 51));
        TXT_APELLIDO.setBorderColor(new java.awt.Color(204, 204, 204));
        TXT_APELLIDO.setBotonColor(new java.awt.Color(204, 204, 204));
        TXT_APELLIDO.setNextFocusableComponent(TXT_EMAIL);
        TXT_APELLIDO.setPhColor(new java.awt.Color(102, 102, 102));
        TXT_APELLIDO.setPlaceholder("Apellido");

        TXT_EMAIL.setForeground(new java.awt.Color(51, 51, 51));
        TXT_EMAIL.setBorderColor(new java.awt.Color(204, 204, 204));
        TXT_EMAIL.setBotonColor(new java.awt.Color(204, 204, 204));
        TXT_EMAIL.setNextFocusableComponent(TXT_USUARIO);
        TXT_EMAIL.setPhColor(new java.awt.Color(102, 102, 102));
        TXT_EMAIL.setPlaceholder("Correo electronico");

        TXT_CON_CONTRASEÑA.setForeground(new java.awt.Color(51, 51, 51));
        TXT_CON_CONTRASEÑA.setBorderColor(new java.awt.Color(204, 204, 204));
        TXT_CON_CONTRASEÑA.setBotonColor(new java.awt.Color(204, 204, 204));
        TXT_CON_CONTRASEÑA.setNextFocusableComponent(BTN_REGISTRAR);
        TXT_CON_CONTRASEÑA.setPhColor(new java.awt.Color(102, 102, 102));
        TXT_CON_CONTRASEÑA.setPlaceholder("Confirme contraseña");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 112, 192));
        jLabel2.setText("Facebook");

        TXT_USUARIO.setForeground(new java.awt.Color(51, 51, 51));
        TXT_USUARIO.setBorderColor(new java.awt.Color(204, 204, 204));
        TXT_USUARIO.setBotonColor(new java.awt.Color(204, 204, 204));
        TXT_USUARIO.setNextFocusableComponent(TXT_CONTRASEÑA);
        TXT_USUARIO.setPhColor(new java.awt.Color(102, 102, 102));
        TXT_USUARIO.setPlaceholder("Usuario");

        LBL_LIMPIAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LBL_LIMPIAR.setForeground(new java.awt.Color(0, 102, 0));
        LBL_LIMPIAR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_LIMPIAR.setText("Limpiar campos");
        LBL_LIMPIAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBL_LIMPIAR.setNextFocusableComponent(LBL_LIMPIAR);
        LBL_LIMPIAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBL_LIMPIARMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBL_LIMPIAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_REGISTRAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TXT_CON_CONTRASEÑA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TXT_EMAIL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TXT_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXT_APELLIDO, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TXT_USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TXT_CONTRASEÑA, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(130, 130, 130))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_APELLIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TXT_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_CONTRASEÑA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXT_CON_CONTRASEÑA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTN_REGISTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LBL_LIMPIAR)
                .addGap(21, 21, 21))
        );

        LBL_LIMPIAR.getAccessibleContext().setAccessibleName("Limpiar");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    CRUD_USUARIO usu = new CRUD_USUARIO();
    private void BTN_REGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_REGISTRARActionPerformed
        if (TXT_CONTRASEÑA.getText().equalsIgnoreCase(TXT_CON_CONTRASEÑA.getText())) {
            usu.CREATE(TXT_NOMBRE.getText(), TXT_APELLIDO.getText(), TXT_EMAIL.getText(), TXT_USUARIO.getText(), TXT_CON_CONTRASEÑA.getText());
           } else {
            JOptionPane.showMessageDialog(null, "Contraseñas incorrectas");
        }
    }//GEN-LAST:event_BTN_REGISTRARActionPerformed

    private void LBL_LIMPIARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBL_LIMPIARMouseClicked
TXT_NOMBRE.setText("");
TXT_APELLIDO.setText("");
TXT_EMAIL.setText("");
TXT_USUARIO.setText("");
TXT_CONTRASEÑA.setText("");
TXT_CON_CONTRASEÑA.setText("");
    }//GEN-LAST:event_LBL_LIMPIARMouseClicked

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
            java.util.logging.Logger.getLogger(REGISTRARSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTRARSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTRARSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTRARSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                REGISTRARSE dialog = new REGISTRARSE(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsbutton.RSButtonRound BTN_REGISTRAR;
    private javax.swing.JLabel LBL_LIMPIAR;
    private rojerusan.RSMetroTextFullPlaceHolder TXT_APELLIDO;
    private rojerusan.RSMetroTextPassPlaceHolder TXT_CONTRASEÑA;
    private rojerusan.RSMetroTextPassPlaceHolder TXT_CON_CONTRASEÑA;
    private rojerusan.RSMetroTextFullPlaceHolder TXT_EMAIL;
    private rojerusan.RSMetroTextFullPlaceHolder TXT_NOMBRE;
    private rojerusan.RSMetroTextFullPlaceHolder TXT_USUARIO;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
