/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceinmarkmmaalumnoa.otros;

/**
 *
 * @author Julen Profe
 */
public class CompeticionUtils {
 
    /**
     * asignarCategoria (double peso): Devuelve String
     */   
    public static String asignarCategoria (double peso) {
        //Vamos a intentar hacer este ejercicio con un case.
        if (peso <= 47) return "átomo";       
        if (peso <= 52) return "paja";
        if (peso <= 56) return "mosca";
        if (peso <= 61) return "gallo";
        if (peso <= 65) return "pluma";
        if (peso <= 70) return "ligero";       
        return "";
        
    }
   
    
    /**
     * esPesoValido: Devuelve un true si el peso está entre 40 y 70kg.
     * @param peso
     * @return true/false
     */
    public static boolean esPesoValido (double peso) {
        //if (peso >= 40 && peso <= 70) return true;
        //else return false;
        return (peso >= 40 && peso <= 70);       
    }
    
}
