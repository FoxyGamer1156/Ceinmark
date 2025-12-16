/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Multi
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ejercicios ={"1.- Procesar nombres desde un fichero de texto: \r\n" + //
                        "       Crear un archivo de texto llamado nombres.txt que contenga, uno por línea, nombres de personas con espacios y letras en mayúsculas/minúsculas desordenadas.\r\n" + //
                        "       Leer el contenido del archivo.\r\n" + //
                        "       Limpiar cada línea: Eliminar espacios al principio y al final. Convertir a mayúsculas solo la primera letra y el resto a minúsculas.\r\n" + //
                        "       Guardar los nombres procesados en un nuevo archivo llamado nombres_limpios.txt.\r\n" + //
                        "2.- A. Leer un fichero y guardar todas las líneas en un HashSet para eliminar duplicados. Mostrar cuántas líneas únicas existen. \r\n" + //
                        "     B. Escribir un fichero nuevo con las líneas únicas.\r\n" + //
                        "3.- A. Leer un fichero y generar un HashMap<String, Integer> donde la clave sea la palabra y el valor la cantidad de apariciones.\r\n" + //
                        "      B. Usando el HashMap anterior, crear un fichero con las palabras que aparecen más de 5 veces.\r\n" + //
                        "4.- Dado un CSV con columnas nombre,email, generar un HashMap<String,String> donde la clave sea el email.\r\n" + //
                        "5.- Cargar un fichero en un HashSet. Leer otro fichero y mostrar si contiene alguna palabra del conjunto. Detección de palabras clave, por ejemplo, en una red social.\r\n" + //
                        "6.- Leer un fichero grande y producir:\r\n" + //
                        "       Nº total de líneas → ArrayList\r\n" + //
                        "       Nº de palabras únicas → HashSet\r\n" + //
                        "       Nº de repeticiones por palabra → HashMap\r\n" + //
                        "       Y escribir un informe\r\n" + //
                        "7.- Dado un fichero CSV del estilo \"nombre,edad,ciudad\" guardar cada línea en un HashMap<String, String> y todos los mapas en un ArrayList."};
        String LeerRutaArchivo = "";
        String EscribirRutaArchivo = "";
        String cadena = "";
        String linea = "";
        int nºejer = 0;
        boolean seguir = true;
        while(seguir){
            for(String Ejercicios : ejercicios){
                System.out.println(Ejercicios+"\n");
            }
            System.out.println("¿Que ejercicio deseas hacer?");
            nºejer = sc.nextInt();
            if(nºejer != 0){
                switch(nºejer){
                    case 1:
                        LeerRutaArchivo = "H:\\Proyectos\\Programación\\Tema 7\\TXTs\\nombres_sinLimpiar.txt";
                        EscribirRutaArchivo = "H:\\Proyectos\\Programación\\Tema 7\\TXTs\\nombres_Limpiados.txt";
                        try {
                            BufferedReader lectura = new BufferedReader(new FileReader(LeerRutaArchivo));
                            BufferedWriter escritura = new BufferedWriter(new FileWriter(EscribirRutaArchivo));
                            while((linea = lectura.readLine()) != null){
                                cadena = limpiaCadenas(linea);
                                escritura.write(cadena+"\n");
                            }
                            lectura.close();
                            escritura.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 2:
                        LeerRutaArchivo = "H:\\Proyectos\\Programación\\Tema 7\\TXTs\\Ejercicio2_sinFiltrar.txt";
                        EscribirRutaArchivo = "H:\\Proyectos\\Programación\\Tema 7\\TXTs\\Ejercicio2_Filtrado.txt";
                        try {
                            HashSet <String> valores = new HashSet<>();
                            BufferedReader lectura = new BufferedReader(new FileReader(LeerRutaArchivo));
                            BufferedWriter escritura = new BufferedWriter(new FileWriter(EscribirRutaArchivo));
                            while((linea = lectura.readLine()) != null){
                                valores.add(linea);
                            }
                            for (String palabra : valores) {
                                palabra = palabra.substring(0, 1).toUpperCase()+palabra.substring(1);
                                escritura.write(palabra+"\n");
                            }
                            
                            lectura.close();
                            escritura.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        LeerRutaArchivo = "H:\\Proyectos\\Programación\\Tema 7\\TXTs\\Ejercicio3_ListaPalabras.txt";
                        try {
                            ArrayList<String> valores = new ArrayList<>();
                            String[] Palabras = {"árbol","sol", "cielo", "luna", "mar"};
                            HashMap<String, Integer> ContadorPalabras = new HashMap<>();
                            BufferedReader lectura = new BufferedReader(new FileReader(LeerRutaArchivo));
                            while ((linea = lectura.readLine()) != null) { 
                                valores.add(linea);
                            }
                            for(int i = 0; i < Palabras.length;i++) {
                                ContadorPalabras.put(Palabras[i], cantidadPalabra(valores, Palabras[i]));
                            }
                            System.out.println(ContadorPalabras.entrySet());
                            lectura.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 4:
                        LeerRutaArchivo = "H:\\Proyectos\\Programación\\Tema 7\\TXTs\\Ejercicios4_NombreEmail.txt";
                        EscribirRutaArchivo = "";
                        try {
                            BufferedWriter escritura = new BufferedWriter(new FileWriter(EscribirRutaArchivo));
                            BufferedReader lectura = new BufferedReader(new FileReader(LeerRutaArchivo));
                            HashMap<String, String> usuarios = new HashMap<>();
                            while((linea = lectura.readLine())!=null){
                                
                            }
                            lectura.close();
                            escritura.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                }
            }
        }
    }
    public static String limpiaCadenas(String cadena){
        cadena = cadena.trim().replace(" ", "").toLowerCase();
        return cadena.substring(0, 1).toUpperCase()+cadena.substring(1);
    }
    public static int cantidadPalabra(ArrayList<String> valores, String palabra){
        int result = 0;
        for (String valor : valores) {
            if(valor.equals(palabra))
                result++;
        }
        System.out.println(palabra+": "+result);
        return result;
    }
}
