/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoramatrices;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class Interface extends javax.swing.JFrame {

    private int m1[][];
    private int m2[][];
    Operaciones o = new Operaciones();

    public Interface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mensa = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        suma = new javax.swing.JButton();
        limite = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        llenar = new javax.swing.JButton();
        llenar2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ma1 = new javax.swing.JTextArea();
        mensa1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ma2 = new javax.swing.JTextArea();
        resta1 = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        traza = new javax.swing.JButton();
        tra2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        suma.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        suma.setText("suma");
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });

        limite.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-SELECCIONES-", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" }));
        limite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limiteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel1.setText("Tamaño  de la matriz");

        llenar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        llenar.setText("matriz 1");
        llenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llenarActionPerformed(evt);
            }
        });

        llenar2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        llenar2.setText("matriz 2");
        llenar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llenar2ActionPerformed(evt);
            }
        });

        ma1.setColumns(20);
        ma1.setRows(5);
        jScrollPane1.setViewportView(ma1);

        mensa1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel2.setText("calculadora de matrices");

        ma2.setColumns(20);
        ma2.setRows(5);
        jScrollPane2.setViewportView(ma2);

        resta1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        resta1.setText("resta");
        resta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resta1ActionPerformed(evt);
            }
        });

        salir.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        limpiar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        traza.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        traza.setText("Traza");
        traza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trazaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel3.setText("Llenar Matriz");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel4.setText("Llenar Matriz");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(llenar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(llenar2))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(38, 38, 38)
                                .addComponent(limite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(suma))
                                    .addComponent(resta1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(traza, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mensa1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(limpiar)
                                .addGap(73, 73, 73))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tra2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(limite, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(mensa1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(llenar)
                    .addComponent(llenar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tra2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(suma)
                                .addGap(18, 18, 18)
                                .addComponent(resta1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(traza))
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(limpiar)
                            .addComponent(salir))
                        .addContainerGap(49, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        s.sumaMatriz(this.m1, this.m2);
    }//GEN-LAST:event_sumaActionPerformed

    private void llenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llenarActionPerformed
        int m1[][] = new int[Integer.parseInt(limite.getSelectedItem().toString())][Integer.parseInt(limite.getSelectedItem().toString())];
        for (int i = 0; i < Integer.parseInt(limite.getSelectedItem().toString()); i++) {
            ma1.setText(ma1.getText() + "\n");
            for (int j = 0; j < Integer.parseInt(limite.getSelectedItem().toString()); j++) {
                int valor = Integer.parseInt(JOptionPane.showInputDialog("digite los valores de la matriz 1"));
                m1[i][j] = valor;
                ma1.setText(ma1.getText() + m1[i][j] + " ");
                setM1(m1);
                System.out.println(m1[i][j]);
            }
        }
    }//GEN-LAST:event_llenarActionPerformed

    private void llenar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llenar2ActionPerformed
        int m2[][] = new int[Integer.parseInt(limite.getSelectedItem().toString())][Integer.parseInt(limite.getSelectedItem().toString())];
        for (int i = 0; i < Integer.parseInt(limite.getSelectedItem().toString()); i++) {
            ma2.setText(ma2.getText() + "\n");
            for (int j = 0; j < Integer.parseInt(limite.getSelectedItem().toString()); j++) {
                int valor2 = Integer.parseInt(JOptionPane.showInputDialog("digite los valores de la matriz 2"));
                m2[i][j] = valor2;
                ma2.setText(ma2.getText() + m2[i][j] + " ");
                setM2(m2);
                System.out.println(m2[i][j]);
            }
        }
    }//GEN-LAST:event_llenar2ActionPerformed

    private void limiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limiteActionPerformed

        if (limite.getSelectedItem().toString().equals("-SELECCIONES-")) {
            mensa1.setText("*Seleccione");
        } else {
            String mensaje = "la matriz es de " + limite.getSelectedItem().toString() + "X";
            mensaje = mensaje + limite.getSelectedItem().toString();
            mensa1.setText(mensaje);
            
        }
    }//GEN-LAST:event_limiteActionPerformed

    private void resta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resta1ActionPerformed

        s.restaMatriz(this.m1, this.m2);
    }//GEN-LAST:event_resta1ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_salirActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        ma1.setText("");
        ma2.setText("");
        limite.setSelectedIndex(0);
        mensa1.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void trazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trazaActionPerformed
       s.trazaMatriz1(this.m1);
       s.trazaMatriz2(this.m2);

            
       
    }//GEN-LAST:event_trazaActionPerformed
    Operaciones s = new Operaciones();

    public JComboBox getLimite() {
        return limite;
    }

    public void setLimite(JComboBox limite) {
        this.limite = limite;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox limite;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton llenar;
    private javax.swing.JButton llenar2;
    private javax.swing.JTextArea ma1;
    private javax.swing.JTextArea ma2;
    private javax.swing.JLabel mensa;
    private javax.swing.JLabel mensa1;
    private javax.swing.JButton resta1;
    private javax.swing.JButton salir;
    private javax.swing.JButton suma;
    private javax.swing.JLabel tra2;
    private javax.swing.JButton traza;
    // End of variables declaration//GEN-END:variables

    public int[][] getM1() {
        return m1;
    }

    public void setM1(int[][] m1) {
        this.m1 = m1;
    }

    public int[][] getM2() {
        return m2;
    }

    public void setM2(int[][] m2) {
        this.m2 = m2;
    }

}
