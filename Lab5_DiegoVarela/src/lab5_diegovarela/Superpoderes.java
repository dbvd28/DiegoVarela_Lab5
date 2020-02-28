/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_diegovarela;

/**
 *
 * @author diego
 */
public class Superpoderes {
    private int nivel;
    private String descripcion;
    private String vulnerabilidad;

    
    public Superpoderes(int nivel, String descripcion, String vulnerabilidad) {
        this.nivel = nivel;
        this.descripcion = descripcion;
        this.vulnerabilidad = vulnerabilidad;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getVulnerabilidad() {
        return vulnerabilidad;
    }

    public void setVulnerabilidad(String vulnerabilidad) {
        this.vulnerabilidad = vulnerabilidad;
    }

    @Override
    public String toString() {
        return "Superpoderes{" + "nivel=" + nivel + '}';
    }
    
}
