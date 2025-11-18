/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos_cadenasdetexto;

/**
 *
 * @author Multi
 */
public class Ejemplos_CadenasdeTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "Y no para, no para, no para, no para";
        //Ejemplo como funciona el LENGTH.
        System.out.println("La longitud de la cadena es de "+cadena.length());
        //Ejemplo de como funciona el substring.
        //El subtring empieza desde esa posicion en adelante, es decir incluye esa posición tambien
        String subcadena1 = cadena.substring(0);
        String subcadena2 = cadena.substring(1);
        String subcadena3 = cadena.substring(11);
        System.out.println(subcadena1);
        System.out.println(subcadena2);
        System.out.println(subcadena3);
        //Ejemplo subtring pero con el index i,j
        //De la posición i a la posición j
        String subcadena4 = cadena.substring(0, 10);
        System.out.println(subcadena4);
        //Ejemplo indexof
        //Te indica la primera posicion de ese caracter
        int PrimeraPosicionCar = cadena.indexOf('n');
    }
    
}
