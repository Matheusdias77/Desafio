package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String palavra = "Abacaxi";
        int cont = 0;
        boolean flag = false;

        palavra = palavra.toLowerCase();

        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == 'a') {
                cont++;
                flag = true;
            }
        }

        if (flag) {
            System.out.println("A letra 'a' aparece " + cont + " vezes na palavra " + palavra);
        } else {
            System.out.println("Não tem nenhuma letra 'a' na palavra " + palavra);
        }

        teclado.close();
    }
}