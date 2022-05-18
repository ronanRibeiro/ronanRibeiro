/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 25 - Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais 
imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o 
maior, e uma mensagem que são diferentes;
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Informe dois números número:");
        double num1 = leitorScanner.nextDouble();
        double num2 = leitorScanner.nextDouble();

        // Verificação do número
        if (num1 == num2) {
            System.out.println("Os dois números são iguais.");
        } else if (num1 > num2) {
            System.out.printf("Os dois números são diferentes e o número %.2f é maior que o número %.2f", num1, num2);
        } else {
            System.out.printf("Os dois números são diferentes e o número %.2f é maior que o número %.2f", num2, num1);
        }

        leitorScanner.close();
    }
}