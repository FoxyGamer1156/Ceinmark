/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabla_multi;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Multi
 */
public class Tabla_Multi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num;
        int repetir;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el numero que quieres multiplicar:");
        num = sc.nextDouble();
        System.out.println("Introduce la cantidad de veces que quieres multiplicar:");
        repetir = sc.nextInt();
        for (int i = 0; i <= repetir; i++) {
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
    
}
