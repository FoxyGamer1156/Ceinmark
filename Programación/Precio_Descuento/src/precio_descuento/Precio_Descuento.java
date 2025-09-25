/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package precio_descuento;

import java.util.Scanner;

/**
 *
 * @author Multi
 */
//A partir de un precio y un porcentaje(%) de descuneto, dar precio final
public class Precio_Descuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Precio;
        double Descuento;
        double PrecioFinal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio del producto:");
        Precio = sc.nextDouble();
        System.out.println("Introduce el descuento:");
        Descuento = sc.nextDouble();
        PrecioFinal = Precio - ((Precio*Descuento)/100);
        System.out.println("El precio final del producto es de "+PrecioFinal+" euros.");
    }
    
}
