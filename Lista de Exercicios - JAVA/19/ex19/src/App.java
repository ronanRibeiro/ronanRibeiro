/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 19 -  Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou 
mulher. No final informe total de homens e de mulheres;
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Informe o nome e o sexo (m ou f) de 56 pessoas:");
        int qntdHomem = 0, qntdMulher = 0;
        
        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);
        for (int i = 1; i <= 5; i++){
            System.out.printf("Idade da %dª pessoa: ", i);
            int idade = leitorScanner.nextInt();
            System.out.printf("Sexo da %dª pessoa: ", i);
            char sexo = leitorScanner.next().charAt(0);
            
            //Teste lógico e atribuição das quantidades de homens e mulheres.
            if (sexo == 'm') {
                 qntdHomem++;
            } else if (sexo == 'f') {
                qntdMulher++;
            } else {
                System.out.println("Sexo inválido. Digite novamente.");
                 i--;
            }
        }
        leitorScanner.close();

        //Impressão dos resultados
        System.out.printf("Ao todo, das 56 pessoas, %d são homens e %d são mulheres.", qntdHomem, qntdMulher);
    }
}