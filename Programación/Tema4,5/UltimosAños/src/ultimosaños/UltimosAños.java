/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ultimosaños;

import java.util.Scanner;

/**
 *
 * @author Multi
 */
public class UltimosAños {

    /**
     * @param args the command line arguments
     */
    public static boolean esBisiesto(int anio) {
        //Por defecto, el año no es bisiesto, voy a evaluar la condiciones
        // en las que sí lo es
        boolean bisiesto = false;
        /*
        Si el año es divisible por cuatro y no lo por 100 es bisiesto .
        Pero si el año es divisible por cuatro y por 100 tambien debería
        serlo por 400.
         */
        if (anio % 4 == 0) {
            //el año es divisible por cuatro
            if (anio % 100 == 0) {
                // si el año es divisible por 100 tambien lo debería ser por 400
                if (anio % 400 == 0) {
                    //el año es divisible por 400
                    bisiesto = true;
                } //else el año es divisible por 100 pero no por 400 (false)
            } else {
                //el año no es divisible por 100 pero sí por cuatro
                bisiesto = true;
            }
        }
        return bisiesto;
    }
    public static void  EnseñarAños(int[] ListaAños){
        for (int i = 0; i <= ListaAños.length-1; i++) {
            System.out.println(ListaAños[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad;
        int año;
        int AñosPosteriores;
        int AñosAnteriores;
        int i = 0;
        int j = 0;

        System.out.println("¿Cuantos años bisisestos desea guardar?");
        cantidad = sc.nextInt();
        /* Ejercicio de meter años bisiestos manualmente
        int[] a_bisiestos = new int[cantidad];
        while(i<=a_bisiestos.length-1){
            System.out.println("Introduce un año:");
            año = sc.nextInt();
            if(esBisiesto(año)){
                //System.out.println("Año introducido.");
                a_bisiestos[i]=año;
                i++;
            }
        }
        EnseñarAños(a_bisiestos);
        */
        int[] a_BisiestosAnterior = new int[cantidad];
        int[] a_BisiestosPosterior = new int[cantidad];
        System.out.println("Introduce un año:");
        año = sc.nextInt();
        AñosAnteriores = año;
        AñosPosteriores = año;
        while(i<= a_BisiestosAnterior.length-1){
            if(esBisiesto(AñosAnteriores)){
                a_BisiestosAnterior[i] = AñosAnteriores;
                i++;
            }
            AñosAnteriores--;
        }
        while(j<= a_BisiestosPosterior.length-1){
            if(esBisiesto(AñosPosteriores)){
                a_BisiestosPosterior[j] = AñosPosteriores;
                j++;
            }
            AñosPosteriores++;
        }
        System.out.println("Años bisiestos anteriores:");
        EnseñarAños(a_BisiestosAnterior);
        System.out.println("Años bisiestos posteriores:");
        EnseñarAños(a_BisiestosPosterior);
    }
    
}
