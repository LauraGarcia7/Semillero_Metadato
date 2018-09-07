/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metamodelo;

import java.util.ArrayList;

/**
 *
 * @author LabingXEON
 */
public class Aplicacion {

    private String nombre;
    private ArrayList<Clase> clases;
    private ArrayList<Tipo> tipos;

    public Aplicacion(String nombre) {
        this.nombre = nombre;
        this.clases = new ArrayList<>();
        this.tipos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void addClases(String nombre) {
        this.clases.add(new Clase(nombre));
    }

    public void addAtributo(String nombre, Tipo tipo) {

    }

    public ArrayList<Tipo> getTipos() {
        return tipos;
    }

    public void addTipo(String nombre) {
        this.tipos.add(new Tipo(nombre));
    }

}
