/*
 * This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.accesodatos.tipodatosBoolean;

/**
 *
 * @author Esther Ferreiro
 */
import java.util.Scanner;

class Principal {

//    public static void main( String args[] ) {
//
//        int numero;
//        boolean esCorrecto;
//        Scanner teclado = new Scanner(System.in);
//
//        do
//        {
//            System.out.print("Introduce un número del 0 al 10: ");
//            numero = teclado.nextInt();
//            esCorrecto = true;
//
//            if (numero < 0)
//                esCorrecto = false;
//
//            if (numero > 10)
//                esCorrecto = false;
//
//            if ( ! esCorrecto )
//                System.out.println("Este número no es válido!");
//        }
//        while ( ! esCorrecto );
//        System.out.println("Finalizada la prueba!");
//    }
    
    //No es necesario usar un "if" para darles valores, sino que se puede hacer 
    //directamente asignándoles el valor de una condición, así:
public static void main(String args[]) {

    int numero;
    boolean esCorrecto;
    Scanner teclado = new Scanner(System.in);

    do {
        System.out.print("Introduce un número del 0 al 10: ");
        numero = teclado.nextInt();
        esCorrecto = true;

        esCorrecto = (numero >= 0) && (numero <= 10);
        if (!esCorrecto) {
            System.out.println("No es correcto!");
        }
    } while (!esCorrecto);
    System.out.println("Finalizada la prueba!");
}
}