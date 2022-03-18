//Atividade de Ronan Sales Ribeiro
//IFMT - Tecnologia em Sistemas para Internet - Fundamentos de Programação
//Ex.4 - Implemente um programa para ler um número inteiro e mostrar uma mensagem indicando se este número é par ou ímpar, e se positivo ou negativo

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

		//Verificar se número é positivo e par
		se (num > 0 e num % 2 == 0) {
			escreva ("Número positivo e par")
		}
		
		//Verificar se número é positivo e ímpar
		senao se (num > 0 e num % 2 == 1) {
			escreva ("Número positivo e ímpar")
		}
		
		//Verificar se número é negativo e par
		senao se (num < 0 e num % 2 == 0) {
			escreva ("Número neagtivo e par")
		}
		
		//Verificar se número é negativo e ímpar
		senao {
			escreva ("Número neagtivo e ímpar")
		}

		escreva ("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 951; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */