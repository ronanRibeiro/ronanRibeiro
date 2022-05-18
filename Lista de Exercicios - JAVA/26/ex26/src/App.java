/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 26 - Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso o usuário digite um número 
que não esteja neste intervalo, exibir a seguinte mensagem: número inválido;;
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Informe um número de 1 a 5:");
        int num = leitorScanner.nextInt();
        leitorScanner.close();

        // Verificação do número
        switch (num) {
            case 1:
            System.out.println("Um");
            break;
            case 2:
            System.out.println("Dois");
            break;
            case 3:
            System.out.println("Três");
            break;
            case 4:
            System.out.println("Quatro");
            break;
            case 5:
            System.out.println("Cinco");
            break;
            default:
            System.out.println("Número inválido");        
        }
    }
}