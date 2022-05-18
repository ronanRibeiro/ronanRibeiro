/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 29 - Faça um algoritmo que receba o número do mês e mostre o mês correspondente. Valide mês inválido;
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int mes;

        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Informe o número do mês:");
        mes = leitorScanner.nextInt();        
        leitorScanner.close();

        //Impressão do nome do mês
        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Digite um mês válido");
        }
    }
}