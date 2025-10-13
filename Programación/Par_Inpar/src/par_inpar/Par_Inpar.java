/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package par_inpar;

import java.util.Scanner;

/**
 *
 * @author Multi
 */
public class Par_Inpar {

    /**
     * @param args the command line arguments
     */
    public static boolean EsPar(int num){
        boolean respuesta = true;
        if ((num%2)==0){
            respuesta = true;
        }
        else{
            respuesta = false;
        }
        return respuesta;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numpar = 0;
        int numimpar = 0;
        int numero;
        String NumerosPuestoPar="";
        String NumerosPuestoImpar="";
        System.out.println("Introduce un numero o 0 para salir");
        numero = sc.nextInt();
        if(numero != 0){
            while (numero != 0) { 
                if(EsPar(numero)){
                    numpar++;
                    NumerosPuestoPar+="|"+numero;
                }
                else{
                    numimpar++;
                    NumerosPuestoImpar+="|"+numero;
                }
                System.out.println("Introduce un numero o 0 para salir");
                numero = sc.nextInt();
            }
            System.out.println("Has escrito "+numpar+" numeros pares (cullos numeros eran "+NumerosPuestoPar+") y "+numimpar+" numeros impares(cullos numeros eran "+NumerosPuestoImpar+").");
        }
        else{
            System.out.println("Has salido.");
        }
    }
    
}
