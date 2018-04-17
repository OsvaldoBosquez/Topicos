/*
Osvaldo Bosquez Garcia 16410108
Alejandro Leal Gamboa 16410129
Fecha: 27/febrero/2018
Tiempo de desarrollo: 6 horas aprox
Contratiempos:  Al habilitar el boton de estilo subrayado no lo representaba en el TextArea con el primer trozo de codigo que usamos,
asi que tuvimos que indagar en la red un poco y asi descubrimos un metodo para ello. Ademas nos detuvo el hecho de que no podiamos representar 
el tipo de fuente que era en el ComboBox.
Conclusiones:  Consideramos que fue una buena tactica el hacernos buscar el como configurar los componentes por nosotros mismo pues nos vimos
forzados a pensar e investigar por nuestra propia cuenta, que aunque el ejercicio no tuvo una dificultad tan elevada eran componenetes que algunos 
no sabiamos el como usarlos.

Referencias: https://www.lawebdelprogramador.com/foros/Java/1423586-Como-subrayar-texto-y-negrita-en-Java-Swing.html
https://codigosparadesarrolladores.blogspot.mx/2014/10/codigo-java-cambiar-el-estilo-de-la-fuente-de-un-jtextfield-y-demas-elementos.html
http://chuwiki.chuidiang.org/index.php?title=Fuentes_de_texto_en_Java
 
*/
package otrosComponentes;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.JColorChooser;


public class FrmEditor extends javax.swing.JFrame {    
    
   private boolean subrayado;
   
    JColorChooser escogerColor=new JColorChooser();
    Color color;    
    
