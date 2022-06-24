/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cantor.Interface;

import Util.util;
import cantor.Artista;
import cantor.Canario;
import cantor.Gallo;
import cantor.Instrumento;
import cantor.SerCantor;
import java.time.LocalDate;
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
    public Agregar() {
        initComponents();
        setLocationRelativeTo(null);
//        rellenarComboConductores(_LISTA_TIPO);
    }

//    public static void rellenarComboConductores(JComboBox _LISTA_TIPO){
//            ArrayList<String> listaConductores = new ArrayList(); 
//            listaConductores.add("Hola");
//            listaConductores.add("Mundo");
//            String nombre;
//            _LISTA_TIPO.removeAllItems();
//            try{
//                for(int i = 0; i<listaConductores.size(); i++){
//                    nombre = listaConductores.get(i);
//                    _LISTA_TIPO.addItem(nombre);
//                }
//            }catch(Exception e){
//                System.out.println("Error al cargar ComboBox" + e);
//            }
//        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel28 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        _LISTA_TIPO = new javax.swing.JComboBox<>();
        ingreso_LISTA_INSTRUMENTOS = new javax.swing.JComboBox<>();
        ingreso_NOMBRE_INSTRUMENTO = new javax.swing.JTextField();
        ingreso_NOMBRE = new javax.swing.JTextField();
        btn_ingresar2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        dia = new javax.swing.JComboBox<>();
        mes = new javax.swing.JComboBox<>();
        ano = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        jLabel28.setText("NOMBRE:");

        jLabel26.setText("NOMBRE:");

        jLabel31.setText("TOCA ALGUN INSTRUMENTO");

        jLabel27.setText("TIPO:        ");

        jLabel1.setText("INGRESAR CANTOR");

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

        ingreso_NOMBRE.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ingreso_NOMBRE.setToolTipText("");
        ingreso_NOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingreso_NOMBREActionPerformed(evt);
            }
        });

        btn_ingresar2.setText("Agregar cantor");
        btn_ingresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresar2ActionPerformed(evt);
            }
        });

        jLabel2.setText("FECHA DE NACIMIENTO:");

        dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        ano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009" }));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jButton1.setText("Agregar un nuevo instrumento");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(116, 116, 116))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel28)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ingreso_NOMBRE_INSTRUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btn_ingresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(60, 60, 60)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(_LISTA_TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel31)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ingreso_LISTA_INSTRUMENTOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ingreso_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(98, 98, 98)
                                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ano, 0, 1, Short.MAX_VALUE))))
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(ingreso_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(_LISTA_TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(ingreso_LISTA_INSTRUMENTOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(ingreso_NOMBRE_INSTRUMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_ingresar2)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingreso_NOMBRE_INSTRUMENTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreso_NOMBRE_INSTRUMENTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingreso_NOMBRE_INSTRUMENTOActionPerformed

    private void ingreso_LISTA_INSTRUMENTOSItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ingreso_LISTA_INSTRUMENTOSItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ingreso_LISTA_INSTRUMENTOSItemStateChanged

    private void ingreso_LISTA_INSTRUMENTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreso_LISTA_INSTRUMENTOSActionPerformed
        // TODO add your handling code here:
        if (ingreso_LISTA_INSTRUMENTOS.getSelectedItem().equals("NO")) {  //User have not entered anything.
            ingreso_NOMBRE_INSTRUMENTO.setEnabled(false);
        } else if (ingreso_LISTA_INSTRUMENTOS.getSelectedItem().equals("SI")) {
            ingreso_NOMBRE_INSTRUMENTO.setEnabled(true);
        }

    }//GEN-LAST:event_ingreso_LISTA_INSTRUMENTOSActionPerformed

    private void btn_ingresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresar2ActionPerformed
        // TODO add your handling code here:

        if (ingreso_NOMBRE.getText().equals("")) {
            util.MENSAJE("Porfavor ingrese el valor faltante.");
            ingreso_NOMBRE.requestFocusInWindow();
        } else if (_LISTA_TIPO.getSelectedItem().equals("ARTISTA")) {
            String nacimiento = String.valueOf(dia.getSelectedItem())+ String.valueOf(mes.getSelectedItem())+ String.valueOf(ano.getSelectedItem());
            var artista = new Artista(ingreso_NOMBRE.getText(), String.valueOf(_LISTA_TIPO.getSelectedItem()), nacimiento);

            var instrumento = new Instrumento();
            instrumento.nombre = ingreso_NOMBRE_INSTRUMENTO.getText();

            artista.usa.add(instrumento);

//            artista.canto = ingreso_CANTAR.getText();
//            System.out.println("A");
//            SerCantor.artistas.add(artista);
//        } else if (_LISTA_TIPO.getSelectedItem().equals("GALLO")) {
//            String nacimiento = String.valueOf(dia.getSelectedItem())+ String.valueOf(mes.getSelectedItem())+ String.valueOf(ano.getSelectedItem());
//            var gallo = new Gallo(ingreso_NOMBRE.getText(), String.valueOf(_LISTA_TIPO.getSelectedItem()), nacimiento);
//            gallo.nombre = ingreso_NOMBRE.getText();
//            gallo.tipo = ingreso_TIPO.getText();
//            System.out.println("G");
//            SerCantor.gallo.add(gallo);
//        } else if (_LISTA_TIPO.getSelectedItem().equals("CANARIO")) {
//            String nacimiento = String.valueOf(dia.getSelectedItem())+ String.valueOf(mes.getSelectedItem())+ String.valueOf(ano.getSelectedItem());
//            var canario = new Canario(ingreso_NOMBRE.getText(), String.valueOf(_LISTA_TIPO.getSelectedItem()), nacimiento);
//            System.out.println("C");
//            SerCantor.canario.add(canario);

//            artista.usa[0] = instrumento;
//
//            artista.canto = ingreso_CANTAR.getText();
//            System.out.println("A");
//            SerCantor.artistas.add(artista);
//        } else if (_LISTA_TIPO.getSelectedItem().equals("GALLO")) {
//            String nacimiento = String.valueOf(dia.getSelectedItem())+ String.valueOf(mes.getSelectedItem())+ String.valueOf(ano.getSelectedItem());
//            var gallo = new Gallo(ingreso_NOMBRE.getText(), ingreso_TIPO.getText(), nacimiento);
//            gallo.nombre = ingreso_NOMBRE.getText();
//            gallo.tipo = ingreso_TIPO.getText();
//            System.out.println("G");
//            SerCantor.gallo.add(gallo);
//        } else if (_LISTA_TIPO.getSelectedItem().equals("CANARIO")) {
//            String nacimiento = String.valueOf(dia.getSelectedItem())+ String.valueOf(mes.getSelectedItem())+ String.valueOf(ano.getSelectedItem());
//            var canario = new Canario(ingreso_NOMBRE.getText(), ingreso_TIPO.getText(), nacimiento);
//            System.out.println("C");
//            SerCantor.canario.add(canario);

        }

        ingreso_NOMBRE.setText("");
        ingreso_NOMBRE_INSTRUMENTO.setText("");

    }//GEN-LAST:event_btn_ingresar2ActionPerformed

    private void _LISTA_TIPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__LISTA_TIPOActionPerformed
        // TODO add your handling code here:

        if (_LISTA_TIPO.getSelectedItem().equals("ARTISTA")) {
            ingreso_NOMBRE_INSTRUMENTO.setEnabled(true);
        } else {
            ingreso_NOMBRE_INSTRUMENTO.setEnabled(false);
        }
    }//GEN-LAST:event__LISTA_TIPOActionPerformed

    private void ingreso_NOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreso_NOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingreso_NOMBREActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        var elegir = new Agregar_instrumento();
        elegir.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JComboBox<String> ano;
    private javax.swing.JButton btn_ingresar2;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JComboBox<String> ingreso_LISTA_INSTRUMENTOS;
    private javax.swing.JTextField ingreso_NOMBRE;
    private javax.swing.JTextField ingreso_NOMBRE_INSTRUMENTO;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JComboBox<String> mes;
    // End of variables declaration//GEN-END:variables
}
