/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 18 -  Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e 
“menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;


*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Informe o nome e a idade de 75 pessoas:");
        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);
        for (int i = 1; i <= 75; i++){
            System.out.printf("Idade da %dª pessoa: ", i);
            double idade = leitorScanner.nextDouble();
                //Verificar maior idade
                if (idade >= 18) {
                    System.out.println("Maior de idade");
                } else {
                    System.out.println("Menor de idade");
                }
        }
        leitorScanner.close();
    }
}