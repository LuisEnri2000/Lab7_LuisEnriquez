
import java.util.Date;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Enriquez
 */
public class FrameMain extends javax.swing.JFrame {

    /**
     * Creates new form FrameMain
     */
    public FrameMain() {
        initComponents();
        
        ab = new adminBarra(pb_barra,tablaPlatillos);
        ab.start();
        ac.cargarArchivo();
        //acli.cargarArchivo();
        escribirTabla();
        //escribirTablaCli();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_crearCliente = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jf_nombreCliente = new javax.swing.JTextField();
        js_edadCliente = new javax.swing.JSpinner();
        cb_generoCliente = new javax.swing.JComboBox<>();
        cb_sopa = new javax.swing.JComboBox<>();
        cb_fuerte = new javax.swing.JComboBox<>();
        cb_postre = new javax.swing.JComboBox<>();
        cb_entrada = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jd_crearChef = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jf_nombreCliente1 = new javax.swing.JTextField();
        js_edadCliente1 = new javax.swing.JSpinner();
        cb_generoCliente1 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaClientes = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaChefs = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        pb_barra = new javax.swing.JProgressBar();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaPlatillos = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jLabel4.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jLabel4.setText("Crear cliente:");

        jLabel5.setText("Nombre:");

        jLabel6.setText("Edad:");

        jLabel7.setText("Genero:");

        jLabel8.setText("Orden:");

        js_edadCliente.setModel(new javax.swing.SpinnerNumberModel(20, 0, null, 1));

        cb_generoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));

        cb_sopa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tortilla", "Res", "Pollo", "Capirotada" }));

        cb_fuerte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pollo con pure", "Espaguetis", "Hamburguesa", "Salmon", "Cordero" }));

        cb_postre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pie de Limón", "Cheesecake", "Tiramisú", "Crepa" }));

        cb_entrada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anafre Parisiense", "Empanada", "Huevos Rellenos" }));

        jLabel9.setText("Sopa:");

        jLabel10.setText("Plato fuerte:");

        jLabel11.setText("Postres:");

        jLabel12.setText("Entrada:");

        jButton3.setText("Crear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_crearClienteLayout = new javax.swing.GroupLayout(jd_crearCliente.getContentPane());
        jd_crearCliente.getContentPane().setLayout(jd_crearClienteLayout);
        jd_crearClienteLayout.setHorizontalGroup(
            jd_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearClienteLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jd_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jd_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8)
                        .addComponent(jLabel4)
                        .addGroup(jd_crearClienteLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_generoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jd_crearClienteLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(js_edadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearClienteLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(62, 62, 62)
                            .addComponent(jf_nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearClienteLayout.createSequentialGroup()
                            .addGroup(jd_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jd_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_postre, 0, 120, Short.MAX_VALUE)
                                    .addComponent(cb_sopa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jd_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jd_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton3)
                                    .addGroup(jd_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cb_fuerte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cb_entrada, 0, 120, Short.MAX_VALUE)))))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jd_crearClienteLayout.setVerticalGroup(
            jd_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearClienteLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jd_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jf_nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jd_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(js_edadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jd_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cb_generoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jLabel8)
                .addGap(29, 29, 29)
                .addGroup(jd_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_sopa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_fuerte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jd_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_crearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_postre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jButton3)
                .addGap(22, 22, 22))
        );

        jLabel13.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jLabel13.setText("Crear chef:");

        jLabel14.setText("Nombre:");

        jLabel15.setText("Edad:");

        jLabel16.setText("Genero:");

        js_edadCliente1.setModel(new javax.swing.SpinnerNumberModel(20, 0, null, 1));

        cb_generoCliente1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));

        jButton4.setText("Crear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_crearChefLayout = new javax.swing.GroupLayout(jd_crearChef.getContentPane());
        jd_crearChef.getContentPane().setLayout(jd_crearChefLayout);
        jd_crearChefLayout.setHorizontalGroup(
            jd_crearChefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearChefLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jd_crearChefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13)
                    .addGroup(jd_crearChefLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb_generoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_crearChefLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(js_edadCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearChefLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(62, 62, 62)
                        .addComponent(jf_nombreCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jd_crearChefLayout.setVerticalGroup(
            jd_crearChefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearChefLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jd_crearChefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jf_nombreCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jd_crearChefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(js_edadCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jd_crearChefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cb_generoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(21, 21, 21))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Rage Italic", 0, 48)); // NOI18N
        jLabel1.setText("Mamarr'e");

        listaClientes.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(listaClientes);

        listaChefs.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(listaChefs);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Chefs");

        jLabel3.setText("Clientes");

        jButton5.setText("Crear platillo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        tablaPlatillos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tiempo"
            }
        ));
        jScrollPane3.setViewportView(tablaPlatillos);

        jButton6.setText("Eliminar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Eliminar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(216, 216, 216))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pb_barra, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(251, 251, 251))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(200, 200, 200)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(34, 34, 34)
                                    .addComponent(jButton6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2)
                                    .addGap(48, 48, 48)
                                    .addComponent(jButton7)
                                    .addGap(27, 27, 27))))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pb_barra, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Agregar a la lista de chefs
        jd_crearChef.setModal(true);
        jd_crearChef.pack();
        jd_crearChef.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Visible la ventana de crear cliente
        jd_crearCliente.setModal(true);
        jd_crearCliente.pack();
        jd_crearCliente.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Crear nuevo cliente
        String nombre = jf_nombreCliente.getText();
        int edad = (Integer) js_edadCliente.getValue();
        String genero = (String) cb_generoCliente.getSelectedItem();
        ArrayList<Platillos> a = new ArrayList();
        
        switch (cb_sopa.getSelectedIndex()) {
            case 0:
                a.add(new Platillos("Sopa de tortilla",9,"0001",new Date(), Color.RED)); break;
            case 1:
                a.add(new Platillos("Sopa de res",12,"0002",new Date(), Color.BLACK)); break;
            case 2:
                a.add(new Platillos("Sopa de pollo",10,"0003",new Date(), Color.YELLOW)); break;
            case 3:
                a.add(new Platillos("Sopa de capirotada",7,"0004",new Date(), Color.WHITE)); break;
        }
        switch (cb_fuerte.getSelectedIndex()) {
            case 0:
                a.add(new Platillos("Pollo con pure",15,"0001",new Date(), Color.BLACK)); break;
            case 1:
                a.add(new Platillos("Espaguetis",13,"0002",new Date(), Color.RED)); break;
            case 2:
                a.add(new Platillos("Hamburguesa",11,"0003",new Date(), Color.YELLOW)); break;
            case 3:
                a.add(new Platillos("Salmon",18,"0004",new Date(), Color.PINK)); break;
            case 4:
                a.add(new Platillos("Cordero",16,"0004",new Date(), Color.WHITE)); break;
        }
        switch (cb_postre.getSelectedIndex()) {
            case 0:
                a.add(new Platillos("Pie de limon",7,"0001",new Date(), Color.GREEN)); break;
            case 1:
                a.add(new Platillos("Cheesecake",8,"0002",new Date(), Color.RED)); break;
            case 2:
                a.add(new Platillos("Tiramisu",9,"0003",new Date(), Color.BLACK)); break;
            case 3:
                a.add(new Platillos("Crepa",6,"0004",new Date(), Color.YELLOW)); break;
        }
        switch (cb_entrada.getSelectedIndex()) {
            case 0:
                a.add(new Platillos("Anafre Parisense",5,"0001",new Date(), Color.BLACK)); break;
            case 1:
                a.add(new Platillos("Empanada",7,"0002",new Date(), Color.RED)); break;
            case 2:
                a.add(new Platillos("Huevos rellenos",3,"0003",new Date(), Color.WHITE)); break;
            
        }
        
        
        jf_nombreCliente.setText("");
        jd_crearCliente.setVisible(false);
        
        Cliente c = new Cliente(nombre,edad,genero,a);
        
        DefaultListModel l = (DefaultListModel) listaClientes.getModel();
        l.addElement(c);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String nombre = jf_nombreCliente1.getText();
        int edad = (Integer) js_edadCliente1.getValue();
        String genero = (String) cb_generoCliente1.getSelectedItem();
        ArrayList<Platillos> a = new ArrayList();
        
        Chef c = new Chef(nombre,edad,genero);
        
        ac.getListaChefs().add(c);
        
        DefaultListModel l = (DefaultListModel) listaChefs.getModel();
        l.addElement(c);
        
        ac.escribirArchivo();
        
        jf_nombreCliente1.setText("");
        jd_crearChef.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        DefaultListModel m1 = (DefaultListModel) listaChefs.getModel();
        DefaultListModel m2 = (DefaultListModel) listaClientes.getModel();
        DefaultTableModel m3 = (DefaultTableModel) tablaPlatillos.getModel();
        
        
        
        
        if (listaChefs.getSelectedIndex() > -1 && listaClientes.getSelectedIndex() > -1) {
            m3.setRowCount(0);
            Chef chef = (Chef) m1.getElementAt(listaChefs.getSelectedIndex());
            Cliente cliente = (Cliente) m2.getElementAt(listaClientes.getSelectedIndex());
            ArrayList<Platillos> lista = cliente.getLista();
            
            for (Platillos i : lista) {
                chef.getLista().add(i);
                ab.getLista().add(i);                       
            }
            
            ab.setCapaz(true);
            listaChefs.repaint();
            
            
        }else{
            JOptionPane.showMessageDialog(this, "Primero selecciona el chef y el cliente!");
        }
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        DefaultListModel m1 = (DefaultListModel) listaChefs.getModel();
        
        if (listaChefs.getSelectedIndex() > -1){
            
            ac.getListaChefs().remove(listaChefs.getSelectedIndex());
            ac.escribirArchivo();
            m1.removeElementAt(listaChefs.getSelectedIndex());
            JOptionPane.showMessageDialog(this, "Eliminado con exito!");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        DefaultListModel m2 = (DefaultListModel) listaClientes.getModel();

        if (listaClientes.getSelectedIndex() > -1) {
            m2.removeElementAt(listaClientes.getSelectedIndex());
            JOptionPane.showMessageDialog(this, "Eliminado con exito!");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }
    
    public void escribirTabla () {
        
        DefaultListModel modelo = (DefaultListModel) listaChefs.getModel();
        
        for (int i = 0; i < ac.getListaChefs().size(); i++) {
            modelo.addElement(ac.getListaChefs().get(i));
        }
        
        listaChefs.setModel(modelo);
    }
    
    public void escribirTablaCli () {
        
        DefaultListModel modelo = (DefaultListModel) listaClientes.getModel();
        
        for (int i = 0; i < acli.getListaClientes().size(); i++) {
            modelo.addElement(acli.getListaClientes().get(i));
        }
        
        listaClientes.setModel(modelo);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_entrada;
    private javax.swing.JComboBox<String> cb_fuerte;
    private javax.swing.JComboBox<String> cb_generoCliente;
    private javax.swing.JComboBox<String> cb_generoCliente1;
    private javax.swing.JComboBox<String> cb_postre;
    private javax.swing.JComboBox<String> cb_sopa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JDialog jd_crearChef;
    private javax.swing.JDialog jd_crearCliente;
    private javax.swing.JTextField jf_nombreCliente;
    private javax.swing.JTextField jf_nombreCliente1;
    private javax.swing.JSpinner js_edadCliente;
    private javax.swing.JSpinner js_edadCliente1;
    private javax.swing.JList<String> listaChefs;
    private javax.swing.JList<String> listaClientes;
    private javax.swing.JProgressBar pb_barra;
    private javax.swing.JTable tablaPlatillos;
    // End of variables declaration//GEN-END:variables
    
    adminChefs ac = new adminChefs("./chefs.chefes");
    adminBarra ab;
    adminCliente acli;

}