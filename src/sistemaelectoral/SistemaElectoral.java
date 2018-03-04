package sistemaelectoral;

import hondureno.Hondureno;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class SistemaElectoral extends javax.swing.JFrame {

    public SistemaElectoral() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_login = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jt_user = new javax.swing.JTextField();
        jt_pwd = new javax.swing.JPasswordField();
        cb_perfil = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jb_login = new javax.swing.JButton();
        jd_usuarios = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        cb_depto = new javax.swing.JComboBox<>();
        cb_ciudad = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        bt_sexo = new javax.swing.ButtonGroup();
        jd_admin = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jd_magister = new javax.swing.JDialog();
        jd_votante = new javax.swing.JDialog();
        jd_mesa = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jp_menu = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_archivo = new javax.swing.JMenu();
        jmi_login = new javax.swing.JMenuItem();
        jmi_logout = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmi_salir = new javax.swing.JMenuItem();
        jm_info = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        jd_login.setTitle("Ingreso al Sistema Electoral");

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        jt_pwd.setText("jPasswordField1");

        cb_perfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija una opción...", "Administradores", "Magistrados", "Miembro de Mesa Electoral", "Votante" }));

        jLabel3.setText("Perfil:");

        jb_login.setText("Ingresar");

        javax.swing.GroupLayout jd_loginLayout = new javax.swing.GroupLayout(jd_login.getContentPane());
        jd_login.getContentPane().setLayout(jd_loginLayout);
        jd_loginLayout.setHorizontalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jb_login)
                        .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jt_user)
                            .addComponent(jt_pwd, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)))
                    .addComponent(cb_perfil, 0, 1, Short.MAX_VALUE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jd_loginLayout.setVerticalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jt_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jb_login)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jd_usuarios.setTitle("Usuarios");
        jd_usuarios.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("N. Identidad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, -1, -1));

        jLabel5.setText("Nombre:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 54, -1, -1));

        jLabel6.setText("Fecha de Nacimiento:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 129, -1, -1));

        jLabel7.setText("Lugar de Nacimiento:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 167, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 17, 198, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 49, 287, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 125, 150, -1));

        cb_depto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Departamento", "Atlántida", "Choluteca", "Colón", "Comayagua", "Copán", "Cortés", "El Paraíso", "Francisco Morazán", "Gracias a Dios", "Intibucá", "Islas de la Bahía", "La Paz", "Lempira", "Ocotepeque", "Olancho", "Santa Bárbara", "Valle", "Yoro" }));
        cb_depto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_deptoItemStateChanged(evt);
            }
        });
        jPanel1.add(cb_depto, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 163, -1, -1));

        cb_ciudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ciudad" }));
        jPanel1.add(cb_ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 163, -1, -1));

        jLabel8.setText("Sexo:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 22, -1, -1));

        bt_sexo.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("M");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 18, -1, -1));

        bt_sexo.add(jRadioButton2);
        jRadioButton2.setText("F");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 18, -1, -1));

        jLabel9.setText("Dirección:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 208, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 208, 285, -1));

        jButton1.setText("Guardar");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 304, -1, -1));

        jLabel10.setText("Usuario:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 92, -1, -1));

        jLabel11.setText("Contraseña:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 87, 150, -1));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 150, -1));

        jTabbedPane1.addTab("Nuevo", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Modificar", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Eliminar", jPanel3);

        jd_usuarios.getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        jd_admin.setTitle("Administradores");

        jButton2.setText("Papeletas");

        jButton3.setText("Mesas");

        jButton4.setText("Magistrados");

        jButton5.setText("Miembros de mesa");

        jButton6.setText("Electores");

        jButton7.setText("Reportes");

        jButton8.setText("Administradores");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7)
                            .addComponent(jButton4)
                            .addComponent(jButton3)
                            .addComponent(jButton5)
                            .addComponent(jButton6))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(jButton8)
                        .addGap(79, 79, 79))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_adminLayout = new javax.swing.GroupLayout(jd_admin.getContentPane());
        jd_admin.getContentPane().setLayout(jd_adminLayout);
        jd_adminLayout.setHorizontalGroup(
            jd_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_adminLayout.createSequentialGroup()
                .addGap(0, 49, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jd_adminLayout.setVerticalGroup(
            jd_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jd_magister.setTitle("Magistrados");

        javax.swing.GroupLayout jd_magisterLayout = new javax.swing.GroupLayout(jd_magister.getContentPane());
        jd_magister.getContentPane().setLayout(jd_magisterLayout);
        jd_magisterLayout.setHorizontalGroup(
            jd_magisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_magisterLayout.setVerticalGroup(
            jd_magisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jd_votante.setTitle("Votante");

        javax.swing.GroupLayout jd_votanteLayout = new javax.swing.GroupLayout(jd_votante.getContentPane());
        jd_votante.getContentPane().setLayout(jd_votanteLayout);
        jd_votanteLayout.setHorizontalGroup(
            jd_votanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_votanteLayout.setVerticalGroup(
            jd_votanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jd_mesa.setTitle("Miembro de Mesa");

        jLabel12.setText("Aperturar Mesa");

        javax.swing.GroupLayout jd_mesaLayout = new javax.swing.GroupLayout(jd_mesa.getContentPane());
        jd_mesa.getContentPane().setLayout(jd_mesaLayout);
        jd_mesaLayout.setHorizontalGroup(
            jd_mesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_mesaLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel12)
                .addContainerGap(446, Short.MAX_VALUE))
        );
        jd_mesaLayout.setVerticalGroup(
            jd_mesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_mesaLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel12)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Electoral 0.01");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setText("jLabel13");

        javax.swing.GroupLayout jp_menuLayout = new javax.swing.GroupLayout(jp_menu);
        jp_menu.setLayout(jp_menuLayout);
        jp_menuLayout.setHorizontalGroup(
            jp_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_menuLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel13)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jp_menuLayout.setVerticalGroup(
            jp_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_menuLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel13)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        jPanel5.add(jp_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 270, 220));

        jButton9.setText("jButton9");
        jPanel5.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        jLabel16.setText("jLabel16");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg_hn_900x529.png"))); // NOI18N
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 540));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 550));

        jm_archivo.setText("Archivo");

        jmi_login.setText("Log In");
        jmi_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_loginActionPerformed(evt);
            }
        });
        jm_archivo.add(jmi_login);

        jmi_logout.setText("Log Out");
        jmi_logout.setEnabled(false);
        jm_archivo.add(jmi_logout);
        jm_archivo.add(jSeparator1);

        jmi_salir.setText("Salir");
        jmi_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_salirActionPerformed(evt);
            }
        });
        jm_archivo.add(jmi_salir);

        jMenuBar1.add(jm_archivo);

        jm_info.setText("Info");

        jMenuItem4.setText("Acerca de...");
        jm_info.add(jMenuItem4);

        jMenuBar1.add(jm_info);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_loginActionPerformed
        jd_login.setModal(true);
        jd_login.pack();
        jd_login.setVisible(true);
        jd_usuarios.setVisible(true);
    }//GEN-LAST:event_jmi_loginActionPerformed

    private void cb_deptoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_deptoItemStateChanged
        
        if (cb_depto.getSelectedIndex()==0){
            cb_ciudad.setSelectedIndex(0);
        }
        
        if (cb_depto.getSelectedItem().equals("Comayagua")){
            
            cb_ciudad.setModel(comayagua);
            
        } else if (cb_depto.getSelectedItem().equals("Atlántida")){
            //cb_ciudad.setEnabled(true);
            cb_ciudad.setModel(atlantida);
        }
    }//GEN-LAST:event_cb_deptoItemStateChanged

    private void jmi_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_salirActionPerformed
        int exit = JOptionPane.showConfirmDialog(
                this, "¿Está seguro que desea salir del sistema?",
                "Terminar Aplicación",JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        
        if (exit==JOptionPane.YES_OPTION){
        System.exit(0);}
        
    }//GEN-LAST:event_jmi_salirActionPerformed

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
            java.util.logging.Logger.getLogger(SistemaElectoral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaElectoral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaElectoral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaElectoral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaElectoral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bt_sexo;
    private javax.swing.JComboBox<String> cb_ciudad;
    private javax.swing.JComboBox<String> cb_depto;
    private javax.swing.JComboBox<String> cb_perfil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton jb_login;
    private javax.swing.JDialog jd_admin;
    private javax.swing.JDialog jd_login;
    private javax.swing.JDialog jd_magister;
    private javax.swing.JDialog jd_mesa;
    private javax.swing.JDialog jd_usuarios;
    private javax.swing.JDialog jd_votante;
    private javax.swing.JMenu jm_archivo;
    private javax.swing.JMenu jm_info;
    private javax.swing.JMenuItem jmi_login;
    private javax.swing.JMenuItem jmi_logout;
    private javax.swing.JMenuItem jmi_salir;
    private javax.swing.JPanel jp_menu;
    private javax.swing.JPasswordField jt_pwd;
    private javax.swing.JTextField jt_user;
    // End of variables declaration//GEN-END:variables

    ArrayList<Hondureno> usuarios = new ArrayList();
    
    final DefaultComboBoxModel atlantida
            = new DefaultComboBoxModel(new String[]{
        "Arizona", "El Porvenir", "Esparta", "Jutiapa", "La Ceiba",
        "La Masica", "San Francisco", "Tela"});
    
    final DefaultComboBoxModel choluteca
            = new DefaultComboBoxModel(new String[]{
        "Apacilagua", "Choluteca", "Concepción de María", "Duyure",
        "El Corpus", "El Triunfo", "Marcovia", "Morolica", "Namasigue",
        "Orocuina", "Pespire", "San Antonio de Flores", "San Isidro",
        "San José", "San Marcos de Colón", "Santa Ana de Yusguare"});
    
    final DefaultComboBoxModel colon
            = new DefaultComboBoxModel(new String[]{
        "Balfate", "Bonito Oriental", "Iriona", "Limón", "Sabá",
        "Santa Fé", "Santa Rosa de Aguán", "Sonaguera", "Tocoa",
        "Trujillo"});
    
    final DefaultComboBoxModel comayagua
            = new DefaultComboBoxModel(new String[]{
        "Ajuterique", "Comayagua", "El Rosario", "Esquías", "Humuya",
        "La Libertad", "Lamaní", "Las Lajas", "La Trinidad",
        "Lejamaní", "Meámbar", "Minas de Oro", "Ojos de Agua", "San Jerónimo", "San José de Comayagua",
        "San José del Potrero", "San Luis", "San Sebastián", "Siguatepeque",
        "Taulabé","Villa de San Antonio"});

}
