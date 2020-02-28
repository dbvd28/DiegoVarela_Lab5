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
public class Villanos {
    private ArrayList<Superpoderes> spoderes=new ArrayList();
    private String nombre;
    private int edad;
    private String planeta;
    private String Altura;

    public Villanos(String nombre, int edad, String planeta, String Altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.planeta = planeta;
        this.Altura = Altura;
    }

    public ArrayList<Superpoderes> getSpoderes() {
        return spoderes;
    }

    public void setSpoderes(ArrayList<Superpoderes> spoderes) {
        this.spoderes = spoderes;
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

    @Override
    public String toString() {
        return "Villanos{" + "nombre=" + nombre + '}';
    }

    
}
