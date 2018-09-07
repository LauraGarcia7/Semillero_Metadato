
import java.util.Scanner;
import java.util.ArrayList;
public class Main{
public static void main(String[] args) {
ArrayList<Activo> activo = new ArrayList<>();
ArrayList<Tipo> tipo = new ArrayList<>();
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
            
            switch(opcion){
                case 1: System.out.println("Insertar Entidades");
             System.out.println("0.Activo");
             System.out.println("1.Tipo");
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
                    break;
     }            
        } while (continuar);
    }
}
