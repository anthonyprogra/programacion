/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw2017;

/**
 *
 * @author anthony
 */
import java.util.Scanner;

public class Practica2Ej1 {

    public static void main(String[] args) {
       
        //variables
        int inf;
        int sup;
        
        //colección de datos
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe el numero inferior");
        inf = s.nextInt();
        System.out.println("Escribe el numero superior");
        sup = s.nextInt();

        //codigo
        System.out.println("Los numeros que hay entre "+inf+" y "+sup+" son:");
        for(int i=inf+1;inf<sup-1;inf++){
            System.out.print(inf+1+"-");
        }
    }
}
