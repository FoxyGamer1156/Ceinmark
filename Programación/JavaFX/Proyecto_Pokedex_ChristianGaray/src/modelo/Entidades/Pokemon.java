package modelo.Entidades;

import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author foxyg
 */
public class Pokemon {
    private int id;
    private String nombre;
    private int generacion;
    private double altura;
    private double peso;
    private String tipo1;
    private String tipo2;
    private List<Movimiento> movimientos;
    private String descripcion;
    private String spriteModelo;
    private int baseHp;
    private int baseAtq;
    private int baseDef;
    private int baseAtqEsp;
    private int baseDefEsp;
    private int baseVel;
    private double ratioCaptura;
    private int regionOrigen;

    public Pokemon(int id, String nombre, int generacion, double altura, double peso, String descripcion, String spriteModelo, int baseHp, int baseAtq, int baseDef, int baseAtqEsp, int baseDefEsp, int baseVel, String ratioGenero, double ratioCaptura, int regionOrigen) {
        this.id = id;
        this.nombre = nombre;
        this.generacion = generacion;
        this.altura = altura;
        this.peso = peso;
        this.descripcion = descripcion;
        this.spriteModelo = spriteModelo;
        this.baseHp = baseHp;
        this.baseAtq = baseAtq;
        this.baseDef = baseDef;
        this.baseAtqEsp = baseAtqEsp;
        this.baseDefEsp = baseDefEsp;
        this.baseVel = baseVel;
        this.ratioCaptura = ratioCaptura;
        this.regionOrigen = regionOrigen;
    }
    public Pokemon(){
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

    public int getGeneracion() {
        return generacion;
    }

    public void setGeneracion(int generacion) {
        this.generacion = generacion;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {this.tipo1 = tipo1;}

    public String getTipo2() {
        return tipo2;
    }
    public void setTipo2(String tipo2) {this.tipo2 = tipo2;}

    public List<Movimiento> getMovimientos() {return movimientos;}

    public void setMovimientos(List<Movimiento> movimientos) {this.movimientos = movimientos;}

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSpriteModelo() {
        return spriteModelo;
    }

    public void setSpriteModelo(String spriteModelo) {
        this.spriteModelo = spriteModelo;
    }

    public int getBaseHp() {
        return baseHp;
    }

    public void setBaseHp(int baseHp) {
        this.baseHp = baseHp;
    }

    public int getBaseAtq() {
        return baseAtq;
    }

    public void setBaseAtq(int baseAtq) {
        this.baseAtq = baseAtq;
    }

    public int getBaseDef() {
        return baseDef;
    }

    public void setBaseDef(int baseDef) {
        this.baseDef = baseDef;
    }

    public int getBaseAtqEsp() {
        return baseAtqEsp;
    }

    public void setBaseAtqEsp(int baseAtqEsp) {
        this.baseAtqEsp = baseAtqEsp;
    }

    public int getBaseDefEsp() {
        return baseDefEsp;
    }

    public void setBaseDefEsp(int baseDefEsp) {
        this.baseDefEsp = baseDefEsp;
    }

    public int getBaseVel() {
        return baseVel;
    }

    public void setBaseVel(int baseVel) {
        this.baseVel = baseVel;
    }

    public double getRatioCaptura() {
        return ratioCaptura;
    }

    public void setRatioCaptura(double ratioCaptura) {
        this.ratioCaptura = ratioCaptura;
    }

    public int getRegionOrigen() {
        return regionOrigen;
    }

    public void setRegionOrigen(int regionOrigen) {
        this.regionOrigen = regionOrigen;
    }
    
    
}
