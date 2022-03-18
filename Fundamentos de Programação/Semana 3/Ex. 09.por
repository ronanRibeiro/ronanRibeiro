//Atividade de Ronan Sales Ribeiro
//IFMT - Tecnologia em Sistemas para Internet - Fundamentos de Programação
//Ex.9 - Crie um algoritmo que receba dois números e multiplica o num1 pelo num2 através de somas repetidas.


programa
{

	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		//Declaração de váriaveis
		inteiro num1, num2
		inteiro total = 0
		
		//leitura de váriaveis
		escreva ("Digite os números que deseja multiplicar \n")
		escreva ("Número 1: ")
		leia(num1)
		escreva ("Número 2: ")
		leia(num2)

		inteiro aux = mat.valor_absoluto(num1)
		
		//Fazer a multiplicação			
		enquanto (aux != 0) {
			total = total + num2
			aux = aux - 1
		}

		se (num1 >= 0 ){
			escreva ("O resultado de " + num1 + " * " + num2 + " é: " + total)			
		}
		senao {
			escreva ("O resultado de " + num1 + " * " + num2 + " é: " + -total)
		}

		escreva ("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 485; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */