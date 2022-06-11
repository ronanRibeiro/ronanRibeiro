/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 13 - Crie uma classe Calculadora. Esta classe deve implementar as operações básicas (soma, subtração, divisão 
e multiplicação). Utilizando o conceito de herança crie uma classe chamada calculadora cientifica que 
implementa os seguintes cálculos: raizQuadrada e a potencia. Dica utilize a classe Math do pacote java.lang.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        CalculadoraCientifica cc = new CalculadoraCientifica();

        boolean continuar = true;
        int opcao;

        while (continuar == true) {

            System.out.println("\nDigite qual operaão deseja realizar:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Raiz Quadrada");
            System.out.println("6 - Potência");
            System.out.println("7 - Sair");

            opcao = leitorScanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nDigite os 2 números que deseja somar");
                    System.out.printf("O resultado é %f", cc.soma(leitorScanner.nextDouble(), leitorScanner.nextDouble()));
                    break;
                case 2:
                    System.out.println("\nDigite os 2 números que deseja subtrair");
                    System.out.printf("O resultado é %f", cc.subtracao(leitorScanner.nextDouble(), leitorScanner.nextDouble()));
                    break;
                case 3:
                    System.out.println("\nDigite os 2 números que deseja multiplicar");
                    System.out.printf("O resultado é %f", cc.multiplicacao(leitorScanner.nextDouble(), leitorScanner.nextDouble()));
                    break;
                case 4:
                    System.out.println("\nDigite os 2 números que deseja dividir");
                    System.out.printf("O resultado é %f", cc.divisao(leitorScanner.nextDouble(), leitorScanner.nextDouble()));
                    break;
                case 5:
                    System.out.println("\nDigite os número que deseja a raiz quadrada");
                    System.out.printf("O resultado é %f", cc.raizQuadrada(leitorScanner.nextDouble()));
                    break;
                case 6:
                    System.out.println("\nDigite os o números que deseja elevar e a potência");
                    System.out.printf("O resultado é %f", cc.potencia(leitorScanner.nextDouble(), leitorScanner.nextDouble()));
                    break;
                case 7:
                    continuar = false;
                    break;
                default: 
                    System.out.println("\nDigite um comando váldio");
                    break;
            }
        }
        leitorScanner.close();        
    }
}
