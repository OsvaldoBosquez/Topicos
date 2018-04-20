package ComponenteSinPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class FormatoHolder extends JTextField {
    private String mensaje = "Escriba aqui";
    private boolean enabled = true;
    private boolean estadoHolder;
    private Font holderTextFont,fieldFont;
    private Color holderTextForeground,fieldForeground,fieldBackground;
    private int tamanio,styleTextHolder;

    public FormatoHolder() {
        setHolderTextForeground(super.getForeground());
        setHolderTextFont(super.getFont());
        if (enabled) {
            setMensaje(mensaje);
            evalua();
        }
        this.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                if (enabled) {
                    if (getText().trim().isEmpty()) {
                        estadoHolder = true;
                        evalua();
                        setMensaje(mensaje);

                    }
                }
            }

//            @Override
//            public void focusGained(FocusEvent e) {
//                if (enabled) {
//                    if (estadoHolder) {
//                        setText("");
//                        estadoHolder = false;
//                        evalua();
//                    } else {
//                        estadoHolder = false;
//                        evalua();
//                    }
//                }
//            }

        });
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (enabled) {
                    if (estadoHolder) {
                        setText("");
                        estadoHolder = false;
                        evalua();
                    } else {
                        estadoHolder = false;
                        evalua();
                    }
                }
            }
        });
        
        

    }

    public Font getHolderTextFont() {
        return holderTextFont;
    }

    public void setHolderTextFont(Font holderTextFont) {
        this.holderTextFont = holderTextFont;
    }
    
    public Color getHolderTextForeground() {
        return holderTextForeground;
    }

    public void setHolderTextForeground(Color holderTextForeground) {
        if (holderTextForeground.getAlpha() == 255) {
            this.holderTextForeground = new Color(holderTextForeground.getRed(), holderTextForeground.getGreen(),
                    holderTextForeground.getBlue(), holderTextForeground.getAlpha() - 100);
        } else {
            this.holderTextForeground = holderTextForeground;
        }
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public String getMensaje(){
        return this.mensaje;
    }

    public void enableHolder(boolean x) {
        this.enabled = x;
        if (!x) {
            if (estadoHolder) {
                estadoHolder = false;
                evalua();
                estadoHolder = true;
            } else {
                evalua();
                super.getText();
            }
        } else {
            if (getText().trim().isEmpty()) {
                estadoHolder = true;
                evalua();
                setText(mensaje);
            }
        }
    }

    private void evalua() {
        if (estadoHolder) {
            super.setFont(this.getHolderTextFont());
            super.setForeground(this.getHolderTextForeground());
        } else {
            super.setFont(this.fieldFont);
            super.setForeground(this.fieldForeground);
        }
    }

    @Override
    public void setForeground(Color colorLetra) {
       super.setForeground(colorLetra);
       fieldForeground=colorLetra;
    }

    @Override
    public void setBackground(Color colorFondo) {
        super.setBackground(colorFondo);
        fieldBackground = colorFondo;
        
    }
        @Override 
    public void setFont(Font fuente){
        super.setFont(fuente);
        fieldFont=fuente;
   }

    @Override
    public String getText() {
        if (estadoHolder) {
            return "";
        } else {
            return super.getText();
        }
    }

    @Override
    public void setText(String s) {
        super.setText(s);
    }

}
