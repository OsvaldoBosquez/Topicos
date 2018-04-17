/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.Arrays;
import java.util.Locale;

/**
 *
 * @author sr_os
 */
public class MetodosString {
    public static void main(String[] args) {
        String s = "Prueba de Strings";
        String x = "Segundo String";
        
        //devuelde el caracter en el indeice indicado
        System.out.println(s.charAt(0));
        //
        System.out.println(s.chars().toString());
        //Devuelve el valor de un caracterer en el indice dado en Unicode
        System.out.println(s.codePointAt(0));
        //Devuelve el valor de un caracterer anterior al indice dado en Unicode
        System.out.println(s.codePointBefore(1));
        //Devuelve el total de de caracteres Unicode que se encuentren desde el 
        //primer indice hasta el segundo indice dados como parametros
        System.out.println(s.codePointCount(0, 1));
        //
        System.out.println("Compare "+s.compareTo("Pruebda"));
        //
        System.out.println(s.compareToIgnoreCase(x));
        //Une dos Strings, uso similar al operador +
        System.out.println(s.concat(" "+x));
        //Regresa true si es que la cadena de texto contienen la secuencia de cararcteres 
        System.out.println(s.contains("tring"));
        //Parecido al contains pero este metodo se asegura que todo el String sea 
        //identico a lo que contiene la secuencia de caracteres dada
        System.out.println(s.contentEquals("Prueba de Strings"));
        //Compara el String con un objeto dado de parametro y regresa un booleano
        Object sb = new Object();
        System.out.println(s.equals(sb));
        //Compara una String con otra dada de parametrso ignoarando si hay mayusculas o minisculas
        System.out.println(s.equalsIgnoreCase("prueba DE strIngs"));
        //Regresa un true si la secuencia de carcateres dada coincide con la terminacion 
        //del string
        System.out.println(s.endsWith("ngs"));
        //Indica si dos cadenas de texto son identicas entre si 
        System.out.println(s.equals(x));
        //Tiene el mismo funcionamiento que equals pero este ignora las mayusculas y minusculas
        System.out.println(s.equalsIgnoreCase(x));
        //Devuelve un array de bytes usando el formato de charset predefinido, se puede agregar como 
        //parametro algun otro charset
        System.out.println("GetBytes "+s.getBytes());
        //Regresa el nombre de la calse del objeto que se esta utilizando 
        System.out.println(s.getClass());
        //Regresa un código hash para el valor de la String usando el algoritmo.
        System.out.println(s.hashCode());
        //Devuelve el indice del carcater dado y el segundo parametro se indica a partir de que
        //indice se buscara
        System.out.println(s.indexOf("e", 5));
        //Regresa la representacion canonica del String 
        System.out.println(s.intern());
        //Devuelve un true si es que el String esta vacio
        System.out.println(s.isEmpty());
        //
        System.out.println(s.lastIndexOf("s"));
        //Devuelve el tamaño del String
        System.out.println(s.length());
        //El método matches de String nos permite comprobar si un String cumple una expresión regular pasado como parámetro. Si es cierta devuelve true, sino false.
        //Una expresión regular es una expresión textual que utiliza símbolos especiales para hacer búsquedas avanzadas.
        System.out.println(s.matches(s));
        //uma el número de caracteres que hay desde el inicio hasta el índice con el límite impuesto. 
        System.out.println("Ofset "+s.offsetByCodePoints(0, 1));
        //Reemplaza una secuencia de caracteres o uno en especifico por una nueva secuencia de carcateres
        System.out.println(s.replace("de","st"));
        //Reemplaza completamente una primera String por la segunda String 
        System.out.println(s.replaceAll(s, x));
        //Reemplaza la la primera String en el primer caracter que coincida con el parametro 
        System.out.println(s.replaceFirst("S", x));
        //Separa el String donde encuentre un caracter identico al que se da como parametro 
        String [] i = "A,B,C".split(",");
        System.out.println(Arrays.toString(i));
        //Regresa true si es que el String inicia con el caracter o secuencia de estos 
        //se puede agregar un parametro int para indicar el indice del cual se desea comenzar a buscar
        System.out.println(s.startsWith("d", 7));
        //Muestra los caracteres que esten entre los indices dados como paramtereos del String
        System.out.println(s.subSequence(0, 4));
        //Muestra los caracteres del String desde el indice dado como parametro hasta el final del String
        //se puede agregar un segundo paramatreo para definir hasta que indice se desea obtener
        System.out.println(s.substring(8));
        //Devuelve un arreglo de caracteres del String 
        System.out.println(s.toCharArray());
        //Convierte todos los caracteres del String en minusculas
        System.out.println(s.toLowerCase());
        //Devuelve un objeto convertido a String
        System.out.println(s.toString());
        //Convierte todos los caracteres del String en mayusculas
        System.out.println(s.toUpperCase());
        //Devuelve el mismo String pero sin espacios en blanco
        System.out.println(s.trim());

    }
}
