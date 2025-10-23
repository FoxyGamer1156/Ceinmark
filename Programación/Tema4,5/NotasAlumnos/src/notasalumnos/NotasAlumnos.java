/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notasalumnos;

import java.util.Scanner;

/**
 *
 * @author Multi
 */
public class NotasAlumnos {

    /**
     * @param args the command line arguments
     */
    //Función para comparar notas, para sacar la mas alta y la mas baja
    public static void NotaAlta_NotaBaja(double[] ListaNotas, int Cantidad){
        double NotaAlta=ListaNotas[0];
        double NotaBaja=0;
        //Bucle para recorrer el array
        for(int i=0;i<ListaNotas.length;i++){
            //Comparación
            if (NotaAlta<ListaNotas[i]) {
                NotaAlta = ListaNotas[i];
            }
            else{
                NotaBaja = ListaNotas[i];
            }
        }
        System.out.println("La nota mas alta de la clase es "+NotaAlta+" y la mas baja es "+NotaBaja);
    }
    //Función para sacar la media
    public static double Media(double[] ListaNotas) {
        double SumNotas = 0;
        double resultados = 0;
        //Bucle para recorrer el array
        for (int i = 0; i < ListaNotas.length; i++) {
            //Sumamos las notas en una variable
            SumNotas+= ListaNotas[i];
        }
        //Hacemos la division de la SumNotas con la longitud del array para tener la media
        resultados = SumNotas/ListaNotas.length;
        return resultados;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NumNotas;
        //Preguntamos cuantas notas queremos introducir
        System.out.println("¿Cuantas notas de alumnos va introducir?");
        NumNotas = sc.nextInt();
        //Definimos la longitud del array donde iran las notas
        double[] NotasAlumnos = new double[NumNotas];
        //Bucle para recorrer el array, mientras metemos las notas
        for (int i=0;i<NumNotas;i++) {
            System.out.println("Introduzca la nota del alumno:");
            NotasAlumnos[i]= sc.nextDouble();
        }
        //Enseñamos la nota media, llamando a la función donde sacamos la media
        System.out.println("La nota media de los alumnos es de "+Media(NotasAlumnos));
        NotaAlta_NotaBaja(NotasAlumnos, NumNotas);
    }
    
}
