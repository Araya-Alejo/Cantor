/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cantor.Interface;


import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author alejo
 */
public class Agregar extends javax.swing.JFrame {

    /**
     * Creates new form Agregar
     */
   
    
    public Agregar(){
        initComponents();
        rellenarComboConductores(_LISTA_TIPO);
    }

    public static void rellenarComboConductores(JComboBox _LISTA_TIPO){
            ArrayList<String> listaConductores = new ArrayList(); 
            listaConductores.add("Hola");
            listaConductores.add("Mundo");
            String nombre;
            _LISTA_TIPO.removeAllItems();
            try{
                for(int i = 0; i<listaConductores.size(); i++){
                    nombre = listaConductores.get(i);
                    _LISTA_TIPO.addItem(nombre);
                }
            }catch(Exception e){
                System.out.println("Error al cargar ComboBox" + e);
            }
        }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        _LISTA_TIPO = new javax.swing.JComboBox<>();
        ingreso_LISTA_INSTRUMENTOS = new javax.swing.JComboBox<>();
        ingreso_NOMBRE_INSTRUMENTO = new javax.swing.JTextField();
        ingreso_TIPO_INSTRUMENTO = new javax.swing.JTextField();
        ingreso_CANTAR = new javax.swing.JTextField();
        ingreso_TIPO = new javax.swing.JTextField();
        ingreso_NOMBRE = new javax.swing.JTextField();
        btn_ingresar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel28.setText("NOMBRE:");

        jLabel29.setText("TIPO:        ");

        jLabel30.setText("CANTAR:");

        jLabel26.setText("NOMBRE:");

        jLabel31.setText("TOCA ALGUN INSTRUMENTO");

        jLabel27.setText("TIPO:        ");

        jLabel1.setText("INGRESAR ARTISTA");

