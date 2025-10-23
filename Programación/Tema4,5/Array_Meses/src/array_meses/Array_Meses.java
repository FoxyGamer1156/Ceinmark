/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array_meses;

import java.util.Scanner;

/**
 *
 * @author Multi
 */
public class Array_Meses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MesIntroducido;
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        System.out.println("Introduce un mes en numero del 1 al 12");
        MesIntroducido = sc.nextInt();
        System.out.println(meses[MesIntroducido-1]);
    }
    
}
