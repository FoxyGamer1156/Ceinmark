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
        final int febrero = 30;
        final int marzo = 59;
        final int abril = 90;
        final int mayo = 120;
        final int junio = 153;
        final int julio = 181;
        final int agosto = 212;
        final int septiembre = 243;
        final int octubre = 273;
        final int noviembre = 304;
        final int diciembre = 334;

        //Creamos el escaner
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el dia de hoy maxi:");
        dia = sc.nextInt();
        System.out.println("Introduce el mes de hoy en numero(maximo 12):");
        mes = sc.nextInt();
        if(mes >= 1 && mes <= 31 && dia >=1 && dia <= 31){
            switch (mes) {
                case 1:
                    System.out.println("Han pasado "+dia+" dias desde que empezo el año");
                    break;
                case 2:
                    dia = dia+febrero;
                    System.out.println("Han pasado "+dia+" dias desde que empezo el año");
                    break;
                case 3:
                dia = dia+marzo;
                System.out.println("Han pasado "+dia+" dias desde que empezo el año");
                break;
            case 4:
                dia = dia+abril;
                System.out.println("Han pasado "+dia+" dias desde que empezo el año");
                break;
            case 5:
                dia = dia+mayo;
                System.out.println("Han pasado "+dia+" dias desde que empezo el año");
                break;
            case 6:
                dia = dia+junio;
                System.out.println("Han pasado "+dia+" dias desde que empezo el año");
                break;
            case 7:
                dia = dia+julio;
                System.out.println("Han pasado "+dia+" dias desde que empezo el año");
                break;
            case 8:
                dia = dia+agosto;
                System.out.println("Han pasado "+dia+" dias desde que empezo el año");
                break;
            case 9:
                dia = dia+septiembre;
                System.out.println("Han pasado "+dia+" dias desde que empezo el año");
                break;
            case 10:
                dia = dia+octubre;
                System.out.println("Han pasado "+dia+" dias desde que empezo el año");
                break;
            case 11:
                dia = dia+noviembre;
                System.out.println("Han pasado "+dia+" dias desde que empezo el año");
                break;
            case 12:
                dia = dia+diciembre;
                System.out.println("Han pasado "+dia+" dias desde que empezo el año");
                break;
            default:
                System.out.println("Ha habido un error a la hora de introduccir las fechas.");;
            }
        }
        else{
            System.out.println("El dia o mes que has introducido es incorrecto.");
        }     
    }
    
}
