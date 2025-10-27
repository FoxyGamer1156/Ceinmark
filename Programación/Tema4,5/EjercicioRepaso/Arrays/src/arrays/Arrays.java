/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Scanner;
/**
 *
 * @author Multi
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static boolean EsPar(int num){
        boolean respuesta = true;
        if ((num%2)==0){
            respuesta = true;
        }
        else{
            respuesta = false;
        }
        return respuesta;
    }
    public static void NumsArray(){
        int[] nums={0,1,2,3,4};
        for (int i = 0; i < nums.length; i++) {
         System.out.println(nums[i]);   
        } 
    }
    public static void DiezNumPares(){
        int[] nums=new int[10];
        for (int i = 0; i < nums.length; i++) {
            if(EsPar(i)){
                nums[i]=i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
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
    public static void AsigFav(){
        String[] Asignaturas = {"1.Programación","2.Lenguaje de Marcas","3.Base de Datos"};
        for (int i = 0; i < Asignaturas.length; i++) {
            System.out.println(Asignaturas[i]);
        }
    }
    public static void Matriz(){
        int[][] Matriz = {
            {1,2},
            {3,4}
        };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(Matriz[i][j]);
            }
        }
    }
    public static void Mayor(){
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        int[] Mayor;
        int Tamaño = 0;

        //Guardamos los numeros en una array, mientras ya vamos mirando cuantos
        //son mayores de 5
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Introduce un numero:");
            nums[i] = sc.nextInt();
            if(nums[i]>=5){
                Tamaño++;
            }
        }
        //Teniendo ya el TAMAÑO declaramos el tamaño del array de los numero
        //mayores a 5
        Mayor = new int[Tamaño];
        //Guardamos los numeros mayores a 5 dentro del array Mayor
        for (int i = 0; i < Tamaño; i++) {
            if(nums[i]>=5){
                Mayor[i] = nums[i];
            }
        }
        for (int i = 0; i < Tamaño; i++) {
            System.out.println(Mayor[i]);
        }
    }

    public static void Ordenar(){
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean salir = true;
        int num_Ejercicio = 0;
        String[] Ejercicios = {};
        while (salir) {
            for(int i = 0; i < Ejercicios.length; i++){
                System.out.println(Ejercicios[i]);
            }
            System.out.println("¿Que ejercicio quieres comprobar?");
            num_Ejercicio = sc.nextInt();
            if (num_Ejercicio != 0) {
                switch (num_Ejercicio) {
                    case 1:
                        NumsArray();
                        break;
                    case 2:
                        DiezNumPares();
                        break;
                    case 3:
                        double[] NotasAlumnos = new double[5];
                        System.out.println("Tendras que introducir 5 notas.");
                        //Bucle para recorrer el array, mientras metemos las notas
                        for (int i=0;i<NotasAlumnos.length;i++) {
                            System.out.println("Introduzca la nota del alumno:");
                            NotasAlumnos[i]= sc.nextDouble();
                        }
                        //Enseñamos la nota media, llamando a la función donde sacamos la media
                        System.out.println("La nota media de los alumnos es de "+Media(NotasAlumnos));
                        break;
                    case 4:
                        AsigFav();
                        break;
                    case 5:
                        Matriz();
                        break;
                    case 6:
                        Mayor();
                        break;
                    case 7:

                        break;
                    default:
                        System.out.println("Ha introducido un caracter o numero que no estaba en la lista.");
                        break;
                }
            }else{
                System.out.println("Has salido del programa.");
                salir = false;
            }
        }
    }
}
