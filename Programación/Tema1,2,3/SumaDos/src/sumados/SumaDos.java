/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumados;

import java.util.Scanner;

/**
 *
 * @author Multi
 */
public class SumaDos {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdcuce el primer numero:");
        int Num1 = sc.nextInt();
        System.out.println("Introdcuce el segundo numero:");
        int Num2 = sc.nextInt();
        int Result = Num1+Num2;
        System.out.println(Num1+"+"+Num2+"="+Result);
    }
    
}
