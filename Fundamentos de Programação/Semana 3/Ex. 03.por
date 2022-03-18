//Atividade de Ronan Sales Ribeiro
//IFMT - Tecnologia em Sistemas para Internet - Fundamentos de Programação
//Ex.3 - Crie um algoritimo (linguagem natural e fluxograma) que leia um número diferente de zero e diga se este número é positivo ou negativo.

programa
{
	
	funcao inicio()
	{
		//Declaração de váriaveis
		inteiro num

		//leitura de váriaveis
		escreva ("Digite um número diferente de 0: ")
		leia(num)

		//Verificar se número é diferente de 0
		se (num == 0) {
			escreva ("Digite um número diferente de 0")
		}

		//Verificar se número é positivo
		se (num > 0) {
			escreva ("Número positivo")
		}
		
		//Verificar se número é negativo
		se (num < 0) {
			escreva ("Número negativo")
		}

		escreva ("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 734; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */