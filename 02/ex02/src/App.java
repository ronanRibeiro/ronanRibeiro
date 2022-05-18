/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 02 -  Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão 
dos dois números lidos;
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite 2 valores:");
        float num1 = leitorScanner.nextFloat();
        float num2 = leitorScanner.nextFloat();

        leitorScanner.close();

        //Operacoes
        float soma = num1+num2;
        float subtracao = num1-num2;
        float multiplicacao = num1 * num2;
        float divisao = num1 / num2;

        //Impressão dos resultados
        System.out.println("A soma é: " + soma);
        System.out.println("A subtracão é: " + subtracao);
        System.out.println("A multiplicação é: " + multiplicacao);
        System.out.println("A divisão é: " + divisao);
    }
}