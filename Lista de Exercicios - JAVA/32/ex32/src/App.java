/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 32 - Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo. 
Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno. 
Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos 
outros dois lados. 
a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais; 
b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
c. Triângulo equilátero é também isóscele; 
d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int ladoA, ladoB, ladoC;

        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Informe os lados do triângulo:");
        System.out.println("Primeiro lado:");
        ladoA = leitorScanner.nextInt();
        System.out.println("Segundo lado:");
        ladoB = leitorScanner.nextInt();
        System.out.println("Terceiro lado:");
        ladoC = leitorScanner.nextInt();         
        leitorScanner.close();

        //Verificar se é um triangulo e seu tipo
        if (ladoA <= ladoB + ladoC && ladoB <= ladoA + ladoC && ladoC <= ladoA + ladoB) {
            if (ladoA == ladoB && ladoA == ladoC) {
                System.out.println("É um triângulo equilátero e isóscele");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("É um triângulo isóscele");
            } else {
                System.out.println("É um triângulo escaleno");
            }
        } else {
            System.out.println("Esses lados não podem formar um triângulo");
        }
    }
}