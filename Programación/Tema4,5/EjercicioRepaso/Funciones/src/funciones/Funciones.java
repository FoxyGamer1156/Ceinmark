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
        System.out.println("Su saludo personalizado es: "+Saludo);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = true;
        int num_Ejercicio = 0;
        String[] Ejercicios = {"1.Ejercicio de factorización","2.Numeros primos", "3.Calculo del area del circulo", 
        "4.Comprobar que numero es mayor o menos", "5.Saludo personalizado", "Si quiere terminar el programa pulse 0."};

        while (salir) {
            for(int i = 0; i < Ejercicios.length; i++){
                System.out.println(Ejercicios[i]);
            }
            System.out.println("¿Que ejercicio quieres comprobar?");
            num_Ejercicio = sc.nextInt();
            //Este nextLine() es para generar un salto de linea, por si el ejercicio que se va a hacer
            //es el numero 5. Ya que el nextInt() no genera salto de lines y probocar un problema al recoger la frase,
            //saltandose el Scanner.
            sc.nextLine();
            if (num_Ejercicio != 0) {
                switch (num_Ejercicio) {
                    case 1:
                        int num;
                        System.out.println("Introduce un numero para factorizar:");
                        num = sc.nextInt();
                        Factorial(num);
                        break;
                    case 2:
                        int num_Primo;
                        System.out.println("Numero que quieres comprobar si es primo:");
                        num_Primo = sc.nextInt();
                        if (Primo(num_Primo)){
                            System.out.println("El numero "+num_Primo+" es primo.");
                        }else{
                            System.out.println("El numero " +num_Primo+" NO es primo.");
                        }
                        break;
                    case 3:
                        double Radio;
                        System.out.println("Introduce un radio para calcular el area del circulo:");
                        Radio = sc.nextDouble();
                        AreaCirculo(Radio);
                        break;
                    case 4:
                        int num1;
                        int num2;
                        System.out.println("Introduce el primer numero:");
                        num1 = sc.nextInt();
                        System.out.println("Introduce el segundo numero:");
                        num2 = sc.nextInt();
                        System.out.println("El numero mas alto es "+Mayor_Menor(num1, num2)+".");
                        break;
                    case 5:
                        String Saludo;
                        System.out.println("Introduce un saludo:");
                        Saludo = sc.nextLine();
                        SaludoPersonalizado(Saludo);
                        break;
                    default:
                        System.out.println("Ha introducido un caracter o numero que no estaba en la lista.");
                        break;
                }
            }else{
                System.out.println("Has salido del programa.");
                salir = false;
            }
        }
    }
}


