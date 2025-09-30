/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora_v3;

import java.util.Scanner;

/**
 *
 * @author Multi
 */
public class Calculadora_V3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        double num1;
        double num2;
        double result = 0.0;
        char simbolo;
        final char sum = '+';
        final char res = '-';
        final char multi = '*';
        final char div = '/';
        //Escaner
        Scanner sc = new Scanner(System.in);

        //Pedimos primer numero
        System.out.println("Introduce el primer numero:");
        num1 = sc.nextDouble();
        //Pedimos segundo numero
        System.out.println("Introduce el segundo numero:");
        num2 = sc.nextDouble();
        //Pedimos simbolo
        System.out.println("Introduce la operacion que quieres hacer:");
        simbolo = sc.next().charAt(0);

        switch(simbolo){
            case sum:
                result = num1+num2;
                System.out.println(num1+"+"+num2+"="+result);
                break;
            case res:
                result = num1-num2;
                System.out.println(num1+"-"+num2+"="+result);
                break;
            case multi:
                result = num1*num2;
                System.out.println(num1+"*"+num2+"="+result);
                break;
            case div:
                result = num1/num2;
                System.out.println(num1+"/"+num2+"="+result);
                break;
            default:
                System.out.println("No existe una operación con ese caracter.");
        }
    }
    
}
