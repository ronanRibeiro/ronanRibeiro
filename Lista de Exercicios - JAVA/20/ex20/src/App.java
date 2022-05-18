/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 20 - A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça 
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O 
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O 
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. 
Informar total de carros com ano até 2000 e total geral;
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        boolean continuar = true;
        int qntdGeral = 0, qntdAte2000 = 0;
        
        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);
        while   (continuar == true){
            System.out.println("Informe o valor do veículo:");
            double valor = leitorScanner.nextDouble();
            System.out.println("Informe o ano do veículo");
            int ano = leitorScanner.nextInt();
            
            //Calculo do desconto
            if (ano <= 2000){
                System.out.printf("O carro terá um desconto de %.2f R$ e custará %.2f R$", valor * 0.12, valor * (1-.12));
                qntdAte2000++;
            } else {
                System.out.printf("O carro terá um desconto de %.2f R$ e custará %.2f R$", valor * 0.07, valor * (1-.07));
            }

            //Calcular total de carros
            qntdGeral++;
            
            //Testar a continuidade do loop
            System.out.println("\nCaso queira parar de calcular, digite N. Caso queira continuar digite outra tecla.");
            char teste = leitorScanner.next().charAt(0);
            if (teste == 'N' || teste =='n') {
                continuar = false;
            }
        }
        leitorScanner.close();

        System.out.printf("O total de carros foi de %d e desses %d com ano até 2000", qntdGeral, qntdAte2000);
    }
}