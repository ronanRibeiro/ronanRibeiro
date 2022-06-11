/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 04 - Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um 
prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o 
térreo), capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também 
disponibilizar os seguintes métodos: 
a. Inicializa: que deve receber como parâmetros a capacidade do elevador e o total de andares no 
prédio (os elevadores sempre começam no térreo e vazio);
b. Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
c. Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
d. Sobe: para subir um andar (não deve subir se já estiver no último andar);
e. Desce: para descer um andar (não deve descer se já estiver no térreo);

*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Elevador e = new Elevador();

        //operações
        boolean continuar = true;

        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);
        
        
        
        while (continuar == true) {
            System.out.println("\nDigite qual operação deseja utilizar:\n1 - Inicializa\n2 - Entrada de pessoas\n3 - Saída de pessoas\n4 - Subir elevador\n5 - Descer elevador\n6 - Sair\nn7 - Mostrar situaão do elevador");
            int operacao = leitorScanner.nextInt();
            switch (operacao) {
                case 1:
                System.out.println("Digite a quatidade de andares que possui o prédio e a capacidade do elevador:");
                e.inicializa(leitorScanner.nextInt(), leitorScanner.nextInt());
                break;

                case 2:
                System.out.println("Digite o número de pessoas irão entrar no elevador:");
                int entra = leitorScanner.nextInt();
                if (entra <= e.getCapacidade()-e.getPessoas()) {
                    e.entra(entra);
                } else {
                    System.out.println("O elevador irá passar a sua capacidade total. Por favor, entre com um número menor de pessoas.");
                }
                break;

                case 3:
                System.out.println("Digite o número de pessoas irão descer do elevador:");
                int sai = leitorScanner.nextInt();
                if (sai <= e.getPessoas()) {
                    e.sai(sai);
                } else {
                    System.out.println("Não existe essa quantidade de pessoas no elevador. Por favor, digite um número válido de pessoas para descer.");
                }
                break;

                case 4:
                System.out.println("Digite quantos andares o elevedor irá subir:");
                int sobe = leitorScanner.nextInt();
                if (sobe <= e.getUltimoAndar()-e.getAndarAtual()) {
                    e.sobe(sobe);
                } else {
                    System.out.println("Não é possiível subir acima do andar final do prédio.");
                }
                break;
                
                case 5:
                System.out.println("Digite quantos andares o elevedor irá descer:");
                int desce = leitorScanner.nextInt();
                if (e.getAndarAtual()-desce >= 0) {
                    e.desce(desce);
                } else {
                    System.out.println("Não é possível descer abaixo do andar 0.");
                }
                break;

                case 6:
                continuar = false;
                break;

                case 7:
                System.out.printf("Andar atual: %d\nÚltimo andar: %d\nQuantidade de pessoas no elevador: %d\nCapacidade elevador: %d", e.getAndarAtual(), e.getUltimoAndar(), e.getPessoas(), e.getCapacidade());
                break;

                default:
                System.out.println("Digite uma operação válida.");
            }
        }
        leitorScanner.close();
    }
}