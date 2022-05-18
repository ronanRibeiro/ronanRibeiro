/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 13 - Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Informe um número:");
        double num = leitorScanner.nextDouble();

        leitorScanner.close();

        //Verifcação e impressão do resultado
        if (num > 10 ){
            System.out.println("O número é maior que 10");
        } else if (num == 10) {
            System.out.println("O número é igual a 10");
        } else {
            System.out.println("O número é menor que 10");
        }
    }
}