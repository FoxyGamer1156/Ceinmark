/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piedrapapeltijera;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Multi
 */
public class PiedraPapelTijera {

    /**
     * @param args the command line arguments
     */
    public static void ft_PiedraPapelTijera(String OpcionUsu){
        Random rand = new Random();
        String[] Opciones = {"PIEDRA","PAPEL","TIJERA"};
        int pt_Opciones = rand.nextInt(Opciones.length);
        System.out.println("La maquina ha elegido:"+Opciones[pt_Opciones]);
        switch (Opciones[pt_Opciones]) {
            case "PIEDRA":
                if(OpcionUsu.equals(Opciones[1])){
                    System.out.println("¡HAS GANADO!"); 
                }else if (OpcionUsu.equals(Opciones[2])) {
                    System.out.println("¡HAS PERDIDO!");
                }else{
                    System.out.println("¡EMPATE!");
                }
                break;
            case "PAPEL":
            if(OpcionUsu.equals(Opciones[2])){
                    System.out.println("¡HAS GANADO!"); 
                }else if (OpcionUsu.equals(Opciones[0])) {
                    System.out.println("¡HAS PERDIDO!");
                }else{
                    System.out.println("¡EMPATE!");
                }
                break;
            case "TIJERA":
                if(OpcionUsu.equals(Opciones[1])){
                    System.out.println("¡HAS GANADO!"); 
                }else if (OpcionUsu.equals(Opciones[0])) {
                    System.out.println("¡HAS PERDIDO!");
                }else{
                    System.out.println("¡EMPATE!");
                }
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Opcion;
        String Eleccion;
        boolean Seguir = false;

        System.out.println("¡VAMOS A JUGAR AL PIEDRA, PAPEL O TIJERA!");
        do{
            System.out.println("Elige tu opcion:");
            Opcion = sc.next();
            Opcion = Opcion.toUpperCase();
            if(Opcion.equals("PIEDRA")||Opcion.equals("PAPEL")||Opcion.equals("TIJERA")){
                ft_PiedraPapelTijera(Opcion);
            }
            System.out.println("¿Quieres seguir jugando?(SI/NO)");
            Eleccion = sc.next();
            Eleccion = Eleccion.toUpperCase();
            if(Eleccion.equals("SI")){
                Seguir = true;
            }
        }while(Seguir);
    }
}
