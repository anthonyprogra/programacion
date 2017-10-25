/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw2017;

import java.util.Scanner;

public class Practica2 {

    public static void main(String[] args) {

        //menu
        System.out.println("**************");
        System.out.println("Practica 2.");
        System.out.println("Elige ejercicio: ");
        System.out.println("1. Ejercicio 1 ");
        System.out.println("2. Ejercicio 1 ");
        System.out.println("3. Ejercicio 1 ");
        System.out.println("4. Ejercicio 1 ");
        System.out.println("5. Ejercicio 1 ");
        System.out.println("6. Ejercicio 1 ");
        System.out.println("7. Ejercicio 1 ");
        System.out.println("8. Ejercicio 1 ");
        System.out.println("9. Ejercicio 1 ");
        System.out.println("10. Ejercicio 1 ");
        System.out.println("11. Ejercicio 1 ");
        System.out.println("12. Ejercicio 1 ");
        System.out.println("13. Ejercicio 1 ");

        //opcion
        Scanner s = new Scanner(System.in);
        int opc = s.nextInt();

        switch (opc) {
            case 1:
                ejercicio1(s);
                break;
            case 2:
                ejercicio2(s);
                break;
            case 3:
                ejercicio3(s);
                break;
            case 4:
                ejercicio4(s);
                break;
            case 5:
                ejercicio5(s);
                break;
            case 6:
                ejercicio6(s);
                break;
            case 7:
                ejercicio7(s);
                break;
            case 8:
                ejercicio8(s);
                break;
            case 9:
                ejercicio9(s);
                break;
            case 10:
                ejercicio10(s);
                break;
            case 11:
                ejercicio11(s);
                break;
            case 12:
                ejercicio12(s);
                break;
            case 13:
                ejercicio13(s);
                break;

        }
    }

    //ejercicios
    //public static void ejercicio1(sc)  con eso se comparten parametros entre los ejecicios
    
    
    public static void ejercicio1(Scanner sc) {
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

    public static void ejercicio2(Scanner sc) {
        System.out.println("Este programa va a escribir los 5 primeros multiplos de 5");
        int resul;
        for(int i=1;i<=5;i++){
            resul=5*i;
            System.out.print(resul+"-");
        }

    }

    public static void ejercicio3(Scanner sc) {

    }
    public static void ejercicio4(Scanner sc) {

    }
    public static void ejercicio5(Scanner sc) {

    }
    public static void ejercicio6(Scanner sc) {

    }
    public static void ejercicio7(Scanner sc) {

    }
    public static void ejercicio8(Scanner sc) {

    }
    public static void ejercicio9(Scanner sc) {

    }
    public static void ejercicio10(Scanner sc) {

    }
    public static void ejercicio11(Scanner sc) {

    }
    public static void ejercicio12(Scanner sc) {

    }public static void ejercicio13(Scanner sc) {

    }

}
