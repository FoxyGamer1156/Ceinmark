/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package añosbisiestos;

import java.util.Scanner;

/**
 *
 * @author Multi
 */
public class AñosBisiestos {

    /**
     * @param args the command line arguments
     */
    public static boolean esBisiesto(int num){
        boolean respuesta = false;
        if ((num%4)==0 && (num%100)!=0){
            respuesta = true;
        }
        else if((num%400)==0){
            respuesta = true;
        }
        else{
            respuesta = false;
        }
        return respuesta;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NumIngreso = 0;
        System.out.println("Introduce un año para combrovar si es bisiesto o 0000 para salir:");
        NumIngreso = sc.nextInt();
        if(NumIngreso != 0){
            while(NumIngreso != 0){
                if(esBisiesto(NumIngreso) == true){
                    System.out.println("El año es bisisesto.");
                }
                else{
                    System.out.println("El año no es bisisesto.");
                }
                System.out.println("Introduce un año para combrovar si es bisiesto o 0000 para salir:");
                NumIngreso = sc.nextInt();
            }
            System.out.println("Has salido del programa.");
        }
        else{
            System.out.println("Has salido del programa.");
        }
    }
    
}
