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
public class Clase {

    private String nombre;
    private ArrayList<Atributo> atributos;

    public Clase(String nombre) {
        this.nombre = nombre;
        this.atributos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Atributo> getAtributos() {
        return atributos;
    }

    public void addAtributos(String nombre, Tipo tipo) {
        this.atributos.add(new Atributo(nombre, tipo));
    }

}
