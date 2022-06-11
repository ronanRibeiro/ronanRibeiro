/* 
Ronan Sales Ribeiro
Introduçção a lógica de programação III - Capegemini
Ex. 05 - Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto dessa 
classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de trabalho. 
Escreva os seguintes métodos para esta classe:
a. media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
b. final: calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)
Considerando média 6.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Alunos a = new Alunos();

        // Ler váriavel
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno:");
        a.setNome(leitorScanner.nextLine());
        System.out.println("Digite a matrícula do aluno:");
        a.setMatricula(leitorScanner.nextLine());
        System.out.println("Digite a nota da primeira prova:");
        a.setNota1(leitorScanner.nextDouble());
        System.out.println("Digite a nota da primeira prova:");
        a.setNota2(leitorScanner.nextDouble());
        System.out.println("Digite a nota do trabalho:");
        a.setNotaTrabalho(leitorScanner.nextDouble());
        
        leitorScanner.close();
        
        System.out.printf("A média é de %.2f\n", a.mediaFinal(a.getNota1(), a.getNota2(), a.getNotaTrabalho()));
        if (a.notaFinal(a.mediaFinal(a.getNota1(), a.getNota2(), a.getNotaTrabalho())) == 0) {
            System.out.println("O aluno está aprovado.");
        } else if (a.notaFinal(a.mediaFinal(a.getNota1(), a.getNota2(), a.getNotaTrabalho())) > 10){
            System.out.println("O aluno já está reprovado.");
        } else {
            System.out.printf("O aluno precisa de %.2f na PF para passar de ano.", a.notaFinal(a.mediaFinal(a.getNota1(), a.getNota2(), a.getNotaTrabalho())));
        }        
    }
}