/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cantor.Interface;


/**
 *
 * @author alejo
 */
public class Modificar extends javax.swing.JFrame {

    /**
     * Creates new form Modificar
     */
    public Modificar() {
        initComponents();
        setLocationRelativeTo(null);
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
        modificacion_TIPO_INSTRUMENTO = new javax.swing.JTextField();
        btn_cargar = new javax.swing.JToggleButton();
        jLabel30 = new javax.swing.JLabel();
        modificacion_CANTAR = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        modificacion_NOMBRE_INSTRUMENTO = new javax.swing.JTextField();
        modificacion_LISTA_INSTRUMENTOS = new javax.swing.JComboBox<>();
        modificacion_TIPO = new javax.swing.JTextField();
        btn_modificacion = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        _LISTA_DE_ARTISTAS = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        modificacion_TIPO_INSTRUMENTO.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        modificacion_TIPO_INSTRUMENTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificacion_TIPO_INSTRUMENTOActionPerformed(evt);
            }
        });

        btn_cargar.setText("Cargar");
        btn_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargarActionPerformed(evt);
            }
        });

        jLabel30.setText("CANTAR:");

        modificacion_CANTAR.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        modificacion_CANTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificacion_CANTARActionPerformed(evt);
            }
        });

        jLabel26.setText("NOMBRE:");

        jLabel28.setText("NOMBRE:");

        jLabel31.setText("TOCA ALGUN INSTRUMENTO");

        jLabel1.setText("MODIFICAR ARTISTA");

        jLabel27.setText("TIPO:        ");

        modificacion_NOMBRE_INSTRUMENTO.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        modificacion_NOMBRE_INSTRUMENTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificacion_NOMBRE_INSTRUMENTOActionPerformed(evt);
            }
        });

        modificacion_LISTA_INSTRUMENTOS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        modificacion_LISTA_INSTRUMENTOS.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                modificacion_LISTA_INSTRUMENTOSItemStateChanged(evt);
            }
        });
        modificacion_LISTA_INSTRUMENTOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificacion_LISTA_INSTRUMENTOSActionPerformed(evt);
            }
        });

        modificacion_TIPO.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        modificacion_TIPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificacion_TIPOActionPerformed(evt);
            }
        });

        btn_modificacion.setText("Agregar artista");
        btn_modificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificacionActionPerformed(evt);
            }
        });

        jLabel29.setText("TIPO:        ");

        _LISTA_DE_ARTISTAS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        _LISTA_DE_ARTISTAS.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                _LISTA_DE_ARTISTASItemStateChanged(evt);
            }
        });
        _LISTA_DE_ARTISTAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _LISTA_DE_ARTISTASActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_modificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modificacion_LISTA_INSTRUMENTOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(_LISTA_DE_ARTISTAS, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel29)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(modificacion_TIPO_INSTRUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(modificacion_NOMBRE_INSTRUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(modificacion_TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel30)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(modificacion_CANTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(70, 70, 70))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cargar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btn_cargar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(_LISTA_DE_ARTISTAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(modificacion_TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(modificacion_LISTA_INSTRUMENTOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(modificacion_NOMBRE_INSTRUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(modificacion_TIPO_INSTRUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(modificacion_CANTAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_modificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modificacion_NOMBRE_INSTRUMENTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificacion_NOMBRE_INSTRUMENTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificacion_NOMBRE_INSTRUMENTOActionPerformed

    private void modificacion_TIPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificacion_TIPOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificacion_TIPOActionPerformed

    private void _LISTA_DE_ARTISTASItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event__LISTA_DE_ARTISTASItemStateChanged
        // TODO add your handling code here:
        String value = (String) _LISTA_DE_ARTISTAS.getSelectedItem();
    }//GEN-LAST:event__LISTA_DE_ARTISTASItemStateChanged

    private void _LISTA_DE_ARTISTASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__LISTA_DE_ARTISTASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__LISTA_DE_ARTISTASActionPerformed

    private void modificacion_TIPO_INSTRUMENTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificacion_TIPO_INSTRUMENTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificacion_TIPO_INSTRUMENTOActionPerformed

    private void btn_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarActionPerformed
        // TODO add your handling code here:

//        for (int i = 0; i < SerCantor.artistas.size(); i++) {
//            _LISTA_DE_ARTISTAS.addItem(SerCantor.artistas.get(i).nombre);
//        }
    }//GEN-LAST:event_btn_cargarActionPerformed

    private void modificacion_CANTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificacion_CANTARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificacion_CANTARActionPerformed

    private void modificacion_LISTA_INSTRUMENTOSItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_modificacion_LISTA_INSTRUMENTOSItemStateChanged
        // TODO add your handling code here:

        String value = (String) modificacion_LISTA_INSTRUMENTOS.getSelectedItem();

        if (value.equals("NO")) {  //User have not entered anything.
            modificacion_NOMBRE_INSTRUMENTO.setEditable(false);
            modificacion_TIPO_INSTRUMENTO.setEditable(false);
        } else if (value.equals("SI")) {
            modificacion_NOMBRE_INSTRUMENTO.setEditable(true);
            modificacion_TIPO_INSTRUMENTO.setEditable(true);
        }
    }//GEN-LAST:event_modificacion_LISTA_INSTRUMENTOSItemStateChanged

    private void modificacion_LISTA_INSTRUMENTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificacion_LISTA_INSTRUMENTOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificacion_LISTA_INSTRUMENTOSActionPerformed

    private void btn_modificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificacionActionPerformed
        // TODO add your handling code here:
        String item = String.valueOf(_LISTA_DE_ARTISTAS.getSelectedItem());

//        View host = new View();
//        SerCantor.artistas.get(host.POSICION_LISTA(item)).tipo = modificacion_TIPO.getText();
//        SerCantor.artistas.get(host.POSICION_LISTA(item)).usa[0].nombre = modificacion_NOMBRE_INSTRUMENTO.getText();
//        SerCantor.artistas.get(host.POSICION_LISTA(item)).usa[0].tipo = modificacion_TIPO_INSTRUMENTO.getText();
//        SerCantor.artistas.get(host.POSICION_LISTA(item)).canto = modificacion_CANTAR.getText();
    }//GEN-LAST:event_btn_modificacionActionPerformed

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
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> _LISTA_DE_ARTISTAS;
    private javax.swing.JToggleButton btn_cargar;
    private javax.swing.JButton btn_modificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField modificacion_CANTAR;
    private javax.swing.JComboBox<String> modificacion_LISTA_INSTRUMENTOS;
    private javax.swing.JTextField modificacion_NOMBRE_INSTRUMENTO;
    private javax.swing.JTextField modificacion_TIPO;
    private javax.swing.JTextField modificacion_TIPO_INSTRUMENTO;
    // End of variables declaration//GEN-END:variables
}