        _LISTA_TIPO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ARTISTA", "GALLO", "CANARIO" }));
        _LISTA_TIPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _LISTA_TIPOActionPerformed(evt);
            }
        });

        ingreso_LISTA_INSTRUMENTOS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        ingreso_LISTA_INSTRUMENTOS.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ingreso_LISTA_INSTRUMENTOSItemStateChanged(evt);
            }
        });
        ingreso_LISTA_INSTRUMENTOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingreso_LISTA_INSTRUMENTOSActionPerformed(evt);
            }
        });

        ingreso_NOMBRE_INSTRUMENTO.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ingreso_NOMBRE_INSTRUMENTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingreso_NOMBRE_INSTRUMENTOActionPerformed(evt);
            }
        });

        ingreso_TIPO_INSTRUMENTO.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ingreso_TIPO_INSTRUMENTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingreso_TIPO_INSTRUMENTOActionPerformed(evt);
            }
        });

        ingreso_CANTAR.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ingreso_CANTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingreso_CANTARActionPerformed(evt);
            }
        });

        ingreso_TIPO.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ingreso_TIPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingreso_TIPOActionPerformed(evt);
            }
        });

        ingreso_NOMBRE.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ingreso_NOMBRE.setToolTipText("");
        ingreso_NOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingreso_NOMBREActionPerformed(evt);
            }
        });

        btn_ingresar2.setText("Agregar artista");
        btn_ingresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_ingresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel31)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ingreso_LISTA_INSTRUMENTOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ingreso_TIPO_INSTRUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel28)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ingreso_NOMBRE_INSTRUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel27)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ingreso_TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel26)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(ingreso_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ingreso_CANTAR))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(_LISTA_TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(_LISTA_TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(ingreso_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(ingreso_TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(ingreso_LISTA_INSTRUMENTOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(ingreso_NOMBRE_INSTRUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(ingreso_TIPO_INSTRUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(ingreso_CANTAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_ingresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingreso_NOMBRE_INSTRUMENTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreso_NOMBRE_INSTRUMENTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingreso_NOMBRE_INSTRUMENTOActionPerformed

    private void ingreso_TIPO_INSTRUMENTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreso_TIPO_INSTRUMENTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingreso_TIPO_INSTRUMENTOActionPerformed

    private void ingreso_CANTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreso_CANTARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingreso_CANTARActionPerformed

    private void ingreso_LISTA_INSTRUMENTOSItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ingreso_LISTA_INSTRUMENTOSItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ingreso_LISTA_INSTRUMENTOSItemStateChanged

    private void ingreso_LISTA_INSTRUMENTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreso_LISTA_INSTRUMENTOSActionPerformed
        // TODO add your handling code here:
        if (ingreso_LISTA_INSTRUMENTOS.getSelectedItem().equals("NO")) {  //User have not entered anything.
            ingreso_NOMBRE_INSTRUMENTO.setEnabled(false);
            ingreso_TIPO_INSTRUMENTO.setEnabled(false);
        } else if (ingreso_LISTA_INSTRUMENTOS.getSelectedItem().equals("SI")) {
            ingreso_NOMBRE_INSTRUMENTO.setEnabled(true);
            ingreso_TIPO_INSTRUMENTO.setEnabled(true);
        }

    }//GEN-LAST:event_ingreso_LISTA_INSTRUMENTOSActionPerformed

    private void btn_ingresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresar2ActionPerformed
        // TODO add your handling code here:

//        if (ingreso_NOMBRE.getText().equals("") || ingreso_TIPO.getText().equals("")) {
//            Util.POP_MESAGES("Porfavor ingrese el valor faltante.");
//            ingreso_NOMBRE.requestFocusInWindow();
//        } else if (_LISTA_TIPO.getSelectedItem().equals("ARTISTA")) {
//            var artista = new Artista();
//            artista.nombre = ingreso_NOMBRE.getText();
//            artista.tipo = ingreso_TIPO.getText();
//
//            var instrumento = new Instrumento();
//            instrumento.nombre = ingreso_NOMBRE_INSTRUMENTO.getText();
//            instrumento.tipo = ingreso_TIPO_INSTRUMENTO.getText();
//            artista.usa[0] = instrumento;
//
//            artista.canto = ingreso_CANTAR.getText();
//            System.out.println("A");
//            SerCantor.artistas.add(artista);
//        } else if (_LISTA_TIPO.getSelectedItem().equals("GALLO")) {
//            var gallo = new Gallo();
//            gallo.nombre = ingreso_NOMBRE.getText();
//            gallo.tipo = ingreso_TIPO.getText();
//            System.out.println("G");
//            SerCantor.gallo.add(gallo);
//        } else if (_LISTA_TIPO.getSelectedItem().equals("CANARIO")) {
//            var canario = new Canario();
//            canario.nombre = ingreso_NOMBRE.getText();
//            canario.tipo = ingreso_TIPO.getText();
//            System.out.println("C");
//            SerCantor.canario.add(canario);
//        }

        ingreso_NOMBRE.setText("");
        ingreso_TIPO.setText("");
        ingreso_NOMBRE_INSTRUMENTO.setText("");
        ingreso_TIPO_INSTRUMENTO.setText("");
        ingreso_CANTAR.setText("");
    }//GEN-LAST:event_btn_ingresar2ActionPerformed

    private void ingreso_TIPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreso_TIPOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingreso_TIPOActionPerformed

    private void _LISTA_TIPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__LISTA_TIPOActionPerformed
        // TODO add your handling code here:

        if(_LISTA_TIPO.getSelectedItem().equals("ARTISTA")) {
            ingreso_NOMBRE_INSTRUMENTO.setEnabled(true);
            ingreso_TIPO_INSTRUMENTO.setEnabled(true);
        } else {
            ingreso_NOMBRE_INSTRUMENTO.setEnabled(false);
            ingreso_TIPO_INSTRUMENTO.setEnabled(false);
        }
    }//GEN-LAST:event__LISTA_TIPOActionPerformed

    private void ingreso_NOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreso_NOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingreso_NOMBREActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> _LISTA_TIPO;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_ingresar1;
    private javax.swing.JButton btn_ingresar2;
    private javax.swing.JTextField ingreso_CANTAR;
    private javax.swing.JComboBox<String> ingreso_LISTA_INSTRUMENTOS;
    private javax.swing.JTextField ingreso_NOMBRE;
    private javax.swing.JTextField ingreso_NOMBRE_INSTRUMENTO;
    private javax.swing.JTextField ingreso_TIPO;
    private javax.swing.JTextField ingreso_TIPO_INSTRUMENTO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    // End of variables declaration//GEN-END:variables
}
