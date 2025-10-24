/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author Multi
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
/*Las pruebas de los ejercicios estaran comentado, por si quieres probarlas*/
    public static void  Factorial(int Num){
        int Resultado = 1;
        for (int i = 1; i < Num; i++) {
            Resultado *= i;
        }
        System.out.println("El resultado de la factorización es "+Resultado);
    }
    public static boolean Primo(int Num){
        for(int i=2;2*i<Num;i++){
            if(Num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void AreaCirculo(double Radio){
        System.out.println("El area de su circulo es de "+(Math.PI*Radio*Radio));
    }
    public static int Mayor_Menor(int Num1, int Num2){
        if (Num1>=Num2) {
            return Num1;
        }
        return Num2;
    }
    public static void SaludoPersonalizado(String Saludo){
        System.out.println("Su saludo personalizado es:"+Saludo);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Ejercicio de factorización:
        /*int num;
        System.out.println("Introduce un numero para factorizar:");
        num = sc.nextInt();
        Factorial(num);*/

        //Numeros primos
        /*int num;
        System.out.println("Numero que quieres comprobar si es primo:");
        num = sc.nextInt();
        if (Primo(num)){
            System.out.println("El numero "+num+" es primo.");
        }else{
            System.out.println("No es primo.");
        }*/

        //Calculo del area del circulo
        /*double Radio;
        System.out.println("Introduce un radio para calcular el area del circulo:");
        Radio = sc.nextDouble();
        AreaCirculo(Radio);*/

        //Comprobar que numero es mayor o menos
        /*int num1;
        int num2;
        System.out.println("Introduce el primer numero:");
        num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero:");
        num2 = sc.nextInt();
        System.out.println("El numero mas alto es "+Mayor_Menor(num1, num2));*/

        //Saludo personalizado
        /*String Saludo;
        System.out.println("Introduce un saludo:");
        Saludo = sc.nextLine();
        SaludoPersonalizado(Saludo);*/
    }
    
}
