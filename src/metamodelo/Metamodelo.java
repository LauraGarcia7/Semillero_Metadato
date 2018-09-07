/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metamodelo;

/**
 *
 * @author LabingXEON
 */
public class Metamodelo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Aplicacion aplicacion = new Aplicacion("laboratorio");
        aplicacion.addClases("Activo");
        aplicacion.addClases("Tipo");
        aplicacion.addTipo("String");
        aplicacion.addTipo("int");
        
        Clase clase = aplicacion.getClases().get(0);
        Tipo tipo = aplicacion.getTipos().get(0);
        
        clase.addAtributos("nombre", tipo);
        clase.addAtributos("descripcion", tipo);
        
        Generador generador = new Generador();
        generador.generar(aplicacion);
        generador.generarDAO(aplicacion);
        
        generador.generarMain(aplicacion);
    }
    
}
