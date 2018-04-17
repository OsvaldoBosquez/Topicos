package tabla;

import java.awt.Color;

/**
 * Clase auxiliar para agregar datos para el combo.
 */
public class Auto {
    
    private String marca;
    private String modelo;
     private int año;
    private Color color;
    private boolean vendido;

    public Auto(String marca, String modelo,int año, Color color, boolean vendido) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.vendido = vendido;
    }
    
   

    /**
     * Get the value of año
     *
     * @return the value of año
     */
    public int getAño() {
        return año;
    }

    /**
     * Set the value of año
     *
     * @param año new value of año
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * Get the value of vendido
     *
     * @return the value of vendido
     */
    public boolean isVendido() {
        return vendido;
    }

    /**
     * Set the value of vendido
     *
     * @param vendido new value of vendido
     */
    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }


    /**
     * Get the value of color
     *
     * @return the value of color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Set the value of color
     *
     * @param color new value of color
     */
    public void setColor(Color color) {
        this.color = color;
    }


    

    /**
     * Retorna el valor de la marca.
     * @return marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece el valor de la marca.
     * @param marca nuevo valor de marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene el valor del modelo.
     * @return modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el valor del modelo.
     * @param modelo nuevo valor del modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Retorna la descripción textual del objeto.
     * @return marca y modelo
     */
    @Override
    public String toString() {
        return marca + " " + modelo;
    }
}
