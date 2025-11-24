/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Multi
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = "";
        String[] Ejercicios = {"1. Escribe un código que cuente cuantas vocales tiene el texto. Considera mayúsculas y minúsculas.",
            "2. Crea una función que devuelva el texto invertido de una cadena: Ejemplo: invertido -> oditrevni",
            "3. Cuenta cuantas palabras tiene el texto.","4. Convertir a CamelCase. Ejemplo: Hola mundo que tal  -> holaMundoQueTal",
            "5. Enmascarar cadenas: cambiamos en cadenas varias posiciones por * temas de privacidad (números de teléfono, cuentas de banco, email...)",
            "6. Extraer dominio de una palabra","7. Formatear un número de teléfono. Ejemplo: 666666666 -> +34 666 666 666",
            "8. Reemplaza todas las ocurrencias de una palabra por otra, y debe ser sensible a las mayúsculas.", 
            "9. Valida que una contraseña cumpla con los siguientes requisitos:\r\n" + //
                "- Al menos 8 caracteres\r\n" + //
                "- Al menos una mayúscula\r\n" + //
                "- Al menos una minúscula\r\n" + //
                "- Al menos un número\r\n" + //
                "- Al menos un carácter especial",
            "10.Crea una función que me diga si una palabra tiene todas las vocales."};
        boolean seguir = true;
        int ejer = 0;
        while (seguir) {
            for (int i = 0; i < Ejercicios.length; i++) {
                System.out.println(Ejercicios[i]);
            }
            System.out.println("Introduce el numero del ejercicio:");
            ejer = sc.nextInt();
            if(ejer != 0){
                sc.nextLine();
                switch(ejer){
                    case 1:
                        System.out.println("Introduce un texto(1): ");
                        cadena = sc.nextLine();
                        System.out.println("Tu cadena de texto tiene "+buscaVocales(cadena)+" vocales.");
                        break;
                    case 2:
                        System.out.println("Introduce un texto(2): ");
                        cadena = sc.nextLine();
                        System.out.println("Tu texto es:"+cadena);
                        System.out.println("Tu texto pero invertido:"+cadInvert(cadena));
                        break;
                    case 3:
                        System.out.println("Introduce un texto(3): ");
                        cadena = sc.nextLine();
                        System.out.println("Tu texto es:"+cadena);
                        System.out.println("Tu texto tiene "+contadorPalabras(cadena)+" palabras.");
                        break;
                    case 4:
                        System.out.println("Introduce un texto(4): ");
                        cadena = sc.nextLine();
                        System.out.println("Tu texto es:"+cadena);
                        System.out.println("La frase CamelCase: "+camelCase(cadena));
                        break;
                    case 5:
                        int principio = 0;
                        int fin = 0;
                        System.out.println("¿Cuantos caracteres NO quieres enmascarar al principio y final?");
                        System.out.println("Para los del principio:");
                        principio = sc.nextInt();
                        System.out.println("Para los del final:");
                        fin = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Introduce un texto(5): ");
                        cadena = sc.nextLine();
                        System.out.println("Tu texto es:"+cadena);
                        System.out.println("Tu cadena enmascarada: "+enmascarar(cadena, principio, fin));
                        break;
                    default:
                        System.out.println("Has introducido un numero de ejercicio que no esta disponible.");
                        break;
                }
            }else{
                seguir = false;
            }
        }
        System.out.println("Has terminado el programa.");
    }
    public static int buscaVocales(String Frase){
        //Con indexof()
        int encontrado = 0;
        String vocales = "aeiouáéíóúüàèìòùâêîôû";
        Frase = Frase.toLowerCase();

        for (int i = 0; i < Frase.length();i++) {
            if(vocales.indexOf(Frase.charAt(i)) != -1){
                encontrado++;
            }
        }
        return encontrado;
    }
    public static String cadInvert(String cadena){
        String resultado = "";
        for (int i = cadena.length()-1; i >= 0; i--) {
            resultado += cadena.charAt(i);
        }
        return resultado;
    }
    public static int contadorPalabras(String Frase){
        String[] Palabras = Frase.split(" ");
        return Palabras.length;
    }
    public static String camelCase(String Frase){
        String resultado = "";
        //Frase = Frase.to
        System.out.println("La frase alprincipio: "+Frase);
        String[] Palabras = Frase.split(" ");
        Palabras[0] = Palabras[0].toLowerCase();
        resultado+=Palabras[0];
        for (int i = 1; i < Palabras.length; i++) {
            Palabras[i]=Palabras[i].trim();
            resultado+=Palabras[i].substring(0,1).toUpperCase();
            resultado+=Palabras[i].substring(1);
        }
        return resultado;
    }
    public static String enmascarar(String Cadena, int sinEnmascararPrin, int sinEnmascararFinal){
        String result = "";
        for (int i = 0; i < Cadena.length(); i++) {
            if(i >= sinEnmascararPrin && i < Cadena.length()-sinEnmascararFinal){
                result+='*';
            }else{
                result+=Cadena.charAt(i);
            }
        }
        return result;
    }
}
