/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caculadora_v2;

import java.util.Scanner;

/**
 *
 * @author Multi
 */
public class Caculadora_V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1;
        double num2;
        double result;
        int simbolo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero:");
        num1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero:");
        num2 = sc.nextDouble();
        System.out.println("Introduce la operacion que quieres hacer eliguendo un numero:");
        System.out.println("| 1.+ | 2.- | 3.* | 4./ |");
        simbolo = sc.nextInt();
        if (1 == simbolo) 
        {
            result = num1+num2;
            System.out.println(num1+"+"+num2+"="+result);
        }
        else if(2 == simbolo)
        {
            result = num1-num2;
            System.out.println(num1+"-"+num2+"="+result);
        }
        else if(3== simbolo)
        {
            result = num1*num2;
            System.out.println(num1+"*"+num2+"="+result);
        }
        else if(4== simbolo)
        {
            result = num1/num2;
            System.out.println(num1+"/"+num2+"="+result);
        }
        else 
        {
            System.out.println("No existe una operación con ese caracter.");
        }
    }
    
}
