package com.contador.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        //declaração de variaveis
         int n;

         //entrada de dados:
         System.out.printf("Informe o número INTEIRO:");
         n = leia.nextInt();

         // WHILE (Enquanto)
         while (n >= 0) {
            System.out.println("Contagem:" + n);
            n--;
         }
        leia.close();
    }
}
