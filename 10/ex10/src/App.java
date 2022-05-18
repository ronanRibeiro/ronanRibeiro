/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 10 - A Loja Mamão com Açúcar está vendendo seus produtos em5(cinco)prestações sem juros. Faça um 
algoritmo que receba um valor de uma compra e mostre o valor das prestações;
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto:");
        double valorProduto = leitorScanner.nextDouble(); 

        leitorScanner.close();

        //Cálculo das parcelas e impressão do resultado
        System.out.printf("O valor das parcelas é de %.2f R$", valorProduto / 5);
    }
}
