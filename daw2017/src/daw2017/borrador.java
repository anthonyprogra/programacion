package daw2017;

import java.util.Random;
import java.util.Scanner;

public class borrador {

    public static void main(String[] args) {

        System.out.println("\nEjercicio 7. \nEste programa va a concluir cual es el numero mayor y el menor de los 10 introdicidos.");
        Scanner s = new Scanner(System.in);
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
}
