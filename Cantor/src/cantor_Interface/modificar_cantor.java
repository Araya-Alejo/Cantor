package cantor_Interface;

import Util.util;
import base_datos.Conector;
import cantor.Artista;
import cantor.Canario;
import cantor.Gallo;
import cantor.Instrumento;
import cantor.Momento;
import java.util.ArrayList;

public class Modificar_cantor extends javax.swing.JFrame {

    Conector conn = new Conector();
    public static Artista artMod;
    public static Gallo galloMod;
    public static Canario canMod;
    public static int tipo;

    public Modificar_cantor(Artista artista, Gallo gallo, Canario canario, int tipo) {
        this.artMod = artista;
        this.galloMod = gallo;
        this.canMod = canario;
        this.tipo = tipo;
        initComponents();
        setLocationRelativeTo(null);
        obtener_datos();
        llenar_combos();
    }

    public void borrar_combo() {
        _momento.removeAllItems();
    }

    public void obtener_datos() {
        switch (this.tipo) {
            case 1:
                _salida_nombre.setText(this.artMod.nombre);
                _salida_tipo.setText("Artista");
                _salida_fechaN.setText(this.artMod.fechaNacimiento.toString());
                break;
            case 2:
                _salida_nombre.setText(this.galloMod.nombre);
                _salida_tipo.setText("Gallo");
                _salida_fechaN.setText(this.galloMod.fechaNacimiento.toString());
                break;
            case 3:
                _salida_nombre.setText(this.canMod.nombre);
                _salida_tipo.setText("Canario");
                _salida_fechaN.setText(this.canMod.fechaNacimiento.toString());
                break;
        }
    }

    public void llenar_combos() {
        if (this.tipo == 1) {
            ArrayList<Instrumento> aIns = conn.getGestorInstrumento().getDatos();
            for (Instrumento aIn : aIns) {
                _instrumento_seleccionado.addItem(aIn.nombre);
            }
        } else {
            _instrumento_seleccionado.removeAllItems();
            _instrumento_seleccionado.addItem("No aplica");
            btn_agregar_instrumento.setEnabled(false);
        }
        _momento.addItem("Mañana");
        _momento.addItem("Medio dia");
        _momento.addItem("Tarde");
        _momento.addItem("Tarde noche");
        _momento.addItem("Noche");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        _instrumento_seleccionado = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        btn_agregar_instrumento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        _momento = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btn_modificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        _salida_nombre = new javax.swing.JLabel();
        _salida_tipo = new javax.swing.JLabel();
        _salida_fechaN = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel26.setText("NOMBRE:");

        jLabel31.setText("Campos editables");

        _instrumento_seleccionado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        _instrumento_seleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _instrumento_seleccionadoActionPerformed(evt);
            }
        });

        jLabel27.setText("TIPO:        ");

        btn_agregar_instrumento.setText("Agregar un nuevo instrumento");
        btn_agregar_instrumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_instrumentoActionPerformed(evt);
            }
        });

        jLabel1.setText("MODIFICAR CANTOR");

        jLabel3.setText("Seleccionar en que momento canta");

        btn_modificar.setText("Modificar cantor");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        jLabel2.setText("FECHA DE NACIMIENTO:");

        _salida_nombre.setText("*****");

        _salida_tipo.setText("*****");

        _salida_fechaN.setText("****");

        jLabel7.setText("Instrumento que toca");

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
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(_salida_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(_salida_tipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(0, 19, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(_salida_fechaN, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_modificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(_momento, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_agregar_instrumento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(_instrumento_seleccionado, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(_salida_nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(_salida_tipo))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(_salida_fechaN))
                .addGap(18, 18, 18)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_instrumento_seleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_agregar_instrumento)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_momento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_modificar)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void _instrumento_seleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__instrumento_seleccionadoActionPerformed
        
    }//GEN-LAST:event__instrumento_seleccionadoActionPerformed

    private void btn_agregar_instrumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_instrumentoActionPerformed
        var elegir = new Agregar_instrumento();
        elegir.setVisible(true);
    }//GEN-LAST:event_btn_agregar_instrumentoActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        Momento momento = new Momento();
        Modificar ventana;
        if (this.tipo == 1) {
            ArrayList<Artista> art = conn.getGestorArtista().getDatos();
            for (Artista artista : art) {
                if (this.artMod.nombre.equalsIgnoreCase(artista.nombre)) {
                    conn.getGestorArtista().borrarDato(artista);
                }
            }
            momento.tipo = String.valueOf(_momento.getSelectedItem());
            ArrayList<Instrumento> instrumentos = conn.getGestorInstrumento().getDatos();
            for (Instrumento instrumento : instrumentos) {
                if (_instrumento_seleccionado.getSelectedItem().equals(instrumento.nombre)) {
                    this.artMod.usa = instrumento;
                }
            }
            this.artMod.cuando = momento;
            conn.getGestorArtista().guardarDato(this.artMod);
            util.MENSAJE("¡Artista modificado!");
            ventana = new Modificar();
            ventana.setVisible(true);
            this.dispose();
        } else if (this.tipo == 2) {
            ArrayList<Gallo> gallos = conn.getGestorGallo().getDatos();
            for (Gallo gallo : gallos) {
                if (this.artMod.nombre.equalsIgnoreCase(gallo.nombre)) {
                    conn.getGestorGallo().borrarDato(gallo);
                }
            }
            momento.tipo = String.valueOf(_momento.getSelectedItem());
            this.galloMod.cuando = momento;
            conn.getGestorGallo().guardarDato(galloMod);
            util.MENSAJE("¡Gallo modificado!");
            ventana = new Modificar();
            ventana.setVisible(true);
            this.dispose();
        } else {
            ArrayList<Canario> canarios = conn.getGestorCanario().getDatos();
            for (Canario canario : canarios) {
                if (this.artMod.nombre.equalsIgnoreCase(canario.nombre)) {
                    conn.getGestorCanario().borrarDato(canario);
                }
            }
            momento.tipo = String.valueOf(_momento.getSelectedItem());
            this.canMod.cuando = momento;
            conn.getGestorCanario().guardarDato(canMod);
            util.MENSAJE("¡Canario modificado!");
            ventana = new Modificar();
            ventana.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar_cantor(artMod, galloMod, canMod, tipo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> _instrumento_seleccionado;
    private javax.swing.JComboBox<String> _momento;
    private javax.swing.JLabel _salida_fechaN;
    private javax.swing.JLabel _salida_nombre;
    private javax.swing.JLabel _salida_tipo;
    private javax.swing.JButton btn_agregar_instrumento;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
