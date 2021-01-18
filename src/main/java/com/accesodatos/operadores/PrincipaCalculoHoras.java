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
public class PrincipaCalculoHoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalH, semanas, dias, horas;
        Scanner miScanner=new Scanner(System.in);
        System.out.println("Introduce el número de horas para realizar el cálculo");
        totalH = miScanner.nextInt();
        semanas = totalH / (24 * 7);
        dias = totalH % (24 * 7) / 24;
        horas = totalH % 24;
        System.out.println("El número total de horas es " + totalH);
        System.out.println("que es equivalente a:");
        System.out.println(semanas + " semanas");
        System.out.println(dias + " dias");
        System.out.println(dias + " horas");
    }

}
