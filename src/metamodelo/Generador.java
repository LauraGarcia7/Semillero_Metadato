/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metamodelo;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LabingXEON
 */
public class Generador {

    File folder = new File("ejemplo1");

    public void generar(Aplicacion aplicacion) {

        folder.mkdirs();
        for (Clase clase : aplicacion.getClases()) {
            try {
                FileWriter escritura = new FileWriter(new File("package/" + clase.getNombre()) + ".java");
                escritura.write("public class " + clase.getNombre() + "\n");
                escritura.write("{" + "\n");
                for (Atributo atributo : clase.getAtributos()) {
                    escritura.write("private " + atributo.getTipo().getNombre() + " " + atributo.getNombre() + ";\n");
                }

                for (Atributo atributo : clase.getAtributos()) {
                    String p = atributo.getNombre().substring(0, 1).toUpperCase();
                    String r = atributo.getNombre().substring(1, atributo.getNombre().length());

                    escritura.write("public " + atributo.getTipo().getNombre() + " " + "get" + p + r + "(" + ")" + "{" + "\n");
                    escritura.write("return " + atributo.getNombre() + ";\n");
                    escritura.write("}\n");

                    escritura.write(" public void set" + p + r + "(" + atributo.getTipo().getNombre() + " " + atributo.getNombre() + "){\n");
                    escritura.write(" this." + atributo.getNombre() + "=" + atributo.getNombre() + ";");
                    escritura.write("\n}\n");
                }

                escritura.write("}\n");
                escritura.flush();
                escritura.close();

            } catch (IOException ex) {
                Logger.getLogger(Generador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void generarMain(Aplicacion aplicacion) {
        FileWriter escritura;
        try {
            escritura = new FileWriter("package/"+"Main.java");
            escritura.write("\n");
            escritura.write("import java.util.Scanner;\n");
            escritura.write("import java.util.ArrayList;\n");
            escritura.write("public class Main" + "{\n");
            escritura.write("public static void main(String[] args) {\n");
            ArrayList<Clase> clases = aplicacion.getClases();
            for (Clase clase : clases) {
                escritura.write("ArrayList<" + clase.getNombre() + "> " + clase.getNombre().toLowerCase() + " = new ArrayList<>();\n");
            }

            escritura.write("  Scanner lectura = new Scanner(System.in);\n"
                    + "        int opcion=-1;\n"
                    + "        boolean continuar= false;\n"
                    + "        System.out.println(\"Bienvinido a APLICACION\");\n"
                    + "        \n"
                    + "        do {            \n"
                    + "            System.out.println(\"1: Insertar\");\n"
                    + "            System.out.println(\"2: Listar\");\n"
                    + "            System.out.println(\"3: Borrar\");\n"
                    + "            System.out.println(\"4: Actualizar\");\n"
                    + "            opcion= lectura.nextInt();\n"
                    + "            \n"
                    + "            switch(opcion){\n"
                    + "                case 1: ");
            escritura.write("System.out.println(\"Insertar Entidades\");\n");
            for (int i = 0; i < clases.size(); i++) {
                escritura.write("             System.out.println(\"" + i + "." + clases.get(i).getNombre() + "\");\n");
            }

            escritura.write("                    break;\n" + "                case 2: \n");
            escritura.write(
                    "                    System.out.println(\"Listar Entidades\");\n"
                    + "                    break;\n");

            escritura.write("                case 3: \n");
            escritura.write(
                    "                    System.out.println(\"Borrar Entidades\");\n"
                    + "                    break;\n");

            escritura.write("                case 4: \n");
            escritura.write(
                    "                    System.out.println(\"Actualizar Entidades\");\n"
                    + "                    break;\n");

            escritura.write("                default: \n");
            escritura.write(
                    "                    System.out.println(\"Opcion Invalida\");\n"
                    + "                    break;\n");

            escritura.write("     }            \n"
                    + "        } while (continuar);\n"
                    + "    }\n"
                    + "}\n"
                    + "");
            escritura.flush();

        } catch (IOException ex) {
            Logger.getLogger(Generador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    void generarDAO(Aplicacion aplicacion){
         for (Clase clase : aplicacion.getClases()) {
             try {
                 String p = clase.getNombre().substring(0, 1).toLowerCase();
                    String r = clase.getNombre().substring(1, clase.getNombre().length());
                 FileWriter escritura = new FileWriter(new File("package/" + clase.getNombre()) + "DAO.java");
                 escritura.write(" ");
                 escritura.write(" public class "+ clase.getNombre() + "DAO{\n");
                 escritura.write("public void Insertar("+ clase.getNombre()+" "+p+r +"){\n");
                 escritura.write("\n}");
                 escritura.write("public void Borrar("+ clase.getNombre()+" "+p+r +"){\n");
                 escritura.write("\n}");
                 escritura.write("public void nose("+ clase.getNombre()+" "+p+r +"){\n");
                 escritura.write("\n}");
                 escritura.write("\n}");
                 escritura.flush();
                 escritura.close();
             } catch (IOException ex) {
                 Logger.getLogger(Generador.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             
         
         
         }
    
    }
}

