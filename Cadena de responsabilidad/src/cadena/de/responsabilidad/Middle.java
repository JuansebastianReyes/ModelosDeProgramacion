/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena.de.responsabilidad;

/**
 *
 * @author JUAN SEBASTIAN
 */
public class Middle implements interfasAyuda{
    private final int tipoAyuda = 2;
    private interfasAyuda sucesor;
    
    public Middle(interfasAyuda s){
        this.sucesor = s;   
    }
    
    @Override
    public void getAyuda(int tipo) {
        if(tipo == tipoAyuda){
            System.out.println("\t == Ayuda desde el Middle");
        }else{
            sucesor.getAyuda(tipo);
        }
    }
    
}
