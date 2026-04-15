package modelo.Entidades;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author foxyg
 */
public class Region {
    private int id;
    private String nombre;

    public Region(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public Region() {
        this.id = 0;
        this.nombre = "";
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
