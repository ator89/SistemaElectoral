package sistemaelectoral;

import hondureno.Hondureno;
import hondureno.MiembroMesa;
import hondureno.Usuario;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class SistemaElectoral extends javax.swing.JFrame {

    public SistemaElectoral() {
        initComponents();
        setLocationRelativeTo(this);
        jp_menu.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_login = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_user = new javax.swing.JTextField();
        tf_pwd = new javax.swing.JPasswordField();
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
        jLabel30 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        bt_sexo = new javax.swing.ButtonGroup();
        jd_adminOptions = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        bt_mesasAdmin = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        bt_mmesa = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jd_magister = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jd_votante = new javax.swing.JDialog();
        jLabel23 = new javax.swing.JLabel();
        jd_adminMesa = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jd_miembros = new javax.swing.JDialog();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        tf_userMM = new javax.swing.JTextField();
        tf_passMM = new javax.swing.JPasswordField();
        jLabel40 = new javax.swing.JLabel();
        cb_cargo = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel34 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jTextField11 = new javax.swing.JTextField();
        cb_cargo1 = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jd_mesas = new javax.swing.JDialog();
        jPanel11 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton5 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jp_menu = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
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

        jb_login.setText("Ingresar");
        jb_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_loginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_loginLayout = new javax.swing.GroupLayout(jd_login.getContentPane());
        jd_login.getContentPane().setLayout(jd_loginLayout);
        jd_loginLayout.setHorizontalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb_login)
                    .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tf_user)
                        .addComponent(tf_pwd, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jd_loginLayout.setVerticalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jb_login)
                .addContainerGap(32, Short.MAX_VALUE))
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
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 17, 150, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 180, -1));
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
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        bt_sexo.add(jRadioButton1);
        jRadioButton1.setText("M");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        bt_sexo.add(jRadioButton2);
        jRadioButton2.setText("F");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

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

        jLabel30.setText("Tipo de Usuario:");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Magistrado", "Administrador", "Elector", "Mimbro de Mesa" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        jLabel31.setText("Apellido");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, 20));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 150, -1));

        jTabbedPane1.addTab("Nuevo", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Modificar", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Eliminar", jPanel3);

        jd_usuarios.getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 660, 410));

        jd_adminOptions.setTitle("Administradores");

        jButton2.setText("Papeletas");

        bt_mesasAdmin.setText("Mesas");
        bt_mesasAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_mesasAdminMouseClicked(evt);
            }
        });

        jButton4.setText("Magistrados");

        bt_mmesa.setText("Miembros de mesa");
        bt_mmesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_mmesaMouseClicked(evt);
            }
        });

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
                            .addComponent(bt_mesasAdmin)
                            .addComponent(bt_mmesa)
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
                .addComponent(bt_mesasAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_mmesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_adminOptionsLayout = new javax.swing.GroupLayout(jd_adminOptions.getContentPane());
        jd_adminOptions.getContentPane().setLayout(jd_adminOptionsLayout);
        jd_adminOptionsLayout.setHorizontalGroup(
            jd_adminOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_adminOptionsLayout.createSequentialGroup()
                .addGap(0, 49, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jd_adminOptionsLayout.setVerticalGroup(
            jd_adminOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jd_magister.setTitle("Magistrados");

        jLabel14.setText("Resultados Finales");

        jLabel17.setText("Municipio");

        jLabel18.setText("Departamento");

        jLabel19.setText("Mesa");

        jLabel20.setText("Candidatos");

        jLabel21.setText("Anular Actas");

        jLabel22.setText("Estadísticas");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_magisterLayout = new javax.swing.GroupLayout(jd_magister.getContentPane());
        jd_magister.getContentPane().setLayout(jd_magisterLayout);
        jd_magisterLayout.setHorizontalGroup(
            jd_magisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_magisterLayout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jd_magisterLayout.setVerticalGroup(
            jd_magisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_magisterLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jd_votante.setTitle("Votante");

        jLabel23.setText("Número de mesa");

        javax.swing.GroupLayout jd_votanteLayout = new javax.swing.GroupLayout(jd_votante.getContentPane());
        jd_votante.getContentPane().setLayout(jd_votanteLayout);
        jd_votanteLayout.setHorizontalGroup(
            jd_votanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_votanteLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel23)
                .addContainerGap(237, Short.MAX_VALUE))
        );
        jd_votanteLayout.setVerticalGroup(
            jd_votanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_votanteLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel23)
                .addContainerGap(231, Short.MAX_VALUE))
        );

        jd_adminMesa.setTitle("Miembro de Mesa");

        jLabel12.setText("Aperturar Mesa");

        jLabel24.setText("Cerrar Mesa");

        jLabel25.setText("Habilitar Votante");

        jLabel26.setText("Personas que han votado");

        jLabel27.setText("Reporte de mesas");

        jLabel28.setText("Generar acta e imprimir");

        jLabel29.setText("Ver ubicación de mesa");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28)
                    .addComponent(jLabel12)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27))
                .addContainerGap(267, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel12)
                .addGap(42, 42, 42)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_adminMesaLayout = new javax.swing.GroupLayout(jd_adminMesa.getContentPane());
        jd_adminMesa.getContentPane().setLayout(jd_adminMesaLayout);
        jd_adminMesaLayout.setHorizontalGroup(
            jd_adminMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_adminMesaLayout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jd_adminMesaLayout.setVerticalGroup(
            jd_adminMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_adminMesaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jd_miembros.setTitle("Miembros de Mesa");
        jd_miembros.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setText("Nombre:");
        jPanel8.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 54, -1, -1));
        jPanel8.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 150, -1));

        jButton10.setText("Guardar");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        jPanel8.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        jLabel38.setText("Usuario:");
        jPanel8.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 92, -1, -1));

        jLabel39.setText("Contraseña:");
        jPanel8.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));
        jPanel8.add(tf_userMM, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 87, 150, -1));
        jPanel8.add(tf_passMM, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 150, -1));

        jLabel40.setText("Cargo:");
        jPanel8.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 136, -1, 20));

        cb_cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Presidente", "Secretario", "Vocal" }));
        jPanel8.add(cb_cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel41.setText("Apellido:");
        jPanel8.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, 20));
        jPanel8.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 150, -1));

        jTabbedPane2.addTab("Nuevo", jPanel8);

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jPanel9.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 104, 165));

        jLabel34.setText("Nombre:");
        jPanel9.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 54, -1, -1));
        jPanel9.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 150, -1));

        jLabel42.setText("Usuario:");
        jPanel9.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 92, -1, -1));
        jPanel9.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 150, -1));
        jPanel9.add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 150, -1));
        jPanel9.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 150, -1));

        cb_cargo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Presidente", "Secretario", "Vocal" }));
        jPanel9.add(cb_cargo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel43.setText("Cargo:");
        jPanel9.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 136, -1, 20));

        jTabbedPane2.addTab("Modificar", jPanel9);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Eliminar", jPanel10);

        jd_miembros.getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, 320));

        jLabel35.setText("Código de Mesa:");

        jLabel36.setText("Ubicación:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(325, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel36)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Agregar", jPanel12);

        jLabel3.setText("Código Mesa:");

        jLabel32.setText("Ubicación:");

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList2);

        jButton5.setText("Editar");

        jButton12.setText("Guardar");

        jButton13.setText("Eliminar");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel32)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton12)
                            .addComponent(jButton13))
                        .addGap(61, 61, 61))))
        );

        jTabbedPane3.addTab("Modificar", jPanel13);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jd_mesasLayout = new javax.swing.GroupLayout(jd_mesas.getContentPane());
        jd_mesas.getContentPane().setLayout(jd_mesasLayout);
        jd_mesasLayout.setHorizontalGroup(
            jd_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_mesasLayout.setVerticalGroup(
            jd_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Electoral 0.01");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setText("Administrar Sistema");

        jButton11.setText("Entrar");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_menuLayout = new javax.swing.GroupLayout(jp_menu);
        jp_menu.setLayout(jp_menuLayout);
        jp_menuLayout.setHorizontalGroup(
            jp_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_menuLayout.createSequentialGroup()
                .addGroup(jp_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_menuLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel13))
                    .addGroup(jp_menuLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButton11)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jp_menuLayout.setVerticalGroup(
            jp_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_menuLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton11)
                .addContainerGap(111, Short.MAX_VALUE))
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
        jmi_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_logoutActionPerformed(evt);
            }
        });
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
        jd_login.setLocationRelativeTo(this);
        jd_login.setVisible(true);
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

    private void jb_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_loginMouseClicked
        
        login();
        
    }//GEN-LAST:event_jb_loginMouseClicked

    private void jmi_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_logoutActionPerformed
        
        logout();
        
    }//GEN-LAST:event_jmi_logoutActionPerformed

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        
        //Opciones de aministradores
        jd_adminOptions.setModal(true);
        jd_adminOptions.pack();
        jd_adminOptions.setLocationRelativeTo(this);
        jd_adminOptions.setVisible(true);
        
    }//GEN-LAST:event_jButton11MouseClicked

    private void bt_mmesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_mmesaMouseClicked
        
        //mostrar ventana de administración de miembros mesa
        jd_miembros.setModal(true);
        jd_miembros.pack();
        jd_miembros.setLocationRelativeTo(this);
        jd_miembros.setVisible(true);
        
        
        
    }//GEN-LAST:event_bt_mmesaMouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
    
        //Agregar miembros de mesa
        try{
        agregarMiembro();
        }catch(Exception e){
            JOptionPane.showMessageDialog(jd_miembros, "Ocurrió un error y no se guardó la información, intente de nuevo.");
        }
    }//GEN-LAST:event_jButton10MouseClicked

    private void bt_mesasAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_mesasAdminMouseClicked
        
        //administrar mesas
        jd_mesas.setModal(true);
        jd_mesas.pack();
        jd_mesas.setLocationRelativeTo(jd_adminOptions);
        jd_mesas.setVisible(true);
    }//GEN-LAST:event_bt_mesasAdminMouseClicked

    public void login(){
        if (tf_user.getText().equals(user)&&tf_pwd.getText().equals(pwd)){
            jp_menu.setVisible(true);
            jmi_logout.setEnabled(true);
            jmi_login.setEnabled(false);
            jd_login.setVisible(false);
            
            tf_user.setText("");
            tf_pwd.setText("");
            
        }else{
            JOptionPane.showMessageDialog(jd_login, "¡Usuario/Contraseña incorrecta!");
            tf_user.setText("");
            tf_pwd.setText("");
        }
    }
    
    public void logout(){
        
        int exit = JOptionPane.showConfirmDialog(
                this, "¿Está seguro que terminar la sesión de usuario?",
                "Log Out",JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        
        if (exit==JOptionPane.YES_OPTION){
            
            jp_menu.setVisible(false);
            jmi_logout.setEnabled(false);
            jmi_login.setEnabled(true);
            
        }
    }
    
    public void agregarAdmin(){
        
        
        
    }
    
    public void agregarMagistrado(){
        
    }
    
    public void agregarMiembro(){
        
        String nombre, apellido, pwd, usuario;
        String cargo;
        
        usuario = tf_userMM.getText();
        pwd = tf_passMM.getText();
        cargo = cb_cargo.getSelectedItem().toString();
        
        usuarios.add(new MiembroMesa(usuario, pwd, cargo));
        
        
        tf_userMM.setText("");
        tf_passMM.setText("");
        cb_cargo.setSelectedIndex(0);
        JOptionPane.showMessageDialog(jd_miembros, "Miembro de mesa agregado satisfactoriamente");
        
                
        
    }
    
    public void agregarElector(){
        
    }
    
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
    private javax.swing.JButton bt_mesasAdmin;
    private javax.swing.JButton bt_mmesa;
    private javax.swing.ButtonGroup bt_sexo;
    private javax.swing.JComboBox<String> cb_cargo;
    private javax.swing.JComboBox<String> cb_cargo1;
    private javax.swing.JComboBox<String> cb_ciudad;
    private javax.swing.JComboBox<String> cb_depto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton jb_login;
    private javax.swing.JDialog jd_adminMesa;
    private javax.swing.JDialog jd_adminOptions;
    private javax.swing.JDialog jd_login;
    private javax.swing.JDialog jd_magister;
    private javax.swing.JDialog jd_mesas;
    private javax.swing.JDialog jd_miembros;
    private javax.swing.JDialog jd_usuarios;
    private javax.swing.JDialog jd_votante;
    private javax.swing.JMenu jm_archivo;
    private javax.swing.JMenu jm_info;
    private javax.swing.JMenuItem jmi_login;
    private javax.swing.JMenuItem jmi_logout;
    private javax.swing.JMenuItem jmi_salir;
    private javax.swing.JPanel jp_menu;
    private javax.swing.JPasswordField tf_passMM;
    private javax.swing.JPasswordField tf_pwd;
    private javax.swing.JTextField tf_user;
    private javax.swing.JTextField tf_userMM;
    // End of variables declaration//GEN-END:variables

    String user="admin", pwd="123";
    ArrayList<Usuario> usuarios = new ArrayList();
    
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
