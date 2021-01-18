/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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