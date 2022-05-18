/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 23 - Faça um algoritmo que receba um número e mostre uma mensagem caso este número sege maior que 80, 
menor que 25 ou igual a 40;
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Informe um número:");
        double num = leitorScanner.nextDouble();

        leitorScanner.close();

        // Veriicação lógica e impressão dos resultado
        if (num == 40) {
            System.out.println("O número é igual a 40");
        } else if (num > 80) {
            System.out.println("O número é maior que 80");
        }
        if (num < 25) {
            System.out.println("O número é menor que 25");
        }
    }
}