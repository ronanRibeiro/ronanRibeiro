//Atividade de Ronan Sales Ribeiro
//IFMT - Tecnologia em Sistemas para Internet - Fundamentos de Programação
//P.1 - Faça um programa que leia 3 notas, calcule e mostre a média e o conceito conforme a tabela abaixo

programa
{
	
	funcao inicio()
	{
		//Declaração de váriaveis
		real nota1, nota2, nota3, media
		
		//leitura de váriaveis
		escreva ("Digite as três notas: (De a à 100)\n")
		escreva ("Nota 1: ")
		leia(nota1)

		escreva ("Nota 2: ")
		leia(nota2)

		escreva ("Nota 3: ")
		leia(nota3)
	
		//Calcular as medias
		media = (nota1 + nota2 + nota3)/3
		
		se (media >= 80 e media <= 100) {
			escreva ("Nota: " + media + " - Conceito A")
		}
		senao se (media >= 70 e media < 80) {
			escreva ("Nota: " + media + " - Conceito B")
		}
		senao se (media >= 60 e media < 70) {
			escreva ("Nota: " + media + " - Conceito C")
		}
		senao se (media >= 50 e media < 60) {
			escreva ("Nota: " + media + " - Conceito D")
		}
		senao {
			escreva ("Nota: " + media + " - Conceito E")
		}
		
		escreva ("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 996; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */