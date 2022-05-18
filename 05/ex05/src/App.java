/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 05 -  Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. 
No final informar o nome do aluno e a sua média (aritmética);
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = leitorScanner.nextLine();
        System.out.println("Digite as suas três notas:");
        float nota1 = leitorScanner.nextFloat();
        float nota2 = leitorScanner.nextFloat();
        float nota3 = leitorScanner.nextFloat();

        leitorScanner.close();
        
        //Calcular a média
        float media = (nota1 + nota2 +  nota3) / 3;

        //Imprimir o resultado
        System.out.printf("A média de %s é %.2f.", nome, media);
    }
}