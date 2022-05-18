/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 04 -  Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas 
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas 
efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor:");
        String nome = leitorScanner.nextLine();
        System.out.println("Digite o seu salario fixo:");
        float salarioFixo = leitorScanner.nextFloat();
        System.out.println("Digite o valor total das vendas dele:");
        float vendas = leitorScanner.nextFloat();

        leitorScanner.close();

        //Calcular salario e imprimir
        double salarioTotal = salarioFixo + 0.15*vendas;
        System.out.printf("O vendedor %s tem o sálario fixo de %.2f R$ e, devido as comissões, receberá o sálario total de %.2f R$.", nome, salarioFixo, salarioTotal);
    }
}
