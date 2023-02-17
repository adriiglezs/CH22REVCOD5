package com.generation;

import java.util.Scanner; /*importamos la libreria*/

public class Correccioncodigo5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); /*agregue el System.in*/
        System.out.print("Introduzca un nufamero: ");
        String ni = s.nextLine();
        int c = Integer.parseInt(ni); /*convertimos el valor string a un itn para poder hacer la operacion matematica*/
        
        int afo = 0;
        int noAfo = 0;
        
        while (c > 0) {
            int digito = c % 10; /*quite el int */
            if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
                afo++;
            } else {
                noAfo++;
            }
            c /= 10;/*cambien ni por c y lo saque del else*/
        }

        if (afo > noAfo) {
            System.out.println("El " + Integer.parseInt(ni) + " es un numero afortunado.");/*agregue el integer*/
        } else {
            System.out.println("El " + Integer.parseInt(ni) + " no es un numero afortunado.");/*agregue el integer*/
        }
    }
}
