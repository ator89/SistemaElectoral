package sistemaelectoral;

import hondureno.Hondureno;
import hondureno.MiembroMesa;
import hondureno.Usuario;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
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
        jLabel44 = new javax.swing.JLabel();
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
        bt_papel = new javax.swing.JButton();
        bt_mesasAdmin = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        bt_mmesa = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
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
        jp_mesasInicio = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jp_mesasReporte = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jp_mesasAbrir = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jp_mesasMenu = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jMenuBar4 = new javax.swing.JMenuBar();
        jm_mesa = new javax.swing.JMenu();
        jmi_mesaAbrir = new javax.swing.JMenuItem();
        jmi_mesaCerrar = new javax.swing.JMenuItem();
        jm_mesaEditar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
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
        jButton3 = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_ME = new javax.swing.JList<>();
        bt_editME = new javax.swing.JButton();
        bt_saveME = new javax.swing.JButton();
        cb_delME = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jd_papeleta = new javax.swing.JDialog();
        jp_papeletaPresi = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jTextField15 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jPanel37 = new javax.swing.JPanel();
        jp_bt_lista1 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jp_bt_pp1 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jp_bt_dip1 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jp_bt_ald1 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jp_bt_cerrar1 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jp_papeletaDefault = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jp_bt_lista = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jp_bt_pp = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jp_bt_dip = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jp_bt_ald = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jp_bt_cerrar = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jp_papeletaAlca = new javax.swing.JPanel();
        jp_papeletaDipu = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jm_adminPapeleta = new javax.swing.JMenu();
        jmi_adminPpresidente = new javax.swing.JMenuItem();
        jmi_adminPalca = new javax.swing.JMenuItem();
        jmi_adminPdipu = new javax.swing.JMenuItem();
        jmi_adminPapeletaAdm = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmi_adminPapeletaClose = new javax.swing.JMenuItem();
        jm_papeletaEdit = new javax.swing.JMenu();
        jd_tipoPapeleta = new javax.swing.JDialog();
        jPanel14 = new javax.swing.JPanel();
        bt_okP = new javax.swing.JButton();
        rb_alcalde = new javax.swing.JRadioButton();
        rb_diputado = new javax.swing.JRadioButton();
        rb_presidente = new javax.swing.JRadioButton();
        jLabel37 = new javax.swing.JLabel();
        btg_tipoP = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel56 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jl_papeleta_presidente = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jt_papeleta_presidente = new javax.swing.JTable();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jp_menu = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        bt_test = new javax.swing.JButton();
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

        jLabel44.setText("Ingrese su usuario y contraseña:");

        javax.swing.GroupLayout jd_loginLayout = new javax.swing.GroupLayout(jd_login.getContentPane());
        jd_login.getContentPane().setLayout(jd_loginLayout);
        jd_loginLayout.setHorizontalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_loginLayout.createSequentialGroup()
                        .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jb_login)
                            .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_user)
                                .addComponent(tf_pwd, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))))
                    .addGroup(jd_loginLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel44)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jd_loginLayout.setVerticalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel44)
                .addGap(18, 18, 18)
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
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 150, -1));

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
            .addGap(0, 649, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Modificar", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 649, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Eliminar", jPanel3);

        jd_usuarios.getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 420));

        jd_adminOptions.setTitle("Opciones Administrativas");

        bt_papel.setText("Papeletas");
        bt_papel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_papelMouseClicked(evt);
            }
        });

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

        jButton9.setText("Usuarios");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_papel)
                    .addComponent(jButton7)
                    .addComponent(bt_mesasAdmin)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addComponent(bt_mmesa)
                    .addComponent(jButton8)
                    .addComponent(jButton4))
                .addGap(65, 65, 65))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_papel)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_mesasAdmin)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_mmesa)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton9))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jMenu3.setText("Archivo");
        jMenuBar3.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar3.add(jMenu4);

        jd_adminOptions.setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout jd_adminOptionsLayout = new javax.swing.GroupLayout(jd_adminOptions.getContentPane());
        jd_adminOptions.getContentPane().setLayout(jd_adminOptionsLayout);
        jd_adminOptionsLayout.setHorizontalGroup(
            jd_adminOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_adminOptionsLayout.createSequentialGroup()
                .addGap(0, 72, Short.MAX_VALUE)
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
        jd_adminMesa.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_mesasInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setText("Bienvenido a la administración de Mesas Electorales ");
        jp_mesasInicio.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel46.setText("Abrir Mesa Electoral");
        jp_mesasInicio.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 118, -1, -1));

        jLabel47.setText("Cerrar Mesa Electoral");
        jp_mesasInicio.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 140, -1, -1));

        jLabel48.setText("Habilitar Elector");
        jp_mesasInicio.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 174, -1, -1));

        jLabel49.setText("Reporte de Mesas Electorales");
        jp_mesasInicio.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 118, -1, -1));

        jLabel50.setText("Generar Actas");
        jp_mesasInicio.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        jLabel51.setText("Ubicación");
        jp_mesasInicio.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 174, -1, -1));

        jd_adminMesa.getContentPane().add(jp_mesasInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 480, 340));

        jp_mesasReporte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Presidente");
        jp_mesasReporte.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jButton5.setText("Diputado");
        jp_mesasReporte.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jButton12.setText("Alcalde");
        jp_mesasReporte.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jd_adminMesa.getContentPane().add(jp_mesasReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 480, 340));

        jp_mesasAbrir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setText("Cerrar Mesa");
        jp_mesasAbrir.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 295, -1, -1));

        jLabel28.setText("Generar acta e imprimir");
        jp_mesasAbrir.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 202, -1, -1));

        jLabel29.setText("Ver ubicación de mesa");
        jp_mesasAbrir.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 236, -1, -1));

        jd_adminMesa.getContentPane().add(jp_mesasAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 0, 480, 340));

        jp_mesasMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Aperturar Mesa");
        jp_mesasMenu.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 66, -1, -1));

        jLabel25.setText("Habilitar Votante");
        jp_mesasMenu.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 114, -1, -1));

        jLabel26.setText("Lista de votantes");
        jp_mesasMenu.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 148, -1, -1));

        jLabel27.setText("Reporte de mesas");
        jp_mesasMenu.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jd_adminMesa.getContentPane().add(jp_mesasMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 338));

        jm_mesa.setText("Archivo");

        jmi_mesaAbrir.setText("Abrir Mesa");
        jmi_mesaAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_mesaAbrirActionPerformed(evt);
            }
        });
        jm_mesa.add(jmi_mesaAbrir);

        jmi_mesaCerrar.setText("Cerrar Mesa");
        jmi_mesaCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_mesaCerrarActionPerformed(evt);
            }
        });
        jm_mesa.add(jmi_mesaCerrar);

        jMenuBar4.add(jm_mesa);

        jm_mesaEditar.setText("Editar");

        jMenuItem1.setText("Habilitar Elector");
        jm_mesaEditar.add(jMenuItem1);

        jMenuItem2.setText("Informe de Electores");
        jm_mesaEditar.add(jMenuItem2);

        jMenu7.setText("Resultados de Mesa");

        jMenuItem3.setText("Presidente");
        jMenu7.add(jMenuItem3);

        jMenuItem5.setText("Diputado");
        jMenu7.add(jMenuItem5);

        jMenuItem6.setText("Alcalde");
        jMenu7.add(jMenuItem6);

        jm_mesaEditar.add(jMenu7);

        jMenuItem7.setText("Generar Actas");
        jm_mesaEditar.add(jMenuItem7);

        jMenuItem8.setText("Ubicación de Mesa Electoral");
        jm_mesaEditar.add(jMenuItem8);

        jMenuBar4.add(jm_mesaEditar);

        jd_adminMesa.setJMenuBar(jMenuBar4);

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
        jPanel8.add(cb_cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

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

        jTextField5.setToolTipText("Código de Mesa Electoral");

        jLabel36.setText("Ubicación:");

        jButton3.setText("Guardar");
        jButton3.setToolTipText("Guardar cambios");

        jTextField12.setToolTipText("Latitud");

        jTextField13.setToolTipText("Longitud");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(328, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(141, 141, 141))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jTextField12)
                    .addComponent(jTextField13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jButton3)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Agregar", jPanel12);

        jLabel3.setText("Código Mesa:");

        jLabel32.setText("Ubicación:");

        jl_ME.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(jl_ME);

        bt_editME.setText("Editar");

        bt_saveME.setText("Guardar");

        cb_delME.setText("Eliminar");

        jTextField7.setEnabled(false);

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
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(bt_editME)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_saveME)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_delME)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_editME)
                            .addComponent(bt_saveME)
                            .addComponent(cb_delME))
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

        jd_papeleta.setTitle("Papeletas");
        jd_papeleta.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_papeletaPresi.setBackground(new java.awt.Color(204, 255, 204));
        jp_papeletaPresi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel52.setText("Papeletas para Presidente");
        jp_papeletaPresi.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        jPanel30.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));

        jLabel59.setText("ID Mesa:");

        jLabel70.setText("Candidato:");

        jLabel71.setText("ID Usuario:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(jList2);

        jButton17.setText("Agregar");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel59)
                            .addComponent(jLabel70)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jLabel71)
                            .addComponent(jTextField15)))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton17)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel71)
                .addGap(10, 10, 10)
                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Partido", "Foto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTable1);

        jButton18.setText("Limpiar");

        jButton19.setText("Guardar");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(jButton18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton19)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18)
                    .addComponent(jButton19))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jp_bt_lista1.setBackground(new java.awt.Color(111, 129, 171));
        jp_bt_lista1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jp_bt_lista1.setPreferredSize(new java.awt.Dimension(140, 40));
        jp_bt_lista1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_bt_lista1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_bt_lista1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jp_bt_lista1MouseEntered(evt);
            }
        });
        jp_bt_lista1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setFont(new java.awt.Font("Corsiva Hebrew", 0, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Listas");
        jp_bt_lista1.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jp_bt_pp1.setBackground(new java.awt.Color(111, 129, 171));
        jp_bt_pp1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jp_bt_pp1.setPreferredSize(new java.awt.Dimension(140, 40));
        jp_bt_pp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_bt_pp1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_bt_pp1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jp_bt_pp1MouseEntered(evt);
            }
        });
        jp_bt_pp1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel65.setFont(new java.awt.Font("Corsiva Hebrew", 0, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Presidente");
        jp_bt_pp1.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));

        jp_bt_dip1.setBackground(new java.awt.Color(111, 129, 171));
        jp_bt_dip1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jp_bt_dip1.setPreferredSize(new java.awt.Dimension(140, 40));
        jp_bt_dip1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_bt_dip1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_bt_dip1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jp_bt_dip1MouseEntered(evt);
            }
        });
        jp_bt_dip1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel66.setFont(new java.awt.Font("Corsiva Hebrew", 0, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Diputado");
        jp_bt_dip1.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));

        jp_bt_ald1.setBackground(new java.awt.Color(111, 129, 171));
        jp_bt_ald1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jp_bt_ald1.setPreferredSize(new java.awt.Dimension(140, 40));
        jp_bt_ald1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_bt_ald1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_bt_ald1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jp_bt_ald1MouseEntered(evt);
            }
        });
        jp_bt_ald1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel67.setFont(new java.awt.Font("Corsiva Hebrew", 0, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("Alcalde");
        jp_bt_ald1.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_bt_lista1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jp_bt_pp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jp_bt_dip1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jp_bt_ald1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jp_bt_lista1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jp_bt_pp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jp_bt_dip1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jp_bt_ald1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
        );

        jLabel68.setText("Seleccione una opción:");

        jp_bt_cerrar1.setBackground(new java.awt.Color(111, 129, 171));
        jp_bt_cerrar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jp_bt_cerrar1.setPreferredSize(new java.awt.Dimension(140, 40));
        jp_bt_cerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_bt_cerrar1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_bt_cerrar1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jp_bt_cerrar1MouseEntered(evt);
            }
        });
        jp_bt_cerrar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel69.setFont(new java.awt.Font("Corsiva Hebrew", 0, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("Cerrar");
        jp_bt_cerrar1.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jp_bt_cerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_bt_cerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel68)))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );

        jp_papeletaPresi.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 740, 450));

        jd_papeleta.getContentPane().add(jp_papeletaPresi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 540));

        jp_papeletaDefault.setBackground(new java.awt.Color(204, 255, 204));
        jp_papeletaDefault.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel55.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel55.setText("Creación y Administración de Papeletas Electorales");
        jp_papeletaDefault.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        jPanel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel22.setBackground(new java.awt.Color(153, 51, 255));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel23.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel24.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel25.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel26.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel27.setBackground(new java.awt.Color(255, 255, 102));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jp_bt_lista.setBackground(new java.awt.Color(111, 129, 171));
        jp_bt_lista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jp_bt_lista.setPreferredSize(new java.awt.Dimension(140, 40));
        jp_bt_lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_bt_listaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_bt_listaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jp_bt_listaMouseEntered(evt);
            }
        });
        jp_bt_lista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setFont(new java.awt.Font("Corsiva Hebrew", 0, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Listas");
        jp_bt_lista.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jp_bt_pp.setBackground(new java.awt.Color(111, 129, 171));
        jp_bt_pp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jp_bt_pp.setPreferredSize(new java.awt.Dimension(140, 40));
        jp_bt_pp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_bt_ppMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_bt_ppMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jp_bt_ppMouseEntered(evt);
            }
        });
        jp_bt_pp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel60.setFont(new java.awt.Font("Corsiva Hebrew", 0, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Presidente");
        jp_bt_pp.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));

        jp_bt_dip.setBackground(new java.awt.Color(111, 129, 171));
        jp_bt_dip.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jp_bt_dip.setPreferredSize(new java.awt.Dimension(140, 40));
        jp_bt_dip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_bt_dipMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_bt_dipMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jp_bt_dipMouseEntered(evt);
            }
        });
        jp_bt_dip.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel61.setFont(new java.awt.Font("Corsiva Hebrew", 0, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Diputado");
        jp_bt_dip.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));

        jp_bt_ald.setBackground(new java.awt.Color(111, 129, 171));
        jp_bt_ald.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jp_bt_ald.setPreferredSize(new java.awt.Dimension(140, 40));
        jp_bt_ald.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_bt_aldMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_bt_aldMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jp_bt_aldMouseEntered(evt);
            }
        });
        jp_bt_ald.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel62.setFont(new java.awt.Font("Corsiva Hebrew", 0, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Alcalde");
        jp_bt_ald.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_bt_lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jp_bt_pp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jp_bt_dip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jp_bt_ald, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jp_bt_lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jp_bt_pp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jp_bt_dip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jp_bt_ald, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
        );

        jLabel63.setText("Seleccione una opción:");

        jp_bt_cerrar.setBackground(new java.awt.Color(111, 129, 171));
        jp_bt_cerrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jp_bt_cerrar.setPreferredSize(new java.awt.Dimension(140, 40));
        jp_bt_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_bt_cerrarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_bt_cerrarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jp_bt_cerrarMouseEntered(evt);
            }
        });
        jp_bt_cerrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel64.setFont(new java.awt.Font("Corsiva Hebrew", 0, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Cerrar");
        jp_bt_cerrar.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jp_bt_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_bt_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jp_papeletaDefault.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 740, 450));

        jd_papeleta.getContentPane().add(jp_papeletaDefault, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 540));

        jp_papeletaAlca.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jd_papeleta.getContentPane().add(jp_papeletaAlca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 540));

        jp_papeletaDipu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jd_papeleta.getContentPane().add(jp_papeletaDipu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 540));

        jMenu1.setText("Administrar");

        jm_adminPapeleta.setText("Nueva");

        jmi_adminPpresidente.setText("Papeleta para Presidente");
        jmi_adminPpresidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_adminPpresidenteActionPerformed(evt);
            }
        });
        jm_adminPapeleta.add(jmi_adminPpresidente);

        jmi_adminPalca.setText("Papeleta para Alcade");
        jm_adminPapeleta.add(jmi_adminPalca);

        jmi_adminPdipu.setText("Papeleta para Diputado");
        jm_adminPapeleta.add(jmi_adminPdipu);

        jMenu1.add(jm_adminPapeleta);

        jmi_adminPapeletaAdm.setText("Administrar");
        jmi_adminPapeletaAdm.setEnabled(false);
        jmi_adminPapeletaAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_adminPapeletaAdmActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_adminPapeletaAdm);

        jMenuItem9.setText("Lista de Papeletas");
        jMenu1.add(jMenuItem9);
        jMenu1.add(jSeparator2);

        jmi_adminPapeletaClose.setText("Cerrar");
        jMenu1.add(jmi_adminPapeletaClose);

        jMenuBar2.add(jMenu1);

        jm_papeletaEdit.setText("Editar");
        jm_papeletaEdit.setEnabled(false);
        jMenuBar2.add(jm_papeletaEdit);

        jd_papeleta.setJMenuBar(jMenuBar2);

        jd_tipoPapeleta.setTitle("Tipo de Papeleta");

        bt_okP.setText("Aceptar");

        btg_tipoP.add(rb_alcalde);
        rb_alcalde.setText("Alcalde");

        btg_tipoP.add(rb_diputado);
        rb_diputado.setText("Diputado");

        btg_tipoP.add(rb_presidente);
        rb_presidente.setText("Presidente");

        jLabel37.setText("¿Qué tipo de papeleta desea administrar?");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_diputado)
                    .addComponent(rb_presidente)
                    .addComponent(rb_alcalde))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(bt_okP)
                .addGap(90, 90, 90))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel37)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(bt_okP)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(rb_presidente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_diputado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_alcalde)
                        .addGap(14, 14, 14))))
        );

        javax.swing.GroupLayout jd_tipoPapeletaLayout = new javax.swing.GroupLayout(jd_tipoPapeleta.getContentPane());
        jd_tipoPapeleta.getContentPane().setLayout(jd_tipoPapeletaLayout);
        jd_tipoPapeletaLayout.setHorizontalGroup(
            jd_tipoPapeletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_tipoPapeletaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jd_tipoPapeletaLayout.setVerticalGroup(
            jd_tipoPapeletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setText("Código de Mesa:");
        jPanel7.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32719, -32621, 53, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel7.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32719, -32587, -1, -1));

        jLabel56.setText("Candidatos:");
        jPanel7.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32719, -32607, 53, -1));

        jl_papeleta_presidente.setModel(new DefaultListModel());
        jScrollPane4.setViewportView(jl_papeleta_presidente);

        jPanel7.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32719, -32585, 43, 140));

        jt_papeleta_presidente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jt_papeleta_presidente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Foto:", "Foto:", "Foto:", "Foto:", "Foto:", "Foto:", "Foto:", "Foto:"},
                {null, null, null, null, null, null, null, null},
                {"Nombre:", "Nombre:", "Nombre:", "Nombre:", "Nombre:", "Nombre:", "Nombre:", "Nombre:"},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Liberal", "Nacional", "Libre", "PAC", "Alianza", "PINU", "UD", "DC"
            }
        ));
        jScrollPane5.setViewportView(jt_papeleta_presidente);

        jPanel7.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32539, -32706, -1, -1));

        jButton13.setText("Guardar");
        jPanel7.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32129, -32280, 105, -1));

        jButton14.setText("Limpiar");
        jPanel7.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32304, -32280, 105, -1));

        jButton15.setText("Cancelar");
        jPanel7.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32337, -32280, 105, -1));

        jButton16.setText("Agregar");
        jPanel7.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32698, -32290, 105, -1));

        jLabel58.setText("ID Usuario:");
        jPanel7.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32719, -32651, 53, -1));
        jPanel7.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32719, -32623, 88, -1));

        jDialog1.getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32698, -32749, 100, 100));

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

        bt_test.setText("TEST");
        bt_test.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_testMouseClicked(evt);
            }
        });
        jPanel5.add(bt_test, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jLabel16.setText("Prueba de funciones de los demás usuarios");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

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

    private void bt_papelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_papelMouseClicked

        //Administrar Paneles dinámicos
        jp_papeletaDefault.setVisible(true);
        jp_papeletaPresi.setVisible(false);
        jp_papeletaAlca.setVisible(false);
        jp_papeletaDipu.setVisible(false);
        
        //abrir ventana de administración de papeletas
        jd_papeleta.setModal(true);
        jd_papeleta.pack();
        jd_papeleta.setLocationRelativeTo(jd_adminOptions);
        jd_papeleta.setVisible(true);
        
        
    }//GEN-LAST:event_bt_papelMouseClicked

    private void bt_testMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_testMouseClicked
        
        //Administrar paneles dinámicos
        jp_mesasAbrir.setVisible(false);
        jp_mesasReporte.setVisible(false);
        jp_mesasMenu.setVisible(false);
        jmi_mesaCerrar.setVisible(false);
        jm_mesaEditar.setEnabled(false);
        
        
        //Abrir administrador de mesas electorales
        jd_adminMesa.setModal(true);
        jd_adminMesa.pack();
        jd_adminMesa.setLocationRelativeTo(this);
        jd_adminMesa.setVisible(true);
        
        
        
        
    }//GEN-LAST:event_bt_testMouseClicked

    private void jmi_mesaAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_mesaAbrirActionPerformed
        
        jm_mesaEditar.setEnabled(true);
        jmi_mesaAbrir.setEnabled(false);
        jmi_mesaCerrar.setVisible(true);
        
        jp_mesasAbrir.setVisible(true);
        jp_mesasReporte.setVisible(false);
        jp_mesasInicio.setVisible(false);
        jp_mesasMenu.setVisible(true);
        
    }//GEN-LAST:event_jmi_mesaAbrirActionPerformed

    private void jmi_mesaCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_mesaCerrarActionPerformed
        
        jm_mesaEditar.setEnabled(false);
        jmi_mesaAbrir.setEnabled(true);
        jmi_mesaCerrar.setVisible(false);
        
        jp_mesasAbrir.setVisible(false);
        jp_mesasReporte.setVisible(false);
        jp_mesasInicio.setVisible(true);
        jp_mesasMenu.setVisible(false);
    }//GEN-LAST:event_jmi_mesaCerrarActionPerformed

    private void jmi_adminPapeletaAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_adminPapeletaAdmActionPerformed

        //seleccionar tipo papeleta
        jd_tipoPapeleta.setModal(true);
        jd_tipoPapeleta.pack();
        jd_tipoPapeleta.setLocationRelativeTo(jd_papeleta);
        jd_tipoPapeleta.setVisible(true);
    }//GEN-LAST:event_jmi_adminPapeletaAdmActionPerformed

    private void jmi_adminPpresidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_adminPpresidenteActionPerformed

        //Administrar Paneles dinámicos
        jp_papeletaDefault.setVisible(false);
        jp_papeletaPresi.setVisible(true);
        jp_papeletaAlca.setVisible(false);
        jp_papeletaDipu.setVisible(false);

        //Mostrar menu
        jmi_adminPapeletaAdm.setEnabled(true);

        //abrir ventana de administración de papeletas
        jd_papeleta.setModal(true);
        jd_papeleta.pack();
        jd_papeleta.setLocationRelativeTo(jd_adminOptions);
        jd_papeleta.setVisible(true);

    }//GEN-LAST:event_jmi_adminPpresidenteActionPerformed

    private void jp_bt_listaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_listaMouseEntered
        //hover botón lista
        jp_bt_lista.setBackground(Color.red);
    }//GEN-LAST:event_jp_bt_listaMouseEntered

    private void jp_bt_listaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_listaMouseExited
        //normal state botón lista
        jp_bt_lista.setBackground(new Color(111,129,171));
    }//GEN-LAST:event_jp_bt_listaMouseExited

    private void jp_bt_listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_listaMouseClicked
        //acción del botón lista
        jp_bt_lista.setBackground(Color.yellow);
        
        
    }//GEN-LAST:event_jp_bt_listaMouseClicked

    private void jp_bt_ppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_ppMouseClicked
        // TODO add your handling code here:
