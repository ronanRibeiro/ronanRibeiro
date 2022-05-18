/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 22 - Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado 
se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor 
de venda de cada produto, a média de preço de custo e do preço de venda;
*/

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        double[] precoCusto = new double[40], precoVenda = new double[40];
        double totalCusto = 0, totalVenda = 0;
        

        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);
        for (int i = 0; i < 40; i++){
            System.out.printf("Informe o preço de custo do %dº produto: ", i+1);
            precoCusto[i] = leitorScanner.nextDouble();
            System.out.printf("Informe o preço de venda do %dº produto: ", i+1);
            precoVenda[i] = leitorScanner.nextDouble();
            
            //Soma do total
            totalCusto = totalCusto + precoCusto[i];
            totalVenda = totalVenda + precoVenda[i];

            //Verificação dos lucros e prejuizos
            if (precoCusto[i] - precoVenda[i] == 0) {
                System.out.println("O produto foi vendido pelo mesmo preço, sem lucros ou prejuízos.");
            } else if (precoVenda[i] - precoCusto[i] < 0){
                System.out.println("O produto foi vendido com prejuízo.");
            } else {
                System.out.println("O produto foi vendido com lucro.");
            }
        }
        leitorScanner.close();

        //Impressão dos resultados
        System.out.println("Os preços de custo foram:");
        System.out.println(Arrays.toString(precoCusto));
        System.out.println("Os preços de venda foram:");
        System.out.println(Arrays.toString(precoVenda));
        System.out.printf("A média de preço de custo é %.2f R$ e a média de preço de venda é %.2f R$.", totalCusto / 40, totalVenda / 40);
    }
}