/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import javax.swing.table.DefaultTableModel;
import Logica.*;
import Ui.NuevoGasto;
import javax.swing.JOptionPane;
import Ui.Calcular;



/**
 *
 * @author facundo
 */
public class Evento extends javax.swing.JFrame {
    NuevoGasto obj = new NuevoGasto();
    int cont =0;
    int gastoTotal=0;
    /**
     * Creates new form Evento
     */
    public Evento() {
        initComponents();
        setTitle("ventana2");
       
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
        lbNombreEvento = new javax.swing.JLabel();
        lbCantinvitado = new javax.swing.JLabel();
        txbCantInvitados = new javax.swing.JTextField();
        btNuevoGasto = new javax.swing.JButton();
        btCalcular = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JTable();
        btBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbNombreEvento.setText("evento");

        lbCantinvitado.setText("cantidad de invitados:");

        txbCantInvitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbCantInvitadosActionPerformed(evt);
            }
        });

        btNuevoGasto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ui/money-icon.png"))); // NOI18N
        btNuevoGasto.setText("nuevo gasto");
        btNuevoGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoGastoActionPerformed(evt);
            }
        });

        btCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ui/Cash-register-icon.png"))); // NOI18N
        btCalcular.setText("calcular");
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jList1);

        btBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ui/borrar.png"))); // NOI18N
        btBorrar.setText("borrar");
        btBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbNombreEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbCantinvitado, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txbCantInvitados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btNuevoGasto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCantinvitado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbCantInvitados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCalcular)
                    .addComponent(btNuevoGasto)
                    .addComponent(btBorrar))
                .addGap(20, 20, 20))
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

    private void btNuevoGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoGastoActionPerformed
        NuevoGasto ventana3 = new NuevoGasto();
        ventana3.setVisible(true);
        obj.lbCantInvitados.setText(txbCantInvitados.getText());
        
        abstracta.refreshTable();
    }//GEN-LAST:event_btNuevoGastoActionPerformed

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
       Calcular ventana4 = new Calcular();
       ventana4.setVisible(true);
       for (int i = 0; i < abstracta.getLista().length; i++ ){
            if (abstracta.getLista()[i] !=null) {
                gastoTotal= gastoTotal+abstracta.getLista()[i].getTotal();
            }
            //if (abstracta.getLista()[i] == null){
              //  break;
                //}  
       }
    
       abstracta.setGastoTotal(gastoTotal);
       Calcular.refresh();
    }//GEN-LAST:event_btCalcularActionPerformed

    private void txbCantInvitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbCantInvitadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txbCantInvitadosActionPerformed

    private void btBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBorrarActionPerformed
        try{
        Gasto[] aux = new Gasto[abstracta.getLista().length -1];
        int row =jList1.getSelectedRow();
        if (abstracta.getLista()[row] != null) {
               abstracta.getLista()[row] = null;
            }
            for (int i = 0; i < abstracta.getLista().length; i++ ) {
                if (abstracta.getLista()[i] !=null) {
                    for (int j = 0; j < aux.length; j++) {
                        if (aux[j] == null) {
                            aux[j] = abstracta.getLista()[i];
                            break;
                        }
                    }
                }
            }
            abstracta.setLista(aux);

            abstracta.refreshTable();

            abstracta.saveLista();
        }
        catch (Exception ex){
                JOptionPane.showMessageDialog(this, "no selecciono ningun elemento para borrar");
                }


    }//GEN-LAST:event_btBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Evento().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBorrar;
    private javax.swing.JButton btCalcular;
    private javax.swing.JButton btNuevoGasto;
    public static javax.swing.JTable jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbCantinvitado;
    public static javax.swing.JLabel lbNombreEvento;
    public static javax.swing.JTextField txbCantInvitados;
    // End of variables declaration//GEN-END:variables
}