/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 08 - Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em 
dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares 
disponíveis com o usuário;
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite o fator de conversão entre Dólar e Real:");
        double fatorConversao = leitorScanner.nextDouble();
        System.out.println("Digite a quantidade de dólares que disponiveis com você:");
        double qntdDolar = leitorScanner.nextDouble();     

        leitorScanner.close();
        
        //Calculo da conversão
        double qntdReal = qntdDolar * fatorConversao;

        //Imprimir o resultado
        System.out.printf("O valor total em reais é de %.2f R$", qntdReal);
    }
}