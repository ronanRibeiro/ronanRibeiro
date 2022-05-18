/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 07 -  Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de 
conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius;
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite da temperatura em Celsius:");
        double tempC = leitorScanner.nextDouble();      

        leitorScanner.close();
        
        //Calculo da conversão
        double tempF = (9*tempC+160)/5;

        //Imprimir o resultado
        System.out.printf("A temperatura é de %.2fº F", tempF);
    }
}