/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author oquintansocampo
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Condicional par1 = new Condicional();
        double num1 = par1.pedirNum();
        double num2 = par1.pedirNum();
        par1.getCondicion(num1, num2);
    }
    
}
