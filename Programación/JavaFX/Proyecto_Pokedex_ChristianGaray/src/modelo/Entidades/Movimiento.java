package modelo.Entidades;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author foxyg
 */
public class Movimiento {
    private int id;
    private String nombre;
    private String tipo;
    private String categoria;
    private double potencia;
    private double precisionMov;
    private int pp;
    private String descripcion;

    public Movimiento(int id, String nombre, String tipo, String categoria, double potencia, double precisionMov, int pp, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.categoria = categoria;
        this.potencia = potencia;
        this.precisionMov = precisionMov;
        this.pp = pp;
        this.descripcion = descripcion;
    }
    public Movimiento() {}
    
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getPrecisionMov() {
        return precisionMov;
    }

    public void setPrecisionMov(double precisionMov) {
        this.precisionMov = precisionMov;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
