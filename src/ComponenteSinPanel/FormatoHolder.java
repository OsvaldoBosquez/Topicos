package ComponenteSinPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FormatoHolder extends JTextField{
    private boolean enable = true;
    private int alpha=255;
    
    public FormatoHolder(){ 
        if(enable){
        setMensaje("Escriba aqui");
        }
        this.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                if(enable){
                setMensaje("Escriba aqui");
                }
            }   
        });
        this.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if(enable){
                click("Escriba aqui");
                }
            }
        });
       
    }
   
    public void setMensaje (String mensaje){
        System.out.println("Focus "+this.getForeground().getAlpha()+"  "+alpha);
        if(this.getForeground().getAlpha() ==alpha){
        super.setText(mensaje);       
        super.setForeground(new Color (getForeground().getRed(),getForeground().getGreen(),getForeground().getBlue(),getForeground().getAlpha()-100));
        }
    }
    public void click(String mensaje){   
        System.out.println(this.getForeground().getAlpha()+"  "+alpha);
        if(this.getForeground().getAlpha()+100 == alpha){
            super.setText(" "); 
            
            super.setForeground(new Color (getForeground().getRed(),getForeground().getGreen(),getForeground().getBlue(),getForeground().getAlpha()+100));
        }
    }
    public void setFontStyle(String fuente, int estilo,int tamanio){      
        Font f = new Font(fuente,estilo,tamanio);
        this.setFont(f);   
    }

    public void enableHolder(boolean x){
        this.enable = x;
        if(!x){
            this.setText("");
            this.setForeground(Color.black);
        }
    }
    @Override
    public void setForeground(Color colorLetra){
        alpha=colorLetra.getAlpha()-100;
        super.setForeground(new Color (colorLetra.getRed(),colorLetra.getGreen(),colorLetra.getBlue(),alpha));        
    }
    @Override
    public void setBackground(Color colorFondo){
        super.setBackground(colorFondo);
    }
    @Override
    public String getText(){  
System.out.println("Focus get"+this.getForeground().getAlpha()+"  "+alpha);        
        if(this.getForeground().getAlpha()+100 == alpha){
            return "";   
        }else{
            return super.getText(); 
        }
    }

}
