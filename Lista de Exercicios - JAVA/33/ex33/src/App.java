/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 33 - A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que 
calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo: 
a. Professor Nível 1 R$12,00 por hora/aula;
b. Professor Nível 2 R$17,00 por hora/aula;
c. Professor Nível 3 R$25,00 por hora/aula.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Informe o nível do professor:");
        int nivelProfessor = leitorScanner.nextInt();
        System.out.println("Informe a quantidade de horas trabalhadas:");
        int horasTrabalhadas = leitorScanner.nextInt();      
        leitorScanner.close();

        //Calculo do salário e impressão
        switch (nivelProfessor) {
            case 1:
                System.out.printf("O sálario será de: %d,00 R$", horasTrabalhadas * 12);
                break;
            case 2:
                System.out.printf("O sálario será de: %d,00 R$", horasTrabalhadas * 17);
                break;
            case 3:
                System.out.printf("O sálario será de: %d,00 R$", horasTrabalhadas * 25);
                break;
            default:
                System.out.println("Digite um nível de professor válido.");
        }
    }
}