/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_diegovarela;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Super {
    private ArrayList<Superpoderes> poderes=new ArrayList();
    private String nombre;
    private int edad;
    private String planeta;
    private String Altura;
    private int atrapados;

    public Super() {
    }

    public Super(String nombre, int edad, String planeta, String Altura, int atrapados) {
        this.nombre = nombre;
        this.edad = edad;
        this.planeta = planeta;
        this.Altura = Altura;
        this.atrapados = atrapados;
    }

    public ArrayList<Superpoderes> getPoderes() {
        return poderes;
    }

    public void setPoderes(ArrayList<Superpoderes> poderes) {
        this.poderes = poderes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public String getAltura() {
        return Altura;
    }

    public void setAltura(String Altura) {
        this.Altura = Altura;
    }

    public int getAtrapados() {
        return atrapados;
    }

    public void setAtrapados(int atrapados) {
        this.atrapados = atrapados;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
    
}
