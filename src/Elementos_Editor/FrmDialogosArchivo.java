/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos_Editor;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author sr_os
 */
public class FrmDialogosArchivo extends javax.swing.JFrame {

    /**
     * Creates new form FrmDialogosArchivo
     */
    public FrmDialogosArchivo() {
        initComponents();
        
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
        btnAbrir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        log = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ejemplo_JFileChooser");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnAbrir.setMnemonic('a');
        btnAbrir.setText("Abrir Archivo");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        jPanel1.add(btnAbrir);

        btnGuardar.setMnemonic('g');
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar);

        log.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(log);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Simula la apertura de un archivo.
     * @param evt informacion del evento
     */
    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        JFileChooser chooser = new JFileChooser();
        
        //chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "Archivos de texto", "txt");
    chooser.setFileFilter(filter);
        
        chooser.setDialogTitle("Abrir Archivo");
       int respuesta = chooser.showOpenDialog(this);
       
       if(respuesta == JFileChooser.APPROVE_OPTION){
           File archivo = chooser.getSelectedFile();
           
          ((DefaultListModel) log.getModel()).addElement("Abrir Archivo: "+archivo.getName());
          ((DefaultListModel) log.getModel()).addElement("Ruta Completa absoluta "+ archivo.getAbsolutePath());
          ((DefaultListModel) log.getModel()).addElement("Existe "+archivo.getName()+" : "+archivo.exists());
          
          
       }
        
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        JFileChooser chooser = new JFileChooser();
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "Archivos de texto", "txt");
         chooser.setFileFilter(filter);
        
        chooser.setDialogTitle("Guardar Archivo");
       int respuesta = chooser.showSaveDialog(this);
       
       if(respuesta == JFileChooser.APPROVE_OPTION){
           File archivo = chooser.getSelectedFile();    
           
          ((DefaultListModel) log.getModel()).addElement("Guardar Archivo Archivo: "+archivo.getName());
          ((DefaultListModel) log.getModel()).addElement("Ruta Completa absoluta "+ archivo.getAbsolutePath());
          ((DefaultListModel) log.getModel()).addElement("Existe "+archivo.getName()+" : "+archivo.exists());
          
          
       }
    }//GEN-LAST:event_btnGuardarActionPerformed
        
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       int respuesta = JOptionPane.showConfirmDialog(this, "Deseas cerrar?");
       
        if(respuesta == JOptionPane.YES_OPTION){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            System.out.println("No hizo nada");
        }else{
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
    }
        
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(FrmDialogosArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDialogosArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDialogosArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDialogosArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDialogosArchivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> log;
    // End of variables declaration//GEN-END:variables
}
