/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diasvividos;

import java.util.Scanner;

/**
 *
 * @author Multi
 */
public class DiasVividos {

    /**
     * @param args the command line arguments
     */
    static int DiasTranscurridos(int dias, int meses){
        int DiasTotales = 0;
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
        for(int i=1; i < meses; i++){
                switch(i){
                    case 1:
                        DiasTotales += Enero;
                        break;
                    case 2:
                        DiasTotales += Febrero;
                        break;
                    case 3:
                        DiasTotales += Marzo;
                        break;
                    case 4:
                        DiasTotales += Abril;
                        break;
                    case 5:
                        DiasTotales += Mayo;
                        break;
                    case 6:
                        DiasTotales += Junio;
                        break;
                    case 7:
                        DiasTotales += Julio;
                        break;
                    case 8:
                        DiasTotales += Agosto;
                        break;
                    case 9:
                        DiasTotales += Septiembre;
                        break;
                    case 10:
                        DiasTotales += Octubre;
                        break;
                    case 11:
                        DiasTotales += Noviembre;
                        break;
                    case 12:
                        DiasTotales += Diciembre;
                        break;
                }
            }
        return DiasTotales+dias;
    }
    public static void main(String[] args) {
        int DiaNac, MesNac, AñoNac;
        int DiaActual,MesActual, AñoActual;
        int DiasPasados;
        char confirm;
        char continuar = 'Y';
        boolean seguir = false;

        //Creamos el escaner
        Scanner sc = new Scanner(System.in);
        do{
            DiasPasados = 0;
            System.out.println("Introduce el dia de nacimiento:");
            DiaNac = sc.nextInt();
            System.out.println("Introduce el mes de nacimiento en numero(maximo 12):");
            MesNac = sc.nextInt();
            System.out.println("Introduce el año de nacmiento:");
            AñoNac = sc.nextInt();
            System.out.println("Introduce el dia de hoy:");
            DiaActual = sc.nextInt();
            System.out.println("Introduce el mes de hoy en numero(maximo 12):");
            MesActual = sc.nextInt();
            System.out.println("Introduce el año actual:");
            AñoActual = sc.nextInt();
            
            DiasPasados = (366-DiasTranscurridos(DiaNac, MesNac)+((AñoActual-AñoNac-1)*365));
            /*System.out.println(DiasPasados);*/
            DiasPasados += DiasTranscurridos(DiaActual,MesActual)-1;
            System.out.println("Han paso "+ DiasPasados);
            System.out.println("¿Quieres seguir utilizando el contador de dias?");
            System.out.println("Introduce:Y(YES)/N(NO)");
            confirm = sc.next().charAt(0);
            confirm = Character.toTitleCase(confirm);
            seguir = (confirm == continuar)?true:false;        
        }while(seguir);
    
    }
}
