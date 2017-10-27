package daw2017;

import java.util.Scanner;

public class Practica2HojaEjercicios {

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
            default:
                System.out.println("Opción incorrecta, elige una opción correcta.");

        }
    }

    //**ejercicios**
    //***************************************************
    public static void ejercicio1(Scanner s) {

        System.out.println("\nEjercicio 1. \nEste programa va a escribir los valores comprendidos entre dos numeos dados");

        int inf;
        int sup;

        System.out.println("Escribe el numero inferior");
        inf = s.nextInt();
        System.out.println("Escribe el numero superior");
        sup = s.nextInt();

        System.out.println("Los numeros que hay entre " + inf + " y " + sup + " son:");
        for (int i = inf + 1; inf < sup - 1; inf++) {
            System.out.print(inf + 1 + "-");
        }

    }
//******************************************************
    public static void ejercicio2(Scanner s) {

        System.out.println("\nEjercicio 2. \nEste programa va a escribir los 20 primeros multiplos de 5");

        int resul;
        for (int i = 1; i <= 20; i++) {
            resul = 5 * i;
            System.out.print(resul + "-");
        }

    }
//******************************************************
    public static void ejercicio3(Scanner s) {
        System.out.println("\nEjercicio 3. \nEste programa va a realizar la media de los 15 primeros numeros suministrados.");

        double suma, media;
        double num = 0;

        for (int i = 0; i < 15; i++) {
            System.out.println("Introducir un numero.");
            suma = s.nextInt();
            num += suma;
        }
        media = num / 15;
        System.out.println("La media resultante es; " + media);

    }
//*****************************************************
    public static void ejercicio4(Scanner s) {

        System.out.println("\nEjercicio 4. \nEste programa va a realizar la media de los 'n' numeros suministrados.");

        double suma, media;
        double num = 0;
        int max;

        System.out.println("Introduzca el numero de valores de los que desea realizar la media:");
        max = s.nextInt();

        for (int i = 0; i < max; i++) {
            System.out.println("Introducir un numero.");
            suma = s.nextInt();
            num += suma;
        }
        media = num / max;
        System.out.println("La media resultante es; " + media);

    }
//******************************************************************
    public static void ejercicio5(Scanner s) {
        System.out.println("\nEjercicio 5. \nEste programa va a convertir a segundos una hora dada por el usuario.");

        int hora, minutos, segundos;
        int sec = 0;
        System.out.println("Tiene que indicar la hora que desea convertir, formato 24H");

        do {
            System.out.println("Introduzca una hora valida, entre 0-24H");
            hora = s.nextInt();

        } while (hora > 24 || hora < 0);
        do {
            System.out.println("Introduzca los minutos, entre 0-59");
            minutos = s.nextInt();

        } while (minutos > 59 || minutos < 0);

        do {
            System.out.println("Introduzca los segundos, entre 0-59");
            segundos = s.nextInt();

        } while (segundos > 59 || segundos < 0);

        hora = hora * 3600;
        minutos = minutos * 60;
        sec = hora + minutos + segundos;

        System.out.println("los segundos totales de: " + hora / 3600 + " hora/s, " + minutos / 60 + " minutos y " + segundos + " son: " + sec + " segundos");

    }
//*******************************************************
    public static void ejercicio6(Scanner s) {
        System.out.println("\nEjercicio 6. \nEste programa va a convertir a hora minutos segundos una cantidad de segundos.");
        int total, hora = 0, min, seg, dia;
        System.out.println("Introduzca los segundos totales.");
        total = s.nextInt();

        seg = total % 60; //segundos

        min = total / 60;//minutos

        while (min >= 60) {
            hora++;
            min -= 60;

        }

        System.out.println(total + " segundos equivalen a: " + hora + " hora/s," + min + " minutos y " + seg + " segundos.");

    }

    public static void ejercicio7(Scanner s) {
        System.out.println("\nEjercicio 7. \nEste programa va a concluir cual es el numero mayor y el menor de los 10 introdicidos.");
        int num, num2, max = 0, min = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un numero entero: ");
            num = s.nextInt();
            System.out.println("otro numero");
            num2 = s.nextInt();

            if (num > num2) {
                max = num;

            } else if (num < min) {
                min = num;
            }
        }
        System.out.println("El numero mas grande es: " + max);
        System.out.println("El numero mas pequeño es: " + min);

    }
//********************************************************
    public static void ejercicio8(Scanner s) {
        System.out.println("\nEjercicio 8. \nEste programa va a calcular el factorial de un numero suministrado por teclado.");
        int num, fact = 1;
        System.out.println("Escriba el numero del que desea hallar el factorial: ");
        num = s.nextInt();
        for (int i = 1; i <= num; i++) {

            fact = fact * i;

        }
        System.out.println(fact);

    }

    public static void ejercicio9(Scanner s) {
        System.out.println("\nEjercicio 9. \nEste programa va a ordenar 3 numeros de menos a mayor");

        int num1, num2, num3, max, min;
        System.out.println("");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

            }
        }
    }
//***************************************************
    public static void ejercicio10(Scanner s) {
        System.out.println("\nEjercicio 10. \nEste programa va a mostrar los numeros primos entre 1 y 'n':");
        int nota;
        System.out.println("Introducir nota");
        nota = s.nextInt();
        switch (nota) {
            case 1:
                System.out.println("Su nota es: UNO");
                break;
            case 2:
                System.out.println("Su nota es: DOS");
                break;
            case 3:
                System.out.println("Su nota es: TRES");
                break;
            case 4:
                System.out.println("Su nota es: CUATRO");
                break;
            case 5:
                System.out.println("Su nota es: CINCO");
                break;
            case 6:
                System.out.println("Su nota es: SEIS");
                break;
            case 7:
                System.out.println("Su nota es: SIETE");
                break;
            case 8:
                System.out.println("Su nota es: OCHO");
                break;
            case 9:
                System.out.println("Su nota es: NUEVE");
                break;
            case 10:
                System.out.println("Su nota es: DIEZ");
                break;
            default:
                System.out.println("Nota no valida");
        }

    }

    public static void ejercicio11(Scanner s) {
        System.out.println("\nEjercicio 11. \nEste programa va a mostrar los numeros primos entre 1 y 'n':");
        int nota;
        System.out.println("Escribir nota: ");
        nota=s.nextInt();
        
        if(nota>=0&&nota<=4){
            System.out.println("Insuficiente (<5)");            
        }else if(nota >=5){
            System.out.println("suficiente (5)");
    }else{
            System.out.println("Nota no valida");
        }

    }

    public static void ejercicio12(Scanner s) {

    }

    public static void ejercicio13(Scanner s) {
        System.out.println("\nEjercicio 9. \nEste programa va a mostrar los numeros primos entre 1 y 'n':");
        int cont;
        boolean primo = true;
        System.out.println("Escribe el limite: ");
        cont = s.nextInt();
        for (int i = 1; i <= cont; i++) {

            for (int j = 1; j <= cont; j++) {

                if (i / j = 1) {

                }

                if (primo) {
                    System.out.println(i);
                }

            }
            /* if(i/i=1){
                System.out.println(i);
                
            }*/
        }
    }

}
