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
