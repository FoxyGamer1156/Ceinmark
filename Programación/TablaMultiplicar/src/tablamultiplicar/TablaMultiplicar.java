/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablamultiplicar;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Multi
 */
//Pedir un numero por pantalla y hacer la multiplicación
public class TablaMultiplicar {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) throws InterruptedException {
        double num;
        double result;
        int i;//Indice
        Scanner sc = new Scanner(System.in);

        i = 0;
        
        System.out.println("Introduce el numero que quieres multiplicar:");
        num = sc.nextDouble();
        while(i <= 10)
        {
            result = num*i;
            System.out.println(num+" x "+i+" = "+result);
            i++;
            TimeUnit.SECONDS.sleep(1);
        }
    }
    
}
