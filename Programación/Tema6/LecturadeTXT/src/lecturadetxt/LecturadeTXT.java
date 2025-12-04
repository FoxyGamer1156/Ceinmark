/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lecturadetxt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;

/**
 *
 * @author Multi
 */
public class LecturadeTXT {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) throws IOException {
        String rutaArchivo = "C:\\Proyectos\\Programación\\TXTes\\Salida.txt";
        FileReader fileReader = new FileReader(rutaArchivo);
        BufferedReader br = new BufferedReader(fileReader);
        ArrayList<String> Nombres = new ArrayList<>();
        String linea = "";
        try{
            while((linea = br.readLine()) != null) {
                /*System.out.println("Introduce el nombre: ");
                String nombre = sc.nextLine();*/
            
                Nombres.add(linea);
            }
            Sustituir(Nombres);
        }catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        br.close();
    }
    public static void Sustituir(ArrayList<String> nombres){
        String mensaje = "Estimada/o/e XXX, bienvenida/o/e a nuestra compañía";
        for (String nombre : nombres) {
            //Versión 2, pasándolo a String (más fácil)
            System.out.println(mensaje.replace("XXX", nombre));
        }
    }
}
