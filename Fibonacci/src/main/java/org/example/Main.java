package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1 = 0, num2 = 1;
        System.out.println("Digite um número:");
        int num = teclado.nextInt();
        int[] numeros = new int[num + 1];

        if (num >= 0) {
            numeros[0] = num1;
        }
        if (num >= 1) {
            numeros[1] = num2;
        }

        for (int i = 2; i <= num; i++) {
            int calculo = num1 + num2;
            numeros[i] = calculo;
            num1 = num2;
            num2 = calculo;
        }

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (num == numeros[i]) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O número " + num + " está presente na sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não está presente na sequência de Fibonacci.");
        }

        teclado.close();
    }
}
