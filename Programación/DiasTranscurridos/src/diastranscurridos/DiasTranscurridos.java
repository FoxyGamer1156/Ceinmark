/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diastranscurridos;

import java.util.Scanner;

/**
 *
 * @author Multi
 */
public class DiasTranscurridos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        int dia;
        int mes;
        int DiasPasados = 0;
        char confirm;
        char continuar = 'Y';
        boolean seguir = false;
        /*final int Enero,Marzo,Mayo,Julio,Agosto,Octubre,Diciembre = 31;*/
        final int Enero = 31;
        final int Febrero = 28;
        final int Marzo = 31;
        final int Abril = 30;
        final int Mayo = 31;
        final int Junio = 30;
        final int Julio = 31;
        final int Agosto = 31;
        final int Septiembre = 30;
        final int Octubre = 31;
        final int Noviembre = 30;
        final int Diciembre = 31;
        /*final int Abril,Junio,Septiembre,Noviembre = 30;*/

        //Creamos el escaner
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Introduce el dia de hoy:");
            dia = sc.nextInt();
            System.out.println("Introduce el mes de hoy en numero(maximo 12):");
            mes = sc.nextInt();
            for(int i=1; i < mes; i++){
                switch(i){
                    case 1:
                        DiasPasados += Enero;
                        break;
                    case 2:
                        DiasPasados += Febrero;
                        break;
                    case 3:
                        DiasPasados += Marzo;
                        break;
                    case 4:
                        DiasPasados += Abril;
                        break;
                    case 5:
                        DiasPasados += Mayo;
                        break;
                    case 6:
                        DiasPasados += Junio;
                        break;
                    case 7:
                        DiasPasados += Julio;
                        break;
                    case 8:
                        DiasPasados += Agosto;
                        break;
                    case 9:
                        DiasPasados += Septiembre;
                        break;
                    case 10:
                        DiasPasados += Octubre;
                        break;
                    case 11:
                        DiasPasados += Noviembre;
                        break;
                    case 12:
                        DiasPasados += Diciembre;
                        break;
                }
            }
            System.out.println("Han paso "+(DiasPasados += dia-1));
            System.out.println("¿Quieres seguir utilizando el contador de dias?");
            System.out.println("Introduce:Y(YES)/N(NO)");
            confirm = sc.next().charAt(0);
            confirm = Character.toTitleCase(confirm);
            seguir = (confirm == continuar)?true:false;        
        }while(seguir);
    }
    
}
