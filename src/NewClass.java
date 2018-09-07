
import java.util.ArrayList;
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int opcion=-1;
        boolean continuar= false;
        System.out.println("Bienvinido a APLICACION");
       
        do {            
            System.out.println("1: Insertar");
            System.out.println("2: Listar");
            System.out.println("3: Borrar");
            System.out.println("4: Actualizar");
            opcion= lectura.nextInt();
            System.out.println(i+"."+ "");
            switch(opcion){
                case 1: 
                    System.out.println("Insertar Entidades");
                    break;
                case 2: 
                    System.out.println("Listar Entidades");
                    break;
                case 3: 
                    System.out.println("Borrar Entidades");
                    break;
                case 4: 
                    System.out.println("Actualizar Entidades");
                    break;   
                default:
                    System.out.println("Opcion Invalida");
            }            
        } while (continuar);
    }
}