    public FrmEditor() {
        initComponents(); 

        spnTamanio.setValue(11); 
        
        //Obteniendo las fuentes disponibles en el ordenador
        String fuentes[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();        
        for(int i=0;i<fuentes.length;i++){
            cboTipoLetra.addItem(fuentes[i]);
        }
        txtContenido.setText("Mensaje de Prueba");
        
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboTipoLetra = new javax.swing.JComboBox<>();
        btnNegrita = new javax.swing.JToggleButton();
        btnCursiva = new javax.swing.JToggleButton();
        btnSubrayado = new javax.swing.JToggleButton();
        spnTamanio = new javax.swing.JSpinner();
        txtColor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtContenido = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EDITOR");

        cboTipoLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoLetraActionPerformed(evt);
            }
        });

        btnNegrita.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNegrita.setMnemonic('n');
        btnNegrita.setText("N");
        btnNegrita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegritaActionPerformed(evt);
            }
        });

        btnCursiva.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        btnCursiva.setMnemonic('c');
        btnCursiva.setText("C");
        btnCursiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCursivaActionPerformed(evt);
            }
        });

        btnSubrayado.setMnemonic('s');
        btnSubrayado.setText("S");
        btnSubrayado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubrayadoActionPerformed(evt);
            }
        });

        spnTamanio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnTamanioStateChanged(evt);
            }
        });

        txtColor.setEditable(false);
        txtColor.setBackground(new java.awt.Color(0, 0, 0));
        txtColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtColorMouseClicked(evt);
            }
        });

        txtContenido.setColumns(20);
        txtContenido.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        txtContenido.setRows(5);
        txtContenido.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtContenido);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboTipoLetra, 0, 150, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNegrita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCursiva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSubrayado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtColor, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNegrita)
                        .addComponent(btnCursiva)
                        .addComponent(btnSubrayado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboTipoLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Metodo para cambiar el tipo de fuente seleccionado en el JComboBox
     */
    public void cambiarTipoLetra(){
        if(!btnNegrita.isSelected() && !btnCursiva.isSelected() && !btnSubrayado.isSelected()){
            txtContenido.setFont(new Font((String) cboTipoLetra.getSelectedItem(),0,(int)spnTamanio.getValue()));
        }
        else if(btnNegrita.isSelected() && !btnCursiva.isSelected() && !btnSubrayado.isSelected()){
            txtContenido.setFont(new Font((String) cboTipoLetra.getSelectedItem(),1,(int)spnTamanio.getValue()));
        }
        else if(!btnNegrita.isSelected() && btnCursiva.isSelected() && !btnSubrayado.isSelected()){
            txtContenido.setFont(new Font((String) cboTipoLetra.getSelectedItem(),2,(int)spnTamanio.getValue()));
        }
        else if(!btnNegrita.isSelected() && !btnCursiva.isSelected() && btnSubrayado.isSelected()){
            txtContenido.setFont(new Font((String) cboTipoLetra.getSelectedItem(),0,(int)spnTamanio.getValue()));
            subrayado();
        }
        else if(btnNegrita.isSelected() && btnCursiva.isSelected() && !btnSubrayado.isSelected()){
            txtContenido.setFont(new Font((String) cboTipoLetra.getSelectedItem(),3,(int)spnTamanio.getValue()));
        }
        else if(!btnNegrita.isSelected() && btnCursiva.isSelected() && btnSubrayado.isSelected()){
            txtContenido.setFont(new Font((String) cboTipoLetra.getSelectedItem(),2,(int)spnTamanio.getValue()));
            subrayado();
        }
        else if(btnNegrita.isSelected() && btnCursiva.isSelected() && btnSubrayado.isSelected()){
            txtContenido.setFont(new Font((String) cboTipoLetra.getSelectedItem(),3,(int)spnTamanio.getValue()));
            subrayado();
        }
        else if(btnNegrita.isSelected() && !btnCursiva.isSelected() && btnSubrayado.isSelected()){
            txtContenido.setFont(new Font((String) cboTipoLetra.getSelectedItem(),1,(int)spnTamanio.getValue()));
            subrayado();
        }
    }
    //Invocacion del metodo anterior en cada uno de los botones de estilo disponibles
    private void btnNegritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegritaActionPerformed
        cambiarTipoLetra();
    }//GEN-LAST:event_btnNegritaActionPerformed

    private void btnCursivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCursivaActionPerformed
       cambiarTipoLetra();
    }//GEN-LAST:event_btnCursivaActionPerformed

    private void btnSubrayadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubrayadoActionPerformed
      cambiarTipoLetra();
    }//GEN-LAST:event_btnSubrayadoActionPerformed

    private void txtColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtColorMouseClicked
        /**
         * Validacion del numero de cliks en el mouse y boton principal del mismo para abrir el JColorChooser
         * evt.getClickCount = 2 para el doble click
         * evt.getButton = 1 para validar el boton principal 
         */
        if(evt.getClickCount()==2 && evt.getButton() == 1){
            color=escogerColor.showDialog(null,"Seleccionar color",Color.BLACK);
        txtColor.setBackground(color);
        txtContenido.setForeground(color);
        }
       
    }//GEN-LAST:event_txtColorMouseClicked

    private void spnTamanioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnTamanioStateChanged
        txtContenido.setFont(new Font((String) cboTipoLetra.getSelectedItem(),txtContenido.getFont().getStyle(),(int)spnTamanio.getValue()));
        cambiarTipoLetra();
    }//GEN-LAST:event_spnTamanioStateChanged

    private void cboTipoLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoLetraActionPerformed
        
        //cboTipoLetra.setFont(new Font((String) cboTipoLetra.getSelectedItem(),txtContenido.getFont().getStyle(),(int)spnTamanio.getValue()));
        txtContenido.setFont(new Font((String) cboTipoLetra.getSelectedItem(),txtContenido.getFont().getStyle(),(int)spnTamanio.getValue()));
        cambiarTipoLetra();
    }//GEN-LAST:event_cboTipoLetraActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(FrmEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEditor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCursiva;
    private javax.swing.JToggleButton btnNegrita;
    private javax.swing.JToggleButton btnSubrayado;
    private javax.swing.JComboBox<String> cboTipoLetra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnTamanio;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextArea txtContenido;
    // End of variables declaration//GEN-END:variables
    /**
     * Metodo para poder subrayar el texto en el JTextArea
     * @return 
     */
    private boolean subrayado() {
        if (btnSubrayado.isSelected()) {
            Font fuente = txtContenido.getFont();
            Map atributos = fuente.getAttributes();
            atributos.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
            txtContenido.setFont(fuente.deriveFont(atributos));
            subrayado = true;
            return subrayado;
        } else {
            subrayado = false;
            return subrayado;
        }
    }
}
