/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 17 -  Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150 
(inclusive);

*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Informe 80 números:");
        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);
        int intervalo = 0;
        for (int i = 1; i <= 80; i++){
            System.out.printf("Número %d: ", i);
            double num = leitorScanner.nextDouble();
                //Verificar se o número está no intervalo
                if (num >= 10 && num <= 150) {
                    intervalo++;
                }
        }
        leitorScanner.close();

        //Impressão do resultado        
        System.out.printf("%d números no intervalo", intervalo);
        
    }
}