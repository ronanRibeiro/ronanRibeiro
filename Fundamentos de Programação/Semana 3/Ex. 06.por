//Atividade de Ronan Sales Ribeiro
//IFMT - Tecnologia em Sistemas para Internet - Fundamentos de Programação
//Ex.6 - Um usuário deseja um algoritmo onde possa escolher que tipo de média deseja calcular a partir de 3 notas. Faça um algoritmo que leia as notas, a opção escolhida pelo usuário e calcule a média 1. Aritmética e 2. Ponderada (peso 3, 3, 4)

programa
{
	
	funcao inicio()
	{
		//Declaração de váriaveis
		real nota1, nota2, nota3, mediaA, mediaP
		cadeia tipo
		
		//leitura de váriaveis
		escreva ("Digite as três notas: \n")
		escreva ("Nota 1: ")
		leia(nota1)

		escreva ("Nota 2: ")
		leia(nota2)

		escreva ("Nota 3: ")
		leia(nota3)

		//Leitura do tipo de operação
		escreva ("Digite a se deseja a média aritimética ou p caso deseje a média ponderada de 3, 3 e 4: ")
		leia(tipo)
		
		//Calcular as medias
		se (tipo == "a") {
			mediaA = (nota1 + nota2 + nota3)/3
			escreva ("A média é: " + mediaA)
		}
		se (tipo == "p") {
			mediaP = (nota1 * 3 + nota2 * 3 + nota3 * 4)/10
			escreva ("A média é: " + mediaP)
		}
		senao {
			escreva ("Digite uma opção válida")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 827; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */