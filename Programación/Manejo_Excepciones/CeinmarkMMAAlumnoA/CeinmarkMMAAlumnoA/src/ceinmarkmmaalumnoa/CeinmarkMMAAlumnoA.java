/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ceinmarkmmaalumnoa;

import ceinmarkmmaalumnoa.gestion.TorneoGestion;
import ceinmarkmmaalumnoa.modelo.Atleta;
import ceinmarkmmaalumnoa.otros.CompeticionUtils;
import java.io.IOException;

/**
 *
 * @author Julen Profe
 */
public class CeinmarkMMAAlumnoA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Atleta ata = new Atleta(1, "Julen", 40, "");
        Atleta atb = new Atleta(2, "Maria", 51, "átomo");
        Atleta atc = new Atleta(3, "Juana", 62, "pluma");
        Atleta atd = new Atleta(4, "Paquita", 63, "");
        Atleta ate = new Atleta();
        System.out.println(ata.toString());
        System.out.println("La categoría es :"+CompeticionUtils.asignarCategoria(50));
        System.out.println("La categoría es :"+CompeticionUtils.asignarCategoria(ata.getPesoCorporal()));
        ata.setCategoria(CompeticionUtils.asignarCategoria(ata.getPesoCorporal()));
        atb.setCategoria(CompeticionUtils.asignarCategoria(atb.getPesoCorporal()));
        atc.setCategoria(CompeticionUtils.asignarCategoria(atc.getPesoCorporal()));
        atd.setCategoria(CompeticionUtils.asignarCategoria(atd.getPesoCorporal()));
        
        ate.setNombre("Mariano");
        ate.setPesoCorporal(55);
        //String cate = CompeticionUtils.asignarCategoria(ate.getPesoCorporal());
        //ate.setCategoria(cate);
        ate.setCategoria(CompeticionUtils.asignarCategoria(ate.getPesoCorporal()));        
        System.out.println(ata.toString());
        System.out.println(atb.toString());
        System.out.println(atc.toString());
        System.out.println(atd.toString());
        System.out.println(ate.toString());
        //Probamos la clase dinámica
        TorneoGestion tg = new TorneoGestion();
        tg.inscribirAtleta(ata);
        tg.inscribirAtleta(atb);
        tg.inscribirAtleta(atc);
        tg.inscribirAtleta(atd);
        tg.inscribirAtleta(new Atleta(5, "Mawi", 20, "--"));
        tg.inscribirAtleta(new Atleta(6, "Antonia", 95, "--"));
        tg.inscribirAtleta(new Atleta(7, "Mauricio", 45, "--"));
        System.out.println(tg.getListaAtletas().toString());
        try {
            tg.exportarListaCompeticion("paja");
            tg.exportarListaCompeticion("pluma");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        numeros();
        try {
            division();
        } catch (Exception e) {
            System.out.println("No se pude dividir entre 0.");
        }
        try {

        } catch (NullPointerException e) {
            System.out.println("Estas intendo obtener un datos vacios.");
        }
    }
    public static double division() throws ArithmeticException{
        return 10/0;
    }
    public static void numeros(){
        int[] numero = {1,2,3,4};
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(numero[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No se han podido recorrer tantas posiciones");
        }
    }
    
}
