/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 31 - Dados três valores A, B e C, em que A e B são números reais e C é um caractere, pede-se para imprimir o 
resultado da operação de A por B se C for um símbolo de operador aritmético; caso contrário deve ser 
impressa uma mensagem de operador não definido. Tratar erro de divisão por zero;
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double numA, numB;
        char operador;

        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite a operação que deseja realizar:");
        System.out.println("Primeiro número:");
        numA = leitorScanner.nextDouble();
        System.out.println("Operador:");
        operador = leitorScanner.next().charAt(0);  
        System.out.println("Segundo número:");
        numB = leitorScanner.nextInt();          
        leitorScanner.close();

        //Fazer a operação e imprimir o resultado.
        switch (operador) {
            case '+':
                System.out.printf("%.2f", numA + numB);
                break;
            case '-':
                System.out.printf("%.2f", numA - numB);
                break;
            case '*':
                System.out.printf("%.2f", numA * numB);
                break;
            case '/':
                if (numB != 0) {
                    System.out.printf("%.2f", numA / numB);
                } else {
                    System.out.println("Não é possível fazer divisão por zero");
                }
                break;
            default:
                System.out.println("Digite um operador válido");
        }

    }
}