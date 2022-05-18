/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 27 -   A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um 
algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser 
calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel 
–14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos 
clientes;

*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double valorCarro;
        int tipoCombustivel;
        boolean continuar = true;
        
        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);
        while   (continuar == true){
            System.out.println("\nInforme o valor do veículo, ou digite 0 para interromper a operação:");
            valorCarro = leitorScanner.nextDouble();

            if (valorCarro != 0) {
                System.out.println("Informe o seu tipo de combustível:\n1 - Álcool; 2 - Gasolina; 3 - Diesel.");
                tipoCombustivel = leitorScanner.nextInt();

                //Cálculo do desconto
                switch (tipoCombustivel) {
                    case 1:
                    System.out.printf("O carro terá um desconto de %.2f R$ e custará %.2f R$", valorCarro * 0.25, valorCarro * (1-.25));
                    break;
                    case 2:
                    System.out.printf("O carro terá um desconto de %.2f R$ e custará %.2f R$", valorCarro * 0.14, valorCarro * (1-.14));
                    break;
                    case 3:
                    System.out.printf("O carro terá um desconto de %.2f R$ e custará %.2f R$", valorCarro * 0.21, valorCarro * (1-.21));
                    break;
                    default:
                    System.out.println("Digite uma opção válida");
                    break;
                }
            
            //Teste de parada
            } else {
                continuar = false;
            }
        }
        leitorScanner.close();
    }
}