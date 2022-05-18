/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 21 - Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta 
ou não para cumprir o serviço militar obrigatório. Informe os totais;
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        boolean continuar = true;
        int qntdApto = 0;

        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);
        while   (continuar == true){
            System.out.println("Informe o nome da pessoa:");
            String nome = leitorScanner.next();
            System.out.println("Informe o sexo da pessoa (M ou F)");
            char sexo = leitorScanner.next().charAt(0);
            System.out.println("Informe a idade da pessoa");
            int idade = leitorScanner.nextInt();
            System.out.println("Informe a saude da pessoa (B para boa e M para mau):");
            char saude = leitorScanner.next().charAt(0);
            
            //Verificação dos requesitos
            if ((sexo == 'm' || sexo == 'M') && idade >= 18 && (saude == 'b' || saude == 'B')){
                System.out.printf("%s está apto para servir", nome);
                qntdApto++;
            }
            
            //Testar a continuidade do loop
            System.out.println("\nCaso queira parar, digite N. Caso queira continuar digite outra tecla.");
            char teste = leitorScanner.next().charAt(0);
            if (teste == 'N' || teste =='n') {
                continuar = false;
            }
        }
        leitorScanner.close();

        System.out.printf("%d estão aptos para cumprir o serviço militar", qntdApto);
    }
}