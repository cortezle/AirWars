/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author danie
 */
public class Info {
    private String nombre;
    private int puntaje;

    public Info() {
        
    }

    public Info(String nombre) {
        this.nombre = nombre;
    }

    public Info(int puntaje) {
        this.puntaje = puntaje;
    }
    
    public Info(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }    
    
}
