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
        int i = 0;
        int j = 0;
        while(i < nums.length) {
            if(EsPar(j)){
                nums[i]=j;
                System.out.println(nums[i]);
                i++;
                j++;
            }
            j++;
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
        System.out.println("------------------------");
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
                System.out.println(Tamaño);
            }
        }
        //Teniendo ya el TAMAÑO declaramos el tamaño del array de los numero
        //mayores a 5
        Mayor = new int[Tamaño];
        //Guardamos los numeros mayores a 5 dentro del array Mayor
        int i = 0;
        int j = 0;
        while(i < nums.length) {
            if(nums[i]<=5){
                Mayor[j]=nums[i];
                i++;
                j++;
            }
            j++;
        }
        for (int k = 0; i < Tamaño; k++) {
            System.out.println(Mayor[k]);
        }
    }
    public static int[] NumOrdenado(int[] anums){
        int tmp;
        for (int i = 0; i < anums.length; i++) {
            for (int j = 0; j < anums.length; j++) {
                if(anums[j] < anums[j+1]){
                    tmp = anums[j];
                    anums[j] = anums[j+1];
                    anums[j+1] = tmp;
                }
            }
        }
        return anums;
    }
    public static void ft_Nombres(){
        Scanner sc = new Scanner(System.in);
        String[] aNombres={"Diovar","Christian","Joacco","Izan"};
        String NombreAlum;
        for (int i = 0; i < aNombres.length; i++) {
            System.out.println("Introduce un nombre de clase");
            NombreAlum = sc.nextLine();
            if(aNombres[i].equals(NombreAlum)){
                System.out.println("Este alumno esta en el array.");
            }
        }
    }
    public static void ArrayInverso(){
        Scanner sc = new Scanner(System.in);
        int[] aInverso = new int[10];

        System.out.println("Guardando los numero de manera inversa.");
        for (int i = aInverso.length; i > 0; i--) {
            aInverso[i] = i;
            System.out.println(aInverso[i]);
        }
        System.out.println("Enseñando lo numeros de manera normal.");
        for (int i = 0; i < aInverso.length; i++) {
            System.out.println(aInverso[i]);
        }
    }
    public static boolean Palindromo(String Palabra){
        int i = 0;
        int j = Palabra.length();
        boolean confirmar = false;
        while(i != j){
            if(Palabra.charAt(i) == Palabra.charAt(j)){
                confirmar = true;
            }
            i++;
            j--;
        }
        return confirmar;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean salir = true;
        int num_Ejercicio = 0;
        String[] Ejercicios = {"1.Declara un array de 5 enteros y muestra su contenido.",
        "2.Llena un array con los primeros 10 números pares",
        "3.Pide 5 notas al usuario y muestra la media.",
        "4.Declara un array de cadenas con tus asignaturas favoritas.",
        "5.Muestra el contenido de un array usando un bucle for.",
        "6.Crea una matriz 2x2 e inicialízala con valores.",
        "7.Pide 10 números y muestra cuántos son mayores que 5.",
        "8.Crea un array de nombres y busca uno por teclado.",
        "9.Rellena un array de forma inversa con números del 10 al 1.",
        "10.Crea una función que devuelva true si una palabra es palíndroma."};

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
                        System.out.println("Un ejemplo de este ejercicio es la lista de ejericicios.");
                    case 6:
                        Matriz();
                        break;
                    case 7:
                        Mayor();
                        break;
                    case 8:
                        System.out.println("Vamos a ordenar los numero de mayor a menos.");
                        break;
                    case 9:
                        ft_Nombres();
                        break;
                    case 10:
                        String Palabra;
                        System.out.println("Introduce una palabra para comprobar si es palindroma:");
                        Palabra = sc.nextLine();
                        if(Palindromo(Palabra)){
                            System.out.println("Su palabra SI es palindroma.");
                        }else{
                            System.out.println("Su palabra NO es palindorma.");
                        }
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
