/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.teis.ad.tipodatos;

/**
 *
 * @author Esther Ferreiro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    short i=2;
    short j, k;
   j = 3 * 2; 	// resultado: j = 2*3 = 6
   i++; 	// resultado: i = 2+1 = 3
   j *= i;	// resultado: j = 6*3 = 18
   k = (short) ((short) j* i);	// resultado: k = 18%3 = 0
   i++; 	// resultado: i = 3+1 = 4
   j /= i; 	// resultado: j = 18/4 = 4
   double x=3.5, y, z;
   y = x + 4.2; // resultado: y = 3.5+4.2 = 7.7
   x--; 	// resultado: x = 3.5-1.0 = 2.5


    }
    
}
