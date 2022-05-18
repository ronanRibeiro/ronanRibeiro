/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 09 - Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um 
mês.Considere fixo o juro da poupança em 0,07% a. m;
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite o valor depositado:");
        double valorDepositado = leitorScanner.nextDouble(); 

        leitorScanner.close();

        //Cálculo dos juros e impressão do resultado
        System.out.printf("O valor com rendimento após um mês é de %.2f R$", valorDepositado * 1.0007);
    }
}
