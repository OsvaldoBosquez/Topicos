/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponenteSinPanel;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author Luis Páez
 */
public class ComponenteObligatorio extends JTextField{
    private Border bordePredeterminado;
//  Si haces esto ya no lo puedes arrastrar 
//private JTextFieldObligatorio(){
//    }
    
    public ComponenteObligatorio(){
    bordePredeterminado = this.getBorder();
    
    this.addFocusListener(new FocusAdapter() {
        @Override
        public void focusLost(FocusEvent e) {
            evaluar();
        }
    });
    }
    
    public void evaluar(){
        if(this.getText().isEmpty()){
        this.setBorder(BorderFactory.createLineBorder(new Color(255, 0, 0)));
     } else{
        this.setBorder(bordePredeterminado);
      }
    }
    
    @Override
     public void setText(String texto){
     super.setText(texto);
     evaluar();
 }
 
 public String getText(){
     return super.getText();
 }
}
