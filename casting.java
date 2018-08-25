/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casting;

/**
 *
 * @author Lucas A. Morales Romero
 */
public class Casting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 1234567891; 
        long b = (long) a;
        System.out.println("valor convertido de integer a long: " +b );
        
        double c = 3.1416;
        int s = (int) c;
        System.out.println("valor convertido de double a integer: " +c);
    }
    
}
