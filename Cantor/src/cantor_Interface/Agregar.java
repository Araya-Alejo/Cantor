package cantor_Interface;

import Util.util;
import cantor.Artista;
import base_datos.*;
import cantor.Canario;
import cantor.Gallo;
import cantor.Instrumento;
import cantor.Momento;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.JComboBox;

public class Agregar extends javax.swing.JFrame {

    /*Instanciamos el un objeto de la clase Conector para poder tener acceso a los gestores de archivos*/
    Conector conn = new Conector();

    /*Constructor de la ventana en donde se cargaran los metodos que cargan los datos que se mostraran
    inmediatamente cuando se abra la ventana*/
    public Agregar() {
        initComponents();
        setLocationRelativeTo(null);
        rellenarComboConductores_instrumentos(_instrumento_seleccionado);
        cargar_combo_momento(_momento);
        
    }
    
    /*Metodo para poder llenar el Combo Box de los instrumentos, conectandose con el archivo que los guarda*/
    public void rellenarComboConductores_instrumentos(JComboBox _instrumento_seleccionado) {
        try {
            ArrayList<Instrumento> instrumento = new ArrayList();
            /*con el metodo getDatos del gestor de archivos especifico para los instrumentos, 
            se guardan en el arrayList*/
            instrumento = conn.getGestorInstrumento().getDatos();

            String nombre;
            /*se limpia el combo box*/
            _instrumento_seleccionado.removeAllItems();
            /*se añaden los nombres de los instrumentos al combo box*/
            for (int i = 0; i < instrumento.size(); i++) {
                nombre = instrumento.get(i).nombre;
                _instrumento_seleccionado.addItem(nombre);
            }
        } catch (Exception e) {
            System.out.println("Error al cargar ComboBox\n\n" + e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        _LISTA_TIPO = new javax.swing.JComboBox<>();
        ingreso_LISTA_INSTRUMENTOS = new javax.swing.JComboBox<>();
        ingreso_NOMBRE = new javax.swing.JTextField();
        btn_ingresar2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        dia = new javax.swing.JComboBox<>();
        mes = new javax.swing.JComboBox<>();
        ano = new javax.swing.JComboBox<>();
        _instrumento_seleccionado = new javax.swing.JComboBox<>();
        btn_agregar_instrumento = new javax.swing.JButton();
        _momento = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        jLabel26.setText("NOMBRE:");

        jLabel31.setText("TOCA ALGUN INSTRUMENTO");

        jLabel27.setText("TIPO:        ");

        jLabel1.setText("INGRESAR CANTOR");

        _LISTA_TIPO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ARTISTA", "GALLO", "CANARIO" }));
        _LISTA_TIPO.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                _LISTA_TIPOItemStateChanged(evt);
            }
        });
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

