/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accesodatos.tipodatosint;

import java.util.Scanner;

/**
 *
 * @author Esther Ferreiro4
 */
public class Principal {

    //Programa que pida un número entero y nos diga si es par o no
    //Con control básico de excepciones
    public static void main(String[] args) {

        int a = 18, b = 14, c = 22;
        String s = "";
        s = (a > b && a > c) ? "maximo = " + a : s + "";
        s = (b > a && b > c) ? "maximo = " + b : s + "";
        s = (c > a && c > b) ? "maximo = " + c : s + "";
        System.out.println(s); //maximo=22

    }
}
