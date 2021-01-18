/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accesodatos.tipodatosChar;

import java.util.Scanner;

/**
 *
 * @author Esther Ferreiro
 */
public class Principal {

    public static void main(String[] args) {
        char letra1, letra2;

        letra1 = 'a';
        letra2 = 'z';

        System.out.print("La primera letra del alfabeto es: ");
        System.out.println(letra1);

        System.out.print("La última letra del alfabeto es: ");
        System.out.println(letra2);

        //Conversión entre int y char
        char c1 = 'a';
        char c2 = '1';
        //A las variables enteras se asigna el código ASCII
        int n1 = c1;
        int n2 = c2;
        System.out.println(n1);//97
        System.out.println(n2);//49

        Scanner oo= new Scanner (System.in);
//        //Casting entre char e int
//        int a = 65;
//        char c = (char) a;
//        System.out.println(c);
        
        //Condiciones
        int a=5, b=12, c=2;
        if (a > b || b >= 12 && b > c) {
            a=56;
        }

    }

}
