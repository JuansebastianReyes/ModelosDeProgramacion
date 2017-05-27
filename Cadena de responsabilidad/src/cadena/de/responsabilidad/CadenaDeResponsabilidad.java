/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena.de.responsabilidad;

import java.util.Scanner;

/**
 *
 * @author JUAN SEBASTIAN
 */
public class CadenaDeResponsabilidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        Aplicacion aplicacion = new Aplicacion();
        Middle intermediario = new Middle(aplicacion);
        frontEnd presentacion = new frontEnd(intermediario);
        
        do{
            System.out.println("Ingrese una opcion ");
            System.out.println("1 = Presentacion ");
            System.out.println("2 = Logica ");
            System.out.println("3 = Aplicacion ");
            System.out.println("0 = Salir ");
            
            opcion = sc.nextInt();
            
            if(opcion != 0){
                presentacion.getAyuda(opcion);
            }
            
        }while(opcion != 0);
    }
    
}
