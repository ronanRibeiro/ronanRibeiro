/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 16 - Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a 
sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e 
Recuperação (media entre 5.1 a 6.9);

*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Informe o nome do aluno:");
        String nome = leitorScanner.nextLine();
        System.out.printf("Informe as três notas de %s:\n", nome);
        double nota1 = leitorScanner.nextDouble();
        double nota2 = leitorScanner.nextDouble();
        double nota3 = leitorScanner.nextDouble();

        leitorScanner.close();

        //Calculo da media
        double media = (nota1 + nota2 + nota3)/3;

        //Verifcação lógica e impressão do resultado
        if (media >= 7 ){
            System.out.printf("%s tem média %.2f, logo está aprovado", nome, media);
        } else if (media <= 5) {
            System.out.printf("%s tem média %.2f, logo está reprovado", nome, media);
        } else {
            System.out.printf("%s tem média %.2f, logo está de recuperação", nome, media);
        }
    }
}