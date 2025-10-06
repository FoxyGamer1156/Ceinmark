/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora_v4;

import java.util.Scanner;

/**
 *
 * @author Multi
 */
public class Calculadora_V4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        double num1;
        double num2;
        char simbolo;
        final char sum = '+';
        final char res = '-';
        final char multi = '*';
        final char div = '/';
        char confirm;
        char continuar = 'Y';
        boolean seguir = false;
        //Escaner
        Scanner sc = new Scanner(System.in);

        do{//Pedimos primer numero
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
                    System.out.println(num1+"+"+num2+"="+(num1+num2));
                    break;
                case res:
                    System.out.println(num1+"-"+num2+"="+(num1-num2));
                    break;
                case multi:
                    System.out.println(num1+"*"+num2+"="+(num1*num2));
                    break;
                case div:;
                    System.out.println(num1+"/"+num2+"="+(num1/num2));
                    break;
                default:
                    System.out.println("No existe una operación con ese caracter.");
            }
            System.out.println("¿Quieres seguir utilizando la calculadora?");
            System.out.println("Introduce:Y(YES)/N(NO)");
            confirm = sc.next().charAt(0);
            confirm = Character.toTitleCase(confirm);
            seguir = (confirm == continuar)?true:false;
        }while(seguir);
    }
    
}
