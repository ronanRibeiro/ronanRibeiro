/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 30 - Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int numA, numB, numC;

        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Informe três números:");
        numA = leitorScanner.nextInt();
        numB = leitorScanner.nextInt();  
        numC = leitorScanner.nextInt();          
        leitorScanner.close();

        //Ordenar e Imprimir os resultados
        if (numA <= numB && numA <= numC) {
            if (numB <= numC) {
                System.out.printf("%d, %d, %d", numA, numB, numC);
            } else {
                System.out.printf("%d, %d, %d", numA, numC, numB);
            }
        } else if (numB <= numA && numB <= numC) {
            if (numA <= numC) {
                System.out.printf("%d, %d, %d", numB, numA, numC);
            } else {
                System.out.printf("%d, %d, %d", numB, numC, numA);
            }
        } else {
            if (numA <= numB) {
                System.out.printf("%d, %d, %d", numC, numA, numB);
            } else {
                System.out.printf("%d, %d, %d", numC, numB, numA);
            }
        }

    }
}