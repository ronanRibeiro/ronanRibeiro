/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 12 - O custo de um carro novo ao consumidoré a soma do custo de fábrica mais o percentual do distribuidor e 
dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual 
do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos 
45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do 
mesmo;
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Informe o custo do carro de fábrica:");
        double valorCarro = leitorScanner.nextDouble();

        leitorScanner.close();

        //Cálculo do valor final e impressão do resultado
        System.out.printf("O carro custará %.2f R$", valorCarro * 1.45 * 1.28);
    }
}
