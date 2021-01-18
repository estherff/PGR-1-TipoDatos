/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accesodatos.operadores;

import java.util.Scanner;

/**
 *
 * @author Esther Ferreiro
 */
public class PrincipalOperadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ostIncremento();
        //preIncremento();
        propreIncremento();
        Scanner miScanner = new Scanner(System.in);
        //int miCadena = miScanner.nextLine();
        long miEntero = miScanner.nextInt();
        float miFloat = Float.parseFloat(miScanner.nextLine());

    }

    static void postIncremento() {
        int a = 5;
        System.out.println("El valor inicial de a es: " + a);

        //operador post incremental
        //el valor actual de "a" es usado e impreso por pantalla, luego 
        //el valor incrementa en una unidad
        System.out.println("El valor de a es: " + a++);
        //imprimimos nuevamente el valor de "a", donde recien
        //podemos obsevar el incremento
        System.out.println("El valor de a es: " + a);
    }

    static void preIncremento() {
        int a = 5;
        System.out.println("El valor inicial de a es: " + a);

        //operador pre incremental
        //el valor actual de "a" es incrementado en una unidad luego 
        //es usado para ser mostrado por pantalla
        System.out.println("El valor de a es: " + ++a);
        //mostramos nuevamente el valor de "a", que no ha variado
        System.out.println("El valor de a es: " + a);
    }

    static void propreIncremento() {
        int valor = 0;
        valor = 23;
        valor += 10;
        System.out.println("Resultado de a = " + --valor);
        System.out.println("Resultado de b = " + ++valor);
        System.out.println("Resultado de c = " + valor++);
        System.out.println("Resultado de a = " + valor);
    }
}
