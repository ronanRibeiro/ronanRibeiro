/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 24 - Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        boolean continuar = true;
        double num;

        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);
        while   (continuar == true){
            System.out.println("\nInforme um número:");
            num = leitorScanner.nextDouble();

            //Verificação do número
            if ( num == 0 ) {
                System.out.println("O número é igual a zero.");
            } else if (num > 0) {
                System.out.println("O número é positivo.");
            } else {
                System.out.println("O número é negativo.");
            }
            
            //Testar a continuidade do loop
            System.out.println("Caso queira parar, digite N. Caso queira continuar digite outra tecla.");
            char teste = leitorScanner.next().charAt(0);
            if (teste == 'N' || teste =='n') {
                continuar = false;
            }
        }

        leitorScanner.close();
    }
}