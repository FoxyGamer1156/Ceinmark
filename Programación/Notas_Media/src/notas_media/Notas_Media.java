/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notas_media;

import java.util.Scanner;

/**
 *
 * @author Multi
 */
public class Notas_Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float exam1, exam2, exam3, total, media;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdcuce el primer examen:");
        exam1 = sc.nextFloat();
        System.out.println("Introdcuce el segundo examen:");
        exam2 = sc.nextFloat();
        System.out.println("Introdcuce el tercer examen:");
        exam3 = sc.nextFloat();
        total = exam1+exam2+exam3;
        System.out.println("La suma de tus 3 examenes es de "+total+" .");
        media = total/3;
        System.out.println("Y tu media es de "+media+" .");

    }
    
}
