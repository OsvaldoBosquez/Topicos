package ComponenteSinPanel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class FormatoHolder {
    
    public void setMensaje (JTextField txtField, String mensaje, int tamanio){
        if(tamanio == 0){
            txtField.setText(mensaje);
            txtField.setForeground(Color.LIGHT_GRAY);
        }
    }
    public void clik(JTextField txtField, String mensaje){
        if(txtField.getText().equals(mensaje)){
            txtField.setText(" ");
            txtField.setForeground(Color.BLACK);
        }
    }
    public void setFontStyle(JTextField txtField, String fuente, int estilo,int tamanio){      
        Font f = new Font(fuente,estilo,tamanio);
        txtField.setFont(f);   
    }
    public void setColor(JTextField txtField, Color colorLetra, Color colorFondo){
        txtField.setForeground(colorLetra);
        txtField.setBackground(colorFondo);
    }
    public boolean enable(JTextField txtField,boolean activado){
        if(activado == true){
            txtField.setText(" ");
            return activado;
        }else{
            return activado;
        }
    }
}
