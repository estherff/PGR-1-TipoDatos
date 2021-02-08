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
