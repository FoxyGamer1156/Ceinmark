/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author Multi
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejer1();
        Ejer2();
        Ejer3();
        Ejer4();
    }
    public static char    ft_tolower(char c)
    {
	    if (c >= 'A' && c <= 'Z'){
		    c += 32;
        }
	    return c;
    }
    public static char	ft_toupper(char c)
    {
        if (c >= 'a' && c <= 'z')
            c -= 32;
        return c;
    }
    public static void Ejer1(){
        //Con indexof()
        int encontrado = 0;
        String vocales = "aeiouáéíóúüàèìòùâêîôû";
        String Frase ="Tú y yo, Chelo y te quiero y siento mucho que no me hayan gustado las mujeres porque habría sido más feliz, hemos tenido una noche de amor";
        for (int i = 0; i < Frase.length();i++) {
            if(vocales.indexOf(Frase.charAt(i)) != -1){
                encontrado++;
            }
        }
        System.out.println("En la frase hay un total de "+encontrado+" vocales.");
    }
    public static void Ejer2(){
        StringBuilder Frase = new StringBuilder("Hola, Mundo");
        System.out.println("Frase normal: "+Frase);
        System.out.println("Frase invertida: "+Frase.reverse());
    }
    public static void Ejer3(){
        String Frase = "Tú y yo, Chelo y te quiero y siento mucho que no me hayan gustado las mujeres porque habría sido más feliz, hemos tenido una noche de amor.";
        String[] Palabras = Frase.split(" ");
        System.out.println("La frase "+Frase+" tiene "+Palabras.length+" palabras.");
    }
    public static void Ejer4(){
        String Frase = "Hola mundo que tal";
        //Frase = Frase.to
        System.out.println("La frase alprincipio: "+Frase);
        
        for (int i = 0; i < Frase.length(); i++) {
            if(Frase.charAt(i) == ' '){
                
            }
        }
        System.out.println("La frase CamelCase: "+Frase);
    }
}