        _instrumento_seleccionado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        _instrumento_seleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _instrumento_seleccionadoActionPerformed(evt);
            }
        });

        btn_agregar_instrumento.setText("Agregar un nuevo instrumento");
        btn_agregar_instrumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_instrumentoActionPerformed(evt);
            }
        });

        jLabel3.setText("Seleccionar en que momento canta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_agregar_instrumento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(_instrumento_seleccionado, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ingreso_LISTA_INSTRUMENTOS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(60, 60, 60))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(_momento, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_ingresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ingreso_NOMBRE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(_LISTA_TIPO, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(ingreso_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(_LISTA_TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dia))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(ingreso_LISTA_INSTRUMENTOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_instrumento_seleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_agregar_instrumento)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_momento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_ingresar2)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingreso_LISTA_INSTRUMENTOSItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ingreso_LISTA_INSTRUMENTOSItemStateChanged
        
    }//GEN-LAST:event_ingreso_LISTA_INSTRUMENTOSItemStateChanged

    /*con este metodo se habilita o no la opcion de instrumentos, se hara mediante un si o no en un combo box*/
    private void ingreso_LISTA_INSTRUMENTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreso_LISTA_INSTRUMENTOSActionPerformed
        
        if (ingreso_LISTA_INSTRUMENTOS.getSelectedItem().equals("NO")) {
            _instrumento_seleccionado.setEnabled(false);
            btn_agregar_instrumento.setEnabled(false);
        } else if (ingreso_LISTA_INSTRUMENTOS.getSelectedItem().equals("SI")) {
            _instrumento_seleccionado.setEnabled(true);
            btn_agregar_instrumento.setEnabled(true);
        }
    }//GEN-LAST:event_ingreso_LISTA_INSTRUMENTOSActionPerformed
    /*con este metodo se verifican los datos y se obtienen para cargar el cantor al fichero
    segun el tipo que sea*/
    private void btn_ingresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresar2ActionPerformed
        if (ingreso_NOMBRE.getText().equals("")) {
            util.MENSAJE("Porfavor ingrese el valor faltante.");
            ingreso_NOMBRE.requestFocusInWindow();
        } else if (_LISTA_TIPO.getSelectedItem().equals("ARTISTA")) {
            /*si se selecciona artista se verifican los datos y se ingresa en el fichero*/
            try {
                String nacimiento = String.valueOf(dia.getSelectedItem()) + String.valueOf(mes.getSelectedItem()) + String.valueOf(ano.getSelectedItem());
                Artista artista;
                Momento momento = new Momento();
                momento.tipo = String.valueOf(_momento.getSelectedItem());
                System.out.println(momento.tipo);
                if (String.valueOf(ingreso_LISTA_INSTRUMENTOS.getSelectedItem()).equals("SI")) {
                    Instrumento instrumento = new Instrumento(String.valueOf(_instrumento_seleccionado.getSelectedItem()));
                    System.out.println(instrumento.nombre);
                    artista = new Artista(instrumento, ingreso_NOMBRE.getText(), nacimiento, momento);
                } else {
                    Instrumento instrumento = new Instrumento("Mi voz");
                    System.out.println(instrumento.nombre);
                    artista = new Artista(instrumento, ingreso_NOMBRE.getText(), nacimiento, momento);
                }
                conn.getGestorArtista().guardarDato(artista);
                borrar_combo();
                util.MENSAJE("Artista agregado");
                this.dispose();
            } catch (Exception e) {
                util.MENSAJE("Error al guardar el artista" + e);
            }
        } else if (_LISTA_TIPO.getSelectedItem().equals("GALLO")) {
            /*si es gallo se verifican los datos y se ingresa en el fichero*/
            String nacimiento = String.valueOf(dia.getSelectedItem()) + String.valueOf(mes.getSelectedItem()) + String.valueOf(ano.getSelectedItem());
            try {
                Gallo gallo;
                Momento momento = new Momento();
                momento.tipo = String.valueOf(_momento.getSelectedItem());
                gallo = new Gallo(ingreso_NOMBRE.getText(), nacimiento, momento);
                conn.getGestorGallo().guardarDato(gallo);
                borrar_combo();
                util.MENSAJE("Gallo agregado");
                this.dispose();
            } catch (Exception e) {
                util.MENSAJE("Error al guardar el gallo" + e);
            }
        } else if (_LISTA_TIPO.getSelectedItem().equals("CANARIO")) {
            /*si es canario se verifican los datos y se ingresa en el fichero*/
            String nacimiento = String.valueOf(dia.getSelectedItem()) + String.valueOf(mes.getSelectedItem()) + String.valueOf(ano.getSelectedItem());
            try {
                Canario canario;
                Momento momento = new Momento();
                momento.tipo = String.valueOf(_momento.getSelectedItem());
                canario = new Canario(ingreso_NOMBRE.getText(), nacimiento, momento);
                conn.getGestorCanario().guardarDato(canario);
                borrar_combo();
                util.MENSAJE("Canario agregado");
                this.dispose();
            } catch (Exception e) {
                util.MENSAJE("Error al guardar el canario" + e);
            }
        }        
    }//GEN-LAST:event_btn_ingresar2ActionPerformed
    
     /*se borran todos los items del combo que contienen los momentos*/
    public void borrar_combo() {
        _momento.removeAllItems();
    }

     /*se cargan todos los momentos que se pueden seleccionar*/
    public void cargar_combo_momento(JComboBox _momento) {
        _momento.addItem("Mañana");
        _momento.addItem("Medio dia");
        _momento.addItem("Tarde");
        _momento.addItem("Tarde noche");
        _momento.addItem("Noche");
    }

    /*segun el tipo, se habilitaran las opciones de los instrumentos*/
    private void _LISTA_TIPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__LISTA_TIPOActionPerformed
        if (!_LISTA_TIPO.getSelectedItem().equals("ARTISTA")) {
            _instrumento_seleccionado.setEnabled(false);
            btn_agregar_instrumento.setEnabled(false);
            ingreso_LISTA_INSTRUMENTOS.setEnabled(false);
        } else {
            _instrumento_seleccionado.setEnabled(true);
            btn_agregar_instrumento.setEnabled(true);
            ingreso_LISTA_INSTRUMENTOS.setEnabled(true);
        }
    }//GEN-LAST:event__LISTA_TIPOActionPerformed

    
    private void ingreso_NOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreso_NOMBREActionPerformed

    }//GEN-LAST:event_ingreso_NOMBREActionPerformed

    /*conecta con la vista de "Agregar_instrumento" para hacer esa accion*/
    private void btn_agregar_instrumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_instrumentoActionPerformed
        var elegir = new Agregar_instrumento(1);
        elegir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_agregar_instrumentoActionPerformed

    

    private void _instrumento_seleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__instrumento_seleccionadoActionPerformed
        
    }//GEN-LAST:event__instrumento_seleccionadoActionPerformed

    /*segun lo que se seleccione en el combo box que tiene los tipos de cantores, se habilita o no 
    el combo box que pregunta si toca algun instrumento*/
    private void _LISTA_TIPOItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event__LISTA_TIPOItemStateChanged
        try {
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                if (_LISTA_TIPO.getSelectedIndex() > 0) {
                    if (_LISTA_TIPO.getSelectedIndex() != 1) {
                        ingreso_LISTA_INSTRUMENTOS.setEnabled(false);
                    }
                }
            }
        }catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }
    }//GEN-LAST:event__LISTA_TIPOItemStateChanged

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
    private javax.swing.JComboBox<String> _instrumento_seleccionado;
    private javax.swing.JComboBox<String> _momento;
    private javax.swing.JComboBox<String> ano;
    private javax.swing.JButton btn_agregar_instrumento;
    private javax.swing.JButton btn_ingresar2;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JComboBox<String> ingreso_LISTA_INSTRUMENTOS;
    private javax.swing.JTextField ingreso_NOMBRE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JComboBox<String> mes;
    // End of variables declaration//GEN-END:variables
}
