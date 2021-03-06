package cantor_Interface;

import Util.util;
import base_datos.Conector;
import cantor.Artista;
import cantor.Canario;
import cantor.Gallo;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class Elegir extends javax.swing.JFrame {

    /*Instanciamos el un objeto de la clase Conector para poder tener acceso a los gestores de archivos*/
    Conector conn = new Conector();

    /*Constructor de la ventana en donde se cargaran los metodos que cargan los datos que se mostraran
    inmediatamente cuando se abra la ventana*/
    public Elegir() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        _artistas = new javax.swing.JComboBox<>();
        _salida_nacimiento = new javax.swing.JTextField();
        _salida_instrumento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        _salida_canto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        _salida_edad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jLabel1.setText("ELIGE AL ARTISTA");

        _artistas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                _artistasItemStateChanged(evt);
            }
        });
        _artistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _artistasActionPerformed(evt);
            }
        });

        _salida_nacimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _salida_nacimiento.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        _salida_nacimiento.setEnabled(false);

        _salida_instrumento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _salida_instrumento.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        _salida_instrumento.setEnabled(false);

        jLabel2.setText("Fecha de nacimiento");

        jLabel3.setText("Instrumento que toca");

        _salida_canto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _salida_canto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        _salida_canto.setEnabled(false);

        jLabel4.setText("Momento de canto");

        jButton1.setText("Cantar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Tipo", "ARTISTA", "GALLO", "CANARIO" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        _salida_edad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _salida_edad.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        _salida_edad.setEnabled(false);
        _salida_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _salida_edadActionPerformed(evt);
            }
        });

        jLabel5.setText("Edad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_salida_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(_salida_nacimiento)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(jLabel2)
                            .addGap(60, 60, 60)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(_artistas, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(_salida_instrumento, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(_salida_canto, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, 236, Short.MAX_VALUE)))
                .addGap(86, 86, 86))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_artistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(_salida_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(1, 1, 1)
                .addComponent(_salida_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_salida_instrumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_salida_canto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*Metodo para mostrar un mensaje al usuario segun el canto*/
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jComboBox1.getSelectedIndex() > 0) {
            if (jComboBox1.getSelectedIndex() == 1) {
                util.MENSAJE("??Artista Cantando!");
            }
            if (jComboBox1.getSelectedIndex() == 2) {
                util.MENSAJE("??Gallo Cantando!");
            }
            if (jComboBox1.getSelectedIndex() == 3) {
                util.MENSAJE("??Canario Cantando!");
            }
        }else{
            util.MENSAJE("Seleccione un Cantor");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void _artistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__artistasActionPerformed

    }//GEN-LAST:event__artistasActionPerformed
    
    /*con este metodo se interrelacionan los combo box para que se muestren datos segun lo que se seleccione*/
    private void _artistasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event__artistasItemStateChanged
        try {
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                if (jComboBox1.getSelectedIndex() > 0) {
                    if (jComboBox1.getSelectedIndex() == 1) {
                        /*si se selecciona tipo artistas y un artista en especifico, 
                        se muestran todos sus datos*/
                        ArrayList<Artista> art = conn.getGestorArtista().getDatos();
                        for (Artista artista : art) {
                            if (_artistas.getSelectedItem().equals(artista.nombre)) {
                                _salida_nacimiento.setText(String.valueOf(artista.fechaNacimiento));
                                _salida_edad.setText(String.valueOf(artista.calcularEdad()));
                                _salida_instrumento.setText(artista.usa.nombre);
                                _salida_canto.setText(artista.cuando.tipo);
                            }
                        }
                    }
                    /*si se selecciona tipo gallos y un gallo en especifico, 
                        se muestran todos sus datos*/
                    if (jComboBox1.getSelectedIndex() == 2) {
                        ArrayList<Gallo> gallos = conn.getGestorGallo().getDatos();
                        for (Gallo gallo : gallos) {
                            if (_artistas.getSelectedItem().equals(gallo.nombre)) {
                                _salida_nacimiento.setText(String.valueOf(gallo.fechaNacimiento));
                                _salida_edad.setText(String.valueOf(gallo.calcularEdad()));
                                _salida_canto.setText(gallo.cuando.tipo);
                                _salida_instrumento.setText("No aplica");
                            }
                        }
                    }
                    /*si se selecciona tipo canarios y un canario en especifico, 
                        se muestran todos sus datos*/
                    if (jComboBox1.getSelectedIndex() == 3) {
                        ArrayList<Canario> canarios = conn.getGestorCanario().getDatos();
                        for (Canario canario : canarios) {
                            if (_artistas.getSelectedItem().equals(canario.nombre)) {
                                _salida_nacimiento.setText(String.valueOf(canario.fechaNacimiento));
                                _salida_edad.setText(String.valueOf(canario.calcularEdad()));
                                _salida_canto.setText(canario.cuando.tipo);
                                _salida_instrumento.setText("No aplica");
                            }
                        }
                    }
                } else {
                    String[] arreglo = {""};
                    this._artistas.setModel(new DefaultComboBoxModel(arreglo));
                }
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }
    }//GEN-LAST:event__artistasItemStateChanged

    /*con este metodo se interrelacionan los combo box para que se muestren datos segun lo que se seleccione*/
    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        try {
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                if (jComboBox1.getSelectedIndex() > 0) {
                    if (jComboBox1.getSelectedIndex() == 1) {
                        /*si se selecciona artista, se muestran todos los artistas y sus datos en el otro combo box*/
                        ArrayList<Artista> art = conn.getGestorArtista().getDatos();
                        String[] arreglo1 = convertirArrayArregloArtista(art);
                        this._artistas.setModel(new DefaultComboBoxModel(arreglo1));
                    }
                    if (jComboBox1.getSelectedIndex() == 2) {
                        /*si se selecciona gallo, se muestran todos los artistas y sus datos en el otro combo box*/
                        ArrayList<Gallo> gallos = conn.getGestorGallo().getDatos();
                        String[] arreglo2 = convertirArrayArregloGallo(gallos);
                        this._artistas.setModel(new DefaultComboBoxModel(arreglo2));
                    }
                    if (jComboBox1.getSelectedIndex() == 3) {
                        /*si se selecciona canario, se muestran todos los artistas y sus datos en el otro combo box*/
                        ArrayList<Canario> canarios = conn.getGestorCanario().getDatos();
                        String[] arreglo3 = convertirArrayArregloCanario(canarios);
                        this._artistas.setModel(new DefaultComboBoxModel(arreglo3));
                    }
                } else {
                    String[] arreglo = {""};
                    this._artistas.setModel(new DefaultComboBoxModel(arreglo));
                }
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }

    }

    /*este metodo se utiliz?? para guardar todos los nombres de los artistas en un arreglo*/
    public String[] convertirArrayArregloArtista(ArrayList<Artista> array) {
        String[] arreglo = new String[array.size()];
        for (int i = 0; i < array.size(); i++) {
            arreglo[i] = array.get(i).nombre;
        }
        return arreglo;
    }

    /*este metodo se utiliz?? para guardar todos los nombres de los gallos en un arreglo*/
    public String[] convertirArrayArregloGallo(ArrayList<Gallo> array) {
        String[] arreglo = new String[array.size()];
        for (int i = 0; i < array.size(); i++) {
            arreglo[i] = array.get(i).nombre;
        }
        return arreglo;
    }

    /*este metodo se utiliz?? para guardar todos los nombres de los canarios en un arreglo*/
    public String[] convertirArrayArregloCanario(ArrayList<Canario> array) {
        String[] arreglo = new String[array.size()];
        for (int i = 0; i < array.size(); i++) {
            arreglo[i] = array.get(i).nombre;
        }
        return arreglo;

    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void _salida_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__salida_edadActionPerformed
        
    }//GEN-LAST:event__salida_edadActionPerformed

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
            java.util.logging.Logger.getLogger(Elegir.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Elegir.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Elegir.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Elegir.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Elegir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> _artistas;
    private javax.swing.JTextField _salida_canto;
    private javax.swing.JTextField _salida_edad;
    private javax.swing.JTextField _salida_instrumento;
    private javax.swing.JTextField _salida_nacimiento;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
