/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceinmarkmmaalumnoa.gestion;

import ceinmarkmmaalumnoa.modelo.Atleta;
import ceinmarkmmaalumnoa.otros.CompeticionUtils;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Julen Profe
 */
public class TorneoGestion {
    
    //Atributo
    private ArrayList<Atleta> listaAtletas;
    //private ArrayList<Atleta> listaAtletas = new ArrayList<>();

    public TorneoGestion() {
        this.listaAtletas = new ArrayList<>();
    }

    public TorneoGestion(ArrayList<Atleta> listaAtletas) {
        this.listaAtletas = listaAtletas;
    }
    
    
    
    //Getter & Setter
    public ArrayList<Atleta> getListaAtletas() {
        return listaAtletas;
    }

    public void setListaAtletas(ArrayList<Atleta> listaAtletas) {
        this.listaAtletas = listaAtletas;
    }
    
    //toString
    @Override
    public String toString() {
        return "TorneoGestion{" + "listaAtletas=" + listaAtletas + '}';
    }
    
    /**
     * inscribirAtleta. Antes de añadirlo a la lista, debe usar la clase 
     * estática para asignarle su categoria basada en su pesoCorporal.
     * @param at Atleta a inscribir
     */
    
    public void inscribirAtleta(Atleta at) {
        //Primero validamos que tiene un peso de competición
        if(CompeticionUtils.esPesoValido(at.getPesoCorporal())){
            //con el set le asignamos su categoría
            //que la buscamos usando la función que hemos creado en la clase
            //asignar categoría.
            at.setCategoria(CompeticionUtils.asignarCategoria(at.getPesoCorporal()));
            this.listaAtletas.add(at);
        }
    }
    
    /**
     * exportarListaCompeticion. Busca los atletas de la lista que 
     * tengan la categoría pasada por parámetro y guarda sus nombres y dorsales
     * en un fichero llamado categoria_atletas.txt donde “categoria” 
     * es el nombre de la misma en minúsculas.
     * @param categoria 
     */
    
    public void exportarListaCompeticion (String categoria) throws IOException {
       //try {
            //Vamos a escribir un fichero
            //Ejercicios: una función que cree archivos para todas las categorías
            BufferedWriter bw =  new BufferedWriter(new FileWriter("C:\\tmp\\"+categoria.toLowerCase()+"_atletas_daw.txt"));
            for (Atleta atactual : this.listaAtletas){
                if (atactual.getCategoria().equals(categoria)) {
                    bw.write(atactual.getNombre()+" - "+atactual.getDorsal());
                    bw.newLine();
                }        
            }
            bw.close();
//        } catch (IOException ex) {
//            //System.getLogger(TorneoGestion.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
//            System.out.println("Error: "+ex.getMessage());
//        }
    }
    
    
    /**
     * actualizarPesaje. El atleta se ha pesado de nuevo antes de competir.
     * Debes buscarlo por dorsal, actualizar su peso y volver a calcular su 
     * categoría automáticamente.
     * @param dorsal
     * @param nuevoPeso 
     */
    public void actualizarPesaje (int dorsal, double nuevoPeso){
        
//        for (int i = 0 ; i<this.listaAtletas.size() ; i++){
//            Atleta atactual = this.listaAtletas.get(i);
//            if (atactual.getDorsal() == dorsal) {
//                atactual.setPesoCorporal(nuevoPeso);
//                atactual.setCategoria(CompeticionUtils.asignarCategoria(nuevoPeso));
//                this.listaAtletas.set(i,atactual);
//            }  
//        }
        int i = 0;
        for (Atleta atactual : this.listaAtletas){
             if (atactual.getDorsal() == dorsal) {
                atactual.setPesoCorporal(nuevoPeso);
                atactual.setCategoria(CompeticionUtils.asignarCategoria(nuevoPeso));
                this.listaAtletas.set(i,atactual);
            } 
            i++; 
        }
        
//        this.listaAtletas.stream().filter( a -> a.getDorsal() == dorsal )
//                .forEach(a -> { 
//                       a.setPesoCorporal(nuevoPeso); 
//                       a.setCategoria(CompeticionUtils.asignarCategoria(nuevoPeso));
//                });
        
    } 
    
    
}
