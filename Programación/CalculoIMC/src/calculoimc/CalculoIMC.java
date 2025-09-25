/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculoimc;

import java.util.Scanner;

/**
 *
 * @author Multi
 */
//Calcular el IMC
public class CalculoIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double peso;
        double altura;
        double IMC;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdcuce el tu peso en kilogramos:");
        peso = sc.nextDouble();
        System.out.println("Introdcuce el tu altura en metros:");
        altura = sc.nextDouble();
        IMC = peso/(altura*altura);
        System.out.println("Su IMC es de "+IMC+"kg/m^2");
    }
    
}
