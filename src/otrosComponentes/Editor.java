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

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class Editor {
    public static void main (String[]args){
        FrmEditor editor = new FrmEditor();
        
        editor.setLocationRelativeTo(null);
        editor.setDefaultCloseOperation(EXIT_ON_CLOSE);
        editor.setVisible(true);
    }
}
