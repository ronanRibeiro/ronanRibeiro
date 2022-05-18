/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 14 - Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Informe dois número:");
        double num1 = leitorScanner.nextDouble();
        double num2 = leitorScanner.nextDouble();

        leitorScanner.close();

        //Verifcação e impressão do resultado
        if (num1 > num2 ){
            System.out.printf("%s é maior %s", Double.toString(num1), Double.toString(num2));
        } else if (num1 == num2) {
            System.out.printf("%s é igual a %s", Double.toString(num2), Double.toString(num1));
        }else {
            System.out.printf("%s é maior %s", Double.toString(num2), Double.toString(num1));
        }
    }
}