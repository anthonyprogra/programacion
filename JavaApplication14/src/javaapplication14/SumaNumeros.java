/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.Scanner;
public class SumaNumeros {

    public static void main(String[] args) {
        //sumando1
        System.out.println("Introducir dos numeros enteros");
        Scanner s=new Scanner(System.in);
        int a,b,suma;
        a=s.nextInt();
        b=s.nextInt();
        suma=a+b;

        System.out.println("El resultado de sumar " + a+ " y " + b + " es :" + suma);
        
    }
}
