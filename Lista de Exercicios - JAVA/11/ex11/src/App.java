/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 11 - Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o 
preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Informe o preço do produto:");
        double valorProduto = leitorScanner.nextDouble();
        System.out.println("Informe o percentual de lucro:");
        double percentualProduto = leitorScanner.nextDouble(); 

        leitorScanner.close();

        //Cálculo do valor final e impressão do resultado
        System.out.printf("O produto que custa %.2f R$ passará a custar %.2f R$", valorProduto, valorProduto * (1 + percentualProduto / 100));
    }
}