/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        String rutaArchivo = "";
        String linea = "";
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
            "10.Crea una función que me diga si una palabra tiene todas las vocales."+
            "11. Vamos a recoger 5 nombres por consola y los vamos a almacenar en un ArrayList. Lo recorreremos para mostrarlos en la siguiente cadena, en la que sustituiremos la \"XXX\" por los nombres recogidos usando un StringBuilder. \"Estimada/o/e XXX, bienvenida/o/e a nuestra compañía\". El objetivo de este programa es ver la diferencia entre usar un String y un StringBuilder, pero el uso de este tipo en este programa realmente no tiene sentido.",
            "12.Cambiamos el programa anterior para que lea los nombres de un fichero de texto (cada nombre en una línea).",
            "13.Utilizaremos la función creada en el ejercicio 56 (extraer un dominio). Leeremos una lista de rutas \"https://www.ejemplo.com/pagina&quot; de un archivo (cada uno estará en una línea), llamaremos a la función que extrae los dominios, y los escribiremos en otro archivo (de igual manera, cada uno en una línea).",
            "14.Crear una función que valide un DNI o NIE válido (usar Pattern y expresión regular). Leer de un fichero una lista de DNIs y NIEs y escribir en un fichero una lista de los válidos y una lista de los no válidos."};
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
                        int cantidadEnmascarar = 0;
                        boolean posicion = false;
                        System.out.println("Introduce un texto(5): ");
                        cadena = sc.nextLine();
                        System.out.println("¿Cuantos caracteres deseas enmascarar?");
                        cantidadEnmascarar = sc.nextInt();
                        sc.nextLine();
                        System.out.println("¿Por donde deseas enmascarar?");
                        System.out.println("1.Enmascarar por delante.");
                        System.out.println("2.Enmascarar por el final.");
                        if(sc.nextInt() == 1){
                            posicion = true;
                        }
                        sc.nextLine();
                        System.out.println("Tu texto es:"+cadena);
                        System.out.println("Tu cadena enmascarada: "+enmascarar(cadena, cantidadEnmascarar, posicion));
                        break;
                    case 6:
                        System.out.println("Introduce la url para extrar el dominio:");
                        cadena = sc.nextLine();
                        extraccionDominio(cadena);
                        break;
                    case 7:
                        System.out.println("Introduce el prefijo de tu pais:");
                        String prefijo = sc.nextLine();
                        System.out.println("Introduce tu numero de telefono");
                        cadena = sc.nextLine();
                        formatearNumTelf(cadena, prefijo);
                        break;
                    case 8:
                        System.out.println("Introduce el texto:");
                        cadena = sc.nextLine();
                        System.out.println("¿Cual de las palabras deseas cambiar?");
                        String palabraACambiar = sc.nextLine();
                        System.out.println("¿Que palabras quiere poner acambio?");
                        String palabraCambio = sc.nextLine();
                        reemplazaOcurrencias(cadena, palabraACambiar, palabraCambio);
                    case 9:
                        System.out.println("Introduce el texto:");
                        cadena = sc.nextLine();
                        if(validarContrasena(cadena))
                            System.out.println("Tu contraseña es VALIDA.");
                        break;
                    case 10:
                        System.out.println("Introduce el texto:");
                        cadena = sc.nextLine();
                        if(vocales(cadena))
                            System.out.println("Tu texto TIENE todas las vocales.");
                        break;
                    case 11:
                        ArrayList<String> Nombres = new ArrayList<>();
                        System.out.println("Introduce 5 nombres:");
                        while(Nombres.size() < 5) {
                            System.out.println("Introduce el nombre: ");
                            /*String nombre = sc.nextLine();*/
                            Nombres.add(sc.nextLine());
                        }
                        Sustituir(Nombres);
                        break;
                    case 12:
                        rutaArchivo = "C:\\Proyectos\\Programación\\TXTes\\Salida.txt";
                        ArrayList<String> NombresArchivo = new ArrayList<>();
                        linea = "";
                        try{
                            BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
                            while((linea = br.readLine()) != null) {
                                NombresArchivo.add(linea);
                            }
                            sustituirConArchivo(NombresArchivo);
                        }catch (IOException e) {
                            System.out.println("Error reading file: " + e.getMessage());
                        }
                        break;
                    case 13:
                        rutaArchivo = "C:\\Proyectos\\Programación\\TXTes\\URL.txt";
                        ArrayList<String> Dominios = new ArrayList<>();
                        linea = "";
                        try {
                            BufferedReader buff = new BufferedReader(new FileReader(rutaArchivo));
                            while((linea = buff.readLine())!= null){
                                Dominios.add(linea);
                            }
                            extraccionDominioVersion2(Dominios);
                            buff.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 14:
                        rutaArchivo = "C:\\Proyectos\\Programación\\TXTes\\DNI_NIE_SinValidar.txt";
                        String rutArchivoEscribir = "C:\\Proyectos\\Programación\\TXTes\\DNI_NIE_Validados.txt";
                        ArrayList<String> DNINIE = new ArrayList<>();
                        linea = "";
                        try {
                            System.out.println("Guardando DNIs y NIE...");
                            BufferedReader buff = new BufferedReader(new FileReader(rutaArchivo));
                            FileWriter fw = new FileWriter(rutArchivoEscribir);
                            while((linea = buff.readLine())!= null){
                                DNINIE.add(linea);
                            }
                            fw.write("----------------\r\n");
                            fw.write("|DNIs VALIDADOS|\r\n");
                            fw.write("----------------\r\n");
                            for (int i = 0; i < DNINIE.size(); i++) {
                                if(validarDNI(DNINIE.get(i))){
                                    fw.write(DNINIE.get(i)+"\r\n");
                                    DNINIE.remove(i);
                                }
                            }
                            fw.write("----------------\r\n");
                            fw.write("|NIEs VALIDADOS|\r\n");
                            fw.write("----------------\r\n");
                            for (String NIE : DNINIE    ) {
                                if(validarNIE(NIE)){
                                    fw.write(NIE+"\r\n");
                                }
                            }
                            System.out.println("DNI y NIE VALIDADOS y GUARDADOS.");
                            buff.close();
                            fw.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("Has introducido un numero de ejercicio que no esta disponible.");
                        break;
                }
                System.out.println("<-------------------------------------------------------------------------->");
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
        String[] Palabras = Frase.split(" ");
        boolean primeraVez = true;
        /*for (int i = 1; i < Palabras.length; i++) {
            resultado+=Palabras[i].substring(0,1).toUpperCase()+Palabras[i].substring(1).toLowerCase();
        }*/
        for (String CC : Palabras) {
            if (primeraVez) {
                resultado = CC.toLowerCase();
                primeraVez = false;
            }else{
                resultado += CC.substring(0,1).toUpperCase()+CC.substring(1).toLowerCase();
            }
        }
        return resultado;
    }
    public static String enmascarar(String Cadena, int sinEnmascarar, boolean PrinoFin){
        String result = "";
        for (int i = 0; i < Cadena.length()-sinEnmascarar; i++) {
            result+="*";
        }
        if(PrinoFin){
            result = result+Cadena.substring(Cadena.length()-sinEnmascarar); 
        }else{
            result = Cadena.substring(0, sinEnmascarar)+result;
        }
        return result;
    }
    public static String extraccionDominio(String enlace){ 
        String subenlace = enlace.substring(enlace.indexOf('.')+1);
        String result=  subenlace.substring(0, subenlace.indexOf('/'));
        return result;
    }
    public static String formatearNumTelf(String numTelf, String Prefijo){
        String result = Prefijo;

        for (int i = 0; i < 3; i++) {
            result+= ' ';
            result+= numTelf.substring(0,3);
            numTelf = numTelf.substring(3);
        }
        return result;
    }
    public static String reemplazaOcurrencias(String texto, String palabraACambiar, String palabraRemplazo){
        String result = "";
        String splitTexto[] = texto.split(" ");
        boolean palabraCambiarEncontrado = true;
        for (int i = 0; i < splitTexto.length; i++) {
            if(splitTexto[i].equals(palabraACambiar)){
                palabraCambiarEncontrado = false;
            }
        }
        if(palabraCambiarEncontrado){
            result = texto.replace(palabraACambiar, palabraRemplazo);
        }else{
            System.out.println("No se ha encontrado la palabras que querias cambiar.");
        }
        return result;
    }
    public static boolean validarContrasena(String contrasena){
        boolean longitud = false;
        boolean mayuscula = false;
        boolean minuscula = false;
        boolean num = false;
        boolean caracterEsp = false;
        boolean todoCorrecto = true;
        if(contrasena.length() >= 8)
            longitud = true;
        for (int i = 0; i < contrasena.length(); i++) {
            if(contrasena.charAt(i) >= 'A' && contrasena.charAt(i) <= 'Z') {
                mayuscula = true;
            }
            if(contrasena.charAt(i) >= 'a' && contrasena.charAt(i) <= 'z'){
                minuscula = true;
            }
            if(contrasena.charAt(i) >= '0' && contrasena.charAt(i) <= '9'){
                num = true;
            }
            if ((contrasena.charAt(i) >= 33 && contrasena.charAt(i) <= 47) || (contrasena.charAt(i) >= 58 && contrasena.charAt(i) <= 64) || (contrasena.charAt(i) >= 91 && contrasena.charAt(i) <= 96) || (contrasena.charAt(i) >= 123 && contrasena.charAt(i) <= 254)) {
                caracterEsp = true;
            }
        }
        if(!longitud){
            System.out.println("La contraseña deve de tener minimo 8 CARACTERES.");
            todoCorrecto = false;
        }
        if(!mayuscula){
            System.out.println("La contraseña deve de tener minimo UNA MAYUSCULA.");
            todoCorrecto = false;
        }
        if(!minuscula){
            System.out.println("La contraseña deve de tener minimo UNA MINUSCULA.");
            todoCorrecto = false;
        }
        if(!caracterEsp){
            System.out.println("La contraseña deve de tener minimo UN CARACTER ESPECIAL");
            todoCorrecto = false;
        }
        if(!num){
            System.out.println("La contraseña deve de tener minimo UN NUMERO.");
            todoCorrecto = false;
        }
        return todoCorrecto;
    }
    public static boolean vocales(String texto){
        boolean encontrado = false;
        String vocales = "aeiou";
        texto = texto.toLowerCase();
        for (int i = 0; i < texto.length(); i++) {
            if(vocales.indexOf(texto.charAt(i)) != -1){
                vocales = vocales.replace(texto.charAt(i), ' ');
            }
        }
        vocales = vocales.trim();
        if(vocales.equals("")){
            encontrado = true;
        }else{
            System.out.println("A tu texto le falta la/las vocal/vocales " + vocales + ".");
        }
        return encontrado;
    }
    public static void Sustituir(ArrayList<String> nombres){
        StringBuilder result = new StringBuilder("Bienvenido XXX, anfitrion");
        for(String buff : nombres){
            result.replace(result.indexOf(" ")+1, result.indexOf(","), buff);
            System.out.println(result);
        }
        /*VERSION CON STRING
        String frase = "Bienvenido XXX, anfitrion";
        for(String buff : nombres){
            frase.replace("XXX", nombres);
        }*/
        
    }
    public static void sustituirConArchivo(ArrayList<String> nombres){
        String mensaje = "Estimada/o/e XXX, bienvenida/o/e a nuestra compañía";
        for (String nombre : nombres) {
            //Versión 2, pasándolo a String (más fácil)
            System.out.println(mensaje.replace("XXX", nombre));
        }
    }
    public static void extraccionDominioVersion2(ArrayList<String> dominios){
        String fichero = "C:\\Proyectos\\Programación\\TXTes\\Dominios.txt";
        try{
            FileWriter fw = new FileWriter(fichero);
            for(String url : dominios){
                System.out.println("URL: "+ url);
                String dominio  = extraccionDominio(url);
                System.out.println("DOMINIO: "+ dominio);
                fw.write(dominio+"\r\n");
            }
            System.out.println("TODOS LOS DOMINIOS GUARDADOS.");
            fw.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
    public static boolean  validarNIE(String NIE){
        boolean result = false;
        Pattern patronNIE = Pattern.compile("^[XYZ]\\d{7}[A-Z]$");
        Matcher matcherNIE = patronNIE.matcher(NIE);
        if (matcherNIE.matches())
            result= true;
        return result;
    }
    public static boolean validarDNI(String DNI){
        boolean result = false;
        Pattern patronDNI = Pattern.compile("^\\d{8}[A-Z]$");
        Matcher matcherDNI = patronDNI.matcher(DNI);
        if (matcherDNI.matches())
            result = true;
        return result;
    }
}
