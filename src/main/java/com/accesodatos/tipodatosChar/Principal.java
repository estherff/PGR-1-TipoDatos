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
