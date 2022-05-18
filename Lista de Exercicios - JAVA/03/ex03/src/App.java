/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 03 -  Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância 
total percorrida pelo automóvel e o total de combustível gasto;
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite a distância percorrida em kilometros:");
        float distanca = leitorScanner.nextFloat();
        System.out.println("Digite quantos litros foram gastos em litros:");
        float combustivel = leitorScanner.nextFloat();

        leitorScanner.close();

        //Calcular e Imprimir
        float consumoMedio = distanca/combustivel;
        System.out.println("O consumo médio é de " + consumoMedio + " km/l.");
    }
}