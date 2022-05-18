/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 01 -  Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite 2 valores:");
        int num1 = leitorScanner.nextInt();
        int num2 = leitorScanner.nextInt();

        leitorScanner.close();

        //Soma
        int tot = num1 + num2;

        //Impressão do resultado
        System.out.println("A soma é: " + tot);
    }
}