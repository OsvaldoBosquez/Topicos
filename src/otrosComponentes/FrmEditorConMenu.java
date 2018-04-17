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
import java.io.File;
import java.util.Map;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class FrmEditorConMenu extends javax.swing.JFrame {    
    
   Metodos metodo = new Metodos();
   private boolean subrayado;
   private boolean si;
   JFileChooser chooser = new JFileChooser();
   File archivo;
   
    JColorChooser escogerColor=new JColorChooser();
    Color color;    
    
    public FrmEditorConMenu() {
        initComponents(); 

        spnTamanio.setValue(11); 
       
        
        //Obteniendo las fuentes disponibles en el ordenador
        String fuentes[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();        
        for(int i=0;i<fuentes.length;i++){
            cboTipoLetra.addItem(fuentes[i]);
        }
        
        
       
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuNuevo = new javax.swing.JMenuItem();
        mnuAbrir = new javax.swing.JMenuItem();
        mnuGuardar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EDITOR");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

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

        jMenu1.setMnemonic('a');
        jMenu1.setText("Archivo");

        mnuNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mnuNuevo.setMnemonic('n');
        mnuNuevo.setText("Nuevo");
        mnuNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(mnuNuevo);

        mnuAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnuAbrir.setText("Abrir");
        mnuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(mnuAbrir);

        mnuGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        mnuGuardar.setMnemonic('g');
        mnuGuardar.setText("Guardar");
        mnuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(mnuGuardar);
        jMenu1.add(jSeparator1);

        mnuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        mnuSalir.setMnemonic('s');
        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
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

    private void mnuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNuevoActionPerformed
        if(txtContenido.getText().isEmpty()){
            
        }else{
            int respuestaPane = JOptionPane.showConfirmDialog(this, "Deseas guardar los cambios en "+this.getTitle()+"? \n"
                    + "Se debe guardar con .txt");
            if(respuestaPane == JOptionPane.YES_OPTION){
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "Archivos de texto", "txt");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar Archivo");
            int respuestaChoo = chooser.showSaveDialog(this);
         if(respuestaChoo == JFileChooser.APPROVE_OPTION){
             archivo = chooser.getSelectedFile();
             if(archivo.getName().endsWith("txt")){
                String contenido = txtContenido.getText();
                String respuesta3 = metodo.GuardarTexto(archivo, contenido);
             if(respuesta3 !=null){
                    JOptionPane.showMessageDialog(this, respuesta3);
                }else{
                    JOptionPane.showMessageDialog(this, "Error al guardar");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Se debe guardar en .txt");
        }
         }
         txtContenido.setText(null);
            
        }else{     
          txtContenido.setText(null);
    }
         }

    }//GEN-LAST:event_mnuNuevoActionPerformed

    private void mnuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAbrirActionPerformed
        
        if(txtContenido.getText().isEmpty()){
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto", "txt");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Abrir Archivo");
            int respuesta = chooser.showOpenDialog(this);
        
            if(respuesta == JFileChooser.APPROVE_OPTION){
                archivo = chooser.getSelectedFile();
                if(archivo.canRead()){
                    if(archivo.getName().endsWith("txt")){
                        String contenido = metodo.AbrirTexto(archivo);
                        txtContenido.setText(contenido);
                  
                    }else{
                        JOptionPane.showMessageDialog(this, "Solo se pueden abrir archivos con terminacion .txt");
                    }
                }   
            }
        }else{
            int respuesta = JOptionPane.showConfirmDialog(this, "Deseas guardar los cambios en "+this.getTitle()+" ?\n"
                    + "Con terminacion .txt");
            if(respuesta == JOptionPane.YES_OPTION){
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "Archivos de texto", "txt");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar Archivo");
            int respuesta2 = chooser.showSaveDialog(this);
         if(respuesta2 == JFileChooser.APPROVE_OPTION){
             archivo = chooser.getSelectedFile();
             if(archivo.getName().endsWith("txt")){
                String contenido = txtContenido.getText();
                String respuesta3 = metodo.GuardarTexto(archivo, contenido);
             if(respuesta3 !=null){
                    JOptionPane.showMessageDialog(this, respuesta3);
                }else{
                    JOptionPane.showMessageDialog(this, "Error al guardar");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Se debe guardar en .txt");
        }
         }
        }else{
         
    }
        }
        
    }//GEN-LAST:event_mnuAbrirActionPerformed

    private void mnuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGuardarActionPerformed
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "Archivos de texto", "txt");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar Archivo");
        int respuesta = chooser.showSaveDialog(this);
        
        if(respuesta == JFileChooser.APPROVE_OPTION){
            archivo = chooser.getSelectedFile();
            if(archivo.exists()){
                archivo.getName();
                archivo.getAbsolutePath();
            if(archivo.getName().endsWith("txt")){
                String contenido = txtContenido.getText();
                String respuesta2 = metodo.GuardarTexto(archivo, contenido);
                if(respuesta2 !=null){
                    JOptionPane.showMessageDialog(this, respuesta2);
                }else{
                    JOptionPane.showMessageDialog(this, "Error al guardar");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Se debe guardar en .txt");
             }}else{
              archivo = chooser.getSelectedFile();
              if(archivo.getName().endsWith("txt")){
                String contenido = txtContenido.getText();
                String respuesta2 = metodo.GuardarTexto(archivo, contenido);
                if(respuesta2 !=null){
                    JOptionPane.showMessageDialog(this, respuesta2);
                }else{
                    JOptionPane.showMessageDialog(this, "Error al guardar");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Se debe guardar en .txt");
             }
          }
        }
    }//GEN-LAST:event_mnuGuardarActionPerformed

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        
        int respuesta = JOptionPane.showConfirmDialog(this, "Deseas salir y guardar?");
        
        if(respuesta == JOptionPane.YES_OPTION){
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "Archivos de texto", "txt");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar Archivo");
            int respuesta2 = chooser.showSaveDialog(this);
         if(respuesta2 == JFileChooser.APPROVE_OPTION){
             archivo = chooser.getSelectedFile();
             if(archivo.getName().endsWith("txt")){
                String contenido = txtContenido.getText();
                String respuesta3 = metodo.GuardarTexto(archivo, contenido);
             }else{
                JOptionPane.showMessageDialog(this, "Se debe guardar en .txt");
        }
         }
            this.dispose();
        }else{     
          this.dispose();
    }
        
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
       if(txtContenido.getText().isEmpty()){
            this.dispose();
       }else{
        
        int respuesta = JOptionPane.showConfirmDialog(this, "No haz guardado las modificaciones\n"
                + "Deseas salir aun asi?");
        if(respuesta == JOptionPane.YES_OPTION){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
        }else{     
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }   
      }
        
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(FrmEditorConMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEditorConMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEditorConMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEditorConMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEditorConMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCursiva;
    private javax.swing.JToggleButton btnNegrita;
    private javax.swing.JToggleButton btnSubrayado;
    private javax.swing.JComboBox<String> cboTipoLetra;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mnuAbrir;
    private javax.swing.JMenuItem mnuGuardar;
    private javax.swing.JMenuItem mnuNuevo;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JSpinner spnTamanio;
    private javax.swing.JTextField txtColor;
    public javax.swing.JTextArea txtContenido;
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
    private boolean SiNo(){
        if(archivo.exists()){
                archivo.getName();
                archivo.getAbsolutePath();
            if(archivo.getName().endsWith("txt")){
                String contenido = txtContenido.getText();
                String respuesta2 = metodo.GuardarTexto(archivo, contenido);
                if(respuesta2 !=null){
                    JOptionPane.showMessageDialog(this, respuesta2);
                }else{
                    JOptionPane.showMessageDialog(this, "Error al guardar");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Se debe guardar en .txt");
             }
            si = true;
            return si;
          }else{
              archivo = chooser.getSelectedFile();
              if(archivo.getName().endsWith("txt")){
                String contenido = txtContenido.getText();
                String respuesta2 = metodo.GuardarTexto(archivo, contenido);
                if(respuesta2 !=null){
                    JOptionPane.showMessageDialog(this, respuesta2);
                }else{
                    JOptionPane.showMessageDialog(this, "Error al guardar");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Se debe guardar en .txt");
             }
          }
        si = false;
        return si;
    }
}
