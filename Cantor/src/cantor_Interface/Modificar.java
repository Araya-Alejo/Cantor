package cantor_Interface;

import base_datos.Conector;
import cantor.Artista;
import cantor.Canario;
import cantor.Gallo;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import Util.util;

public class Modificar extends javax.swing.JFrame {

    /*Instanciamos el un objeto de la clase Conector para poder tener acceso a los gestores de archivos*/
    Conector conn = new Conector();
    
    /*Constructor de la ventana en donde se cargaran los metodos que cargan los datos que se mostraran
    inmediatamente cuando se abra la ventana*/
    public Modificar() {
        initComponents();
        setLocationRelativeTo(null);
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_modificacion = new javax.swing.JButton();
        _lista_artistas = new javax.swing.JComboBox<>();
        _ELIMINAR_ = new javax.swing.JButton();
        _tipos_artistas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        _salida_nacimiento = new javax.swing.JTextField();
        _salida_edad = new javax.swing.JTextField();
        _salida_instrumento = new javax.swing.JTextField();
        _salida_canto = new javax.swing.JTextField();

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Instrumento que toca");

        jLabel1.setText("MODIFICAR/ELIMINAR ARTISTA");

        btn_modificacion.setText("Modificar");
        btn_modificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificacionActionPerformed(evt);
            }
        });

        _lista_artistas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        _lista_artistas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                _lista_artistasItemStateChanged(evt);
            }
        });
        _lista_artistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _lista_artistasActionPerformed(evt);
            }
        });

        _ELIMINAR_.setText("Eliminarlo");
        _ELIMINAR_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _ELIMINAR_ActionPerformed(evt);
            }
        });

        _tipos_artistas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Tipo", "ARTISTA", "GALLO", "CANARIO" }));
        _tipos_artistas.setAutoscrolls(true);
        _tipos_artistas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                _tipos_artistasItemStateChanged(evt);
            }
        });
        _tipos_artistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _tipos_artistasActionPerformed(evt);
            }
        });

        jLabel3.setText("Momento");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Edad");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Fecha de Nacimiento");

        _salida_nacimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _salida_nacimiento.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        _salida_nacimiento.setEnabled(false);

        _salida_edad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _salida_edad.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        _salida_edad.setEnabled(false);
        _salida_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _salida_edadActionPerformed(evt);
            }
        });

        _salida_instrumento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _salida_instrumento.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        _salida_instrumento.setEnabled(false);
        _salida_instrumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _salida_instrumentoActionPerformed(evt);
            }
        });

        _salida_canto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _salida_canto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        _salida_canto.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(172, 172, 172))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(_salida_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_modificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_ELIMINAR_, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(_salida_canto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_salida_instrumento, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(_salida_edad, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(_lista_artistas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(_tipos_artistas, javax.swing.GroupLayout.Alignment.LEADING, 0, 302, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(41, 41, 41))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_tipos_artistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_lista_artistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_salida_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(_salida_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_salida_instrumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(_salida_canto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modificacion)
                    .addComponent(_ELIMINAR_))
                .addGap(20, 20, 20))
        );

        _tipos_artistas.getAccessibleContext().setAccessibleName("");

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

    /*con este metodo se interrelacionan los combo box para que se muestren datos segun lo que se seleccione*/
    private void _lista_artistasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event__lista_artistasItemStateChanged
        try {
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                if (_tipos_artistas.getSelectedIndex() > 0) {
                    if (_tipos_artistas.getSelectedIndex() == 1) {
                        /*si se selecciona tipo artistas y un artista en especifico, 
                        se muestran todos sus datos*/
                        ArrayList<Artista> art = conn.getGestorArtista().getDatos();
                        for (Artista artista : art) {
                            if (_lista_artistas.getSelectedItem().equals(artista.nombre)) {
                                _salida_nacimiento.setText(String.valueOf(artista.fechaNacimiento));
                                _salida_edad.setText(String.valueOf(artista.calcularEdad()));
                                _salida_instrumento.setText(artista.usa.nombre);
                                _salida_canto.setText(artista.cuando.tipo);
                            }
                        }
                    }
                    if (_tipos_artistas.getSelectedIndex() == 2) {
                        /*si se selecciona tipo gallos y un gallo en especifico, 
                        se muestran todos sus datos*/
                        ArrayList<Gallo> gallos = conn.getGestorGallo().getDatos();
                        for (Gallo gallo : gallos) {
                            if (_lista_artistas.getSelectedItem().equals(gallo.nombre)) {
                                _salida_nacimiento.setText(String.valueOf(gallo.fechaNacimiento));
                                _salida_edad.setText(String.valueOf(gallo.calcularEdad()));
                                _salida_canto.setText(gallo.cuando.tipo);
                                _salida_instrumento.setText("No aplica");
                            }
                        }
                    }
                    if (_tipos_artistas.getSelectedIndex() == 3) {
                        /*si se selecciona tipo canarios y un canario en especifico, 
                        se muestran todos sus datos*/
                        ArrayList<Canario> canarios = conn.getGestorCanario().getDatos();
                        for (Canario canario : canarios) {
                            if (_lista_artistas.getSelectedItem().equals(canario.nombre)) {
                                _salida_nacimiento.setText(String.valueOf(canario.fechaNacimiento));
                                _salida_edad.setText(String.valueOf(canario.calcularEdad()));
                                _salida_canto.setText(canario.cuando.tipo);
                                _salida_instrumento.setText("No aplica");
                            }
                        }
                    }
                } else {
                    String[] arreglo = {""};
                    this._lista_artistas.setModel(new DefaultComboBoxModel(arreglo));
                }
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }
    }//GEN-LAST:event__lista_artistasItemStateChanged

    private void _lista_artistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__lista_artistasActionPerformed
        
    }//GEN-LAST:event__lista_artistasActionPerformed

    /*con este metodo, pasamos los datos necesarios para modificarlos a la siguiente ventana*/
    private void btn_modificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificacionActionPerformed
        if (_tipos_artistas.getSelectedIndex() > 0) {
            if (_tipos_artistas.getSelectedIndex() == 1) {
                /*si es tipo artista, pasamos el objeto elegido, abrimos la siguiente
                interfaz donde se modificaran y cerramos esta*/
                ArrayList<Artista> art = conn.getGestorArtista().getDatos();
                for (Artista artista : art) {
                    if (_lista_artistas.getSelectedItem().equals(artista.nombre)) {
                        Modificar_cantor window = new Modificar_cantor(artista,null, null, 1);
                        window.setVisible(true);
                        this.setVisible(false);
                        this.dispose();
                    }
                }
            }
            if (_tipos_artistas.getSelectedIndex() == 2) {
                /*si es tipo gallo, pasamos el objeto elegido, abrimos la siguiente
                interfaz donde se modificaran y cerramos esta*/
                ArrayList<Gallo> gallos = conn.getGestorGallo().getDatos();
                for (Gallo gallo : gallos) {
                    if (_lista_artistas.getSelectedItem().equals(gallo.nombre)) {
                        Modificar_cantor window = new Modificar_cantor(null,gallo, null, 2);
                        window.setVisible(true);
                        this.setVisible(false);
                        this.dispose();
                    }
                }
            }
            if (_tipos_artistas.getSelectedIndex() == 3) {
                /*si es tipo canario, pasamos el objeto elegido, abrimos la siguiente
                interfaz donde se modificaran y cerramos esta*/
                ArrayList<Canario> canarios = conn.getGestorCanario().getDatos();
                for (Canario canario : canarios) {
                    if (_lista_artistas.getSelectedItem().equals(canario.nombre)) {
                        Modificar_cantor window = new Modificar_cantor(null,null, canario, 3);
                        window.setVisible(true);
                        this.setVisible(false);
                        this.dispose();
                    }
                }
            }
        } else {
            util.MENSAJE("Se debe seleccionar un artista");
        }
    }//GEN-LAST:event_btn_modificacionActionPerformed

    /*con este metodo, eliminamos un cantor elegido por el usuario*/
    private void _ELIMINAR_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__ELIMINAR_ActionPerformed
        int eleccion = JOptionPane.showConfirmDialog(null, "Seguro que quieres borrar el artista", "", JOptionPane.YES_NO_OPTION);
        try {
            if (eleccion == JOptionPane.YES_OPTION) {
                if (_tipos_artistas.getSelectedIndex() > 0) {
                    if (_tipos_artistas.getSelectedIndex() == 1) {
                        /*si es de tipo artista se busca el dato elegido y se borra*/
                        ArrayList<Artista> art = conn.getGestorArtista().getDatos();
                        for (Artista artista : art) {
                            if (_lista_artistas.getSelectedItem().equals(artista.nombre)) {
                                conn.getGestorArtista().borrarDato(artista);
                                util.MENSAJE("Artista borrado");
                                this.dispose();
                            }
                        }
                    }
                    if (_tipos_artistas.getSelectedIndex() == 2) {
                        /*si es de tipo gallo se busca el dato elegido y se borra*/
                        ArrayList<Gallo> gallos = conn.getGestorGallo().getDatos();
                        for (Gallo gallo : gallos) {
                            if (_lista_artistas.getSelectedItem().equals(gallo.nombre)) {
                                conn.getGestorGallo().borrarDato(gallo);
                                util.MENSAJE("Gallo borrado");
                                this.dispose();

                            }
                        }
                    }
                    if (_tipos_artistas.getSelectedIndex() == 3) {
                        /*si es de tipo canario se busca el dato elegido y se borra*/
                        ArrayList<Canario> canarios = conn.getGestorCanario().getDatos();
                        for (Canario canario : canarios) {
                            if (_lista_artistas.getSelectedItem().equals(canario.nombre)) {
                                conn.getGestorCanario().borrarDato(canario);
                                util.MENSAJE("Canario borrado");
                                this.dispose();
                            }
                        }
                    }
                } else {
                    util.MENSAJE("Se debe seleccionar un artista");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El Artista no fue borrado");
            }
        } catch (Exception ex) {
            System.err.println("Error" + ex.getMessage());
        }
    }//GEN-LAST:event__ELIMINAR_ActionPerformed

    private void _tipos_artistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__tipos_artistasActionPerformed
    
    }//GEN-LAST:event__tipos_artistasActionPerformed

    /*con este metodo se interrelacionan los combo box para que se muestren datos segun lo que se seleccione*/
    private void _tipos_artistasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event__tipos_artistasItemStateChanged
        try {
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                if (_tipos_artistas.getSelectedIndex() > 0) {
                    if (_tipos_artistas.getSelectedIndex() == 1) {
                        /*si se selecciona artista, se muestran todos los artistas y sus datos en el otro combo box*/
                        ArrayList<Artista> art = conn.getGestorArtista().getDatos();
                        String[] arreglo1 = convertirArrayArregloArtista(art);
                        this._lista_artistas.setModel(new DefaultComboBoxModel(arreglo1));

                    }
                    if (_tipos_artistas.getSelectedIndex() == 2) {
                        /*si se selecciona gallo, se muestran todos los artistas y sus datos en el otro combo box*/
                        ArrayList<Gallo> gallos = conn.getGestorGallo().getDatos();
                        String[] arreglo2 = convertirArrayArregloGallo(gallos);
                        this._lista_artistas.setModel(new DefaultComboBoxModel(arreglo2));
                    }
                    if (_tipos_artistas.getSelectedIndex() == 3) {
                        /*si se selecciona canario, se muestran todos los artistas y sus datos en el otro combo box*/
                        ArrayList<Canario> canarios = conn.getGestorCanario().getDatos();
                        String[] arreglo3 = convertirArrayArregloCanario(canarios);
                        this._lista_artistas.setModel(new DefaultComboBoxModel(arreglo3));
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }


    }//GEN-LAST:event__tipos_artistasItemStateChanged

    private void _salida_instrumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__salida_instrumentoActionPerformed
        
    }//GEN-LAST:event__salida_instrumentoActionPerformed

    private void _salida_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__salida_edadActionPerformed
        
    }//GEN-LAST:event__salida_edadActionPerformed

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
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _ELIMINAR_;
    private javax.swing.JComboBox<String> _lista_artistas;
    private javax.swing.JTextField _salida_canto;
    private javax.swing.JTextField _salida_edad;
    private javax.swing.JTextField _salida_instrumento;
    private javax.swing.JTextField _salida_nacimiento;
    private javax.swing.JComboBox<String> _tipos_artistas;
    private javax.swing.JButton btn_modificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
