/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 *
 * @author Multi
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> Nombres = new ArrayList<>();
        System.out.println("Introduce 5 nombres:");
        while(Nombres.size() < 5) {
            System.out.println("Introduce el nombre: ");
            /*String nombre = sc.nextLine();*/
            Nombres.add(sc.nextLine());
        }
        Sustituir(Nombres);
    }
    public static void Sustituir(ArrayList<String> nombres){
        StringBuilder result = new StringBuilder("Bienvenido XXX, anfitrion");
        for(String buff : nombres){
            result.replace(result.indexOf(" ")+1, result.indexOf(","), buff);
            System.out.println(result);
        }
        /*VERSION CON STRING
        String frase = "Bienvenido XXX, anfitrion";
        for(String buff : nombres){
            frase.replace("XXX", nombres);
        }*/
        
    }
    public static String extraerNombres(String frase){
        String result = "";
        result = frase.substring(frase.indexOf(' ')+1, frase.indexOf(','));
        return result;
    }
}