//        jDialog1.setModal(true);
//        jDialog1.pack();
//        jDialog1.setLocationRelativeTo(jd_papeleta);
        jp_papeletaPresi.setVisible(true);
        jp_papeletaDefault.setVisible(false);
    }//GEN-LAST:event_jp_bt_ppMouseClicked

    private void jp_bt_ppMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_ppMouseExited
        //normal botón presidentes   
      jp_bt_pp.setBackground(new Color(111,129,171)); 
    }//GEN-LAST:event_jp_bt_ppMouseExited

    private void jp_bt_ppMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_ppMouseEntered
      //hover botón presidentes   
      jp_bt_pp.setBackground(Color.red);  
    }//GEN-LAST:event_jp_bt_ppMouseEntered

    private void jp_bt_dipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_dipMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jp_bt_dipMouseClicked

    private void jp_bt_dipMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_dipMouseExited
        //normal botón presidentes   
        jp_bt_dip.setBackground(new Color(111,129,171)); 
    }//GEN-LAST:event_jp_bt_dipMouseExited

    private void jp_bt_dipMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_dipMouseEntered
        // hover diputados button
        jp_bt_dip.setBackground(Color.red); 
    }//GEN-LAST:event_jp_bt_dipMouseEntered

    private void jp_bt_aldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_aldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jp_bt_aldMouseClicked

    private void jp_bt_aldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_aldMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jp_bt_aldMouseExited

    private void jp_bt_aldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_aldMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jp_bt_aldMouseEntered

    private void jp_bt_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_cerrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jp_bt_cerrarMouseClicked

    private void jp_bt_cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_cerrarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jp_bt_cerrarMouseExited

    private void jp_bt_cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_cerrarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jp_bt_cerrarMouseEntered

    private void jp_bt_lista1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_lista1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jp_bt_lista1MouseClicked

    private void jp_bt_lista1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_lista1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jp_bt_lista1MouseExited

    private void jp_bt_lista1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_lista1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jp_bt_lista1MouseEntered

    private void jp_bt_pp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_pp1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jp_bt_pp1MouseClicked

    private void jp_bt_pp1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_pp1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jp_bt_pp1MouseExited

    private void jp_bt_pp1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_pp1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jp_bt_pp1MouseEntered

    private void jp_bt_dip1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_dip1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jp_bt_dip1MouseClicked

    private void jp_bt_dip1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_dip1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jp_bt_dip1MouseExited

    private void jp_bt_dip1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_dip1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jp_bt_dip1MouseEntered

    private void jp_bt_ald1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_ald1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jp_bt_ald1MouseClicked

    private void jp_bt_ald1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_ald1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jp_bt_ald1MouseExited

    private void jp_bt_ald1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_ald1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jp_bt_ald1MouseEntered

    private void jp_bt_cerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_cerrar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jp_bt_cerrar1MouseClicked

    private void jp_bt_cerrar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_cerrar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jp_bt_cerrar1MouseExited

    private void jp_bt_cerrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_bt_cerrar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jp_bt_cerrar1MouseEntered

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
    private javax.swing.JButton bt_editME;
    private javax.swing.JButton bt_mesasAdmin;
    private javax.swing.JButton bt_mmesa;
    private javax.swing.JButton bt_okP;
    private javax.swing.JButton bt_papel;
    private javax.swing.JButton bt_saveME;
    private javax.swing.ButtonGroup bt_sexo;
    private javax.swing.JButton bt_test;
    private javax.swing.ButtonGroup btg_tipoP;
    private javax.swing.JComboBox<String> cb_cargo;
    private javax.swing.JComboBox<String> cb_cargo1;
    private javax.swing.JComboBox<String> cb_ciudad;
    private javax.swing.JButton cb_delME;
    private javax.swing.JComboBox<String> cb_depto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JDialog jDialog1;
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
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton jb_login;
    private javax.swing.JDialog jd_adminMesa;
    private javax.swing.JDialog jd_adminOptions;
    private javax.swing.JDialog jd_login;
    private javax.swing.JDialog jd_magister;
    private javax.swing.JDialog jd_mesas;
    private javax.swing.JDialog jd_miembros;
    private javax.swing.JDialog jd_papeleta;
    private javax.swing.JDialog jd_tipoPapeleta;
    private javax.swing.JDialog jd_usuarios;
    private javax.swing.JDialog jd_votante;
    private javax.swing.JList<String> jl_ME;
    private javax.swing.JList<String> jl_papeleta_presidente;
    private javax.swing.JMenu jm_adminPapeleta;
    private javax.swing.JMenu jm_archivo;
    private javax.swing.JMenu jm_info;
    private javax.swing.JMenu jm_mesa;
    private javax.swing.JMenu jm_mesaEditar;
    private javax.swing.JMenu jm_papeletaEdit;
    private javax.swing.JMenuItem jmi_adminPalca;
    private javax.swing.JMenuItem jmi_adminPapeletaAdm;
    private javax.swing.JMenuItem jmi_adminPapeletaClose;
    private javax.swing.JMenuItem jmi_adminPdipu;
    private javax.swing.JMenuItem jmi_adminPpresidente;
    private javax.swing.JMenuItem jmi_login;
    private javax.swing.JMenuItem jmi_logout;
    private javax.swing.JMenuItem jmi_mesaAbrir;
    private javax.swing.JMenuItem jmi_mesaCerrar;
    private javax.swing.JMenuItem jmi_salir;
    private javax.swing.JPanel jp_bt_ald;
    private javax.swing.JPanel jp_bt_ald1;
    private javax.swing.JPanel jp_bt_cerrar;
    private javax.swing.JPanel jp_bt_cerrar1;
    private javax.swing.JPanel jp_bt_dip;
    private javax.swing.JPanel jp_bt_dip1;
    private javax.swing.JPanel jp_bt_lista;
    private javax.swing.JPanel jp_bt_lista1;
    private javax.swing.JPanel jp_bt_pp;
    private javax.swing.JPanel jp_bt_pp1;
    private javax.swing.JPanel jp_menu;
    private javax.swing.JPanel jp_mesasAbrir;
    private javax.swing.JPanel jp_mesasInicio;
    private javax.swing.JPanel jp_mesasMenu;
    private javax.swing.JPanel jp_mesasReporte;
    private javax.swing.JPanel jp_papeletaAlca;
    private javax.swing.JPanel jp_papeletaDefault;
    private javax.swing.JPanel jp_papeletaDipu;
    private javax.swing.JPanel jp_papeletaPresi;
    private javax.swing.JTable jt_papeleta_presidente;
    private javax.swing.JRadioButton rb_alcalde;
    private javax.swing.JRadioButton rb_diputado;
    private javax.swing.JRadioButton rb_presidente;
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
