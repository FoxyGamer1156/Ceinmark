/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora_v1;

import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

/**
 *
 * @author Multi
 */

//1ºPedir primer numero | 2ºPedir segundo numero | 3ºIntroducir simbolo +,-,*,/ | 4ºDevolver operación

//                                                 3ºIntroducir un numeor
public class Calculadora_V1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1;
        double num2;
        double result;
        char simbolo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero:");
        num1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero:");
        num2 = sc.nextDouble();
        System.out.println("Introduce la operacion que quieres hacer:");
        simbolo = sc.nextLine().charAt(0);
        if ('+' == simbolo) 
        {
            result = num1+num2;
            System.out.println(num1+"+"+num2+"="+result);
        }
        else if('-' == simbolo)
        {
            result = num1-num2;
            System.out.println(num1+"-"+num2+"="+result);
        }
        else if('*'== simbolo)
        {
            result = num1*num2;
            System.out.println(num1+"*"+num2+"="+result);
        }
        else if('/'== simbolo)
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
