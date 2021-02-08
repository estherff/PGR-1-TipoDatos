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
