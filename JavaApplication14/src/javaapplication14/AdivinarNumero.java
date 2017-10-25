
package javaapplication14;

import java.util.Random;

public class AdivinarNumero {

    public static void main(String[] args) {
        
        Random generadorNumerosAleatorios = new Random();
        
        int aleatorio = generadorNumerosAleatorios.nextInt(10) + 5;
        
        System.out.println(aleatorio);

    }
}
