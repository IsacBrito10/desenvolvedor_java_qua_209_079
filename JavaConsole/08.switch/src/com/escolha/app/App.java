package com.escolha.app;

 
import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        //declaração de variáveis
        double x, y, result;
        int opcao;

        // entrada de dados:
        System.out.println("Informe o valor de x: ");
        x = leia.nextDouble();
        System.out.println("Informe o valor de y: ");
        y = leia.nextDouble();
        System.out.println("1- Soma.");
        System.out.println("2- Subtração.");
        System.out.println("3- Multiplicação.");
        System.out.println("4- Divisão.");
        System.out.println("5- Fechar programa.");
        System.out.println("Escolha a opção: ");
        opcao = leia.nextInt();

        // Escolha caso:
        switch (opcao) {
            case 1: result = x+y;
            System.out.println("O resultado é: " + result);
                break;
                case 2: result = x-y;
            System.out.println("O resultado é: " + result);
                break;
                case 3: result = x*y;
            System.out.println("O resultado é: " + result);
                break;
                case 4: result = x/y;
            System.out.println("O resultado é: " + result);
                break;
                case 5: System.out.println("Programa encerrado.");
                break;
            default:
            System.out.println("Opção inexistente.");
                break;
        }
         leia.close();
    }
}
